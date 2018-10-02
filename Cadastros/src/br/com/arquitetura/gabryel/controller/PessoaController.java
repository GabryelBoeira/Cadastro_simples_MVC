package br.com.arquitetura.gabryel.controller;

import java.util.ArrayList;

import br.com.arquitetura.gabryel.model.dominio.Pessoa;
import br.com.arquitetura.gabryel.model.negocio.PessoaNegocio;


public class PessoaController {

	private PessoaNegocio pn = new PessoaNegocio();

	public String cadastrar(String nome, int idade) throws Exception {
		
		Pessoa pessoa = new Pessoa();

		pessoa.setNome(nome);
		pessoa.setIdade(idade);

		try {
			return pn.cadastrarPessoa(pessoa);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public ArrayList<Pessoa> listarPessoas() {
				
		return pn.retornarPessoasCadastradas();
	}
}
