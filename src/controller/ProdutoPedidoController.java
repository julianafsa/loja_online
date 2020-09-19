package controller;

import model.Produto;
import model.ProdutoPedido;
import view.ProdutoPedidoView;

public class ProdutoPedidoController {
	
	private ProdutoPedido model;
	private ProdutoPedidoView view;
	
	public ProdutoPedidoController(ProdutoPedido model, ProdutoPedidoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void updateView() {
		view.imprimeDetalhesProdutoPedido(
			model.getProduto(),
			model.getQuantidadeProduto());
	}
	
	/**
	 * @return the fk_produto
	 */
	public Produto getProduto() {
		return model.getProduto();
	}
	/**
	 * @param fk_produto the fk_produto to set
	 */
	public void setProduto(Produto produto) {
		model.setProduto(produto);
	}
	/**
	 * @return the quantidade_produto
	 */
	public int getQuantidadeProduto() {
		return model.getQuantidadeProduto();
	}
	/**
	 * @param quantidade_produto the quantidade_produto to set
	 */
	public void setQuantidadeProduto(int quantidade_produto) {
		model.setQuantidadeProduto(quantidade_produto);
	}
	
}
