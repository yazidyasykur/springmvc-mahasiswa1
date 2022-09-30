

function editHandler(event){
	let getid = event.target.id;
	
	let docs = document.querySelector(`tr#${getid}`);
	
	let id = event.target.id;
	let nama = docs.children[1].textContent;
	let nim = docs.children[2].textContent;
	let email = docs.children[3].textContent;
	
	console.log(nama);
	console.log(nim);
	console.log(email);
	
	docs.innerHTML = `
	<tr>
	<td><input class="form-control" name="editId" value="${id}"></input></td>
	<td><input class="form-control" name="editNama" value="${nama}"></input></td>
	<td><input class="form-control" name="editNim" value="${nim}"></input></td>
	<td><input class="form-control" name="editEmail" value="${email}"></input></td>
	<td><button id="${id}" class="btn btn-primary" onclick="editSubmitHandler(event)">Done</button></td>
	</tr>
	
	`;
}

function editSubmitHandler(event){
	console.log(document.getElementById("edit-form"));
}
