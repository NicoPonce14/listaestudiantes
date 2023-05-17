<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Nuevo Contacto</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
	<div class="container">
		<h2>Contact Info</h2>
		<form:form action="/contact/new" method="POST"
			modelAttribute="contact">
			<div class="form-group">
				<form:label path="estudiante">Estudiante</form:label>
				<form:errors path="estudiante" />
				<form:select class="form-control" path="estudiante">
					<c:forEach items="${per}" var="per">

						<form:option value="${per.id}">
						${per.nombre } ${per.apellido }
						</form:option>
					</c:forEach>
				</form:select>
			</div>
			<div class="form-group">
				<form:label path="direccion">Direccion</form:label>
				<form:errors path="direccion" />
				<form:input class="form-control" path="direccion" />
			</div>
			<div class="form-group">
				<form:label path="ciudad">Ciudad</form:label>
				<form:errors path="ciudad" />
				<form:input  class="form-control" path="ciudad" />
			</div>
			<div class="form-group">
				<form:label path="estado">Estado</form:label>
				<form:errors path="estado" />
				<form:input  class="form-control" path="estado" />
			</div>
			<button>Add License</button>
		</form:form>
	</div>
</body>
</html>