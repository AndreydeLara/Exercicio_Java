package Semana2;

import java.util.Scanner;

public class Quest�o9 {
	public static void main(String[] args) {

		System.out.print("Insira dois valores: ");
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt();
		int y = ler.nextInt();

		int xy=x;
		int nr=1;
		while(nr<y) {
			xy = xy*x;
			nr++;
		}

		System.out.printf("%d elevado a %d � igual a %d\n",x,y,xy);
	}
}