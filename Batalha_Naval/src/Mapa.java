import java.util.Random;

public class Mapa {
	static int[][] tabuleiro = new int[10][10];
	int linha;
	int coluna;
	Random r = new Random();

	public void inicializaTabuleiro() {

		for (linha = 0; linha < 10; linha++)

			for (coluna = 0; coluna < 10; coluna++)

				tabuleiro[linha][coluna] = -1;
	}

	public static void mostraTabuleiro() {

		System.out.println("\tA \tB \tC \tD \tE \tF \tG \tH \tI \tJ");

		for (int linha = 0; linha < 10; linha++) {

			System.out.print((linha) + "");

			for (int coluna = 0; coluna < 10; coluna++) {

				if (tabuleiro[linha][coluna] == 0) {

					System.out.print("\t" + "0");

				} else if (tabuleiro[linha][coluna] == 1) {

					System.out.print("\t" + "x");
				} else {
					System.out.print("\t" + ".");
				}

			}
			System.out.println();
		}

	}

	public void criarFrota() {

		CriarNavios(5); // Cria um Porta avioes

		for (int i = 0; i < 2; i++) { // Cria 2 Destroyers
			CriarNavios(4);
		}

		for (int i = 0; i < 2; i++) { // Cria 2 Fragatas
			CriarNavios(3);
		}

		for (int i = 0; i < 3; i++) { // Cria 3 Torpedeiros
			CriarNavios(2);
		}

		for (int i = 0; i < 5; i++) { // Cria 5 Submarinos
			CriarNavios(1);
		}
	}

	public static void AtacarTir(int opcaoLinha, int opcaoColuna) {
		int aux;
		aux = tabuleiro[opcaoColuna][opcaoLinha];
		if (aux == 2) {
			tabuleiro[opcaoColuna][opcaoLinha] = 0;
		} else {
			tabuleiro[opcaoColuna][opcaoLinha] = 1;
		}
	}

	public boolean existe1(int tamanho, int coluna, int linha) {
		int aux;
		boolean teste = true;
		for (int i = 0; i < tamanho; i++) {
			aux = tabuleiro[coluna][linha + i];
			if (aux == 0) {
				teste = false;
			}
		}
		return teste;
	}

	public boolean existe2(int tamanho, int coluna, int linha) {
		int aux;
		boolean teste = true;
		for (int i = 0; i < tamanho; i++) {
			aux = tabuleiro[coluna + i][linha];
			if (aux == 0) {
				teste = false;
			}
		}
		return teste;
	}

	public void CriarNavios(int tamanho) {
		boolean condicao = true;
		int testeLinha;
		int testeColuna;

		while (condicao) {
			int linha = r.nextInt(10);
			int coluna = r.nextInt(10);
			testeLinha = linha + (tamanho - 1);
			testeColuna = coluna + (tamanho - 1);

			if (testeLinha < 10) {
				if (existe1(tamanho, coluna, linha)) {
					for (int i = 0; i < tamanho; i++) {
						tabuleiro[coluna][linha + i] = 2;
						condicao = false;

					}

				}

			} else if (testeColuna < 10) {
				if (existe2(tamanho, coluna, linha)) {
					for (int i = 0; i < tamanho; i++) {
						tabuleiro[coluna + i][linha] = 2;
						condicao = false;
					}
				}

			}
		}

	}
}
