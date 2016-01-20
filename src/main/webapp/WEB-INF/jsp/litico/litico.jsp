<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	</head>
		<title>Lista geral dos Liticos</title>
	
	<body>

		<fieldset>
			<legend>Lista geral dos liticos</legend>
			<table>
				<thead>
					<tr>
						<th>Nome</th>
						<th>Cargo</th>
						<th>Partido</th>
						<th>Estado</th>
						<th>Cidade</th>
						<th>Local de trabalho</th>
						<th>Opções</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${liticoList}" var="litico">
						<tr>
							<td>${litico.nome}</td>
							<td>${litico.cargo}</td>
							<td>${litico.partido}</td>
							<td>${litico.estado}</td>
							<td>${litico.cidade}</td>
							<td>${litico.localFisicoTabalho}</td>
							<td><a href="<c:url value="/${litico.id}"/>">Visualiza litico</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</fieldset>
		<a href="<c:url value="/pesquisa"/>">Realizar pesquisa</a>
	</body>
</html>