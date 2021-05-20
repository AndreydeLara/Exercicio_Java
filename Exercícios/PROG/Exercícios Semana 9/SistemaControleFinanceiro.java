import java.util.Scanner;

public class SistemaControleFinanceiro {

	private GerenciadorDespesas despesas;

	private Scanner teclado;

	public SistemaControleFinanceiro() {
		despesas = new GerenciadorDespesas();
		teclado = new Scanner(System.in);
	}

	public void iniciarSistema() {
		int op = -1;
		while (op != 0) {
			op = menuPrincipal();
			switch (op) {
			case 1:
				adicionarDespesa();
				break;
			case 2:
				detalharDespesa();
				break;
			case 3:
				despesas.imprimirDespesas();
				break;
			case 4:
				despesas.imprimirDespesasFixas();
				break;
			case 5:
				despesas.imprimirDespesasVariaveis();
				break;
			case 6:
				despesas.imprimirPorMes();
				break;
			case 7:
				removerDespesa();
				break;
			case 8:
				despesas.listaCategorias();
				break;
			case 9:
				adicionarCategoria();
				break;
			case 10:
				removerCategoria();
				break;
			case 0:
				System.out.println("Finalizando o sistema");
				break;
			default:
				System.out.println("Op��o inv�lida");
				break;
			}
		}
	}

	private void removerCategoria() {
		Scanner ler = new Scanner(System.in);
		despesas.listaCategorias();
		if(despesas.numCategorias()>=0) {
			System.out.println("Digite a posi��o para remover:");
			int a = ler.nextInt();
			a--;
			System.out.println("\nRemovendo: "+despesas.getCategoria(a));
			despesas.removerCategoria(a);
			System.out.println();
		}else {
			System.out.println("N�o h� categorias cadastradas!");
		}
		// SAIDA ESPERADA
		// ---------------MENU-----------------
		// 1 - Adicionar Despesa
		// 2 - Detalhar Despesa
		// 3 - Listar Despesas
		// 4 - Listar Despesas Fixas
		// 5 - Listar Despesas Variáveis
		// 6 - Listar Despesas por Mês
		// 7 - Remover Despesa
		// 8 - Listar Categoria
		// 9 - Adicionar Categoria
		// 10 - Remover Categoria
		// 0 - Sair
		// ------------------------------------
		// Digite opção:
		// 10
		// ------- Categorias Cadastradas -------
		//
		// 1 Habitação
		// 2 Transporte
		// 3 Saúde
		// 4 Educação
		// 5 Outros
		// 6 Lazer
		//
		// Digite a posição para remover:
		// 5
		//
		// Removendo: Outros
		// ---------------MENU-----------------
		// 1 - Adicionar Despesa
		// 2 - Detalhar Despesa
		// 3 - Listar Despesas
		// 4 - Listar Despesas Fixas
		// 5 - Listar Despesas Variáveis
		// 6 - Listar Despesas por Mês
		// 7 - Remover Despesa
		// 8 - Listar Categoria
		// 9 - Adicionar Categoria
		// 10 - Remover Categoria
		// 0 - Sair
		// ------------------------------------
		// Digite opção:
		// 8
		// ------- Categorias Cadastradas -------
		//
		// 1 Habitação
		// 2 Transporte
		// 3 Saúde
		// 4 Educação
		// 5 Lazer
	}

	private void adicionarCategoria() {
		Scanner ler = new Scanner(System.in);
		System.out.println("------- Adicionando Categorias -------\n");
		System.out.println("Digite Nome:");
		String a = ler.nextLine();
		despesas.adicionarCategoria(a);
		System.out.println();
		// ---------------MENU-----------------
		// 1 - Adicionar Despesa
		// 2 - Detalhar Despesa
		// 3 - Listar Despesas
		// 4 - Listar Despesas Fixas
		// 5 - Listar Despesas Vari�veis
		// 6 - Listar Despesas por Mês
		// 7 - Remover Despesa
		// 8 - Listar Categoria
		// 9 - Adicionar Categoria
		// 10 - Remover Categoria
		// 0 - Sair
		// ------------------------------------
		// Digite opção:
		// 9
		// ------- Adicionando Categorias -------
		//
		// Digite Nome:
		// Lazer
		//
		// ---------------MENU-----------------
		// 1 - Adicionar Despesa
		// 2 - Detalhar Despesa
		// 3 - Listar Despesas
		// 4 - Listar Despesas Fixas
		// 5 - Listar Despesas Variáveis
		// 6 - Listar Despesas por Mês
		// 7 - Remover Despesa
		// 8 - Listar Categoria
		// 9 - Adicionar Categoria
		// 10 - Remover Categoria
		// 0 - Sair
		// ------------------------------------
		// Digite opção:
		// 8
		// ------- Categorias Cadastradas -------
		//
		// 1 Habitação
		// 2 Transporte
		// 3 Saúde
		// 4 Educação
		// 5 Outros
		// 6 Lazer
	}

