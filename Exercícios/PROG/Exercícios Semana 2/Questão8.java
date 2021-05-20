package Semana2;

import java.util.Scanner;

public class Questão8 {
	public static void main(String[] args) {

		int nr=1, cont=0;
		System.out.println("Insira 20 números: ");
		Scanner ler = new Scanner(System.in);

		do {
			int a = ler.nextInt();	
			if(a>100) {
				cont++;
			}
			nr++;
		}while(nr<=20);

		if(cont==1) {
			System.out.println("Dos 20 números que você inseriu, 1 deles é maior do que 100");
		}else if(cont==20){
			System.out.println("Dos 20 números que você inseriu, todos eles são maiores que 100");
		}else {
			System.out.printf("Dos 20 números que você inseriu, %d deles são maiores que 100\n", cont);
		}

	}
}