<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据信息展示</title>
<link rel="stylesheet" href="../asserts/css/swiper.min.css">
<link rel="stylesheet" type="text/css" href="../asserts/css/common.css">
</head>
<script type="text/javascript">
function save(){
	var name = document.getElementById("name");
	
	if(name==null || typeof(name) == "undefined") {
		return false;
	} else{
		document.getElementById("searchForm").submit();
	}
}
</script>
<body>
<div class="container">
	<div class="header_search clearfix" id="header">
		<div class="width-con">
			<div class=" fl">
				<a href="#"><img src="../asserts/images/logo.png"></a>
			</div>
			<div class="search fl">
				<form  action="../outer/searchLike" name="searchForm" id="searchForm" method="post" >
					<input class="search_input" name="name" id="name" type="text" placeholder="工商数据查询" />
					<!-- <a href="javascript:;" class="search_btn" onclick="javascript:search();">查询</a> -->
					<a href="#" class="search_btn" onclick="javascript:save();">查询</a>
				</form>
			</div>
		</div>
		<div id="fl_menu" class="floatShop" attr="floatShop">
			<div class="floatPart kefu" attr="click:toKefu">
				<img class="icon" src="../asserts/images/kefu.png"><span>在线客服</span>
			</div>
			<div class="floatPart" style="padding-bottom: 15px;" attr="kefu;click:toContact">
				<span>在线</span><span>留言</span>
			</div>
			<div class="floatPart hide" attr="che;click:toShop">
				<img class="icon che" src="../asserts/images/che.png"><span>购物车</span><b attr="prdNum">$prdNum$</b>
			</div>
		</div>
	</div>
	
	<div class="width-con mt_20">
		<div class="search_list_box">
			<ul>
				<li>
				<c:choose>
					<c:when test="${not empty basicList}">
						<c:forEach items="${basicList}" var="basic" varStatus="vs">
							<div class="list_top">
								<p class="list_name">${basic.enterpriseName }</p>
								<!-- <div class="list_top_r">
									<span>在营</span>
									<span>A股</span>
								</div> -->
							</div>
							<div class="list_bottom clearfix">
								<p><span>法定代表人：</span><em>${basic.frName }</em></p>
								<p>注册资本：${basic.regCap }万</p>
								<p>成立日期：${basic.esDate }</p>
							</div>
						</c:forEach>
					</c:when>
				</c:choose>
				<div class="list_bottom clearfix">
				<p><span>股东：</span><em>
					<c:choose>
						<c:when test="${not empty shareHolderList}">
							<c:forEach items="${shareHolderList}" var="basic" varStatus="vs">
							${shareHolder.shareholderName } &nbsp;&nbsp;
							</c:forEach>
						</c:when>
					</c:choose>
				</em></p>
				</div>
					
				</li>
			</ul>
		</div>
		<div class="info_content mt_20">
			<div class="info_ct_title">
				<span>基本信息</span>
			</div>
			<div class="info_ct_box mt_20">
				<table class="std">
				<c:choose>
					<c:when test="${not empty basicList}">
						<c:forEach items="${basicList}" var="basic" varStatus="vs">
							<tr>
								<td>工商注册号：</td>
								<td>${basic.regNo }</td>
								<td>组织机构代码：</td>
								<td>${basic.industryCode }</td>
								<td>企业类型：</td>
								<td>${basic.enterpriseType }</td>
							</tr>
							<tr>
								<td>营业期限：</td>
								<td>${basic.openTo }</td>
								<td>登记机关：</td>
								<td>${basic.regOrg }</td>
								<td>注册地址：</td>
								<td>${basic.address }</td>
							</tr>
							<tr>
								<td>经营范围：</td>
								<td colspan="5">${basic.operateScope }</td>
							</tr>
						</c:forEach>
					</c:when>
				</c:choose>
				</table>
			</div>
		</div>
		<div class="info_content mt_20">
			<div class="info_ct_title">
				<span>外投资信息</span>
			</div>
			<div class="info_ct_box mt_20">
				<table class="std txtcenter">
					<thead class="thead_bg">
						<tr>
							<td>企业名称</td>
							<td>对外投资企业注册号</td>
						</tr>
					</thead>
					
					<c:choose>
						<c:when test="${not empty entinvItemList}">
							<c:forEach items="${entinvItemList}" var="entinv" varStatus="vs">
								<tr>
								<td>${entinv.entName }</td>
								<td>${entinv.regNo }</td>
								</tr>
							</c:forEach>
						</c:when>
						<c:otherwise>
						<tr>
						<td>--</td>
						<td>--</td>
						</tr>
						</c:otherwise>
					</c:choose>
						
					
				</table>
			</div>
		</div>
		<div class="info_content mt_20">
			<div class="info_ct_title">
				<span>企业资产状况信息</span>
			</div>
			<div class="info_ct_box mt_20">
				<table class="std">
					<!-- <tr>
						<td class="td_title">资产总额</td>
						<td>44030110万元</td>
						<td class="td_title">所有者权益合计</td>
						<td>44030110万元</td>
					</tr>
					<tr>
						<td class="td_title">营业收入</td>
						<td>44030110万元</td>
						<td class="td_title">利润总额</td>
						<td>44030110万元</td>
					</tr>
					<tr>
						<td class="td_title">纳税总额</td>
						<td>44030110万元</td>
						<td class="td_title">负债总额</td>
						<td>44030110万元</td>
					</tr> -->
					<tr>
						<td class="td_title">资产总额</td>
						<td>--</td>
						<td class="td_title">所有者权益合计</td>
						<td>--</td>
					</tr>
					<tr>
						<td class="td_title">营业收入</td>
						<td>--</td>
						<td class="td_title">利润总额</td>
						<td>--</td>
					</tr>
					<tr>
						<td class="td_title">纳税总额</td>
						<td>--</td>
						<td class="td_title">负债总额</td>
						<td>--</td>
					</tr>
				</table>
			</div>
		</div>
		<div class="info_content mt_20">
			<div class="info_ct_title">
				<span>对外提供保证担保信息</span>
			</div>
			<div class="info_ct_box mt_20">
				<table class="std txtcenter">
					<thead class="thead_bg">
						<tr>
							<td>债权人</td>
							<td>债务人</td>
							<td>主债权种类</td>
							<td>主债权数额</td>
							<td>履行债务期限</td>
							<td>保证的期间</td>
							<td>保证的方式</td>
							<td>保证担保的范围</td>
						</tr>
					</thead>
					<tr>
						<td>--</td>
						<td>--</td>
						<td>--</td>
						<td>--</td>
						<td>--</td>
						<td>--</td>
						<td>--</td>
						<td>--</td>
					</tr>
				</table>
			</div>
		</div>
		<div class="info_content mt_20">
			<div class="info_ct_title">
				<span>股东变更信息</span>
			</div>
			<div class="info_ct_box mt_20">
				<table class="std txtcenter">
					<thead class="thead_bg">
						<tr>
							<td>股东</td>
							<td>变更前股权比例</td>
							<td>变更后股权比例</td>
							<td>股权变更日期</td>
						</tr>
					</thead>
					<tr>
						<td>--</td>
						<td>--</td>
						<td>--</td>
						<td>--</td>
					</tr>
				</table>
			</div>
		</div>
		<div class="info_content mt_20">
			<div class="info_ct_title">
				<span>分支机构</span>
			</div>
			<div class="info_ct_box mt_20">
				<table class="std txtcenter">
					<thead class="thead_bg">
						<tr>
							<td>名称</td>
							<td>地区</td>
							<td>业务</td>
							<td>成立时间</td>
						</tr>
					</thead>
					<c:choose>
						<c:when test="${not empty filiationList}">
							<c:forEach items="${filiationList}" var="filiation" varStatus="vs">
								<tr>
									<td>${filiation.brName }</td>
									<td>${filiation.brAddr }</td>
									<td>${filiation.cbuItem }</td>
									<td>--</td>
								</tr>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<tr>
								<td>--</td>
								<td>--</td>
								<td>--</td>
								<td>--</td>
							</tr>
						</c:otherwise>
					</c:choose>
				</table>
			</div>
		</div>
	</div>

	<div class="footers" id="footer">
		<div class="width-con">
			<div class="bottom-logo">
				<!-- <img src="../asserts/images/pinganLogo.png"> -->
			</div>
			<p class="l-footers-p">
				<span class="foot-mail"><a href="#">163@163.com</a></span><span class="foot-tel">400-000-0000</span><span class="foot-time">09:00-18:00（周一至周五）</span>
			</p>
			<p>
				Copyright © 2017 好信法院通股份有限公司 版权所有
			</p>
			<div class="l-erweima">
				<!-- <img src="../asserts/images/logo_bottom1.png"> -->
			</div>
			<a href="#" class="back-top"></a>
		</div>
	</div>
</div>
</body>
</html>