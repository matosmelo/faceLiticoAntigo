<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Visualiza Litico</title>
	</head>
	
	<body>
		<fieldset>
			<legend>Pequisa Litico</legend>
				<form action="<c:url value="/pesquisa/string"/>">
   					Geral:<input name="string"/>
   					<button type="submit">Pesquisar</button>
   				</form>
		</fieldset>
		<a href="<c:url value="/litico"/>">Todos os liticos</a>
	</body>
</html>