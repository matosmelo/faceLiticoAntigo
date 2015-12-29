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
		
			<form action="<c:url value="/litico/${litico.id}"/>" method="POST" enctype="multipart/form-data">
				<input type="hidden" name="litico.id" value="${litico.id }" />
				Nome:<input id="nome" type="text" name="litico.nome" value="${litico.nome }" /> 
<%-- 				Preço:<input id="preco" type="text" name="produto.preco" value="${produto.preco }" /> --%>
				
				<button type="submit" name="_method" value="PUT">Enviar</button>
			</form>
		
<%-- 			<a href="<c:url value="/produto"/>">cancelar</a> --%>
		</fieldset>
	</body>
</html>