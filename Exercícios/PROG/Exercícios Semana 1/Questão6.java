import java.util.Scanner;

public class Quest�o6 {
	public static void main(String[] args) {

		System.out.print("Informe o raio de uma circunfer�ncia: ");

		float raio;
		Scanner ler = new Scanner(System.in);
		raio = ler.nextFloat();

		System.out.printf("�rea da Circunfer�ncia = %.2f\n", 3.14*(raio*raio));
		System.out.printf("Comprimento da Circunfer�ncia = %.2f\n", 2*3.14*raio);
	}
}