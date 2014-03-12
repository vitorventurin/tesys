<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:import url="/WEB-INF/jsp/cabecalho.jsp" />
	<div class="conteudo">
		<c:import url="/WEB-INF/jsp/menu.jsp" />
			<div id="principal"><div class="margem">
			<form name="shirtForm" action="<c:url value="/shirt/refresh"/>" method="post">
				<fieldset>
				<legend>Detalhes da camisa</legend>				
				<p>
					<label>Id</label>
					<c:out value="${shirt.id}"></c:out>
				</p>
				<p>
					<label>Tamanho</label>
					<c:out value="${shirt.size}"></c:out>
					</select>
				</p>
				<p>
					<label>Estilo:</label>
					<c:out value="${shirt.style}"></c:out>
				</p>				
				<p>
					<label>Cor</label>
					<c:out value="White"></c:out>
				</p>
				<p>
					<label>Preview</label>
					<canvas id="canvas" width="300" height="300"></canvas>
				</p>
<!-- 				<input type="submit" value="Atualizar"> -->
				</fieldset>
			</form>
		</div>
	</div>
	<div class="clearboth"></div>			
<c:import url="/WEB-INF/jsp/rodape.jsp" />