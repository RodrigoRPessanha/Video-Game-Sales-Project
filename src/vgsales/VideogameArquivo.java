package vgsales;

import java.util.Scanner;

public class VideogameArquivo {

	public static void main(String[] args) {
		Scanner entradaDoTeclado = new Scanner(System.in);	
		int opcaoArmazenamentoEmMemoria, opcaoMenuPrincipal, opcaoOrdenacao, opcaoBusca;
		ColecaoDeJogos listaDeJogos;
		Ordenacao metodoEscolhido;
		ArquivoDeJogos arquivoDeJogos;
		Buscas buscaEscolhida;
		ListaEncadeadaDeJogos opcao = null;
		System.out.println("1 - Vetor");
		System.out.println("2 - ArrayList");
		System.out.println("3 - Lista Encadeada");
		System.out.println("Qual a estrutura de armazenamento em memória você deseja utilizar?");
		opcaoArmazenamentoEmMemoria = entradaDoTeclado.nextInt();
		if (opcaoArmazenamentoEmMemoria == 1) {
			listaDeJogos = new VetorDeJogos();
		}else if(opcaoArmazenamentoEmMemoria == 2){
			listaDeJogos = new ArrayListDeJogos();
		}else{
			listaDeJogos = new ListaEncadeadaDeJogos();
		}
		arquivoDeJogos = new ArquivoTextoDeJogos();
		arquivoDeJogos.lerDoArquivoParaMemoria(listaDeJogos);
		
		do{
			System.out.println("\n\n*************** Menu de Opções ****************");
			System.out.println("1 - Adicionar jogo");
			System.out.println("2 - Excluir jogo");
			System.out.println("3 - Listar jogos");
			System.out.println("4 - Ordenar lista pelo ano");
			System.out.println("5 - Ordenar lista pelas vendas");
			System.out.println("6 - Ordenar lista pelo nome");
			System.out.println("7 - Buscar um jogo pelo nome");
			System.out.println("0 - Sair do programa");
			opcaoMenuPrincipal = entradaDoTeclado.nextInt();			
			switch (opcaoMenuPrincipal) {
			case 1: adicionarJogo(listaDeJogos);
					break;

			case 2: excluirJogo(listaDeJogos);
					break;

			case 3: if(opcaoArmazenamentoEmMemoria == 3){
						listarJogos(listaDeJogos, opcao);
					}else{
						listarJogos(listaDeJogos);
					}
					break;

			case 4: System.out.println("1 - Algoritmo da Bolha");
					System.out.println("2 - Algoritmo de Seleção");
					System.out.println("3 - Algoritmo de Inserção");
					System.out.println("Qual o algoritmo de ordenação você deseja utilizar?");
					opcaoOrdenacao = entradaDoTeclado.nextInt();
					if (opcaoOrdenacao == 1) {
						metodoEscolhido = new OrdenarBolha();
					}else if(opcaoOrdenacao == 2){
						metodoEscolhido = new OrdenarSelecao();
					}else{
						metodoEscolhido = new OrdenarInsercao();
					}
					ordenarJogosPeloAno(metodoEscolhido, listaDeJogos);
					break;

			case 5: System.out.println("1 - Algoritmo da Bolha");
					System.out.println("2 - Algoritmo de Seleção");
					System.out.println("3 - Algoritmo de Inserção");
					System.out.println("Qual o algoritmo de ordenação você deseja utilizar?");
					opcaoOrdenacao = entradaDoTeclado.nextInt();
					if (opcaoOrdenacao == 1) {
						metodoEscolhido = new OrdenarBolha();
					}else if(opcaoOrdenacao == 2){
						metodoEscolhido = new OrdenarSelecao();
					}else{
						metodoEscolhido = new OrdenarInsercao();
					}
					ordenarJogosPelasVendas(metodoEscolhido, listaDeJogos);
					break;

			case 6: System.out.println("1 - Algoritmo da Bolha");
					System.out.println("2 - Algoritmo de Seleção");
					System.out.println("3 - Algoritmo de Inserção");
					System.out.println("Qual o algoritmo de ordenação você deseja utilizar?");
					opcaoOrdenacao = entradaDoTeclado.nextInt();
					if (opcaoOrdenacao == 1) {
						metodoEscolhido = new OrdenarBolha();
					}else if(opcaoOrdenacao == 2){
						metodoEscolhido = new OrdenarSelecao();
					}else{
						metodoEscolhido = new OrdenarInsercao();
					}
					ordenarJogosPeloNome(metodoEscolhido, listaDeJogos);
					break;

			case 7: System.out.println("1 - Busca Sequencial");
					System.out.println("2 - Busca Binária");
					System.out.println("Qual o algoritmo de ordenação você deseja utilizar?");
					opcaoBusca = entradaDoTeclado.nextInt();
					if (opcaoBusca == 1) {
						buscaEscolhida = new BuscaSequencial();
					}else{
						buscaEscolhida = new BuscaBinaria();
					}
					System.out.println("Qual o nome do jogo?");
					entradaDoTeclado.nextLine();
					String nomeProcurado = entradaDoTeclado.nextLine();
					buscarJogoPeloNomePlataforma(buscaEscolhida,listaDeJogos, nomeProcurado);
					break;
			}
		}
		while (opcaoMenuPrincipal != 0);
		arquivoDeJogos.escreverDaMemoriaNoArquivo(listaDeJogos, opcaoArmazenamentoEmMemoria);
	}

