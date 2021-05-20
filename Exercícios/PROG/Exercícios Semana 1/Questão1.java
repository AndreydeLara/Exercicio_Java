import java.util.Scanner;

public class Questão1 {
	public static void main(String[] args) {
		
		int a, b, c, d = 0;
		
		System.out.print("Digite 4 falores inteiros: ");
		Scanner ler = new Scanner(System.in);
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		d = ler.nextInt();

		System.out.println("O resultado da seguinte expressão (a + b + c) x d é igual a: " + (a + b + c)*d);
	}
}