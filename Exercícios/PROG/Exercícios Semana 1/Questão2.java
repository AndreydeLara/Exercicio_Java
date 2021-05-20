import java.util.Scanner;

public class Questão2 {
	public static void main(String[] args) {

		float a,b,c,d = 0;

		System.out.print("Digite sua quatro notas: ");
		Scanner ler = new Scanner(System.in);
		a = ler.nextFloat();
		b = ler.nextFloat();
		c = ler.nextFloat();
		d = ler.nextFloat();

		System.out.printf("Sua média final é igual a: %.2f\n", (a+b+c+d)/4);		
	}
}