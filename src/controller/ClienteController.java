package controller;

import java.time.LocalDate;

import model.Cliente;
import view.ClienteView;

public class ClienteController {
	
	private Cliente model;
	private ClienteView view;
	
	public ClienteController(Cliente model, ClienteView view) {
		this.model = model;
		this.view = view;
	}
	
	public void updateView() {
		view.imprimeDetalhesCliente(
			model.getId(),
			model.getNome(), 
			model.getCpf(), 
			model.getRg(), 
			model.getEmail(),
			model.getDataDeNascimento(),
			model.getEnderecos(),
			model.getTelefones());
	}
	
	/**
	 * @return the id_cliente
	 */
	public int getId() {
		return model.getId();
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return model.getNome();
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		model.setNome(nome);
	}
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return model.getCpf();
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		model.setCpf(cpf);
	}
	/**
	 * @return the rg
	 */
	public String getRg() {
		return model.getRg();
	}
	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		model.setRg(rg);
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return model.getEmail();
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		model.setEmail(email);
	}
	/**
	 * @return the data_de_nascimento
	 */
	public LocalDate getDataDeNascimento() {
		return model.getDataDeNascimento();
	}
	/**
	 * @param data_de_nascimento the data_de_nascimento to set
	 */
	public void setDataDeNascimento(LocalDate data_de_nascimento) {
		model.setDataDeNascimento(data_de_nascimento);
	}

}
