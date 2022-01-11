package spring_vendas.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring_vendas.entity.Vendedor;

@Repository
public class VendedorDAOImpl implements VendedorDAO {

	//injetar session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	//retornar vendedores e quantidade de vendas
	@Override
	public List<Vendedor> getVendedores() {
		
		// retornar sessao atual do hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		
		// criar consulta
		Query<Vendedor> theQuery =
				currentSession.createQuery("from Vendedor", Vendedor.class);
		
		// executar consulta e obter resultado
		List<Vendedor> vendedores = theQuery.getResultList();
		
		// retornar resultados
		return vendedores;
	}
	
	// retornar vendedores e quantidade de vendas em um determinado periodo
	@Override
	public List<Vendedor> getVendedoresByDate(String dataInicio) {
		
		// retornar sessao atual do hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		
		// criar consulta
		Query<Vendedor> theQuery =
				currentSession.createQuery("from Vendedor where id = :dateVal", Vendedor.class)
				.setParameter("dateVal", Integer.parseInt(dataInicio));
		
		// executar consulta e obter resultado
		List<Vendedor> vendedores = theQuery.getResultList();
		
		// retornar resultados
		return vendedores;
	}

}
