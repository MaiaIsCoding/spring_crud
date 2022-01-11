package spring_vendas.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring_vendas.entity.Vendas;
import spring_vendas.service.VendaService;

@RestController
@RequestMapping("/vendas")
public class VendasRestController {
	
	@Autowired
	private VendaService vendaService;
	
	@GetMapping("/list")
	public List<Vendas> getVendas() {
		
		return vendaService.getVendas();
	}
	
	// mapear metodo para adicionar vendas
	@PostMapping("/formAddVenda")
	public Vendas addVenda(@RequestBody Vendas theVendas) {
		
		theVendas.setId(0);
		
		vendaService.salvarVenda(theVendas);
		
		return theVendas;
	}
	
	
}