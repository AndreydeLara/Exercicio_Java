import java.util.Scanner;

public class Questão7 {
	public static void main(String[] args) {

		System.out.print("Informe dois pontos, A e B (x,y): ");

		int x1,x2,y1,y2=0;
		Scanner ler = new Scanner(System.in);
		x1 = ler.nextInt();
		y1 = ler.nextInt();
		x2 = ler.nextInt();
		y2 = ler.nextInt();

		System.out.println("A distância entre esses pontos é de " + Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
	}
}