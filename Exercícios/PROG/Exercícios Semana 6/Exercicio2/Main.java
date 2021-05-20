package exercicio2;

public class Main {
	public static void main(String[] args) {
		
		Livro livro = new Livro("autor 1", "titulo 1", 2000);
		livro.addCapitulo(new Capitulo("Capitulo", "Texto"));
		livro.addCapitulo(new Capitulo("Capitulo", "Texto"));
		
		Artigo artigo = new Artigo("autor 2", "titulo 2", 2019);
		artigo.addSecao(new Secao("Secao", "Conte�do"));
		artigo.addSecao(new Secao("Secao", "Conte�do"));
		artigo.addSecao(new Secao("Secao", "Conte�do"));
		
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.addPublicacao(livro);
		biblioteca.addPublicacao(artigo);
		
		biblioteca.listarAcervo();
		
		biblioteca.imprimirItem(0);
		
		biblioteca.imprimirItem(1);
		

	}
}
//SAIDA ESPERADA
//Item 0:
//T�tulo: titulo 1
//Autor: autor 1
//
//Item 1:
//T�tulo: titulo 2
//Autor: autor 2
//
//---- LIVRO ----
//T�tulo:titulo 1
//Autor: autor 1
//Ano: 2000
//Cap�tulo 1: Capitulo
//Texto
//Cap�tulo 2: Capitulo
//Texto
//
//---- ARTIGO ----
//T�tulo:titulo 2
//Autor: autor 2
//Ano: 2019
//Se��o 1: Secao
//Conte�do
//Se��o 2: Secao
//Conte�do
//Se��o 3: Secao
//Conte�do