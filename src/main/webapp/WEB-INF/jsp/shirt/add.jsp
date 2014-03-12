<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:import url="/WEB-INF/jsp/cabecalho.jsp" />
	<div class="conteudo">
		<c:import url="/WEB-INF/jsp/menu.jsp" />
		<div id="principal">
			<div class="margem">
				<p>A camisa foi adicionada com sucesso!</p>
				<p>Clique <a href='<c:url value="/shirt/list"/>'>aqui</a> para visualizar a lista de camisas.</p>
			</div>
		</div>
	</div>
<c:import url="/WEB-INF/jsp/rodape.jsp" />	