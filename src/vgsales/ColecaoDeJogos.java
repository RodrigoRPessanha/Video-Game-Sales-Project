package vgsales;

public interface ColecaoDeJogos {
		
		public void adicionarJogo(Jogo jogo);
		
		public boolean excluirJogo();
		
		public Jogo obterJogo(int indiceDoJogo);

		public void definirJogo(int indiceDoJogo, Jogo jogo);
		
		public int obterTotalDeJogos();

		public void ordenarJogosPeloAno(Ordenacao metodoEscolhido);

		public void ordenarJogosPelaVenda(Ordenacao metodoEscolhido);

		public void ordenarJogosNome(Ordenacao metodoEscolhido);

		public Jogo buscarJogoNomePlataforma(Buscas buscaEscolhida,String nomeProcurado);

		public Iterador obterIterador();

}
