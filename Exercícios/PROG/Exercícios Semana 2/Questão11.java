package Semana2;

import java.util.Scanner;

public class Quest�o11 {
	public static void main(String[] args) {

		System.out.println("Digite n�meros aleat�rios");
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

		System.out.println("A m�dia dos n�meros que voc� digitou � "+ med);
	}
}