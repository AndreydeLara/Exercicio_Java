package Semana2;

import java.util.Scanner;

public class Quest�o13 {
	public static void main(String[] args) {

		System.out.println("Insira 20 n�meros de forma aleat�ria");
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt();

		int nr=2;
		int maior=x, menor=x;

		while(nr<=5){
			x = ler.nextInt();
			if(x>maior) {
				maior=x;
			}
			if(x<menor) {
				menor=x;
			}
			nr++;
		}

		System.out.printf("Dos 20 n�meros que voc� digitou, %d � o maior e %d � o menor\n",maior,menor);

	}
}