import java.util.Scanner;

public class Questão5 {
	public static void main(String[] args) {

		System.out.print("Informe o valor gasto com as despesas realizadas no restaurante: ");

		float valor=0;
		Scanner ler = new Scanner(System.in);
		valor = ler.nextFloat();

		System.out.printf("O valor gasto com as despesas mais a gorjeta é igual a %.2f reais\n", valor*1.1);
	}
}