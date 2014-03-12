<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:import url="/WEB-INF/jsp/cabecalho.jsp" />
	<div class="conteudo">
		<c:import url="/WEB-INF/jsp/menu.jsp" />
			<div id="principal"><div class="margem">
<!--<form action="<c:url value="/produto/alteraLista"/>">-->
<!--</form>-->
	
<form action="<c:url value="/shirt/removeBulk"/>">
	<table id="hor-minimalist-b" summary="Employee Pay Sheet">
		<thead>
			<tr>
				<th scope="col"></th>
				<th scope="col">Id</th>
				<th scope="col">Tamanho</th>
				<!-- <th scope="col">Inicio Venda</th>-->
				<th scope="col">Estilo</th>
				<th scope="col">Tecido</th>
<!-- 				<th scope="col">Manga</th> -->
				<th scope="col">Mostrar</th>
				<th scope="col">Remover</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${shirtList}" var="shirt" varStatus="s">
				<tr>
					<td><input type="checkbox" name="shirts[${s.index}].id" value="${shirt.id}"></td>
					<td>${shirt.id}</td>
					<td>${shirt.size}</td>
					<td>${shirt.style}</td>
					<td>${shirt.tissue}</td>
<%-- 					<td>${shirt.arm}</td> --%>
					<!--<td><fmt:formatDate value="${produto.dataInicioVenda.time}" pattern="dd/MM/yyyy"/></td>-->
					<td><a href="<c:url value="/shirt/show"/>?id=${shirt.id}"><img src="/images/doc.png"/></a></td>
					<td><a href="<c:url value="/shirt/remove"/>?shirt.id=${shirt.id}"><img src="/images/del.png"/></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>	
	<br/>
	<input type="submit" value="Remove Selecionados!">
	<br/>
	<p>Clique <a href="<c:url value="/shirt/form"/>">aqui</a> para cadastrar uma camisa!</p>		
</form>
</div>
	</div>
	<div class="clearboth"></div>			
<c:import url="/WEB-INF/jsp/rodape.jsp" />