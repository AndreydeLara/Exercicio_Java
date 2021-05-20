package exercicio3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

		pessoas.add(new Pessoa("Paulo", 40, "Masculino"));
		pessoas.add(new Pessoa("Mario", 43, "Masculino"));

		pessoas.add(new Cliente("Jo�o", 30, "Masculino", 500, 1989));
		pessoas.add(new Cliente("Pedro", 20, "Masculino", 300, 1999));

		pessoas.add(new Funcionario("Maria", 50, "Feminino", 5000, 123460));
		pessoas.add(new Funcionario("Mariana", 20, "Feminino", 4500, 123461));

		pessoas.add(new Vendedor("Tiago", 33, "Masculino", 3000, 123456, 10000, 20));
		pessoas.add(new Vendedor("Joana", 35, "Feminino", 3500, 123457, 15000, 30));

		pessoas.add(new Gerente("Jos�", 41, "Masculino", 6000, 123458, "Compras") );
		pessoas.add(new Gerente("Madalena", 45, "Feminino", 6500, 123459, "RH"));

		for (Pessoa pessoa : pessoas) {
			pessoa.print();
			System.out.println("");
		}
	}

}
//SA�DA ESPERADA
//Nome: Paulo
//Idade: 40
//Sexo: Masculino
//
//Nome: Mario
//Idade: 43
//Sexo: Masculino
//
//Nome: Jo�o
//Idade: 30
//Sexo: Masculino
//Valor da d�vida: 500.0
//Ano de Nascimento: 1989
//
//Nome: Pedro
//Idade: 20
//Sexo: Masculino
//Valor da d�vida: 300.0
//Ano de Nascimento: 1999
//
//Nome: Maria
//Idade: 50
//Sexo: Feminino
//Matr�cula: 123460
//Sal�rio Bruto: 5000.0
//Desconto INSS: 500.0
//Sal�rio L�quido: 4500.0
//
//Nome: Mariana
//Idade: 20
//Sexo: Feminino
//Matr�cula: 123461
//Sal�rio Bruto: 4500.0
//Desconto INSS: 450.0
//Sal�rio L�quido: 4050.0
//
//Nome: Tiago
//Idade: 33
//Sexo: Masculino
//Matr�cula: 123456
//Sal�rio Bruto: 3000.0
//Desconto INSS: 300.0
//Sal�rio L�quido: 2700.0
//Valor das vendas: 10000.0
//Quantidade de Vendas: 20
//
//Nome: Joana
//Idade: 35
//Sexo: Feminino
//Matr�cula: 123457
//Sal�rio Bruto: 3500.0
//Desconto INSS: 350.0
//Sal�rio L�quido: 3150.0
//Valor das vendas: 15000.0
//Quantidade de Vendas: 30
//
//Nome: Jos�
//Idade: 41
//Sexo: Masculino
//Matr�cula: 123458
//Sal�rio Bruto: 6000.0
//Desconto INSS: 600.0
//Sal�rio L�quido: 5400.0
//Nome da Ger�ncia: Compras
//
//Nome: Madalena
//Idade: 45
//Sexo: Feminino
//Matr�cula: 123459
//Sal�rio Bruto: 6500.0
//Desconto INSS: 650.0
//Sal�rio L�quido: 5850.0
//Nome da Ger�ncia: RH