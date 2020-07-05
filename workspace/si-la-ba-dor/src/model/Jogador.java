package model;

public class Jogador extends Usuario {
	private int pontuacao;
	
	public Jogador(String nome) {
		super(nome);
	}
	
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	public int getPontuacao() {
		return this.pontuacao;
	}
}
