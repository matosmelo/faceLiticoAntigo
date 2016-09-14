<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta name="viewport"
		content="width=device-width, initial-scale=1, maximum-scale=1.0" />
	<title>Lista geral dos Liticos</title>
	
	<!-- CSS  -->
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
		rel="stylesheet">
	<link href="resources/css/materialize.css" type="text/css"
		rel="stylesheet" media="screen,projection" />
	<link href="resources/css/style.css" type="text/css" rel="stylesheet"
	media="screen,projection" />
</head>

	<body>
	<nav class="yellow accent-3 lighten-1" role="navigation">
			<div class="nav-wrapper container">
	
			<a href="<c:url value="/litico"/>" id="logo-container"
				class="brand-logo">Home</a>
	
			<!-- 		Botão de opções -->
			<div class="fixed-action-btn vertical click-to-toggle "
				style="bottom: 45px; right: 24px;">
				<a class="btn-floating btn-large red"> <i
					class="large mdi-navigation-menu"></i>
				</a>
				<ul>
					<!-- <li><a class="btn-floating red"><i class="material-icons">insert_chart</i></a></li> -->
					<!-- <li><a class="btn-floating yellow darken-1"><i -->
					<!-- class="material-icons">format_quote</i></a></li> -->
<!-- 					<li><a class="btn-floating green" href=""><i class="material-icons">info</i></a></li> -->
<%-- 					<li><a class="btn-floating blue" href="<c:url value="/pesquisa"/>"><i class="material-icons">search</i></a></li> --%>
				</ul>
			</div>
			<!-- <ul class="right hide-on-med-and-down  "> -->
			<%-- <li><a href="<c:url value="/pesquisa"/>">Pesquisa</a></li> --%>
			<!-- <li><a href="html/instalacoes.html">Instalações</a></li> -->
			<!-- <li><a href="html/publicacoes.html">Publicações</a></li> -->
			<!-- <li><a href="html/como.html">Como chegar</a></li> -->
			<!-- <li><a href="html/links.html">Links</a></li> -->
			<!-- <li><a href="html/contato.html">Contato</a></li> -->
			<!-- <li><a href="html/sobre.html">Sobre o FACELITICO</a></li> -->
			<!-- </ul> -->
	
			<ul id="nav-mobile" class="side-nav">
<!-- 				<li><a href="html/pesquisa.html">Pesquisa</a></li> -->
				<!-- <li><a href="html/pesquisa.html">Pesquisa</a></li> -->
				<!-- <li><a href="html/instalacoes.html">Instalações</a></li> -->
				<!-- <li><a href="html/publicacoes.html">Publicações</a></li> -->
				<!-- <li><a href="html/como.html">Como chegar</a></li> -->
				<!-- <li><a href="html/links.html">Links</a></li> -->
				<!-- <li><a href="html/contato.html">Contato</a></li> -->
<!-- 				<li><a href="html/sobre.html">Sobre o FACELITICO</a></li> -->
			</ul>
			<a href="#" data-activates="nav-mobile" class="button-collapse"><i
				class="material-icons">menu</i></a>
			</div>
		</nav>
		<div class="container">
			<div class="row">
				<form class="col s12" action="<c:url value="/litico"/>" method="POST"  enctype="multipart/form-data">
					<div class="row">
    					<div class="input-field col s6">
					        <input id="nome" type="text" name="litico.nome"class="validate">
	       					<label for="Nome">Nome</label>
	     					</div>
	     
	     					<div class="input-field col s6">
						       <input id="cargo" type="text" name="litico.cargo" class="validate">
						       <label for="Cargo">Cargo</label>
     						</div>
   						</div>
				    	<div class="input-field col s6">
				        	<input id="localFisicoTrabalho" type="text" name="litico.localFisicoTabalho" class="validate">
				       			<label for="Local de Tabalho">Local de Trabalho</label>
				     	</div>
					    <div class="input-field col s6">
				       		<input id="partido" type="text" name="litico.partido" class="validate">
				       			<label for="Partido">Partido</label>
				     	</div>
				   		<div class="input-field col s6">
				        	<input id="estado" type="text" name="litico.estado" class="validate">
				       			<label for="Estado">Estado</label>
				     	</div>
				     	<div class="input-field col s6">
				       		<input id="cidade" type="text" name="litico.cidade" class="validate">
				       			<label for="Cidade">Cidade</label>
				     	</div>
				   </div>
			     	<div class="input-field col s6">
			       		<input id="urlRss" type="text" name="litico.urlRss" class="validate">
			       			<label for="Cidade">URL RSS</label>
			     	</div>
				   <button class="btn waves-effect waves-light black" type="submit" >Enviar<i class="material-icons right">send</i></button>
					<a class="btn waves-effect waves-light red" href="<c:url value="/todosLiticos"/>">Cancelar</a>
				</form>
			</div>
		</div>
	
		
<!-- 		<legend> Novo litico</legend> -->
<%-- 		<form action="<c:url value="/litico"/>" method="POST"  enctype="multipart/form-data"> --%>
<!-- 			Nome:<input id="nome" type="text" name="litico.nome" /> -->
<!-- 			</br> -->
<!-- 			Cargo:<input id="cargo" type="text" name="litico.cargo" /> -->
<!-- 			</br> -->
<!-- 			Local fisico de trabalho:<input id="localFisicoTrabalho" type="text" name="litico.localFisicoTabalho" /> -->
<!-- 			</br> -->
<!-- 			Partido:<input id="partido" type="text" name="litico.partido" /> -->
<!-- 			</br> -->
<!-- 			Estado:<input id="estado" type="text" name="litico.estado" /> -->
<!-- 			</br> -->
<!-- 			Cidade:<input id="cidade" type="text" name="litico.cidade" /> -->
<!-- 			</br> -->
<%-- 			<input type="hidden" name="litico.noticias.id" value="${litico.id }"> --%>
<!-- 			<input type="text" name="litico.noticias.nome"> -->
<!-- 			<input type="text" name="litico.noticias.texto"> -->
<!-- 			</br> -->
<!-- 			<button type="submit">Enviar</button> -->
<%-- 			<button href="<c:url value="/todosLiticos"/>">Cancelar</button> --%>
<!-- 		</form> -->
		
		<div class="container">
			<br>
			<br>
			<div class="section"></div>
		</div>
	
		<footer class="page-footer green">
			<div class="container">
				<div class="row">	
					<div class="col l6 s12">
						<h5 class="white-text">FaceLitico</h5>
						<p class="grey-text text-lighten-4">Tentado fazer a diferença na política.</p>
					</div>
		
					<div class="col l3 s12">
						<h5 class="white-text">Relacionados</h5>
						<ul>
							<li>
								<a class="white-text" href="#!">Monkey Mind</a>
							</li>
						</ul>
					</div>
					
					<div class="col l3 s12">
						<h5 class="white-text">Acompanhe</h5>
						<ul>
							<li><a class="white-text" href="#!">Facebook</a></li>
							<li><a class="white-text" href="#!">Twitter</a></li>
	                       <!-- <li><a class="white-text" href="#!">Linkedin</a></li> -->
						</ul>
					</div>
				</div>
			</div>
			
			<div class="footer-copyright">
				<div class="container">
					Produzido por 
					<a class="#000000 black-text text-lighten-3" href="www.monkeymind.com.br">Monkey Mind Co.</a>
				</div>
			</div>
		</footer>
	
		<!--  Scripts-->
		<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
		<script src="resources/js/materialize.js"></script>
		<script src="resources/js/init.js"></script>
		
	</body>
</html>