package vgsales;

import java.util.ArrayList;

public class ArrayListDeJogos implements ColecaoDeJogos{
	ArrayList <Jogo> listaDeJogos;

	public ArrayListDeJogos() {
		this.listaDeJogos = new ArrayList<Jogo>();
	}
	
	@Override
	public void adicionarJogo(Jogo jogo) {
		this.listaDeJogos.add(jogo);
	}
	
	@Override
	public boolean excluirJogo() {
		if (this.listaDeJogos.size() > 0) {
			int ultimoJogoDaLista = this.listaDeJogos.size() - 1;
			this.listaDeJogos.remove(ultimoJogoDaLista);
			return true;
		}
		return false;
	}
	
	@Override
	public Jogo obterJogo(int indiceDoJogo) {
		return this.listaDeJogos.get(indiceDoJogo);
	}

	@Override
	public void definirJogo(int indiceDoJogo, Jogo jogo) {
		this.listaDeJogos.set(indiceDoJogo, jogo);
	}


	@Override
	public int obterTotalDeJogos() {
		return this.listaDeJogos.size();
	}

	@Override
	public void ordenarJogosPeloAno(Ordenacao metodoEscolhido){
	}

	@Override
	public void ordenarJogosPelaVenda(Ordenacao metodoEscolhido){
	}

	@Override
	public void ordenarJogosNome(Ordenacao metodoEscolhido){
	}
	@Override
	public Jogo buscarJogoNomePlataforma(Buscas buscaEscolhida, String nomeProcurado){	
		return null;
	}
	@Override
	public Iterador obterIterador(){
		return null;
	}
}
