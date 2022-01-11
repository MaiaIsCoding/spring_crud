package spring_vendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring_vendas.dao.VendasDAO;
import spring_vendas.entity.Vendas;

@Service
public class VendaServiceImpl implements VendaService {
	
	// injetar VendedorDAO
	@Autowired
	private VendasDAO vendasDAO;
	
	@Override
	@Transactional
	public List<Vendas> getVendas() {
		return vendasDAO.getVendas();
	}

	@Override
	@Transactional
	public void salvarVenda(Vendas theVendas) {
		vendasDAO.salvarVenda(theVendas);
	}

}
