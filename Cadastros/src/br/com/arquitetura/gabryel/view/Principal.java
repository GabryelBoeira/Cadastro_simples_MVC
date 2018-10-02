package br.com.arquitetura.gabryel.view;

import java.util.Scanner;

import br.com.arquitetura.gabryel.controller.PessoaController;
import br.com.arquitetura.gabryel.model.dominio.Pessoa;


public class Principal {

	public static void main(String[] args) {

		PessoaController pc = new PessoaController();

		int opcao = 0;
		Scanner scan = new Scanner(System.in);

		do {

			System.out.println("1 - Cadastro de usuário");
			System.out.println("2 - Listar Usuários");
			System.out.println("");
			System.out.println("0 - Sair");

			opcao = scan.nextInt();

			switch (opcao) {
			case 0:
				break;
			case 1:
				String nome;
				int idade;

				try {
					System.out.print("Digite o nome: ");
					nome = scan.next();
					System.out.print("Digite a idade: ");
					idade = scan.nextInt();

					System.out.println(pc.cadastrar(nome, idade));
				} catch (Exception e) {
					System.out.print("Você está sendo redirecionado. ");
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				for (Pessoa p : pc.listarPessoas()) {
					System.out.println("ID: " + p.getId());
					System.out.println("Nome: " + p.getNome());
					System.out.println("Idade: " + p.getIdade());
					System.out.println();
				}				
				break;
			default:
				System.out.println("Opção inválida! Tente novamente");
				break;
			}
			
			System.out.println();
			System.out.println();
			
		} while (opcao != 0);
	}
}
