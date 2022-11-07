package vgsales;


public class VetorDeJogos implements ColecaoDeJogos{
	Jogo listaDeJogos[];
	int totalDeJogos;

	public VetorDeJogos() {
		this.listaDeJogos = new Jogo[17000];
		this.totalDeJogos = 0;
	}
	
	public VetorDeJogos(int tamanhoMaximoDaLista) {
		this.listaDeJogos = new Jogo[tamanhoMaximoDaLista];
		this.totalDeJogos = 0;
	}
	
	@Override
	public void adicionarJogo(Jogo jogo) {
		this.listaDeJogos[totalDeJogos] = jogo;
		this.totalDeJogos++;
	}
	
	@Override
	public boolean excluirJogo() {
		if (this.totalDeJogos > 0) {
			this.totalDeJogos--;
			return true;
		}
		return false;
	}
	
	@Override
	public Jogo obterJogo(int indiceDoJogo) {
		return this.listaDeJogos[indiceDoJogo];
	}

	@Override
	public void definirJogo(int indiceDoJogo, Jogo jogo) {
		this.listaDeJogos[indiceDoJogo] =  jogo;
	}
	
	@Override
	public int obterTotalDeJogos() {
		return this.totalDeJogos;
	}

	@Override
	public void ordenarJogosPeloAno(Ordenacao metodoEscolhido) {
		this.listaDeJogos = metodoEscolhido.ordenarJogosAno(this.listaDeJogos, this.totalDeJogos);
	}

	@Override
	public void ordenarJogosPelaVenda(Ordenacao metodoEscolhido){
		this.listaDeJogos = metodoEscolhido.ordenarJogosVenda(this.listaDeJogos, this.totalDeJogos);
	}
	@Override
	public void ordenarJogosNome(Ordenacao metodoEscolhido){
		this.listaDeJogos = metodoEscolhido.ordenarJogosNome(this.listaDeJogos, this.totalDeJogos);
	}
	
	@Override
	public Jogo buscarJogoNomePlataforma(Buscas buscaEscolhida, String nomeProcurado){
		try {
			return buscaEscolhida.buscaJogoNome(this.listaDeJogos, nomeProcurado, this.totalDeJogos);	
		}catch (Exception e) {
			return null;
		}
	}
	@Override
	public Iterador obterIterador(){
		return null;
	}
}
		



