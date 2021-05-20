package Semana2;

import java.util.Scanner;

public class Questão5 {
	public static void main(String[] args) {

		System.out.print("Informe quantos minutos seu carro ficou estacionado: ");
		Scanner ler = new Scanner(System.in);
		int a = ler.nextInt();

		if(a<=15){
			System.out.println("Preço: GRÁTIS");
		}else if(a<=60){
			System.out.println("Preço: R$1,00");
		}else {
			System.out.println("Preço: R$2,00");
		}
	}
}