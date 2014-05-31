
public class Insertion {

	public static void main(String[] args) {
		
		int element[] = {22,9,7,6,1,49,35,3,0};
		int chave; int i;
		 
		for(int j = 1; j < element.length; j++){
		  chave = element[j];
		  i = j - 1;
		  while (i >= 0 && element[i] > chave) {
		    element[i+1] = element[i];
		    i = i-1;
		  }
		element[i+1] = chave;
		}
		 
		// imprime todos os elementos da lista reordenada
		for(int j = 0; j < element.length; j++){
		System.out.print(element[j] + ", ");
		}
		
		
	}//fim do main

}//fim da classe
