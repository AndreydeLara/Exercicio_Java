import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	ArrayList<Item> Item = new ArrayList<Item>();
	private int aux=0;

	public void addItem(Item item){
		// Adiciona um item no carrinho
		Item.add(item);
	}

	public void removeItem(int i){
		// Remove um item no carrinho
		if((i>Item.size())||(0>Item.size())) {
			System.out.println("Posição Inválida!");
		}else {
			i--;
			System.out.println("Item Removido: "+ Item.get(i).getNome());	
			Item.remove(i);
		}
	}

	public void valorTotal(){
		// Retorna o valor de todos os itens do carrinho
		double ValorCompra = 0;
		for(int i=0;i<Item.size();i++) {
			ValorCompra = ValorCompra + Item.get(i).getValor();
		}
		System.out.println(ValorCompra);		
	}

	public void imprimirCarrinho(){
		// Imprime todos os itens do carrinho	
		if(Item.size()==0) {
			System.out.println("Carrinho Vazio!");
		}else {
			for(int i=0;i<Item.size();i++) {
				aux++;
				System.out.println("Item "+ aux +": "+ Item.get(i).getNome() +" R$: "+ Item.get(i).getValor());
			}
			aux=0;
		}
	}

}