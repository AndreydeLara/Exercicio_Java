package Semana2;

import java.util.Scanner;

public class Quest�o12 {
	public static void main(String[] args) {

		System.out.println("Digite n�meros aleat�rios");
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

		System.out.printf("Dos %d n�meros que voc� digitou, %d s�o �mpares e %d s�o pares\n",cont,conti,contp);
	}
}