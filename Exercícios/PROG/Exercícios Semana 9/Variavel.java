public class Variavel extends Despesa{

	String mes;

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	@Override
	public void detalharDespesa() {
		System.out.println("Tipo: Renda Vari�vel" );
		System.out.println("Nome: " + getNome());
		System.out.printf("Valor: R$ %.2f \n", getValor());
		System.out.println("M�s: "+ getMes());
	}

}