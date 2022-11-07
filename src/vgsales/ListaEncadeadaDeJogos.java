package vgsales;

public class ListaEncadeadaDeJogos implements ColecaoDeJogos{
    No inicio = null;
    int totalDeJogos;

    @Override
    public void adicionarJogo(Jogo jogo) {
        No novoNo = new No(jogo);
		No noAtual = this.inicio;
		if (this.inicio != null) {
			while (noAtual.proximo != null) {
				noAtual = noAtual.proximo;
			}			
			noAtual.proximo = novoNo;
		}
		else {
			this.inicio = novoNo;
		}
    }

    @Override
    public boolean excluirJogo() {
        No noAtual = this.inicio;
		No noAnterior = null;
	
		if (this.inicio != null) {
			while (noAtual.proximo != null) {
				noAnterior = noAtual;
				noAtual = noAtual.proximo;
			}
			if (noAnterior != null) {
				noAnterior.proximo = null;
			}
			else {
				this.inicio = this.inicio.proximo;
			}
			return true;
		}
		return false;
    }

    @Override
    public Jogo obterJogo(int indiceDoJogo) {
        return null;
    }

    @Override
    public void definirJogo(int indiceDoJogo, Jogo jogo) {
    }

    @Override
    public int obterTotalDeJogos() {
        return this.totalDeJogos;
    }

    @Override
    public void ordenarJogosPeloAno(Ordenacao metodoEscolhido) {
    }

    @Override
    public void ordenarJogosPelaVenda(Ordenacao metodoEscolhido) {
    }

    @Override
    public void ordenarJogosNome(Ordenacao metodoEscolhido) {   
    }

    @Override
    public Jogo buscarJogoNomePlataforma(Buscas buscaEscolhida, String nomeProcurado) {
        return null;
    }

    @Override
	public String toString() {
		String elementos = new String();
		No noAtual = this.inicio;
		while (noAtual != null) {
			elementos = elementos + noAtual.dado + " "; 
			noAtual = noAtual.proximo;
		}
		return "ListaEncadeada [ "+ elementos + "]";
	}

    public Iterador obterIterador() {
		Iterador iterador = new Iterador(this.inicio);
		return iterador;
	}
    
}
