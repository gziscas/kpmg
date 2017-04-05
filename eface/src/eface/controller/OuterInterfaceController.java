package eface.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import util.HttpRequestUtil;
import eface.DataBo;
import eface.model.Data;
import eface.service.IOuterService;

@Controller
@RequestMapping(value = "/outer")
public class OuterInterfaceController extends BaseController{
	
	@Autowired
	IOuterService outerService;
	
	@RequestMapping(value = "/searchInfo")
	public ModelAndView searchInfo(String name) {
		ModelAndView mv = this.getModelAndView();
		mv.setViewName("search_info");
		if (StringUtils.isEmpty(name)) {
			return mv;
		}
		String param = "uid=A4480107&api=100100&args={\"name\":\""+ name +"\"}&sign="+HttpRequestUtil.md5("uid=A4480107&api=100100&args={\"name\":\""+ name +"\"}&key=5ebce9a4674b8176863ad59b4149dc24");
		//综合
		String result = HttpRequestUtil.sendGet("http://open.yscredit.com/api/request", param);
		try {
			DataBo datas = outerService.searchInfo(result);
			if(datas != null) {
				mv.addObject("basicList", datas.getBasicList());//基础信息
				mv.addObject("entinvItemList", datas.getEntinvItemList());//对外投资信息
//				mv.addObject("", "");//企业资产状况 无
//				mv.addObject("", "");//对外提供担保信息 无
//				mv.addObject("shareHolderList", datas.getShareHolderList());//股东出资信息
				mv.addObject("filiationList", datas.getFiliationList());//分支机构信息
			} else {
				mv.addObject("msg", "无数据");//基础信息
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}
	
	@RequestMapping(value = "/searchLike", method= RequestMethod.POST)
	public ModelAndView searchLike(String name) {
		ModelAndView mv = this.getModelAndView();
		mv.setViewName("search_list");
		
		String res = getRequest().getParameter("name");
		
		if (StringUtils.isEmpty(name)) {
			return mv;
		}
		
		String param = "uid=A4480107&api=100003&args={\"key\":\""+ name +"\"}&sign="+HttpRequestUtil.md5("uid=A4480107&api=100003&args={\"key\":\""+ name +"\"}&key=5ebce9a4674b8176863ad59b4149dc24");
		//综合
		String result = HttpRequestUtil.sendGet("http://open.yscredit.com/api/request", param);
		try {
			List<Data> datas = outerService.searchLike(result);
			mv.addObject("datas", datas);
			mv.addObject("total", datas.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}
	
	@RequestMapping(value = "/test")
	@ResponseBody
	public void test() {
		String datas = "{\"code\":\"0000\",\"msg\":\"查询成功\",\"orderNo\":\"15061504515778017\",\"data\":{\"morDetailList\":[],\"basicList\":[{\"enterpriseName\":\"浙江虞南红食品有限公司\",\"frName\":\"徐如根\",\"regNo\":\"330682000053425\",\"creditCode\":\"910330682000053QWF\",\"regCap\":\"2000.000000\",\"regCapCur\":\"人民币\",\"esDate\":\"2009-08-11\",\"openFrom\":\"2009-08-11\",\"openTo\":\"9999-09-09\",\"enterpriseType\":\"有限责任公司(自然人投资或控股)\",\"enterpriseStatus\":\"吊销\",\"cancelDate\":\"\",\"revokeDate\":\"2013-11-22\",\"address\":\"上虞市章镇工业区\",\"abuItem\":\"无\",\"cbuItem\":\"板栗收购、销售。\",\"operateScope\":\"板栗收购、销售。\",\"operateScopeAndForm\":\"板栗收购、销售。\",\"regOrg\":\"上虞市工商行政管理局\",\"ancheYear\":\"2010\",\"industryPhyCode\":\"F\",\"industryCode\":\"5129\",\"industryName\":\"其他食品批发\",\"recCap\":\"2000.000000\",\"oriRegNo\":\"\",\"industryPhyName\":\"批发和零售业\",\"identityCardNt\":\"\",\"ancheDate\":\"null\"}],\"caseInfoList\":[{\"caseTime\":\"2012-05-24\",\"caseReason\":\"2012年5月24日下午，上虞市工商局……建议立案调查。\",\"caseType\":\"其他案件\",\"exeSort\":\"已执行\",\"caseResult\":\"已处罚\",\"pendecissDate\":\"\",\"penAuth\":\"上虞市工商行政管理局\",\"illegFact\":\"办理公司登记时虚报注册资本、提交虚假证明文件或者采取其他欺诈手段隐瞒重要事实取得公司登记\",\"penBasis\":\"《中华人民共和国公司法》第一百九十九条\",\"penType\":\"罚款\",\"penResult\":\"罚款\",\"penAm\":\"50\",\"penExest\":\"10\"}],\"personList\":[{\"name\":\"徐如根\",\"position\":\"执行董事\",\"sex\":\"男\"},{\"name\":\"傅娟芬\",\"position\":\"监事\",\"sex\":\"女\"},{\"name\":\"徐如根\",\"position\":\"经理\",\"sex\":\"男\"}],\"frPositionList\":[{\"frName\":\"徐如根\",\"entName\":\"上虞市雄风空调通风设备厂\",\"regNo\":\"3306822209373\",\"entType\":\"个人独资企业\",\"regCap\":\"20.000000\",\"regCapCur\":\"人民币\",\"entStatus\":\"吊销\",\"canDate\":\"\",\"revDate\":\"2009-11-10\",\"regOrg\":\"上虞市工商行政管理局\",\"position\":\"负责人\",\"lerepsign\":\"是\",\"esDate\":\"2004-01-05\"}],\"sharesFrostList\":[{\"froDocno\":\"（2012）绍商初字第1647号\",\"froAuth\":\"绍兴县人民法院\",\"froFrom\":\"2012-09-17\",\"froTo\":\"2014-09-16\",\"froAm\":\"1200\",\"thawAuth\":\"\",\"thawDocno\":\"\",\"thawDate\":\"\",\"thawComment\":\"\"}],\"entinvItemList\":[],\"sharesImpawnList\":[],\"punishBreakList\":[{\"caseCode\":\"(2015)绍越执民字第00415号\",\"inameClean\":\"徐如根\",\"type\":\"自然人\",\"sex\":\"男\",\"age\":\"52\",\"cardNo\":\"33062219628018\",\"idCardLocation\":\"浙江省上虞县\",\"businessEntity\":\"\",\"regDate\":\"20150123\",\"publishDate\":\"20150331\",\"courtName\":\"绍兴市越城区人民法院\",\"province\":\"(2013)绍越商初字第02757号\",\"gistID\":null,\"gistUnit\":\"绍兴越城区法院\",\"duty\":\"未履行金额人民币300000元\",\"disruptTypeName\":\"其他有履行能力而拒不履行生效法律文书确定义务\",\"performance\":\"全部未履行\",\"performedPart\":\"\",\"unperformPart\":\"\",\"focusNumber\":\"\"}],\"filiationList\":[],\"punishedList\":[{\"caseCode\":\"(2014)杭萧执民字第02031号\",\"inameClean\":\"上虞市巨龙通风设备有限公司\",\"cardNo\":\"330682000024138\",\"sex\":\"\",\"age\":\"\",\"province\":\"\",\"idCardLocation\":\"\",\"courtName\":\"杭州市萧山区人民法院\",\"regDateClean\":\"2014-02-28\",\"caseState\":\"执行中\",\"execMoney\":\"638180\",\"focusNumber\":\"4\"}],\"shareHolderList\":[{\"shareholderName\":\"徐如根\",\"subConam\":\"1200.000000\",\"regCapCur\":\"人民币\",\"conDate\":\"2009-08-11\",\"country\":\"中国\",\"identityCardNt\":\"\",\"fundedratio\":\"60.00%\"},{\"shareholderName\":\"傅娟芬\",\"subConam\":\"800.000000\",\"regCapCur\":\"人民币\",\"conDate\":\"2009-08-11\",\"country\":\"中国\",\"identityCardNt\":\"\",\"fundedratio\":\"40.00%\"}],\"alterList\":[{\"altItem\":\"一般经营项目变更\",\"altBe\":\"一般经营项目:预包装食品销售（有效期至2009年12月30日）（凡涉及许可证制度的凭许可经营）\",\"altAf\":\"一般经营项目:板栗收购、销售。\",\"altDate\":\"2009-12-22\"},{\"altItem\":\"经营期限(营业期限)变更\",\"altBe\":\"营业期限:2009-8-11至2009-12-30\",\"altAf\":\"营业期限:2009-8-11至9999-9-9\",\"altDate\":\"2009-12-22\"}]}}";
//		datas = "[{\"code\":\"0000\",\"msg\":\"查询成功\",\"orderNo\":\"15061504515778017\",\"data\":{\"morDetailList\":[],\"basicList\":[{\"enterpriseName\":\"浙江虞南红食品有限公司\",\"frName\":\"徐如根\",\"regNo\":\"330682000053425\",\"creditCode\":\"910330682000053QWF\",\"regCap\":\"2000.000000\",\"regCapCur\":\"人民币\",\"esDate\":\"2009-08-11\",\"openFrom\":\"2009-08-11\",\"openTo\":\"9999-09-09\",\"enterpriseType\":\"有限责任公司(自然人投资或控股)\",\"enterpriseStatus\":\"吊销\",\"cancelDate\":\"\",\"revokeDate\":\"2013-11-22\",\"address\":\"上虞市章镇工业区\",\"abuItem\":\"无\",\"cbuItem\":\"板栗收购、销售。\",\"operateScope\":\"板栗收购、销售。\",\"operateScopeAndForm\":\"板栗收购、销售。\",\"regOrg\":\"上虞市工商行政管理局\",\"ancheYear\":\"2010\",\"industryPhyCode\":\"F\",\"industryCode\":\"5129\",\"industryName\":\"其他食品批发\",\"recCap\":\"2000.000000\",\"oriRegNo\":\"\",\"industryPhyName\":\"批发和零售业\",\"identityCardNt\":\"\",\"ancheDate\":\"null\"}],\"caseInfoList\":[{\"caseTime\":\"2012-05-24\",\"caseReason\":\"2012年5月24日下午，上虞市工商局……建议立案调查。\",\"caseType\":\"其他案件\",\"exeSort\":\"已执行\",\"caseResult\":\"已处罚\",\"pendecissDate\":\"\",\"penAuth\":\"上虞市工商行政管理局\",\"illegFact\":\"办理公司登记时虚报注册资本、提交虚假证明文件或者采取其他欺诈手段隐瞒重要事实取得公司登记\",\"penBasis\":\"《中华人民共和国公司法》第一百九十九条\",\"penType\":\"罚款\",\"penResult\":\"罚款\",\"penAm\":\"50\",\"penExest\":\"10\"}],\"personList\":[{\"name\":\"徐如根\",\"position\":\"执行董事\",\"sex\":\"男\"},{\"name\":\"傅娟芬\",\"position\":\"监事\",\"sex\":\"女\"},{\"name\":\"徐如根\",\"position\":\"经理\",\"sex\":\"男\"}],\"frPositionList\":[{\"frName\":\"徐如根\",\"entName\":\"上虞市雄风空调通风设备厂\",\"regNo\":\"3306822209373\",\"entType\":\"个人独资企业\",\"regCap\":\"20.000000\",\"regCapCur\":\"人民币\",\"entStatus\":\"吊销\",\"canDate\":\"\",\"revDate\":\"2009-11-10\",\"regOrg\":\"上虞市工商行政管理局\",\"position\":\"负责人\",\"lerepsign\":\"是\",\"esDate\":\"2004-01-05\"}],\"sharesFrostList\":[{\"froDocno\":\"（2012）绍商初字第1647号\",\"froAuth\":\"绍兴县人民法院\",\"froFrom\":\"2012-09-17\",\"froTo\":\"2014-09-16\",\"froAm\":\"1200\",\"thawAuth\":\"\",\"thawDocno\":\"\",\"thawDate\":\"\",\"thawComment\":\"\"}],\"entinvItemList\":[],\"sharesImpawnList\":[],\"punishBreakList\":[{\"caseCode\":\"(2015)绍越执民字第00415号\",\"inameClean\":\"徐如根\",\"type\":\"自然人\",\"sex\":\"男\",\"age\":\"52\",\"cardNo\":\"33062219628018\",\"idCardLocation\":\"浙江省上虞县\",\"businessEntity\":\"\",\"regDate\":\"20150123\",\"publishDate\":\"20150331\",\"courtName\":\"绍兴市越城区人民法院\",\"province\":\"(2013)绍越商初字第02757号\",\"gistID\":null,\"gistUnit\":\"绍兴越城区法院\",\"duty\":\"未履行金额人民币300000元\",\"disruptTypeName\":\"其他有履行能力而拒不履行生效法律文书确定义务\",\"performance\":\"全部未履行\",\"performedPart\":\"\",\"unperformPart\":\"\",\"focusNumber\":\"\"}],\"filiationList\":[],\"punishedList\":[{\"caseCode\":\"(2014)杭萧执民字第02031号\",\"inameClean\":\"上虞市巨龙通风设备有限公司\",\"cardNo\":\"330682000024138\",\"sex\":\"\",\"age\":\"\",\"province\":\"\",\"idCardLocation\":\"\",\"courtName\":\"杭州市萧山区人民法院\",\"regDateClean\":\"2014-02-28\",\"caseState\":\"执行中\",\"execMoney\":\"638180\",\"focusNumber\":\"4\"}],\"shareHolderList\":[{\"shareholderName\":\"徐如根\",\"subConam\":\"1200.000000\",\"regCapCur\":\"人民币\",\"conDate\":\"2009-08-11\",\"country\":\"中国\",\"identityCardNt\":\"\",\"fundedratio\":\"60.00%\"},{\"shareholderName\":\"傅娟芬\",\"subConam\":\"800.000000\",\"regCapCur\":\"人民币\",\"conDate\":\"2009-08-11\",\"country\":\"中国\",\"identityCardNt\":\"\",\"fundedratio\":\"40.00%\"}],\"alterList\":[{\"altItem\":\"一般经营项目变更\",\"altBe\":\"一般经营项目:预包装食品销售（有效期至2009年12月30日）（凡涉及许可证制度的凭许可经营）\",\"altAf\":\"一般经营项目:板栗收购、销售。\",\"altDate\":\"2009-12-22\"},{\"altItem\":\"经营期限(营业期限)变更\",\"altBe\":\"营业期限:2009-8-11至2009-12-30\",\"altAf\":\"营业期限:2009-8-11至9999-9-9\",\"altDate\":\"2009-12-22\"}]}}]";
		try {
			//JSON结果测试
//			JSONArray array = JSONArray.fromObject(datas);
//			outerService.saves(array);
//			outerService.saves(datas);
//			datas = "{\"code\":\"0000\",\"msg\":\"查询成功\",\"orderNo\":\"15061505342059725\",\"data\":[{\"entName\":\"浙江虞南红食品有限公司\"},{\"entName\":\"厦门中南红食品有限公司\"}]}";
//			outerService.saveLike(datas);
			
			//接口测试
			String param = "uid=A4480107&api=100100&args={\"name\":\"浙江虞南红食品有限公司\"}&sign="+HttpRequestUtil.md5("uid=A4480107&api=100100&args={\"name\":\"浙江虞南红食品有限公司\"}&key=5ebce9a4674b8176863ad59b4149dc24");
			//综合
			String result = HttpRequestUtil.sendGet("http://open.yscredit.com/api/request", param);
			System.out.println("===========1===========");
			System.out.println(result);
			//模糊
			param = "uid=A4480107&api=100003&args={\"key\":\"浙江虞南红\"}&sign="+HttpRequestUtil.md5("uid=A4480107&api=100003&args={\"key\":\"浙江虞南红\"}&key=5ebce9a4674b8176863ad59b4149dc24");
			result = HttpRequestUtil.sendGet("http://open.yscredit.com/api/request", param);
			System.out.println("===========2===========");
			System.out.println(result);
			
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		return;
	}
	
}
