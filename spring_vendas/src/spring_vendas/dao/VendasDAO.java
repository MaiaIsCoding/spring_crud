package spring_vendas.dao;

import java.util.List;

import spring_vendas.entity.Vendas;

public interface VendasDAO {

	public List<Vendas> getVendas();

	public void salvarVenda(Vendas theVendas);
	
}
