package vgsales;

public class BuscaBinaria implements Buscas{

    @Override
    public Jogo buscaJogoNome(Jogo[] listadejogos, String nomeProcurado, int totalDeJogos) {
        int indiceEncontrado = buscaBinaria(nomeProcurado, listadejogos, 0, totalDeJogos);
        if(indiceEncontrado >= 0){
            return listadejogos[indiceEncontrado];
        }else{
            return null;
        }
    }

    private static int buscaBinaria(String nomeProcurado, Jogo[] listadejogos, int inicio, int fim) {
		int meio = (inicio + fim) / 2;
		if (listadejogos[meio].obterNome().compareToIgnoreCase(nomeProcurado) == 0) {
			return meio;
		}
		if (inicio >= fim) {
			return -1;
		} 
		if (listadejogos[meio].obterNome().compareToIgnoreCase(nomeProcurado) < 0) {
			return buscaBinaria(nomeProcurado, listadejogos, meio + 1, fim);
		} 
		else {
			return buscaBinaria(nomeProcurado, listadejogos, inicio, meio - 1);
		}
	}

}
