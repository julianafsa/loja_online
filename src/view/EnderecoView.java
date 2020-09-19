package view;

public class EnderecoView {
	
	public void imprimeDetalhesEndereco(String rua, int numero,
			String bairro, String complemento, String cidade, String estado) {
		System.out.println("________________");
		System.out.println("*** ENDEREÇO ***");
		System.out.println("________________");
		System.out.println("Rua: " + rua);
		System.out.println("Numero: " + numero);
		System.out.println("Complemento: " + complemento);		
		System.out.println("Bairro: " + bairro);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: " + estado);
		System.out.println("\n");
	}

}
