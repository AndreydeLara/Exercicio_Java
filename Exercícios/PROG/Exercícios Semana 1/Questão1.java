import java.util.Scanner;

public class Quest�o1 {
	public static void main(String[] args) {
		
		int a, b, c, d = 0;
		
		System.out.print("Digite 4 falores inteiros: ");
		Scanner ler = new Scanner(System.in);
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		d = ler.nextInt();

		System.out.println("O resultado da seguinte express�o (a + b + c) x d � igual a: " + (a + b + c)*d);
	}
}