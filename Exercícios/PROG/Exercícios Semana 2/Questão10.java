package Semana2;

import java.util.Scanner;

public class Quest�o10 {
	public static void main(String[] args) {

		System.out.print("Insira um n�mero: ");
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt();

		int y=1;
		for(int i=1;i<=x;i++) {
			y=y*i;	
		}
		System.out.printf("O fatorial de %d � igual a %d\n",x,y);
	}
}