package vgsales;

public class OrdenarBolha implements Ordenacao{

    @Override
    public Jogo[] ordenarJogosAno(Jogo[] listadejogos, int totalDeJogos) {
            boolean existiuTroca;
            if (totalDeJogos > 0) {
                Jogo jogo;
                Jogo jogo2;
                Jogo aux;
                do {
                    existiuTroca = false;
                    for (int indiceDoJogo = 0; indiceDoJogo < totalDeJogos-1; indiceDoJogo++) {
                        jogo = listadejogos[indiceDoJogo];
                        jogo2 = listadejogos[indiceDoJogo+1];
                        if (jogo.obterAno() > jogo2.obterAno()) {
                            aux = listadejogos[indiceDoJogo];
                            listadejogos[indiceDoJogo] = listadejogos[indiceDoJogo+1];
                            listadejogos[indiceDoJogo+1] = aux;
                            existiuTroca = true;
                        }
                    }
                }while (existiuTroca);
            } 
        return listadejogos;
    }

    @Override
    public Jogo[] ordenarJogosVenda(Jogo[] listadejogos,int totalDeJogos) {
		boolean existiuTroca;
		if (totalDeJogos > 0) {
			Jogo jogo;
			Jogo jogo2;
            Jogo aux;
			do {
				existiuTroca = false;
				for (int indiceDoJogo = 0; indiceDoJogo < totalDeJogos-1; indiceDoJogo++) {
					jogo = listadejogos[indiceDoJogo];
					jogo2 = listadejogos[indiceDoJogo+1];
					if (jogo.obterVendasGlobais() > jogo2.obterVendasGlobais()) {
	
						aux = listadejogos[indiceDoJogo];
                        listadejogos[indiceDoJogo] = listadejogos[indiceDoJogo+1];
                        listadejogos[indiceDoJogo+1] = aux;
						existiuTroca = true;
					}
				}
			}while (existiuTroca);
		} 
        return listadejogos; 
    }
    
    @Override
    public Jogo[] ordenarJogosNome(Jogo[] listadejogos, int totalDeJogos){
        boolean existiuTroca;
            if (totalDeJogos > 0) {
                Jogo jogo;
                Jogo jogo2;
                Jogo aux;
                do {
                    existiuTroca = false;
                    for (int indiceDoJogo = 0; indiceDoJogo < totalDeJogos-1; indiceDoJogo++) {
                        jogo = listadejogos[indiceDoJogo];
                        jogo2 = listadejogos[indiceDoJogo+1];
                        if (jogo.obterNome().compareToIgnoreCase(jogo2.obterNome()) > 0 ) {
                            aux = listadejogos[indiceDoJogo];
                            listadejogos[indiceDoJogo] = listadejogos[indiceDoJogo+1];
                            listadejogos[indiceDoJogo+1] = aux;
                            existiuTroca = true;
                        }
                    }
                }while (existiuTroca);
            } 
        return listadejogos;
    }
}
