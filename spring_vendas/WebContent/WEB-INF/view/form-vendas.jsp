<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>

</head>
<body>

<h2>Adicionar venda</h2>

<form:form action="saveVenda" modelAttribute="venda" method="POST">
	<table>
		<tbody>
			<tr>
				<td><label>Data da Venda</label></td>
				<td><form:input path="data_venda" placeholder="2022-12-31"/></td>
			</tr>
			<tr>
				<td><label>Valor</label></td>
				<td><form:input path="valor"/></td>
			</tr>
			<tr>
				<td><label>ID do vendedor</label></td>
				<td><form:input path="vendedor_id"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Salvar" class="salvar"/></td>
			</tr>
		</tbody>
	</table>
</form:form>

<!-- Link para a tabela de vendas -->
<a href="${pageContext.request.contextPath}/vendas/list">Retornar</a>

</body>

</html>