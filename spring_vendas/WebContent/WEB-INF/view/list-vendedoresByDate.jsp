<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>

</head>
<body>

<h2>Lista de vendedores por data</h2>

<!-- Exibir dados dos vendedores -->
<table>
	<tr>
		<th>ID</th>
		<th>Nome</th>
	</tr>
			
	<c:forEach var="tempVendedor" items="${vendedor}">
		<tr>
			<td>${tempVendedor.id}</td>
			<td>${tempVendedor.nome}</td>
		</tr>
	</c:forEach>
</table>

<form action="listByDate" method="GET">

<!-- Campos para entrada das datas -->
<table>
	<tbody>
		<tr>
			<td><label>Data início</label></td>
			<td><input type="text" name="dataInicio"/></td>
			<td><input type="submit" value="Submit"></td>
		</tr>
		<tr>
			<td><label>Data final</label></td>
			<td><input type="text" name="dataFinal"/></td>
			<td><input type="submit" value="Submit"></td>
		</tr>
	</tbody>
</table>

</form>

<!-- Link para retornar para a tabela inicial -->
<c:url var="returnLink" value="list"/>
<a href="${returnLink}">Retornar</a>

</body>

</html>