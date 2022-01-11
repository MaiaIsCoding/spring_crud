package spring_vendas.dao;

import java.util.List;
import spring_vendas.entity.Vendedor;

public interface VendedorDAO {
	
	public List<Vendedor> getVendedores();

	public List<Vendedor> getVendedoresByDate(String dateVal);

}
