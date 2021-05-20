import java.util.Scanner;

public class Questão3 {
	public static void main(String[] args) {

		System.out.print("Insira as medidas dos lados de um retângulo(comprimento e largura): ");

		float b,h=0;
		Scanner ler = new Scanner(System.in);
		h = ler.nextFloat();
		b = ler.nextFloat();

		System.out.printf("Área do Retângulo = %.2f\n", b*h);
		System.out.printf("Perímetro do Retângulo = %.2f\n", 2*(b+h));
	}
}