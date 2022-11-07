package vgsales;

public interface Ordenacao {

    public Jogo[] ordenarJogosAno(Jogo[] listadejogos, int totalDeJogos);

    public Jogo[] ordenarJogosVenda(Jogo[] listadejogos, int totalDeJogos);
    
    public Jogo[] ordenarJogosNome(Jogo[] listadejogos, int totalDeJogos);

}
