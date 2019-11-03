<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Alta Clientes</title>
		<style>
			.error {
				color: red;
			}
		</style>
	</head>
	<body>
		<form:form action="procesar" modelAttribute="cliente">
			<label for="nombre">Nombre*: </label><form:input type="text" path="nombre" id="nombre" /><form:errors path="nombre" cssClass="error" /><br>
			<label for="nif">NIF: </label><form:input type="text" path="nif" id="nif" /><form:errors path="nif" cssClass="error" /><br>
			<label for="provincia">Provincia: </label><form:select path="provincia" id="provincia">
				<form:options items="${cliente.listaProvincias}" />
			</form:select><br>
			<label for="sector">Sector: </label><form:radiobuttons path="sector" items="${cliente.listaSectores}" id="sector" /><br>
			<label for="pagos">Pagos: </label><form:checkboxes path="pagos" items="${cliente.listaPagos}" id="pagos" /><br>
			<label for="credito">Crédito: </label><form:input type="number" path="credito" id="credito" /><form:errors path="credito" cssClass="error" /><br>
			<label for="dni">DNI admin: </label><form:input path="dni_admin" id="dni" /><form:errors path="dni_admin" cssClass="error" /><br>
			<input type="submit">
		</form:form>
	</body>
</html>