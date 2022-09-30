<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<script src="<c:url value='/resources/js/script.js'/>"></script>
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
	integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
	crossorigin="anonymous"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body class="container bg-dark">

	<div class="bg-light m-3 p-5 container rounded">
		
		<h2 class="text-center">Form Mahasiswa</h2>
		
		<div class="w-100 d-flex justify-content-center">
			<form class="shadow-sm p-3 m-4 rounded-3 bg-body w-50 d-flex flex-column" method="post"
				action="mahasiswa/add">
				<label class="form-label">Nama</label> 
				<input class="form-control" name="nama">
				<label class="form-label">NIM</label>
				<input class="form-control" name="nim"> 
				
				<!--  
				<label class="form-label">Program Studi</label>
				<select>
				<c:forEach items="${allProdi}" var="i">
				<option id="${i.prodiId}">${i.prodiNama}</option>
				</c:forEach>
				</select>
				-->
				<label class="form-label">Email</label>
				<input class="form-control" name="email">
				<button class="btn btn-primary my-3" type="submit">Submit</button>
			</form>
		</div>
	</div>

	<div class="container m-3 p-5 rounded bg-light">
		<h2 class="text-center m-3">Mahasiswa List</h2>
		<form method=post action="mahasiswa/edit" id="edit-form">
			<table class="table table-striped">

				<tr>
					<th>ID</th>
					<th>Nama</th>
					<th>NIM</th>
					<th>Email</th>
					<th>Edit / Hapus</th>
				</tr>

				<c:forEach items="${allMahasiswa}" var="i">
					<tr id="${i.mahasiswaId}">
						<td>${i.mahasiswaId}</td>
						<td>${i.mahasiswaNama}</td>
						<td>${i.mahasiswaNim}</td>
						<td>${i.mahasiswaEmail}</td>
						<td class="d-flex gap-2"><a class="btn btn-warning"
							id="${i.mahasiswaId}" onclick="editHandler(event)">Edit</a><a
							class="btn btn-danger"
							href="<c:url value='/mahasiswa/remove/${i.mahasiswaId}' />">Hapus</a></td>
					</tr>
				</c:forEach>


			</table>
		</form>
	</div>

</body>
</html>