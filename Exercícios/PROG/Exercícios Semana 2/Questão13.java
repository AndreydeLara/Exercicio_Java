package Semana2;

import java.util.Scanner;

public class Questão13 {
	public static void main(String[] args) {

		System.out.println("Insira 20 números de forma aleatória");
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

		System.out.printf("Dos 20 números que você digitou, %d é o maior e %d é o menor\n",maior,menor);

	}
}