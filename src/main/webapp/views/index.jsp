<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<title>Titulo da Aplicação</title>
	<link rel="stylesheet" href="<c:url value="/assets/css/bootstrap.min.css"/>"  />
	<script src="<c:url value="/assets/js/jquery-1.11.1.js"/>"></script>
	<script src="<c:url value="/assets/js/myscript.js"/>"></script>
	
	<c:if test="${!cadastro}">
		<h2>Bem vindo!</h2>
	</c:if>
	<c:if test="${cadastro}">
		<h2>Cadastro de Clientes</h2>
		<br/>
		<input type="text" id="nome" class="form-control col-md-4">
		<br/>
		<input type="number" id="idade" class="form-control col-md-4">
		<br/>
		<input type="text" id="profissao" class="form-control col-md-4">
		<br/>
		<button type="button" class="btn btn-primary" onclick="saveClient()">Cadastrar</button>
	</c:if>
	
	<label id="result"></label>
</body>
</html>
