package eface.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.http.util.TextUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import util.JsonUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import eface.DataBo;
import eface.dao.*;
import eface.model.AlterList;
import eface.model.BasicList;
import eface.model.CaseInfoList;
import eface.model.Data;
import eface.model.EntinvItemList;
import eface.model.FiliationList;
import eface.model.FrPositionList;
import eface.model.MorDetailList;
import eface.model.PersonList;
import eface.model.PunishBreakList;
import eface.model.PunishedList;
import eface.model.ShareHolderList;
import eface.model.SharesFrostList;
import eface.model.SharesImpawnList;

@Service("outerService")
public class OuterServiceImpl implements IOuterService {

	@Resource(name = "alterListMapper")
	AlterListMapper alterListMapper;
	@Resource(name = "basicListMapper")
	BasicListMapper basicListMapper;
	@Resource(name = "caseInfoListMapper")
	CaseInfoListMapper caseInfoListMapper;
	@Resource(name = "entinvItemListMapper")
	EntinvItemListMapper entinvItemListMapper;
	@Resource(name = "filiationListMapper")
	FiliationListMapper filiationListMapper;
	@Resource(name = "frinvListMapper")
	FrinvListMapper frinvListMapper;
	@Resource(name = "frPositionListMapper")
	FrPositionListMapper frPositionListMapper;
	@Resource(name = "liquidationListMapper")
	LiquidationListMapper liquidationListMapper;
	@Resource(name = "morDetailListMapper")
	MorDetailListMapper morDetailListMapper;
	@Resource(name = "morguaInfoListMapper")
	MorguaInfoListMapper morguaInfoListMapper;
	@Resource(name = "personListMapper")
	PersonListMapper personListMapper;
	@Resource(name = "shareHolderListMapper")
	ShareHolderListMapper shareHolderListMapper;
	@Resource(name = "sharesFrostListMapper")
	SharesFrostListMapper sharesFrostListMapper;
	@Resource(name = "sharesImpawnListMapper")
	SharesImpawnListMapper sharesImpawnListMapper;
	@Resource(name = "punishedListMapper")
	PunishedListMapper punishedListMapper;
	@Resource(name = "punishBreakListMapper")
	PunishBreakListMapper punishBreakListMapper;
	@Resource(name = "dataMapper")
	DataMapper dataMapper;
	
	//企业综合信息查询
	@SuppressWarnings({ "unused", "unchecked" })
	@Transactional
	public DataBo searchInfo(String json) throws Exception {
		JSONObject obj = JSONObject.fromObject(json);
		String code = obj.get("code")+"";
		String msg = obj.get("msg")+"";
		String orderNo = obj.get("orderNo")+"";
		String dataStr = obj.get("data")+"";
		if(dataStr.equals("") || dataStr.equals("null"))
			return null;
		JSONObject data = JSONObject.fromObject(dataStr);
		
		List<MorDetailList> morDetailList = handlerJson(data, MorDetailList.class, "morDetailList");
		insert(morDetailList);
		List<BasicList> basicList = handlerJson(data, BasicList.class, "basicList");
		insert(basicList);
		List<CaseInfoList> caseInfoList = handlerJson(data, CaseInfoList.class, "caseInfoList");
		insert(caseInfoList);
		List<PersonList> personList = handlerJson(data, PersonList.class, "personList");
		insert(personList);
		List<FrPositionList> frPositionList = handlerJson(data, FrPositionList.class, "frPositionList");
		insert(frPositionList);
		List<SharesFrostList> sharesFrostList = handlerJson(data, SharesFrostList.class, "sharesFrostList");
		insert(sharesFrostList);
		List<EntinvItemList> entinvItemList = handlerJson(data, EntinvItemList.class, "entinvItemList");
		insert(entinvItemList);
		List<SharesImpawnList> sharesImpawnList = handlerJson(data, SharesImpawnList.class, "sharesImpawnList");
		insert(sharesImpawnList);
		List<PunishBreakList> punishBreakList = handlerJson(data, PunishBreakList.class, "punishBreakList");
		insert(punishBreakList);
		List<FiliationList> filiationList = handlerJson(data, FiliationList.class, "filiationList");
		insert(filiationList);
		List<PunishedList> punishedList = handlerJson(data, PunishedList.class, "punishedList");
		insert(punishedList);
		List<ShareHolderList> shareHolderList = handlerJson(data, ShareHolderList.class, "shareHolderList");
		insert(shareHolderList);
		List<AlterList> alterList = handlerJson(data, AlterList.class, "alterList");
		insert(alterList);
		
		Data dataLog = new Data(code, msg, orderNo, obj.get("data")+"", 2);
		dataMapper.insertLog(dataLog);
		
		DataBo dbo = new DataBo(morDetailList, basicList, caseInfoList, personList, frPositionList, sharesFrostList, entinvItemList, sharesImpawnList, punishBreakList, filiationList, punishedList, shareHolderList, alterList);
		
		return dbo;
	}
	
