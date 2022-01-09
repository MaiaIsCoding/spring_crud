package spring_vendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring_vendas.entity.Vendas;
import spring_vendas.service.VendaService;

@Controller
@RequestMapping("/vendas")
public class VendasController {
	
	@Autowired
	private VendaService vendaService;
	
	@GetMapping("/list")
    public String listVendas(Model theModel){  
		
		// receber vendedores da dao
		List<Vendas> theVendas = vendaService.getVendas();
		
		// adicionar vendedores ao modelo
		theModel.addAttribute("vendas",theVendas);
		
     	// retornar pagina jsp
     	return "list-vendas";
    }
	
	@GetMapping("/formAddVenda")
	public String formAddVenda(Model theModel) {
		
		// criar modelo para atribuir os dados do form
		Vendas theVendas = new Vendas();
		
		theModel.addAttribute("venda", theVendas);
		
		return "form-vendas";
	}
	
	@PostMapping("/saveVenda")
	public String saveVenda(@ModelAttribute("venda") Vendas theVendas) {
		
		//salvar venda
		vendaService.salvarVenda(theVendas);
		
		return "redirect:/vendas/list";
	}
}
