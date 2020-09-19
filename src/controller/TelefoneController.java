package controller;

import model.Telefone;
import view.TelefoneView;

public class TelefoneController {
	
	private Telefone model;
	private TelefoneView view;
	
	public TelefoneController(Telefone model, TelefoneView view) {
		this.model = model;
		this.view = view;
	}
	
	public void updateView() {
		view.imprimeDetalhesTelefone(
			model.getDDI(),
			model.getDDD(), 
			model.getNumero());
	}
	
	/**
	 * @return the ddi
	 */
	public String getDDI() {
		return model.getDDI();
	}
	/**
	 * @param ddi the ddi to set
	 */
	public void setDDI(String ddi) {
		model.setDDI(ddi);
	}
	/**
	 * @return the ddd
	 */
	public String getDDD() {
		return model.getDDD();
	}
	/**
	 * @param ddd the ddd to set
	 */
	public void setDDD(String ddd) {
		model.setDDD(ddd);
	}
	/**
	 * @return the numero
	 */
	public String getNumero() {
		return model.getNumero();
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		model.setNumero(numero);
	}

}
