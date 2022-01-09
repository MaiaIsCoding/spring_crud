<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>

</head>
<body>

<h2>Lista de vendas</h2>

<input type="button" value="Adicionar Venda" onclick="window.location.href='formAddVenda'; return false"/>

<!-- Exibir dados dos vendedores -->
<table>
	<tr>
		<th>ID Venda</th>
		<th>Data</th>
		<th>Valor</th>
		<th>ID Vendedor</th>
	</tr>
	
	<c:forEach var="tempVendas" items="${vendas}">
		<tr>
			<td>${tempVendas.id}</td>
			<td>${tempVendas.data_venda}</td>
			<td>R$ ${tempVendas.valor}</td>
			<td>${tempVendas.vendedor_id}</td>
		</tr>
			
	</c:forEach>
</table>

<!-- Link para a tabela de vendas -->
<a href="${pageContext.request.contextPath}/vendedores/list">Vendedores</a>

</body>

</html>