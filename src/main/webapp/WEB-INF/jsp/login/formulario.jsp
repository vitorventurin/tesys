<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<link type="text/css" href="<c:url value="/css/default.css"/>" rel="stylesheet"/>
	<title>Tesys</title>
</head>

<body>

<div id="corpo">
	<div class="topo"> 	
	<!--	<img src="<c:url value="/images/logo.jpg"/>"/>			-->
		<h1>Tesys</h1>
	</div>

	<div class="entrar"> 
		<div class="area"> 
			<div class="margem">
				<h2>Login</h2> 
				<p>Para acessar o Tesys, utilize seu login de acesso e senha.</p>
				<form action="<c:url value="/login/autentica"/>">
					<p><label for="login">Login</label><input type="text" name="user.username" value="vitor1" /></p>
					<p><label for="login">Senha</label><input type="password" name="user.userpassword" value="vitor1" /></p>
					<p><input type="submit" value="Autenticar" /></p>
				</form>
			</div>
		</div>
	</div>
	
	<div class="rodape"> 
	<p>Versão 1.0</p> 
</div>
	
</div>

</body>
</html>