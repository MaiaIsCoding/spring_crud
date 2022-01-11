package spring_vendas.service;

import java.util.List;

import spring_vendas.entity.Vendas;

public interface VendaService {

	public List<Vendas> getVendas();

	public void salvarVenda(Vendas theVendas);
}
