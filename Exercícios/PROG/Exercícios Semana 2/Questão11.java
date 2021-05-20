package Semana2;

import java.util.Scanner;

public class Questão11 {
	public static void main(String[] args) {

		System.out.println("Digite números aleatórios");
		Scanner ler = new Scanner(System.in);
		int cont=0;
		int soma=0;
		float med=0;

		int x = ler.nextInt();
		while(x!=0) {
			cont++;
			soma=soma+x;
			x = ler.nextInt();
		}

		if(cont==0) {
			med=0;
		}else {
			med=soma/cont;
		}

		System.out.println("A média dos números que você digitou é "+ med);
	}
}