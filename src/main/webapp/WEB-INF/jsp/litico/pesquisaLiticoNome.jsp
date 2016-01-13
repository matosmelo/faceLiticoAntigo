<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Visualiza Litico na busca por nome</title>
	</head>
	
	<body>
		<fieldset>
			<legend>Visualiza Litico na busca por nome</legend>
			<tr>
				<td>${litico.nome}</td>
				<td>${litico.cargo}</td>
				<td>${litico.partido}</td>
				<td>${litico.estado}</td>
				<td>${litico.cidade}</td>
				<td>${litico.localFisicoTabalho}</td>
			</tr>
		</fieldset>
	</body>
</html>