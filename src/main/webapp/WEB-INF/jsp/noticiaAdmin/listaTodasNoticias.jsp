<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1.0" />
<title>Todas as Noticias</title>

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
		<!-- Botão de opções -->
		<div class="fixed-action-btn vertical click-to-toggle "
			style="bottom: 45px; right: 24px;">
			<a class="btn-floating btn-large red"> <i
				class="large mdi-navigation-menu"></i>
			</a>
			<ul>
				<!-- <li><a class="btn-floating red"><i class="material-icons">insert_chart</i></a></li> -->
				<!-- <li><a class="btn-floating yellow darken-1"><i -->
				<!-- class="material-icons">format_quote</i></a></li> -->
				<li><a class="btn-floating green" href="html/sobre.html"><i
						class="material-icons">info</i></a></li>
				<!-- <li><a class="btn-floating blue" -->
				<%-- href="<c:url value="/pesquisa"/>"><i class="material-icons">search</i></a></li> --%>
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
			<li><a href="html/pesquisa.html">Pesquisa</a></li>
			<!-- <li><a href="html/pesquisa.html">Pesquisa</a></li> -->
			<!-- <li><a href="html/instalacoes.html">Instalações</a></li> -->
			<!-- <li><a href="html/publicacoes.html">Publicações</a></li> -->
			<!-- <li><a href="html/como.html">Como chegar</a></li> -->
			<!-- <li><a href="html/links.html">Links</a></li> -->
			<!-- <li><a href="html/contato.html">Contato</a></li> -->
			<li><a href="">Sobre</a></li>
		</ul>
		<a href="#" data-activates="nav-mobile" class="button-collapse"><i
			class="material-icons">menu</i></a>
	</div>
	</nav>

	<div class="section no-pad-bot" id="index-banner">
		<div class="container">
			<br> <br>
			<p class="flow-text center blue-text ">TODAS AS NOTICIAS</p>
			<div class="row ">
				<c:forEach items="${noticiasList}" var="noticias">
					<div class="col s12 m6">
						<div class="card #fafafa grey lighten-5">
							<div class="card-content dark-text">
								<span class="card-title">${noticias.tituloNoticia}</span>
								<%-- <p>${liticoNoticia.texto}</p> --%>
							</div>
							<div class="card-action">
								<a class="waves-effect #2196f3 blue btn"
									href="<c:url value="${noticias.url}"/>" target="_blank">Abrir
									noticia</a>
								<div class="chip">
									${noticias.positivo} <i class="material-icons">thumb_up</i>
								</div>
								<div class="chip">
									${noticias.negativo} <i class="material-icons">thumb_down</i>
								</div>
								<div class="chip">
									${noticias.neutro} <i class="material-icons">thumbs_up_down</i>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
				<%-- 				<a href="<c:url value="/pesquisa"/>">Realizar nova pesquisa</a> --%>
			</div>
		</div>
	</div>

	<div class="container">
		<br> <br> <br> <br> <br> <br> <br>
		<br> <br> <br> <br>
		<div class="section"></div>
	</div>

	<footer class="page-footer green">
	<div class="container">
		<div class="row">
			<div class="col l6 s12">
				<h5 class="white-text">FaceLitico</h5>
				<p class="grey-text text-lighten-4">Tentado fazer a diferença na
					política.</p>
			</div>

			<div class="col l3 s12">
				<h5 class="white-text">Relacionados</h5>
				<ul>
					<li><a class="white-text" href="#!">Monkey Mind</a></li>
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
			Produzido por <a class="#000000 black-text text-lighten-3"
				href="www.monkeymind.com.br">Monkey Mind Co.</a>
		</div>
	</div>
	</footer>

	<!--  Scripts-->
	<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script src="resources/js/materialize.js"></script>
	<script src="resources/js/init.js"></script>

</body>
</html>