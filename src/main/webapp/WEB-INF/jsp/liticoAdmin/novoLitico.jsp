<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Novo Litico</title>
	</head>

	<body>
		<legend> Novo litico</legend>
		<form action="<c:url value="/litico"/>" method="POST"  enctype="multipart/form-data">
			Nome:<input id="nome" type="text" name="litico.nome" />
			</br>
			Cargo:<input id="cargo" type="text" name="litico.cargo" />
			</br>
			Local fisico de trabalho:<input id="localFisicoTrabalho" type="text" name="litico.localFisicoTabalho" />
			</br>
			Partido:<input id="partido" type="text" name="litico.partido" />
			</br>
			Estado:<input id="estado" type="text" name="litico.estado" />
			</br>
			Cidade:<input id="cidade" type="text" name="litico.cidade" />
			</br>
			<input type="hidden" name="litico.noticias.id" value="${litico.id }">
			<input type="text" name="litico.noticias.nome">
			<input type="text" name="litico.noticias.texto">
			</br>
			<button type="submit">Enviar</button>
			<button href="<c:url value="/todosLiticos"/>">Cancelar</button>
		</form>
		
	</body>
</html>