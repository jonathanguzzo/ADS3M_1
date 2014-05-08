public class Jogador {

	private int pontuacaoInicial = 15;
	private String nome;

	public Jogador(String nome) {
		super();
		this.nome = nome;
	}

	public void setPontuacaoInicial(int pontuacaoInicial) {
		pontuacaoInicial = pontuacaoInicial;
	}

	public int getPontuacaoInicial() {
		return pontuacaoInicial;
	}

	public void setNomeJogador(String nome) {
		nome = nome;
	}

	public String getNomeJogador() {
		return nome;
	}

}
