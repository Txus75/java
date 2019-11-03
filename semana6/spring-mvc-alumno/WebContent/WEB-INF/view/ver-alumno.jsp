<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Alumno</title>
	</head>
	<body>
		<h1>Alumno:</h1>
		<p>Nombre: ${alumno.nombre}</p>
		<p>NIF: ${alumno.nif}</p>
		<p>e-mail: ${alumno.email}</p>
		<p>Becado: ${alumno.becado}</p>
		<p>Asignaturas: </p>
		<ul>
			<c:forEach var="asignatura" items="${alumno.asignaturas}">
				<li>${asignatura}</li>
			</c:forEach>
		</ul>
	</body>
</html>