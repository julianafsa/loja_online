package controller;

import model.Endereco;
import view.EnderecoView;

public class EnderecoController {
	
	private Endereco model;
	private EnderecoView view;
	
	public EnderecoController(Endereco model, EnderecoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void updateView() {
		view.imprimeDetalhesEndereco(
			model.getRua(),
			model.getNumero(),
			model.getBairro(),
			model.getComplemento(),
			model.getCidade(),
			model.getEstado());
	}
	
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return model.getNumero();
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		model.setNumero(numero);
	}
	/**
	 * @return the rua
	 */
	public String getRua() {
		return model.getRua();
	}
	/**
	 * @param rua the rua to set
	 */
	public void setRua(String rua) {
		model.setRua(rua);
	}
	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return model.getBairro();
	}
	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		model.setBairro(bairro);
	}
	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return model.getComplemento();
	}
	/**
	 * @param complemento the complemento to set
	 */
	public void setComplemento(String complemento) {
		model.setComplemento(complemento);
	}
	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return model.getCidade();
	}
	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		model.setCidade(cidade);
	}
	/**
	 * @return the estado
	 */
	public String getEstado() {
		return model.getEstado();
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		model.setEstado(estado);
	}

}
