package Semana2;

import java.util.Scanner;

public class Questão14 {
	public static void main(String[] args) {

		System.out.print("Insira um número: ");
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt();
		int cont=0;

		for(int i=1;i<=x;i++) {
			if(x%i==0) {
				cont++;
			}
		}
		if(cont==2) {
			System.out.print("Esse número é primo");
		}else {
			System.out.print("Esse número não é primo");
		}
	}
}