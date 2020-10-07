<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<title>Certificacion</title>
</head>
<body>
	<div class="container">
		<div class="row ">
			<div class="col">

				<!--    desarrollo del ensayo -->
				<div id="titulo" class="my-2">
					<h3>Mantenedor de Quinchos</h3>
					<br />
				</div>

				<div class="row">


					<form action="/" method="post">
						<div class="form-row ">
							<div class="col">
								<label for="estado_id">Estado</label> <select id="estado_id"
									name="estado_id" class="custom-select" required="required">
									<c:forEach var="estado" items="${estados}">
										<option value="${estado.id}">${estado.descripcion}</option>
									</c:forEach>

								</select>
							</div>

							<div class="col">
								<label for="departamento_id">Departamento</label> <select
									id="departamento_id" name="departamento_id"
									class="custom-select" required="required">
									<c:forEach var="departamento" items="${departamentos}">
										<option value="${departamento.id}">${departamento.numero}</option>
									</c:forEach>
								</select>
							</div>


							<div class="col">
								<label for="fecha_desde">Fecha desde</label> <input
									id="fecha_desde" name="fecha_desde" type="date"
									class="form-control" placeholder="Last name" required="required">

							</div>


							<div class="col">
								<label for="fecha_hasta">Fecha hasta</label> <input
									id="fecha_hasta" name="fecha_hasta" type="date"
									class="form-control" placeholder="Last name" required="required">
							</div>
						</div>
					

				</div>


				<br />
				<div id="titulo" class="my-2">
					<h3>Tabla de datos</h3>
					<br />
				</div>


				<div class="row">
					<div class="col">
						<table class="table">
							<thead>
								<tr>
									<th scope="col">#ID</th>
									<th scope="col">Estado</th>
									<th scope="col">Departamento</th>
									<th scope="col">Fecha</th>
								</tr>
							</thead>


							<tbody>

								<c:forEach var="arriendo" items="${arriendos}">
									<tr>
										<th scope="row">${arriendo.id}</th>
										<td>${arriendo.estado.descripcion}</td>
										<td>${arriendo.departamento.numero}</td>
										<td>${arriendo.fecha}</td>
									</tr>
								</c:forEach>

								<div class="row my-2">
									<div class="col">
										<button type="submit" class="btn btn-dark ">Buscar</button>
									</div>
								</div>
</form>
							</tbody>
						</table>
					</div>


				</div>

				<!--    desarrollo del ensayo -->
			</div>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>