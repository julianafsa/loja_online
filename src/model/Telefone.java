package model;

public class Telefone {
	private String ddi;
	private String ddd;
	private String numero;
	
	/**
	 * @return the ddi
	 */
	public String getDDI() {
		return ddi;
	}
	/**
	 * @param ddd the ddi to set
	 */
	public void setDDI(String ddi) {
		this.ddi = ddi;
	}
	/**
	 * @return the ddd
	 */
	public String getDDD() {
		return ddd;
	}
	/**
	 * @param ddd the ddd to set
	 */
	public void setDDD(String ddd) {
		this.ddd = ddd;
	}
	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void imprimir() {
		System.out.println(ddi+ " " +
				           "(" + ddd + ")" + " " +
						   numero);
		//System.out.println("DDI: " + ddi);
		//System.out.println("DDD: " + ddd);
		//System.out.println("Numero: " + numero);		
	}
	
}
