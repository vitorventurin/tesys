<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<link type="text/css" href="<c:url value="/css/default.css"/>" rel="stylesheet"/>
	<link type="text/css" href="<c:url value="/css/color-picker.css"/>" rel="stylesheet"/>
	<link type="text/css" href="<c:url value="/css/jquery-ui-1.8.16.custom.css"/>" rel="stylesheet"/>
	<script src="/js/jquery-1.6.4.js" type="text/javascript"></script>
	<script src="/js/jquery-ui-1.8.16.custom.min.js" type="text/javascript"></script>
	<script src="/js/all.min.js" type="text/javascript"></script>
	<title>Tesys</title>
</head>
<body>
<div id="corpo">
	<div class="topo">
		<div class="logo">				
			<h1>Tesys</h1> 
		</div>
		<div class="usuario">
			<c:if test="${loggedUser.logado}">
				<h4>${loggedUser.nome}<span>[ <a href="<c:url value="/login/formulario"/>">logout</a> ]</span></h4>
			</c:if>
		</div>
		<div class="clearboth"></div>
	</div>