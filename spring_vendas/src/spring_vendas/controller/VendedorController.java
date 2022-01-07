package spring_vendas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring_vendas.dao.VendedorDAO;
import spring_vendas.entity.Vendedor;

@Controller
@RequestMapping("/vendedores")
public class VendedorController {

	@Autowired
	private VendedorDAO vendedorDAO;
	
	@RequestMapping("/list")
	public String listVendedores(Model theModel) {
		
		// pegar vendedores da dao
		List<Vendedor> theVendedores =  vendedorDAO.getVendedores();
		
		// adicionar vendedores ao modelo
		theModel.addAttribute("vendedor", theVendedores);
		
		return "list-vendedores";
	}
}
