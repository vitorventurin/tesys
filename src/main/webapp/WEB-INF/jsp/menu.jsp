<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>		
		<div id="menu">
			<ul>					
				<li>
					<h3>Camisetas</h3>
					<ul>							                       
						<li><a href="<c:url value="/shirt/form"/>">Criar Nova</a></li>
					</ul>
					<ul>
						<li><a href="<c:url value="/shirt/list"/>">Listar</a></li>
					</ul>
<!-- 					<ul>							                        -->
<%-- 						<li><a href="<c:url value="/shirt/listAll"/>">Listar Todas</a></li> --%>
<!-- 					</ul> -->
				</li>														
			</ul>
			<ul>					
				<li>
					<h3>Usuários</h3>
					<ul>							                       
						<li><a href="<c:url value="/user/form"/>">Criar Novo</a></li>
					</ul>
					<ul>							                       
						<li><a href="<c:url value="/user/list"/>">Listar Todos</a></li>
					</ul>
				</li>														
			</ul>
		</div>