package spring_vendas.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring_vendas.entity.Vendedor;
import spring_vendas.service.VendedorService;

@Controller
@RequestMapping("/vendedores")
public class VendedorController {

	// injetar VendedorService
	@Autowired
	private VendedorService vendedorService;
	
	@GetMapping("/list")
	public String listVendedores(Model theModel) {
		
		// receber vendedores da dao
		List<Vendedor> theVendedores = vendedorService.getVendedores();
		
		// adicionar vendedores ao modelo
		theModel.addAttribute("vendedor", theVendedores);
		
		// retornar pagina jsp
		return "list-vendedores";
	}
	
	@GetMapping("/listByDate")
    public String listByDate(HttpServletRequest request, Model theModel){  
		
		// recebendo valores dos campos de data
        String dataInicio = request.getParameter("dataInicio");

        // receber vendedores da dao
        List<Vendedor> theVendedores = vendedorService.getVendedoresByDate(dataInicio);
     				
     	// adicionar vendedores ao modelo
     	theModel.addAttribute("vendedor", theVendedores);
     	
     	// retornar pagina jsp
     	return "list-vendedoresByDate";
    }
	
}