	private void detalharDespesa() {
		despesas.imprimirDespesas();
		if (despesas.numDespesas() > 0) {
			System.out.println("Escolha a despesa, digite a sua posi��o:");
			int flag;
			do {
				flag = Integer.parseInt(teclado.nextLine());
			} while (flag < 1 || flag > despesas.numDespesas());

			despesas.getDespesa(flag - 1).detalharDespesa();
		}
	}

	private void removerDespesa() {
		Scanner ler = new Scanner(System.in);
		despesas.imprimirDespesas();
		if(despesas.numDespesas()>=0) {
			System.out.println("Digite a posi��o para remover:");
			int a = ler.nextInt();
			a--;
			System.out.println("\nRemovendo: "+despesas.getDespesa(a).getNome());
			despesas.removerDespesa(a);
			System.out.println();
		}
		// ---------------MENU-----------------
		// 1 - Adicionar Despesa
		// 2 - Detalhar Despesa
		// 3 - Listar Despesas
		// 4 - Listar Despesas Fixas
		// 5 - Listar Despesas Variáveis
		// 6 - Listar Despesas por Mês
		// 7 - Remover Despesa
		// 8 - Listar Categoria
		// 9 - Adicionar Categoria
		// 10 - Remover Categoria
		// 0 - Sair
		// ------------------------------------
		// Digite opção:
		// 7
		// -------- Listagem de Despesas --------
		//
		// Posição 1: Luz R$ 100.0 [Habitação]
		// Posição 2: Unimed R$ 250.0 [Saúde]
		// Posição 3: Lanche R$ 15.0
		// Posição 4: Compras R$ 50.0
		//
		// Digite a posição para remover:
		// 2
		//
		// Removendo: Unimed
		//		
		// ---------------MENU-----------------
		// 1 - Adicionar Despesa
		// 2 - Detalhar Despesa
		// 3 - Listar Despesas
		// 4 - Listar Despesas Fixas
		// 5 - Listar Despesas Variáveis
		// 6 - Listar Despesas por Mês
		// 7 - Remover Despesa
		// 8 - Listar Categoria
		// 9 - Adicionar Categoria
		// 10 - Remover Categoria
		// 0 - Sair
		// ------------------------------------
		// Digite opção:
		// 3
		// -------- Listagem de Despesas --------
		//
		// Posição 1: Luz R$ 100.0 [Habitação]
		// Posição 2: Lanche R$ 15.0
		// Posição 3: Compras R$ 50.0
	}

	private void adicionarDespesa() {
		System.out.println("------Adicionando Despesa------");
		int op = -1;
		Despesa despesa = null;
		while (!(op == 1 || op == 2)) {
			op = escolhaDespesa();
			switch (op) {
			case 1:
				despesa = new Fixa();
				break;
			case 2:
				despesa = new Variavel();
				break;
			default:
				System.out.println("Op��o inv�lida");
				break;
			}
		}
		System.out.println("Digite Nome:");
		despesa.setNome(teclado.nextLine());

		System.out.println("Digite Valor:");
		despesa.setValor(Double.parseDouble(teclado.nextLine()));

		if (op == 1)
			lerDespesaFixa((Fixa) despesa);
		else
			lerDespesaVariavel((Variavel) despesa);

		despesas.adicionarDespesa(despesa);

	}

	private void lerDespesaFixa(Fixa fixa) {
		System.out.println("Escolha a Categoria:");
		despesas.listaCategorias();
		int flag;
		do {
			flag = Integer.parseInt(teclado.nextLine());
		} while (flag < 1 || flag > despesas.numCategorias());

		fixa.setCategoria(despesas.getCategoria(flag - 1));

	}

	private void lerDespesaVariavel(Variavel variavel) {
		System.out.println("Escolha o m�s, apenas o n�mero:");
		despesas.listarMeses();
		int flag;
		do {
			flag = Integer.parseInt(teclado.nextLine());
		} while (flag < 1 || flag > 12);

		variavel.setMes(despesas.getMes(flag - 1));
	}

	public int escolhaDespesa() {
		System.out.println("Qual o tipo da despesa?");
		System.out.println("  1 - Despesa Fixa");
		System.out.println("  2 - Despesa Vari�vel");
		System.out.println("Digite op��o:");
		int op = Integer.parseInt(teclado.nextLine());
		return op;
	}

	public int menuPrincipal() {
		System.out.println("---------------MENU-----------------");
		System.out.println("  1 - Adicionar Despesa");
		System.out.println("  2 - Detalhar Despesa");
		System.out.println("  3 - Listar Despesas");
		System.out.println("  4 - Listar Despesas Fixas");
		System.out.println("  5 - Listar Despesas Vari�veis");
		System.out.println("  6 - Listar Despesas por M�s");
		System.out.println("  7 - Remover Despesa");
		System.out.println("  8 - Listar Categoria");
		System.out.println("  9 - Adicionar Categoria");
		System.out.println("  10 - Remover Categoria");
		System.out.println("  0 - Sair");
		System.out.println("------------------------------------");
		System.out.println("Digite op��o:");
		int op = Integer.parseInt(teclado.nextLine());
		return op;
	}

}