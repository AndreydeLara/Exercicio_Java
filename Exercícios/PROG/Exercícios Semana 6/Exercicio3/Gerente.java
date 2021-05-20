package exercicio3;

public class Gerente extends Funcionario {

	public Gerente(double salario, String nome, String departamento) {
		super(salario, nome, departamento);
	}

	@Override
	public double calculaBonificacao() {
		return getSalario()*0.5;
	}

}
