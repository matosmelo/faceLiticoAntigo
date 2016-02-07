<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				<li><a class="btn-floating red"
					href="<c:url value="/novoLitico"/>"><i class="material-icons">mode_edit</i></a></li>
				<!-- 				<li><a class="btn-floating yellow darken-1"><i -->
				<!-- 						class="material-icons">format_quote</i></a></li> -->
				<!-- 				<li><a class="btn-floating green" href="html/sobre.html"><i -->
				<!-- 						class="material-icons">info</i></a></li> -->
				<li><a class="btn-floating blue"
					href="<c:url value="/pesquisa"/>"><i class="material-icons">search</i></a></li>
			</ul>
		</div>

		<!-- 		<ul class="right hide-on-med-and-down  "> -->

		<%-- 			<li><a href="<c:url value="/pesquisa"/>">Pesquisa</a></li> --%>
		<!-- 			<li><a href="html/instalacoes.html">Instalações</a></li> -->
		<!-- 			<li><a href="html/publicacoes.html">Publicações</a></li> -->
		<!-- 			<li><a href="html/como.html">Como chegar</a></li> -->
		<!-- 			<li><a href="html/links.html">Links</a></li> -->
		<!-- 			<li><a href="html/contato.html">Contato</a></li> -->
		<!-- 			<li><a href="html/sobre.html">Sobre o FACELITICO</a></li> -->
		<!-- 		</ul> -->

		<ul id="nav-mobile" class="side-nav">
			<li><a href="html/pesquisa.html">Pesquisa</a></li>
			<!-- 			<li><a href="html/pesquisa.html">Pesquisa</a></li> -->
			<!-- 			<li><a href="html/instalacoes.html">Instalações</a></li> -->
			<!-- 			<li><a href="html/publicacoes.html">Publicações</a></li> -->
			<!-- 			<li><a href="html/como.html">Como chegar</a></li> -->
			<!-- 			<li><a href="html/links.html">Links</a></li> -->
			<!-- 			<li><a href="html/contato.html">Contato</a></li> -->
			<li><a href="html/sobre.html">Sobre o FACELITICO</a></li>
		</ul>
		<a href="#" data-activates="nav-mobile" class="button-collapse"><i
			class="material-icons">menu</i></a>
	</div>
	</nav>

	<div class="section no-pad-bot" id="index-banner">
		<div class="container">
			<br> <br>
			<div class="row ">

				<c:forEach items="${liticoList}" var="litico">
					<a class="" href="<c:url value="/litico/${litico.id}"/>">

						<ul class="collection z-depth-4">

							<!-- 											 width="70" height="90" -->
							<li class="collection-item avatar "><img
								src="resources/imagens/felipe.jpg" alt="" class="circle">
								<span class="title">${litico.nome}</span>
								<p>${litico.cargo}/${litico.estado}/${litico.partido}/${litico.cargosAnteriores}/${litico.noticias}</p>
								<a href="#!" class="secondary-content"></a>
								<form action="<c:url value="/litico/${litico.id}"/>"
									method="POST" class="secondary-content">
									<button name="_method" value="DELETE">
										<i class="material-icons">delete</i>
									</button>
								</form>
						</ul>
					</a>
				</c:forEach>
			</div>

		</div>
	</div>


	<div class="container">
		<br> <br>

		<div class="section"></div>
	</div>

	<footer class="page-footer green">
	<div class="container">
		<div class="row">
			<div class="col l6 s12">
				<h5 class="white-text">LACIFID</h5>
				<p class="grey-text text-lighten-4">Somos um laboratorio de
					pesquisa....</p>


			</div>
			<div class="col l3 s12">
				<h5 class="white-text">Relacionados</h5>
				<ul>
					<li><a class="white-text" href="#!">USP</a></li>
				</ul>
			</div>
			<div class="col l3 s12">
				<h5 class="white-text">Acompanhe</h5>
				<ul>
					<li><a class="white-text" href="#!">Facebook</a></li>
					<li><a class="white-text" href="#!">Twitter</a></li>
					<li><a class="white-text" href="#!">Linkedin</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="footer-copyright">
		<div class="container">
			Produzido por <a class="#1a237e-text text-lighten-3"
				href="www.monkeymind.com.br">MMCo</a>
		</div>
	</div>
	</footer>


	<!--  Scripts-->
	<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script src="resources/js/materialize.js"></script>
	<script src="resources/js/init.js"></script>

</body>
</html>
