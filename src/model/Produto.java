package model;

public class Produto {
	
	/** Id do produto. Código gerado automaticamente sempre que uma instancia
	  * de um produto é criada.
	  */
	private static int id_produto = -1;
	private String nome;
	private String descricao;
	private int estoque;
	private float preco;
	
	public Produto() {
		id_produto++;
	}
	
	/**
	 * @return the id_produto
	 */
	public int getIdProduto() {
		return id_produto;
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
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * @return the estoque
	 */
	public int getEstoque() {
		return estoque;
	}
	/**
	 * @param estoque the estoque to set
	 */
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	/**
	 * @return the preco
	 */
	public float getPreco() {
		return preco;
	}
	/**
	 * @param preco the preco to set
	 */
	public void setPreco(float preco) {
		this.preco = preco;
	}

}
