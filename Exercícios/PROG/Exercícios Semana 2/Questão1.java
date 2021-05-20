package Semana2;

import java.util.Scanner;

public class Questão1 {
	public static void main(String[] args) {

		System.out.print("Digite dois valores: ");
		int a,b=0;
		Scanner ler = new Scanner(System.in);
		a = ler.nextInt();
		b = ler.nextInt();

		if(a==b){
			System.out.println("ACERTOU");
		} else {
			System.out.println("ERROU");
		}
	}
}