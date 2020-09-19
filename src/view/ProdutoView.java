package view;

public class ProdutoView {
	
	int id_produto;
	String nome;
	String descricao;
	int estoque;
	float preco;
	
	public void imprimeDetalhesProduto(int id_produto, 
			String nome, String descricao, int estoque, float preco) {
		System.out.println("_______________");
		System.out.println("*** PRODUTO ***");
		System.out.println("_______________");		
		System.out.println("ID: " + id_produto);
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Estoque: " + estoque);
		System.out.println("Preco: " + preco);
		System.out.println("\n");
	}

}
