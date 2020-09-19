package mvc;

import java.time.LocalDate;

import controller.ClienteController;
import controller.EnderecoController;
import controller.PedidoController;
import controller.ProdutoController;
import controller.ProdutoPedidoController;
import controller.TelefoneController;
import model.Cliente;
import model.Endereco;
import model.Pedido;
import model.Produto;
import model.ProdutoPedido;
import model.Telefone;
import view.ClienteView;
import view.EnderecoView;
import view.PedidoView;
import view.ProdutoPedidoView;
import view.ProdutoView;
import view.TelefoneView;

public class Programa {

	public static void main(String[] args) {
		// Criando um cliente.
		Cliente clienteModel = getClienteDoBD();
		ClienteView clienteView = new ClienteView();
		ClienteController controller = new ClienteController(clienteModel, clienteView);

		// Criando um endereco.
		Endereco enderecoModel = getEnderecoDoBD();
		EnderecoView enderecoView = new EnderecoView();
		EnderecoController enderecoController = 
			new EnderecoController(enderecoModel, enderecoView);
		//enderecoController.updateView();
		// Adicionando o endereco no cliente.
		clienteModel.addEndereco(enderecoModel);

		// Criando um telefone.
		Telefone telefoneModel = getTelefoneDoBD();
		TelefoneView telefoneView = new TelefoneView();
		TelefoneController telefoneController = new TelefoneController(telefoneModel, telefoneView);
		//telefoneController.updateView();
		// Adicionando o telefone no cliente.
		clienteModel.addTelefone(telefoneModel);
		
		// Atualizando a view de cliente após adicionar um endereco e um telefone.
		controller.updateView();
		
		// Criando um produto.
		Produto p1_model = getProduto1DoBD();
		ProdutoView p1_view = new ProdutoView();
		ProdutoController p1_controller = new ProdutoController(p1_model, p1_view);
		p1_controller.updateView();

		// Criando outro produto.
		Produto p2_model = getProduto2DoBD();
		ProdutoView p2_view = new ProdutoView();
		ProdutoController p2_controller = new ProdutoController(p2_model, p2_view);
		p2_controller.updateView();

		// Criando o pedido antes dos itens passando o cliente do pedido. 
		Pedido pe_model = getPedidoDoBD(clienteModel);
		PedidoView pe_view = new PedidoView();
		PedidoController pe_controller = 
			new PedidoController(pe_model, pe_view);
		pe_controller.updateView();

		// Criando um item do pedido.
		ProdutoPedido pp1_model = getProdutoPedido1DoBD(p1_model);
		ProdutoPedidoView pp1_view = new ProdutoPedidoView();
		ProdutoPedidoController pp1_controller = 
			new ProdutoPedidoController(pp1_model, pp1_view);
		pe_model.addItensDoPedido(pp1_model);
		pp1_controller.updateView();
		
		// Criando um item do pedido.
		ProdutoPedido pp2_model = getProdutoPedido2DoBD(p2_model);
		ProdutoPedidoView pp2_view = new ProdutoPedidoView();
		ProdutoPedidoController pp2_controller = 
			new ProdutoPedidoController(pp2_model, pp2_view);
		pe_model.addItensDoPedido(pp2_model);
		pp2_controller.updateView();
		
		// Agora que os itens foram adicionados ao pedido, vamos atualizar
		// o status do pedido e a view do pedido.
		System.out.println("____________________________");
		System.out.println("*** ATUALIZANDO O PEDIDO ***");
		System.out.println("____________________________");		
		pe_controller.setStatusPedido(Pedido.CONCLUIDO);
		pe_controller.updateView();

	}
	
	public static Cliente getClienteDoBD() {
		Cliente cliente = new Cliente();
		cliente.setNome("Juliana");
		cliente.setCpf("000.000.000-00");
		cliente.setRg("00000000-00");
		cliente.setEmail("julianafsa@gmail.com");
		cliente.setDataDeNascimento(LocalDate.of(1981, 6, 1));
		return cliente;
	}

	public static Endereco getEnderecoDoBD() {
		Endereco endereco = new Endereco();
		endereco.setNumero(1000);
		endereco.setRua("Bartolomeu Mitre");
		endereco.setBairro("Leblon");
		endereco.setComplemento("Apto 1000");
		endereco.setCidade("Rio de Janeiro");
		endereco.setEstado("RJ");
		return endereco;
	}

	public static Telefone getTelefoneDoBD() {
		Telefone telefone = new Telefone();
		telefone.setDDI("55");
		telefone.setDDD("21");
		telefone.setNumero("99999-9999");
		return telefone;
	}
	
	private static Produto getProduto1DoBD() {
		Produto p1 = new Produto();
		p1.setNome("Caneta BIC azul");
		p1.setDescricao("Caneta esperográfica transparente de cor azul");
		p1.setEstoque(10);
		p1.setPreco(2.5f);
		return p1;
	}

	private static Produto getProduto2DoBD() {
		Produto p = new Produto();
		p.setNome("Borracha Faber Castel Branca");
		p.setDescricao("Borracha branca");
		p.setEstoque(20);
		p.setPreco(1.75f);
		return p;
	}

	private static ProdutoPedido getProdutoPedido1DoBD(Produto produto) {
		ProdutoPedido pp = new ProdutoPedido();
		pp.setProduto(produto);
		pp.setQuantidadeProduto(3);
		return pp;
	}

	private static ProdutoPedido getProdutoPedido2DoBD(Produto produto) {
		ProdutoPedido pp = new ProdutoPedido();
		pp.setProduto(produto);
		pp.setQuantidadeProduto(2);
		return pp;
	}

	private static Pedido getPedidoDoBD(Cliente cliente) {
		Pedido pe = new Pedido();
		pe.setNfe("0");
		pe.setDataEmissao(LocalDate.now());
		pe.setStatusPedido(Pedido.PENDENTE);
		pe.setCliente(cliente);
		return pe;
	}

}
