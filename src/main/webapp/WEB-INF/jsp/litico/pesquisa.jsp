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
			<form method="POST">
				<input id="nome" type="text" name="nome"  value="<c:out value="/pesquisa/${litico.name}"/>"/>
				<button type="submit" value="Search">Pesquisar</button>
			</form>
		</fieldset>
	</body>
</html>