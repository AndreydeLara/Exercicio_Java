package Semana2;

import java.util.Scanner;

public class Quest�o3 {
	public static void main(String[] args) {

		System.out.print("Digite um n�mero inteiro: ");
		Scanner ler = new Scanner(System.in);
		int a = ler.nextInt();

		if((a<10)||(a>100)){
			System.out.println("FORA DO INTERVALO");
		}else{
			System.out.println("NO INTERVALO");
		}
	}
}