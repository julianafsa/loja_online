package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	/**
	 *  Id do cliente. Código gerado automaticamente sempre que uma instancia
	 *  de cliente é criada.
	 */
	private static int id_cliente = -1;
	private String nome;
	private String cpf;
	private String rg;
	private String email;
	private LocalDate data_de_nascimento;
	private List<Endereco> enderecos;
	private List<Telefone> telefones;
	
	public Cliente() {
		id_cliente++;
		enderecos = new ArrayList<Endereco>();
		telefones = new ArrayList<Telefone>();
	}
	
	/**
	 * @return the id_cliente
	 */
	public int getId() {
		return id_cliente;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}
	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the data_de_nascimento
	 */
	public LocalDate getDataDeNascimento() {
		return data_de_nascimento;
	}
	/**
	 * @param data_de_nascimento the data_de_nascimento to set
	 */
	public void setDataDeNascimento(LocalDate data_de_nascimento) {
		this.data_de_nascimento = data_de_nascimento;
	}
	/**
	 * @return the enderecos
	 */
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	/**
	 * @param enderecos the enderecos to set
	 */
	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	/**
	 * @param telefone the telefone to add
	 */
	public void addEndereco(Endereco endereco) {
		this.enderecos.add(endereco);
	}
	/**
	 * @return the telefones
	 */
	public List<Telefone> getTelefones() {
		return telefones;
	}
	/**
	 * @param telefones the telefones to set
	 */
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	/**
	 * @param telefone the telefone to add
	 */
	public void addTelefone(Telefone telefone) {
		this.telefones.add(telefone);
	}
	/**
	 * Imprime os telefones
	 */
	public void imprimirTelefones() {
		for (Telefone telefone : telefones) {
			telefone.imprimir();
		}
	}

}
