package Semana2;

import java.util.Scanner;

public class Questão7 {
	public static void main(String[] args) {

		System.out.println("Informe a, b e c:");
		Scanner ler = new Scanner(System.in);
		System.out.print("a = ");
		float a = ler.nextFloat();
		System.out.print("b = ");
		float b = ler.nextFloat();
		System.out.print("c = ");
		float c = ler.nextFloat();

		double delta = (b*b)-4*a*c;

		if(delta<0) {
			System.out.println("Não há raízes reais");
		}else if(delta==0) {
			double x = -b/(2*a);
			System.out.printf("S = {%.2f}\n", x);
		}else {
			double x = (- b - (Math.sqrt(delta))) / (2*a);
			double xx = (- b + (Math.sqrt(delta))) / (2*a);
			System.out.printf("S = {%.2f, %.2f}\n", x, xx);
		}
	}
}