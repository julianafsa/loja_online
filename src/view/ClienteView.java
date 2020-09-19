package view;

import java.time.LocalDate;
import java.util.List;

import model.Endereco;
import model.Telefone;

public class ClienteView {
	
	public void imprimeDetalhesCliente(int id, 
			String nome, String cpf, String rg, String email, LocalDate data_de_nascimento,
			List<Endereco> enderecos, List<Telefone> telefones) {
		System.out.println("_______________");
		System.out.println("*** CLIENTE ***");
		System.out.println("_______________");
		System.out.println("ID: " + id);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("RG: " + rg);
		System.out.println("E-mail: " + email);
		System.out.println("Data de nascimento: " + data_de_nascimento);
		for (int i = 0; i < enderecos.size(); i++) {
			System.out.println("Endereço " + (i+1) + ":");
			enderecos.get(i).imprimir();
		}
		for (int i = 0; i < telefones.size(); i++) {
			System.out.print("Telefone " + (i+1) + ": ");
			telefones.get(i).imprimir();
		}
		System.out.println("\n");
	}

}
