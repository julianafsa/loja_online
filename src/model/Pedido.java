package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private String nfe;
	private LocalDate data_emissao;
	private float valor_total;
	private String status_pedido;
	private Cliente cliente;
	private List<ProdutoPedido> itensDoPedido;
	
	public static final String PENDENTE = "PENDENTE";
	public static final String CONCLUIDO = "CONCLUIDO";
	public static final String CANCELADO = "CANCELADO";
	
	public Pedido() {
		this.valor_total = 0;
		this.status_pedido = PENDENTE;
		itensDoPedido = new ArrayList<ProdutoPedido>();
	}
	
	/**
	 * @return the nfe
	 */
	public String getNfe() {
		return nfe;
	}
	/**
	 * @param nfe the nfe to set
	 */
	public void setNfe(String nfe) {
		this.nfe = nfe;
	}
	/**
	 * @return the data_emissao
	 */
	public LocalDate getDataEmissao() {
		return data_emissao;
	}
	/**
	 * @param data_emissao the data_emissao to set
	 */
	public void setDataEmissao(LocalDate data_emissao) {
		this.data_emissao = data_emissao;
	}
	/**
	 * @return the valor_total
	 */
	public float getValorTotal() {
		return valor_total;
	}
	/**
	 * @param valor_total the valor_total to set
	 */
	public void setValorTotal(float valor_total) {
		this.valor_total = valor_total;
	}
	/**
	 * @return the status_pedido
	 */
	public String getStatusPedido() {
		return status_pedido;
	}
	/**
	 * @param status_pedido the status_pedido to set
	 */
	public void setStatusPedido(String status_pedido) {
		this.status_pedido = status_pedido;
	}
	/**
	 * @return the fk_cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @param fk_cliente the fk_cliente to set
	 */
	public void setCliente(Cliente fk_cliente) {
		this.cliente = fk_cliente;
	}
	public void addValorTotal(float valor_total_item) {
		this.valor_total += valor_total_item;
	}
	/**
	 * @return the itensDoPedido
	 */
	public List<ProdutoPedido> getItensDoPedido() {
		return itensDoPedido;
	}

	/**
	 * @param itensDoPedido the itensDoPedido to set
	 */
	public void setItensDoPedido(List<ProdutoPedido> itensDoPedido) {
		this.itensDoPedido = itensDoPedido;
	}

	/**
	 * @param itensDoPedido the itensDoPedido to set
	 */
	public void addItensDoPedido(ProdutoPedido itemDoPedido) {
		this.itensDoPedido.add(itemDoPedido);
		this.addValorTotal(itemDoPedido.getQuantidadeProduto() * 
			itemDoPedido.getProduto().getPreco());
	}
	
}
