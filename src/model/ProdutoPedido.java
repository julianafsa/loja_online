package model;

public class ProdutoPedido {
	
	private Produto produto;
	private int quantidade_produto;
	
	/**
	 * @return the fk_produto
	 */
	public Produto getProduto() {
		return produto;
	}
	/**
	 * @param fk_produto the fk_produto to set
	 */
	public void setProduto(Produto fk_produto) {
		this.produto = fk_produto;
	}
	/**
	 * @return the quantidade_produto
	 */
	public int getQuantidadeProduto() {
		return quantidade_produto;
	}
	/**
	 * @param quantidade_produto the quantidade_produto to set
	 */
	public void setQuantidadeProduto(int quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}
	public void imprimir() {
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Quantidade: " + quantidade_produto);
		System.out.println("Preço unitário: " + produto.getPreco());
		System.out.println("Total: " + quantidade_produto * produto.getPreco());
	}
	
}
