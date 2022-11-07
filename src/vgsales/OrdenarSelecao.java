package vgsales;

public class OrdenarSelecao implements Ordenacao{

    @Override
    public Jogo[] ordenarJogosAno(Jogo[] listadejogos, int totalDeJogos) {
		int posicaoDoMenorValor = 0;
		for (int posicaoEmAnalise = 0; posicaoEmAnalise < totalDeJogos; posicaoEmAnalise++) {
			posicaoDoMenorValor = obterPosicaoDoMenorValorAno(listadejogos, totalDeJogos, posicaoEmAnalise);
			trocarValoresAno(listadejogos, posicaoDoMenorValor, posicaoEmAnalise);
		}
        return listadejogos;
	}

	private static int obterPosicaoDoMenorValorAno(Jogo[] listadejogos, int totalDeJogos, int posicaoDeInicio) {
		int menorValor = listadejogos[posicaoDeInicio].obterAno();
		int posicaoParaTroca = posicaoDeInicio;
		for (int posicaoAvaliada = posicaoDeInicio + 1; posicaoAvaliada < totalDeJogos; posicaoAvaliada++) {			
			if (listadejogos[posicaoAvaliada].obterAno() > menorValor) {
				menorValor = listadejogos[posicaoAvaliada].obterAno();
				posicaoParaTroca = posicaoAvaliada;
			}
		}
		return posicaoParaTroca;
	}
	
	private static void trocarValoresAno(Jogo[] listadejogos, int posicaoDoMenorValor, int posicaoVetor) {
		Jogo armazenamentoAuxiliar;
		armazenamentoAuxiliar = listadejogos[posicaoVetor];
		listadejogos[posicaoVetor] = listadejogos[posicaoDoMenorValor];
		listadejogos[posicaoDoMenorValor] = armazenamentoAuxiliar;
	}

    @Override
    public Jogo[] ordenarJogosVenda(Jogo[] listadejogos, int totalDeJogos) {
		int posicaoDoMenorValor = 0;
		for (int posicaoEmAnalise = 0; posicaoEmAnalise < totalDeJogos; posicaoEmAnalise++) {
			posicaoDoMenorValor = obterPosicaoDoMenorValorVenda(listadejogos, totalDeJogos, posicaoEmAnalise);
			trocarValoresVenda(listadejogos, posicaoDoMenorValor, posicaoEmAnalise);
		}
        return listadejogos;
	}

	private static int obterPosicaoDoMenorValorVenda(Jogo[] listadejogos, int totalDeJogos, int posicaoDeInicio) {
		double menorValor = listadejogos[posicaoDeInicio].obterVendasGlobais();
		int posicaoParaTroca = posicaoDeInicio;
		for (int posicaoAvaliada = posicaoDeInicio + 1; posicaoAvaliada < totalDeJogos; posicaoAvaliada++) {			
			if (listadejogos[posicaoAvaliada].obterVendasGlobais() > menorValor) {
				menorValor = listadejogos[posicaoAvaliada].obterVendasGlobais();
				posicaoParaTroca = posicaoAvaliada;
			}
		}
		return posicaoParaTroca;
	}
	
	private static void trocarValoresVenda(Jogo[] listadejogos, int posicaoDoMenorValor, int posicaoVetor) {
		Jogo armazenamentoAuxiliar;
		armazenamentoAuxiliar = listadejogos[posicaoVetor];
		listadejogos[posicaoVetor] = listadejogos[posicaoDoMenorValor];
		listadejogos[posicaoDoMenorValor] = armazenamentoAuxiliar;
	}

	@Override
    public Jogo[] ordenarJogosNome(Jogo[] listadejogos, int totalDeJogos) {
        return null;
    }
}
