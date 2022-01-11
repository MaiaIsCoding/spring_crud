package spring_vendas.service;

import java.util.List;

import spring_vendas.entity.Vendedor;

public interface VendedorService {

	public List<Vendedor> getVendedores();

	public List<Vendedor> getVendedoresByDate(String dateVal);
	
}
