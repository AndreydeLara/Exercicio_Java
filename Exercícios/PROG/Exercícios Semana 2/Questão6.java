package Semana2;

import java.util.Scanner;

public class Questão6 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.print("Informe seu peso(em quilogramas): ");
		float peso = ler.nextFloat();
		System.out.print("Informe sua altura(em metros): ");
		float alt = ler.nextFloat();

		float imc = peso/(alt *alt);

		if(imc<17){
			System.out.println("Situação: Muito abaixo do peso");
		}else if(imc<=18.49){
			System.out.println("Situação: Abaixo do peso");
		}else if(imc<=24.99){
			System.out.println("Situação: Peso normal");
		}else if(imc<=29.99){
			System.out.println("Situação: Acima do peso");
		}else if(imc<=34.99){
			System.out.println("Situação: Obesidade I");
		}else if(imc<=39.99){
			System.out.println("Situação: Obesidade II(Severa)");
		}else{
			System.out.println("Situação: Obesidade III(Mórbida)");
		}
	}
}