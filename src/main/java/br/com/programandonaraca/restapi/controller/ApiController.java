package br.com.programandonaraca.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.programandonaraca.restapi.model.Pessoa;
import br.com.programandonaraca.restapi.services.PessoaServices;

@RestController
public class ApiController {
	
	@Autowired
	private static PessoaServices pessoaService;
	
	@GetMapping("/pessoas/")
	public List<Pessoa> pessoas(){
		return pessoaService.listaDePessoas();
	}

	@GetMapping("/pessoa/{id}/")
	public Pessoa pessoaId(@PathVariable Integer id){
		return pessoaService.getPessoaById(id);
	}

	@GetMapping("/pessoa/error/{id}/")
	public String pessoaErrorId(@PathVariable Integer id){
		return new String("Error: nenhum resultado com esse ID:" + id);
	}
}
