package br.com.programandonaraca.restapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.programandonaraca.restapi.model.Pessoa;

@Service
public class PessoaServices {

	private static List<Pessoa> pessoas;

	public PessoaServices() {

		pessoas = new ArrayList<Pessoa>();

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("João Silva");
		pessoa.setIdade("16");

		pessoas.add(pessoa);

		pessoa = new Pessoa();
		pessoa.setNome("Fernanda Rodrigues");
		pessoa.setIdade("28");

		pessoas.add(pessoa);
	}

	public static List<Pessoa> listaDePessoas() {
		return pessoas;
	}
	
	public static Pessoa getPessoaById(Integer id){
		return pessoas.get(id);
	}

}
