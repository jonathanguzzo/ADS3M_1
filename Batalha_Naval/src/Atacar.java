public class Atacar {
	private int opLinha;
	private int opColuna;

	public void AtacarTiro(int opcaoLinha, int opcaoColuna) {
		this.opLinha = opcaoLinha;
		this.opColuna = opcaoColuna;
	}

	public int getopcaoLinha() {
		return opLinha;
	}

	public void setTamanho(int opcaoLinha) {
		this.opLinha = opcaoLinha;
	}

	public int getopcaoColuna() {
		return opColuna;
	}

	public void setopcaoColuna(int opcaoColuna) {
		this.opColuna = opcaoColuna;
	}

}