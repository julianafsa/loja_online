package controller;

import java.time.LocalDate;

import model.Cliente;
import model.Pedido;
import view.PedidoView;

public class PedidoController {
	
	private Pedido model;
	private PedidoView view;
	
	public PedidoController(Pedido model, PedidoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void updateView() {
		view.imprimeDetalhesPedido(
				model.getNfe(),
				model.getDataEmissao(), 
				model.getValorTotal(), 
				model.getStatusPedido(), 
				model.getCliente(),
				model.getItensDoPedido());
	}
	
	/**
	 * @return the nfe
	 */
	public String getNfe() {
		return model.getNfe();
	}
	/**
	 * @param nfe the nfe to set
	 */
	public void setNfe(String nfe) {
		model.setNfe(nfe);
	}
	/**
	 * @return the data_emissao
	 */
	public LocalDate getDataEmissao() {
		return model.getDataEmissao();
	}
	/**
	 * @param data_emissao the data_emissao to set
	 */
	public void setDataEmissao(LocalDate data_emissao) {
		model.setDataEmissao(data_emissao);
	}
	/**
	 * @return the valor_total
	 */
	public float getValorTotal() {
		return model.getValorTotal();
	}
	/**
	 * @param valor_total the valor_total to set
	 */
	public void setValorTotal(float valor_total) {
		model.setValorTotal(valor_total);
	}
	/**
	 * @return the status_pedido
	 */
	public String getStatusPedido() {
		return model.getStatusPedido();
	}
	/**
	 * @param status_pedido the status_pedido to set
	 */
	public void setStatusPedido(String status_pedido) {
		model.setStatusPedido(status_pedido);
	}
	/**
	 * @return the fk_cliente
	 */
	public Cliente getCliente() {
		return model.getCliente();
	}
	/**
	 * @param fk_cliente the fk_cliente to set
	 */
	public void setCliente(Cliente fk_cliente) {
		model.setCliente(fk_cliente);
	}

}
