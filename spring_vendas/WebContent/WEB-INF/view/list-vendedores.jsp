<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>

</head>
<body>

<div id="wrapper">
	<div id="header">
		<h2>Lista de vendedores</h2>
	</div>
</div>

<div id="container">
	<div id="content">
		<table>
			<tr>
				<th>Nome</th>
				<th>Total de Vendas</th>
			</tr>
			
			<c:forEach var="tempVendedor" items="${vendedor}">
			<tr>
				<td>${tempVendedor.nome}</td>
				<td>${tempVendedor.totalVendas}</td>
			</tr>
			
			</c:forEach>
		</table>
	
	</div>
</div>

</body>

</html>