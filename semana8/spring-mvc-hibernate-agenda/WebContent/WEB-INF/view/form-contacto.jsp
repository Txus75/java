<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Formulario de Contactos</title>
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" />
		<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
	</head>
	<body>
		<div class="container">
			<div class="jumbotron">
				<h1>${ tarea.idtarea == 0 ? "Nuevo" : "Editar"} Contacto</h1>
				<p>Mantenimiento de una Agenda de Contactos realizado con Spring e Hibernate.</p>
			</div>
			<form:form action="savecontacto" modelAttribute="contacto" method="post">
				<form:hidden path="idContacto" />
				<div class="form-group" class="float-none">
					<label for="nombre">Nombre:</label>
					<form:input path="nombre" class="form-control" />
				</div>
				<div class="form-group">
					<label for="email">E-Mail:</label>
					<form:input path="email" class="form-control" />
				</div>
				<div class="form-group">
					<label for="telefono">Teléfono:</label>
					<form:input path="telefono" class="form-control" />
				</div>
				<input type="submit" value="Guardar" class="btn btn-outline-dark" />
				<a href="${pageContext.request.contextPath}/" class="btn btn-outline-dark float-right">Lista de Contactos</a>
			</form:form>
		</div>
	</body>
</html>