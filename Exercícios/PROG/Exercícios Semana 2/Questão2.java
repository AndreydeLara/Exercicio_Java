package Semana2;

import java.util.Scanner;

public class Questão2 {
	public static void main(String[] args) {

		System.out.print("Digite três notas: ");
		float a,b,c=0;
		float m=0;
		Scanner ler = new Scanner(System.in);
		a = ler.nextFloat();
		b = ler.nextFloat();
		c = ler.nextFloat();


		m=(a+b+c)/3;

		if(m>=6){
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}
	}
}