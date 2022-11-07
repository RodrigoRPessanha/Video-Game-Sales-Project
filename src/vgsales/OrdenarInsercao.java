package vgsales;

public class OrdenarInsercao implements Ordenacao{
   
    @Override
    public Jogo[] ordenarJogosAno(Jogo[] listadejogos, int totaltotalDeJogos) {

        int novaPosicaoDoNumero; 
        Jogo numeroParaSerTrocado;

        for (int posicaoEmAvaliacao = 1; posicaoEmAvaliacao < totaltotalDeJogos; posicaoEmAvaliacao++) {
            numeroParaSerTrocado = listadejogos[posicaoEmAvaliacao];
            novaPosicaoDoNumero = obterNovaPosicaoAno(listadejogos, posicaoEmAvaliacao, numeroParaSerTrocado);
            listadejogos[novaPosicaoDoNumero] = numeroParaSerTrocado;
        }
        return listadejogos;
    }
	private static int obterNovaPosicaoAno(Jogo[] listadejogos, int potencialNovaPosicao, Jogo numeroParaSerTrocado) {

		while ((potencialNovaPosicao > 0) && (listadejogos[potencialNovaPosicao - 1].obterAno() < numeroParaSerTrocado.obterAno())) {
			listadejogos[potencialNovaPosicao] = listadejogos[potencialNovaPosicao - 1];     
			potencialNovaPosicao--;
		}
		return potencialNovaPosicao;
	}

    @Override
    public Jogo[] ordenarJogosVenda(Jogo[] listadejogos, int totaltotalDeJogos) {

        int novaPosicaoDoNumero; 
        Jogo numeroParaSerTrocado;

        for (int posicaoEmAvaliacao = 1; posicaoEmAvaliacao < totaltotalDeJogos; posicaoEmAvaliacao++) {
            numeroParaSerTrocado = listadejogos[posicaoEmAvaliacao];
            novaPosicaoDoNumero = obterNovaPosicaoVenda(listadejogos, posicaoEmAvaliacao, numeroParaSerTrocado);
            listadejogos[novaPosicaoDoNumero] = numeroParaSerTrocado;
        }
        return listadejogos;
    }
	private static int obterNovaPosicaoVenda(Jogo[] listadejogos, int potencialNovaPosicao, Jogo numeroParaSerTrocado) {

		while ((potencialNovaPosicao > 0) && (listadejogos[potencialNovaPosicao - 1].obterVendasGlobais() < numeroParaSerTrocado.obterVendasGlobais())) {
			listadejogos[potencialNovaPosicao] = listadejogos[potencialNovaPosicao - 1]; 
			potencialNovaPosicao--;
		}
		return potencialNovaPosicao;
	}
    @Override
    public Jogo[] ordenarJogosNome(Jogo[] listadejogos, int totalDeJogos) {
        return null;
    }
}
