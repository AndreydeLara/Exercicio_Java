public class Item {

	// Possui dois atributos: o valor e o nome
	private double valor;
	private String nome;
	
	public Item(double valor, String nome) {
		this.valor = valor;
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public String getNome() {
		return nome;
	}
	
}