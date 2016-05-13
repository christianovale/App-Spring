package br.com.christiano.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.christiano.dao.Dao;
import br.com.christiano.model.Clientes;

@Controller
@RequestMapping("index")
public class IndexController {
	
	@Autowired
	private Dao<Clientes> clienteDao;
	
	@RequestMapping("/")
	public ModelAndView index(){
		return new ModelAndView("/index");
	}
	
	@RequestMapping("/addClient")
	public ModelAndView addClient(){
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("cadastro", true);
		return mv;
	}
	
	@RequestMapping("/save")
	@ResponseBody //para dizer que o retorno vai ser uma String e não um Jsp
	public String saveClient(@RequestParam("nome") String nome, 
									@RequestParam("idade") String idade,
									@RequestParam("profissao") String profissao){
		
		System.out.println("Nome: "+ nome);
		System.out.println("Idade: "+ idade);
		System.out.println("Profissao: "+ profissao);
		
		Clientes cliente = new Clientes(nome, new Integer(idade), profissao);
		clienteDao.save(cliente);
		
		return "Cliente Cadastrado com sucesso";
	}

}
