<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Editar Litico</title>
	</head>
	
	<body>
		<fieldset>
			<legend>Editar Litico</legend>
<!-- 			enctype="multipart/form-data -->
			<form action="<c:url value="/litico/${litico.id}"/>" method="POST" ">
				<input type="hidden" name="litico.id" value="${litico.id }" />
				Nome:<input id="nome" type="text" name="litico.nome" value="${litico.nome }" /> 
				Cargo:<input id="cargo" type="text" name="litico.cargo" value="${litico.cargo }" /> 
				Partido:<input id="partido" type="text" name="litico.partido" value="${litico.partido }" /> 
				Local de trabalho:<input id="localFisicoTabalho" type="text" name="litico.localFisicoTabalho" value="${litico.localFisicoTabalho}" /> 
				Estado:<input id="estado" type="text" name="litico.estado" value="${litico.estado }" /> 
				Cidade:<input id="cidade" type="text" name="litico.cidade" value="${litico.cidade }" /> 
				
				<button type="submit" name="_method" value="PUT">Enviar</button>
			</form>
			<a href="<c:url value="/todosLiticos"/>">cancelar</a>

		</fieldset>
	</body>
</html>