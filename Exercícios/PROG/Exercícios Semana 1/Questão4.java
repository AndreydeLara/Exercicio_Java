import java.util.Scanner;

public class Quest�o4 {
	public static void main(String[] args) {
		
		System.out.print("Informe seu peso(em quilogramas) e sua altura(em metros): ");

		float peso,alt=0;
		Scanner ler = new Scanner(System.in);
		peso = ler.nextFloat();
		alt = ler.nextFloat();

		System.out.printf("Seu IMC � igual a: %.2f\n", peso/(alt *alt));		
	}
}