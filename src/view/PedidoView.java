package view;

import java.time.LocalDate;
import java.util.List;

import model.Cliente;
import model.ProdutoPedido;

public class PedidoView {
	
	public void imprimeDetalhesPedido(String nfe, 
			LocalDate data_emissao, float valor_total,
			String status_pedido, Cliente fk_cliente,
			List<ProdutoPedido> itensDoPedido) {
		System.out.println("______________");
		System.out.println("*** PEDIDO ***");
		System.out.println("______________");		
		System.out.println("Número nota fiscal: " + nfe);
		System.out.println("Data de emissão: " + data_emissao);
		System.out.println("Nome do cliente: " + fk_cliente.getNome());
		System.out.println("Status do pedido: " + status_pedido);
		for (int i = 0; i < itensDoPedido.size(); i++) {
			System.out.println("Item " + i + ":");
			itensDoPedido.get(i).imprimir();
		}
		System.out.println("Valor total: " + valor_total);
		System.out.println("\n");
	}

}