	private static void adicionarJogo(ColecaoDeJogos listaDeJogos) {
		Scanner entradaDoTeclado = new Scanner(System.in);	
		String nome, plataforma;
		int ano;
		double vendasGlobais;
		
		System.out.println("Entre com o nome do jogo:");
		nome = entradaDoTeclado.nextLine();
		System.out.println("Entre com a plataforma:");
		plataforma = entradaDoTeclado.nextLine();
		System.out.println("Entre com o ano de lançamento:");
		ano = entradaDoTeclado.nextInt();
		System.out.println("Entre com o total de vendas globais:");
		vendasGlobais = entradaDoTeclado.nextDouble();
		Jogo jogo1 = new Jogo(nome, plataforma, ano, vendasGlobais);
		listaDeJogos.adicionarJogo(jogo1);
	}

	private static void excluirJogo(ColecaoDeJogos listaDeJogos) {
		boolean excluiu;
		
		excluiu = listaDeJogos.excluirJogo();
		if (excluiu == true) {
			System.out.println("Jogo excluído com sucesso.");
		}
		else {
			System.out.println("Jogo não encontrado.");
		}
	}
	
	private static void listarJogos(ColecaoDeJogos listaDeJogos) {
		int totalDeJogos = listaDeJogos.obterTotalDeJogos();
		
		if (totalDeJogos > 0) {
			Jogo jogo;
			for (int indiceDoJogo = 0; indiceDoJogo < totalDeJogos; indiceDoJogo++) {
				jogo = listaDeJogos.obterJogo(indiceDoJogo);
				System.out.println("\n------------------------------------------");
				System.out.println("Nome do Jogo:" + jogo.obterNome());
				System.out.println("Plataforma:" + jogo.obterPlataforma());
				System.out.println("Ano de lançamento:" + jogo.obterAno());
				System.out.println("Total de vendas globais:" + jogo.obterVendasGlobais());
			}
		}
		else {
			System.out.println("Não existem jogos cadastrados na lista.");
		}
	}

	private static void listarJogos(ColecaoDeJogos listaDeJogos, ListaEncadeadaDeJogos opcao) {
		Iterador iteradorListaEncadeada = listaDeJogos.obterIterador();
		while (iteradorListaEncadeada.temProximo()) {
			Jogo elemento = iteradorListaEncadeada.obterElemento();
			System.out.println("\n------------------------------------------");
			System.out.println("Nome do Jogo:" + elemento.obterNome());
			System.out.println("Plataforma:" + elemento.obterPlataforma());
			System.out.println("Ano de lançamento:" + elemento.obterAno());
			System.out.println("Total de vendas globais:" + elemento.obterVendasGlobais());
		}
	}

	private static void ordenarJogosPeloAno(Ordenacao metodoEscolhido,ColecaoDeJogos listaDeJogos){
		listaDeJogos.ordenarJogosPeloAno(metodoEscolhido);
	}

	private static void ordenarJogosPelasVendas(Ordenacao metodoEscolhido,ColecaoDeJogos listaDeJogos){
		listaDeJogos.ordenarJogosPelaVenda(metodoEscolhido);
	}

	private static void ordenarJogosPeloNome(Ordenacao metodoEscolhido,ColecaoDeJogos listaDeJogos){
		listaDeJogos.ordenarJogosNome(metodoEscolhido);	
	}

	private static void buscarJogoPeloNomePlataforma(Buscas buscaEscolhida, ColecaoDeJogos listaDeJogos, String nomeProcurado){
		try {
			Jogo jogo = listaDeJogos.buscarJogoNomePlataforma(buscaEscolhida, nomeProcurado);
			System.out.println("\n"+jogo.obterNome());
			System.out.println(jogo.obterPlataforma());
			System.out.println(jogo.obterAno());
			System.out.println(jogo.obterVendasGlobais());
		}catch (NullPointerException e) {
			System.out.println("Jogo não encontrado!");
		}catch (Exception e) {
			System.out.println("Erro");
		}
	}
}
