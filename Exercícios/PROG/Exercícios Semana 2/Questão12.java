package Semana2;

import java.util.Scanner;

public class Questão12 {
	public static void main(String[] args) {

		System.out.println("Digite números aleatórios");
		Scanner ler = new Scanner(System.in);
		int cont=0,contp=0,conti=0;

		int x = ler.nextInt();
		while(x!=0) {
			if(x%2==0) {
				contp++;
			}else {
				conti++;
			}
			cont++;
			x = ler.nextInt();
		}

		System.out.printf("Dos %d números que você digitou, %d são ímpares e %d são pares\n",cont,conti,contp);
	}
}