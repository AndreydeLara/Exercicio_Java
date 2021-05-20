package exercicio3;

public class Programador extends Funcionario {

	public Programador(double salario, String nome, String departamento) {
		super(salario, nome, departamento);
	}

	@Override
	public double calculaBonificacao() {
		return getSalario()*0.1;
	}

}
