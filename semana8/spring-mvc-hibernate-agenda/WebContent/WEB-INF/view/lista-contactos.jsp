<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Agenda de Contactos</title>
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" />
		<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
	</head>
	<body>
		<div class="container">
			<div class="jumbotron">
				<h1>Lista de Contactos</h1>
				<p>Mantenimiento de una Agenda de Contactos realizado con Spring e Hibernate.</p>
			</div>
			<a href="addcontacto" class="btn btn-dark mb-4 float-right">Añadir Contacto</a>
			<table class="table table-hover">
				<thead class="thead-dark">
					<tr>
						<th>ID</th>
						<th>NOMBRE</th>
						<th>E-MAIL</th>
						<th>TELÉFONO</th>
						<th>ACCIONES</th>
					</tr>
				</thead>
				<c:forEach var="contacto" items="${contacto}">
					<c:url var="linkEditar" value="/contacto/updatecontacto">
						<c:param name="idContacto" value="${contacto.idContacto}" />
					</c:url>
					<c:url var="linkBorrar" value="/contacto/deletecontacto">
						<c:param name="idContacto" value="${contacto.idContacto}" />
					</c:url>
					<tr>
						<td>${contacto.idContacto}</td>
						<td>${contacto.nombre}</td>
						<td>${contacto.email}</td>
						<td>${contacto.telefono}</td>
						<td>
							<a href="${linkEditar}" class="btn btn-outline-success btn-sm">Editar</a>
							<a href="${linkBorrar}" class="btn btn-outline-danger btn-sm" onclick="if(!confirm('¿Está seguro?')) return false">Borrar</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</body>
</html>