public class PesquisaBinaria {
	

	public static int pesquisa(int[] dados, int qtde, int chave) {
		if (qtde == 0)
			return -1;
		
		int limInf = 0; //limite inferior
		int limSup = qtde - 1; //limite superior
		int ia;
		int indice = -1;

		while (limInf <= limSup) {
			ia = (limInf + limSup) / 2;
			if (dados[ia] == chave) {
				indice = ia;
				break;
			} else if (dados[ia] < chave)
				limInf = ia + 1;
			else
				limSup = ia - 1;
		}
		return indice;

	}

	public static <C extends Comparable<C>> int pesquisar(C[] dados, int qtde, C chave) {
		if (qtde == 0)
			return -1;

		int limInf = 0; //limite inferior
		int limSup = qtde - 1; //limite superior
		int ia;
		int indice = -1;

		while (limInf <= limSup) {
			ia = (limInf + limSup) / 2;
			if (dados[ia].compareTo(chave) == 0) {
				indice = ia;
				break;
			} else if (dados[ia].compareTo(chave) < 0)
				limInf = ia + 1;
			else
				limSup = ia - 1;
		}
		return indice;
	}

}
