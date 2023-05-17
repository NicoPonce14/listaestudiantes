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
    <title>TITULO AQUi</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body class="container">
<h1>Crea un Estudiante o su Info</h1>
	<a href="/students/new">Crea un nuevo Estudiante</a>
	<a href="/contact/new">Crea la Info del estudiante</a>
	
	<div class="row">
			<div class="col-ms-12">
			<h2>Lista de Estudiantes</h2>
				<table class="table table-success table-striped">
					<thead>
						<tr>
							<th scope="col">Nombre</th>
							<th scope="col">Edad</th>
							<th scope="col">Direccion</th>
							<th scope="col">Ciudad</th>
							<th scope="col">Estado</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="todos" items="${todo}">
							<tr>

								<td><c:out value="${todos.nombre } ${todos.apellido }"></c:out></td>
								<td><c:out value="${todos.edad }"></c:out></td>
								<td><c:out value="${todos.contactInfo.direccion }"></c:out></td>
								<td><c:out value="${todos.contactInfo.ciudad }"></c:out></td>
								<td><c:out value="${todos.contactInfo.estado }"></c:out></td>
								

							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
</body>
</html>