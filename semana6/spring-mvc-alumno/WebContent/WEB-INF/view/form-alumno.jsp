<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Formulario Alumno</title>
		<style>
			.error {
				color: red;
			}
		</style>
	</head>
	<body>
		<h1>Formulario de alta:</h1>
		<form:form action="procesar" modelAttribute="alumno">
			<p>Los campos con * son obligatorios.</p>
			<label for="nombre">Nombre*: </label><form:input type="text" path="nombre" id="nombre" /> <form:errors path="nombre" cssClass="error" /><br><br>
			<label for="nif">NIF*: </label><form:input type="text" path="nif" id="nif" /> <form:errors path="nif" cssClass="error" /><br><br>
			<label for="email">e-mail: </label><form:input type="text" path="email" id="email" /> <form:errors path="email" cssClass="error" /><br><br>
			<label for="becado">Becado: </label><form:radiobuttons path="becado" items="${alumno.listaBecados}" id="becado" /><br><br>
			<label for="asignaturas">Pagos: </label><form:checkboxes path="asignaturas" items="${alumno.listaAsignaturas}" id="asignaturas" /><br><br>
			<input type="submit">
		</form:form>
	</body>
</html>