import java.util.Scanner;


public class Principal {
	public Scanner sc = new Scanner(System.in);
	public int Coluna;
	public int Linha;

	public void map() {
		Mapa mapa;
		mapa = new Mapa();
		mapa.inicializaTabuleiro();
		mapa.criarFrota();
		mapa.mostraTabuleiro();
	}

	public static void main(String[] args) throws Exception {
		(new Principal()).run(args);
	}

	public void run(String[] args) throws Exception {
		Jogador jogador = new Jogador("jogador1");
		Atacar tiro = new Atacar();
		map();
		do {
			System.out.println("Em qual coluna quer atirar?");
			Coluna = sc.nextInt();

			System.out.println("Em qual linha quer atirar?");
			Linha = sc.nextInt();

			Mapa.AtacarTir(Linha, Coluna);
			Mapa.mostraTabuleiro();

		} while (jogador.getPontuacaoInicial() != 0);
	}
}