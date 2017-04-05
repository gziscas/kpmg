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
<link rel="stylesheet" href="../css/swiper.min.css">
<link rel="stylesheet" type="text/css" href="../css/common.css">
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
				<a href="#"><img src="../images/logo.png"></a>
			</div>
			<div class="search">
				<form  action="<%=basePath %>outer/searchLike" name="searchForm" id="searchForm" method="post" >
					<input class="search_input" name="name" id="name" type="text" placeholder="工商数据查询" />
					<a href="#" class="search_btn" onclick="javascript:save();">查询</a>
				</form>
			</div>
			
		</div>
		<div id="fl_menu" class="floatShop" attr="floatShop">
			<div class="floatPart kefu" attr="click:toKefu">
				<img class="icon" src="../images/kefu.png"><span>在线客服</span>
			</div>
			<div class="floatPart" style="padding-bottom: 15px;" attr="kefu;click:toContact">
				<span>在线</span><span>留言</span>
			</div>
			<div class="floatPart hide" attr="che;click:toShop">
				<img class="icon che" src="../images/che.png"><span>购物车</span><b attr="prdNum">$prdNum$</b>
			</div>
		</div>
	</div>

	<div class="width-con">
		<div class="search_list">
			<div class="search_num">
				共查询到：${total}家相关企业
			</div>
			<div class="search_list_box">
				<ul>
					<!-- 开始循环 -->	
					<c:choose>
						<c:when test="${not empty datas}">
							<c:forEach items="${datas}" var="data" varStatus="vs">
								<li>
									<a href="<%=basePath %>outer/searchInfo?name=${data.entName }">
									<div class="list_top">
										<p class="list_name">${data.entName }</p>
										<!-- <div class="list_top_r">
											<span>在营</span>
											<span>A股</span>
										</div> -->
									</div>
									<!-- <div class="list_bottom clearfix">
										<p><span>法定代表人：</span><em>王石</em></p>
										<p>注册资本：1222125544.0021万</p>
										<p>成立日期：1999-09-07</p>
									</div> -->
									<!-- <div class="list_bottom clearfix">
										<p><span>股东：</span><em>王石</em></p>
									</div> -->
									</a>
								</li>
							
							</c:forEach>
						</c:when>
						<c:otherwise>
							<li>
							<a href="#">没有相关数据</a>
							</li>
						</c:otherwise>
					</c:choose>
				</ul>
			</div>
		</div>
	</div>
	<div class="footers" id="footer">
		<div class="width-con">
			<div class="bottom-logo">
				<!-- <img src="../images/pinganLogo.png"> -->
			</div>
			<p class="l-footers-p">
				<span class="foot-mail"><a href="#">163@163.com</a></span><span class="foot-tel">400-000-0000</span><span class="foot-time">09:00-18:00（周一至周五）</span>
			</p>
			<p>
				Copyright © 2017 好信法院通股份有限公司 版权所有
			</p>
			<div class="l-erweima">
				<!-- <img src="../images/logo_bottom1.png"> -->
			</div>
			<a href="#" class="back-top"></a>
		</div>
	</div>
</div>
</body>
</html>
