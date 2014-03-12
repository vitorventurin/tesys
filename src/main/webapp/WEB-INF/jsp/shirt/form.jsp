<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:import url="/WEB-INF/jsp/cabecalho.jsp" />
	<div class="conteudo">
		<c:import url="/WEB-INF/jsp/menu.jsp" />
			<div id="principal"><div class="margem">
				<form action="<c:url value="/shirt/add"/>" method="post">
					<input type="hidden" name="shirt.company.id" value="${loggedUser.company.id}"/>
					<fieldset><legend>Nova camisa</legend>	
						<p>
						<label>Tamanho:</label>
						<select name="shirt.size">
							<option value="PP">PP</option>
							<option value="P">P</option>
							<option value="M">M</option>
							<option value="G">G</option>
							<option value="GG">GG</option>
						</select>
						</p>
						<p>
						<label>Estilo:</label>
						<select name="shirt.style">
							<option value="BABYLOOK">Baby Look</option>
							<option value="TSHIRT">Camiseta</option>
							<option value="JACKET">Jaqueta</option>
							<option value="MUSCLE">Regata</option>
						</select>
						</p>
						<p>
						<label>Tecido:</label>
						<select name="shirt.tissue">
			                <option value="COTTON">Algodão</option>
		                	<option value="NYLON">Nylon</option>
		                	<option value="POLYESTER">Poliéster</option>
		       			</select>
						</p>
<!-- 						<p> -->
<!-- 						<label>Gola:</label> -->
<!-- 								<select name="shirt.neck"> -->
<!-- 					                <option value="V">Gola V</option> -->
<!-- 				                	<option value="POLO">Pólo</option> -->
<!-- 				                	<option value="U">Gola U</option> -->
<!-- 				                	<option value="DEFAULT">Padrão</option> -->
<!-- 				                	<option value="RAIN">Capa de Chuva</option> -->
<!-- 				       			</select> -->
<!-- 						</p> -->
<!-- 						<p> -->
<!-- 						<label>Manga:</label> -->
<!-- 								<select name="shirt.arm"> -->
<!-- 					                <option value="LONG">Longa</option> -->
<!-- 				                	<option value="SHORT">Curta</option>                 -->
<!-- 				       			</select> -->
<!-- 						</p> -->
						<p>
							<label>Cor:</label>							
							
							<script>								
								var code;
								var canvas;
							
								function hexFromRGB(r, g, b) {
									var hex = [
										r.toString( 16 ),
										g.toString( 16 ),
										b.toString( 16 )
									];
									$.each( hex, function( nr, val ) {
										if ( val.length === 1 ) {
											hex[ nr ] = "0" + val;
										}
									});
									return hex.join( "" ).toUpperCase();
								}
																
								function refreshSwatch() {
									var red = $( "#red" ).slider( "value" ),
										green = $( "#green" ).slider( "value" ),
										blue = $( "#blue" ).slider( "value" ),
										hex = hexFromRGB( red, green, blue );
									$( "#swatch" ).css( "background-color", "#" + hex );
									document.getElementById("cor").setAttribute("value", hex);
// 									var cor = $('#cor').val();
									
									$.getJSON('<c:url value="/baseshirtcanvas/"/>' + hex, function (json) {
										code = json.baseShirtCanvas.code;									
									});
								}
								$(function() {
									$( "#red, #green, #blue" ).slider({
										orientation: "horizontal",
										range: "min",
										max: 255,
										value: 127,
										slide: refreshSwatch,
										change: refreshSwatch
									});
									$( "#red" ).slider( "value", 255 );
									$( "#green" ).slider( "value", 140 );
									$( "#blue" ).slider( "value", 60 );
								});
								
								function colorirCamisa() {
									if (canvas == null) {canvas = new fabric.Canvas('c');}
									var $ = function(id){return document.getElementById(id);};
									var svg = code;
								    fabric.loadSVGFromString(svg, function(objects, options) {
								      if (objects.length === 1) {
										canvas.clear();
										canvas.add(objects[0]);
										canvas.selection = false;
								      }
								      else {
								        canvas.add(new fabric.PathGroup(objects, options));
								      }
								      canvas.renderAll();
								    });
								}
								</script>
								
							<div class="demo">
								<input id="cor" type="text" name="shirt.color" value=""/>
								<input type="button" value="Preview" onclick="colorirCamisa();"/>
							
								<div id="red"></div>
								<div id="green"></div>
								<div id="blue"></div>
								
								<div id="swatch" class="ui-widget-content ui-corner-all"></div>
							
							</div><!-- End demo -->							
						</p>
						<p>
<!-- 							<label>Preview</label> -->
							<canvas id="c" width="358" height="325" class="estilo-do-canvas"></canvas>	
													
						</p>						
						<input type="submit" value="Salvar">
					</fieldset>
				</form>
			</div>
		</div>
		<div class="clearboth"></div>
	</div>	
</div>
<c:import url="/WEB-INF/jsp/rodape.jsp" />