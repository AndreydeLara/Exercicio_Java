package exercicio2;

import java.util.ArrayList;

public class Main {
	public static void main(String a[]) {

		ArrayList<Forma> formas = new ArrayList<Forma>();

		formas.add(new Forma());
		formas.add(new Circulo(1));
		formas.add(new Retangulo(2,4));
		formas.add(new Triangulo(10, 1, 1));
		formas.add(new Triangulo(2, 2, 2));
		formas.add(new Triangulo(10, 10, 12));
		formas.add(new Triangulo(4, 5, 3));

		for(Forma forma: formas) {
			System.out.println(forma.info());
			System.out.println("�rea = " + forma.area());
			System.out.println("Per�metro = " + forma.perimetro());
			System.out.println();

		}

	}
}
//SA�DA ESPERADA
//Sem forma definida
//�rea = -1.0
//Per�metro = -1.0
//
//C�rculo
//�rea = 3.141592653589793
//Per�metro = 6.283185307179586
//
//Ret�ngulo
//�rea = 8.0
//Per�metro = 12.0
//
//Os lados n�o formam um tri�ngulo
//�rea = -1.0
//Per�metro = -1.0
//
//Tri�ngulo Equil�tero
//�rea = 1.7320508075688772
//Per�metro = 6.0
//
//Triangulo Is�sceles
//�rea = 48.0
//Per�metro = 32.0
//
//Triangulo Escaleno
//�rea = 6.0
//Per�metro = 12.0
//