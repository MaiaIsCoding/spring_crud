package spring_vendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring_vendas.dao.VendedorDAO;
import spring_vendas.entity.Vendedor;

@Service
public class VendedorServiceImpl implements VendedorService {

	// injetar VendedorDAO
	@Autowired
	private VendedorDAO vendedorDAO;
	
	@Override
	@Transactional
	public List<Vendedor> getVendedores() {
		return vendedorDAO.getVendedores();
	}
	
	@Override
	@Transactional
	public List<Vendedor> getVendedoresByDate(String dateVal) {
		return vendedorDAO.getVendedoresByDate(dateVal);
	}

}