	private boolean insert(List list) {
		if(list == null || list.size() <= 0)
			return true;
		for(int i=0; i < list.size(); i++){
			Object obj = list.get(i);
			if(obj instanceof MorDetailList) {
				this.morDetailListMapper.insert((MorDetailList)obj);
			} else if(obj instanceof BasicList) {
				this.basicListMapper.insert((BasicList)obj);
			} else if(obj instanceof CaseInfoList) {
				this.caseInfoListMapper.insert((CaseInfoList)obj);
			} else if(obj instanceof PersonList) {
				this.personListMapper.insert((PersonList)obj);
			} else if(obj instanceof FrPositionList) {
				this.frPositionListMapper.insert((FrPositionList)obj);
			} else if(obj instanceof SharesFrostList) {
				this.sharesFrostListMapper.insert((SharesFrostList)obj);
			} else if(obj instanceof EntinvItemList) {
				this.entinvItemListMapper.insert((EntinvItemList)obj);
			} else if(obj instanceof SharesImpawnList) {
				this.sharesImpawnListMapper.insert((SharesImpawnList)obj);
			} else if(obj instanceof PunishBreakList) {
				this.punishBreakListMapper.insert((PunishBreakList)obj);
			} else if(obj instanceof FiliationList) {
				this.filiationListMapper.insert((FiliationList)obj);
			} else if(obj instanceof PunishedList) {
				this.punishedListMapper.insert((PunishedList)obj);
			} else if(obj instanceof ShareHolderList) {
				this.shareHolderListMapper.insert((ShareHolderList)obj);
			} else if(obj instanceof AlterList) {
				this.alterListMapper.insert((AlterList)obj);
			} else {
				return false;
			}
		}
		return true;
	}
	
	@SuppressWarnings({"rawtypes" })
	private List handlerJson(JSONObject json, Class bean, String name) {
		if(json==null)
			return null;
		JSONArray aar = JSONArray.fromObject(json.get(name)+"");
		return handlerJson(aar, bean);
	}
	
	@SuppressWarnings({"rawtypes", "unchecked" })
	private List handlerJson(JSONArray jarr, Class bean) {
		if(jarr==null || jarr.size() < 1)
			return null;
		List result = new ArrayList();
		for (int i = 0; i < jarr.size(); i++) {
			JSONObject jo = JSONObject.fromObject(jarr.get(i));
			result.add(JSONObject.toBean(jo, bean));
		}
		return result;
	}
	
	//处理模糊查询返回的结果
	@SuppressWarnings({ "unused", "unchecked" })
	@Transactional
	public List<Data> searchLike(String json) throws Exception {
		JSONObject obj = JSONObject.fromObject(json);
		String code = obj.get("code")+"";
		String msg = obj.get("msg")+"";
		String orderNo = obj.get("orderNo")+"";
		
		Data dataLog = new Data(code, msg, orderNo, obj.get("data")+"", 1);
		dataMapper.insertLog(dataLog);
		
		JSONArray aar = JSONArray.fromObject(obj.get("data")+"");
		if(aar==null || aar.size() <= 0)
			return null;
		List<Data> datas = new ArrayList<Data>();
		Data data = null;
		for(int i=0; i<aar.size(); i++) {
			JSONObject jo = (JSONObject) aar.get(i);
			data = new Data(code, msg, orderNo, jo.get("entName")+"");
			dataMapper.insertData(data);
			datas.add(data);
		}
		
		return datas;
	}
	
}
