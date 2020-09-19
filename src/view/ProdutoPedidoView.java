package view;

import model.Produto;

public class ProdutoPedidoView {
	
	public void imprimeDetalhesProdutoPedido(Produto produto, 
			int quantidade_produto) {
		System.out.println("______________________");
		System.out.println("*** ITEM DO PEDIDO ***");
		System.out.println("______________________");		
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Quantidade do produto: " + quantidade_produto);
		System.out.println("\n");
	}
	
}
