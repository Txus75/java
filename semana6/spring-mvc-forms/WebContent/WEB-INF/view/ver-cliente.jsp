<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Procesar Cliente</title>
	</head>
	<body>
		<h1>Cliente</h1>
		<p>Nombre: ${cliente.nombre}</p>
		<p>NIF: ${cliente.nif}</p>
		<p>Provincia: ${cliente.provincia}</p>
		<p>Sector: ${cliente.sector}</p>
		<p>Pagos:</p>
		<ul>
			<c:forEach var="pago" items="${cliente.pagos}">
				<li>${pago}</li>
			</c:forEach>
		</ul>
		<p>DNI: ${cliente.dni_admin}</p>
		<p>Crédito: ${cliente.credito}</p>
	</body>
</html>