package vgsales;

public class BuscaSequencial implements Buscas{

    @Override
    public Jogo buscaJogoNome(Jogo[] listadejogos, String nomeProcurado, int totalDeJogos) {
        int contador = 0;
		Jogo jogo;
		for(contador = 0; contador < totalDeJogos-1; contador++) {
			jogo = listadejogos[contador];
			if((nomeProcurado.equals(jogo.obterNome()))) {
				return jogo;
			}
		}
        return jogo = null;
    }
    
}
