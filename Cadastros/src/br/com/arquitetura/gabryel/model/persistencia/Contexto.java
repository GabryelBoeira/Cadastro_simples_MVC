package br.com.arquitetura.gabryel.model.persistencia;

import java.util.ArrayList;

import br.com.arquitetura.gabryel.model.dominio.Pessoa;

public class Contexto {

	private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	private static int id = 1;
	
	public int SalvarPessoa(Pessoa pessoa) {
		
		pessoa.setId(id);
		pessoas.add(pessoa);
		id++;			
		
		return pessoas.size();
	}

	public ArrayList<Pessoa> retornarPessoasCadastradas() {
		return pessoas;
	}
}
