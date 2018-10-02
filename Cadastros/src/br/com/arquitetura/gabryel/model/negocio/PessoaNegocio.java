package br.com.arquitetura.gabryel.model.negocio;

import java.util.ArrayList;

import br.com.arquitetura.gabryel.model.dominio.Pessoa;
import br.com.arquitetura.gabryel.model.persistencia.Contexto;


public class PessoaNegocio {

	private Contexto contexto = new Contexto();
	String mensagem = "";
	int idadeLimite = 18;

	public String cadastrarPessoa(Pessoa pessoa) throws Exception {

		

		try {
			if (validarIdade(pessoa)) {
				mensagem = "O número de matrícula é " + contexto.SalvarPessoa(pessoa);
			}
		} catch (Exception e) {
			mensagem = e.getMessage().toString();
			throw new Exception(mensagem);
		}

		return mensagem;
	}

	public boolean validarIdade(Pessoa pessoa) throws Exception {

		String mensagem;

		if (pessoa.getIdade() < idadeLimite) {
			mensagem = "Pessoa com idade inferior a " + idadeLimite + " anos!";
			throw new Exception(mensagem);
		}
		return true;
	}

	public ArrayList<Pessoa> retornarPessoasCadastradas() {

		
		return contexto.retornarPessoasCadastradas();
	}

}
