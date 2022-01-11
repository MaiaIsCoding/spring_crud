package spring_vendas.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring_vendas.entity.Vendedor;
import spring_vendas.service.VendedorService;

@RestController
@RequestMapping("/vendedores")
public class VendedorRestController {
	
	@Autowired
	private VendedorService vendedorService;
	
	@GetMapping("/list")
	public List<Vendedor> getVendedores() {
		
		return vendedorService.getVendedores();
	}
	
	@GetMapping("/listByDate")
    public List<Vendedor> getVendedoresByDate(HttpServletRequest request){  
		
     	return vendedorService.getVendedoresByDate(request.getParameter("dataInicio"));
    }
}
