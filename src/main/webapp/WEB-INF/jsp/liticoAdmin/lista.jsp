<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Lista de Liticos</title>
	</head>
	
	<body>
		<span>Lista liticos</span>

		<fieldset>
			<table>
				<thead>
					<tr>
						<th>Nome</th>
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
<!-- 							Arrumar no banco o e no DAO o nome da string -->
							<td>${litico.localFisicoTabalho}</td>
							<td>
								<form action="<c:url value="/litico/${litico.id}"/>" method="POST">
									<button name="_method" value="DELETE">Remover</button>
								</form>
							</td>
							<td><a href="<c:url value="/litico/${litico.id}"/>">Editar</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</fieldset>
	<a href="<c:url value="/novoLitico"/>">Novo Litico</a>
	</body>
</html>