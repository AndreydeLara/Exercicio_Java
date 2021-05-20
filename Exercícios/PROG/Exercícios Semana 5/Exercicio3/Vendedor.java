package exercicio3;

public class Vendedor extends Funcionario {

	private double Valordasvendas;
	private int QuantidadedeVendas;

	public Vendedor(String nome, int idade, String sexo, double salárioBruto, int matricula, double valordasvendas, int quantidadedeVendas) {
		super(nome, idade, sexo, salárioBruto, matricula);
		this.Valordasvendas = valordasvendas;
		this.QuantidadedeVendas = quantidadedeVendas;
	}

	public double getValordasvendas() {
		return Valordasvendas;
	}

	public void setValordasvendas(double valordasvendas) {
		this.Valordasvendas = valordasvendas;
	}

	public int getQuantidadedeVendas() {
		return QuantidadedeVendas;
	}

	public void setQuantidadedeVendas(int quantidadedeVendas) {
		this.QuantidadedeVendas = quantidadedeVendas;
	}

	public void print() {
		super.print();
		System.out.println("Valor das vendas: " + getValordasvendas());
		System.out.println("Quantidade de Vendas: " + getQuantidadedeVendas());
	}

}