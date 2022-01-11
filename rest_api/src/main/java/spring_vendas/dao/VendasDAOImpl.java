package spring_vendas.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring_vendas.entity.Vendas;

@Repository
public class VendasDAOImpl implements VendasDAO {

	//injetar session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	//retornar lista de vendas
	@Override
	public List<Vendas> getVendas() {
		
		// retornar sessao atual do hibernate
		Session currentSession = sessionFactory.getCurrentSession();
				
		// criar consulta
		Query<Vendas> theQuery =
				currentSession.createQuery("from Vendas", Vendas.class);
				
		// executar consulta e obter resultado
		List<Vendas> vendas = theQuery.getResultList();
		
		return vendas;
	}

	@Override
	public void salvarVenda(Vendas theVendas) {
		
		//  retornar sessao atual do hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		
		// salvar a venda
		currentSession.save(theVendas);
	}

}
