import java.util.Scanner;

public class Questão6 {
	public static void main(String[] args) {

		System.out.print("Informe o raio de uma circunferência: ");

		float raio;
		Scanner ler = new Scanner(System.in);
		raio = ler.nextFloat();

		System.out.printf("Área da Circunferência = %.2f\n", 3.14*(raio*raio));
		System.out.printf("Comprimento da Circunferência = %.2f\n", 2*3.14*raio);
	}
}