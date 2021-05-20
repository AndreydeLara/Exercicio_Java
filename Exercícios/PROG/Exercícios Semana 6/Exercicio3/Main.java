package exercicio3;


public class Main {
	public static void main(String[] args) {
		ListaFuncionario listaFuncionario = new ListaFuncionario();
		Funcionario funcionario = new Gerente(3000,"Mario","RH");
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.calculaBonificacao());
		listaFuncionario.addFuncionario(funcionario);

		funcionario = new Programador(2000, "Maria","Inform�tica");
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.calculaBonificacao());
		listaFuncionario.addFuncionario(funcionario);

		funcionario = new Programador(1800, "Jo�o","Inform�tica");
		listaFuncionario.addFuncionario(funcionario);

		funcionario = new Programador(3800, "Joana","Inform�tica");
		listaFuncionario.addFuncionario(funcionario);

		listaFuncionario.listarFuncionarios();

	}
}
//SA�DA ESPERADA
//3000.0
//1500.0
//2000.0
//200.0
//Nome: Mario
//Sal�rio: 3000.0
//Bonifica��o: 1500.0
//Departamento: RH
//Nome: Maria
//Sal�rio: 2000.0
//Bonifica��o: 200.0
//Departamento: Inform�tica
//Nome: Jo�o
//Sal�rio: 1800.0
//Bonifica��o: 180.0
//Departamento: Inform�tica
//Nome: Joana
//Sal�rio: 3800.0
//Bonifica��o: 380.0
//Departamento: Inform�tica