import java.util.Scanner;

public class Quest�o3 {
	public static void main(String[] args) {

		System.out.print("Insira as medidas dos lados de um ret�ngulo(comprimento e largura): ");

		float b,h=0;
		Scanner ler = new Scanner(System.in);
		h = ler.nextFloat();
		b = ler.nextFloat();

		System.out.printf("�rea do Ret�ngulo = %.2f\n", b*h);
		System.out.printf("Per�metro do Ret�ngulo = %.2f\n", 2*(b+h));
	}
}