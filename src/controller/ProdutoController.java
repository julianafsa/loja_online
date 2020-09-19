package controller;

import model.Produto;
import view.ProdutoView;

public class ProdutoController {
	
	private Produto model;
	private ProdutoView view;
	
	public ProdutoController(Produto model, ProdutoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void updateView() {
		view.imprimeDetalhesProduto(
			model.getIdProduto(),
			model.getNome(), 
			model.getDescricao(), 
			model.getEstoque(), 
			model.getPreco());
	}
	
	/**
	 * @return the id_produto
	 */
	public int getIdProduto() {
		return model.getIdProduto();
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
	 * @return the descricao
	 */
	public String getDescricao() {
		return model.getDescricao();
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		model.setDescricao(descricao);
	}
	/**
	 * @return the estoque
	 */
	public int getEstoque() {
		return model.getEstoque();
	}
	/**
	 * @param estoque the estoque to set
	 */
	public void setEstoque(int estoque) {
		model.setEstoque(estoque);
	}
	/**
	 * @return the preco
	 */
	public float getPreco() {
		return model.getPreco();
	}
	/**
	 * @param preco the preco to set
	 */
	public void setPreco(float preco) {
		model.setPreco(preco);
	}

}
