package Semana2;

import java.util.Scanner;

public class Quest�o6 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.print("Informe seu peso(em quilogramas): ");
		float peso = ler.nextFloat();
		System.out.print("Informe sua altura(em metros): ");
		float alt = ler.nextFloat();

		float imc = peso/(alt *alt);

		if(imc<17){
			System.out.println("Situa��o: Muito abaixo do peso");
		}else if(imc<=18.49){
			System.out.println("Situa��o: Abaixo do peso");
		}else if(imc<=24.99){
			System.out.println("Situa��o: Peso normal");
		}else if(imc<=29.99){
			System.out.println("Situa��o: Acima do peso");
		}else if(imc<=34.99){
			System.out.println("Situa��o: Obesidade I");
		}else if(imc<=39.99){
			System.out.println("Situa��o: Obesidade II(Severa)");
		}else{
			System.out.println("Situa��o: Obesidade III(M�rbida)");
		}
	}
}