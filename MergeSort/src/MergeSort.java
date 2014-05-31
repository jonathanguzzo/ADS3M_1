
import java.util.*;

public class MergeSort {

	public int a[]=new int[50];
	
	public void merge_sort(int menor,int maior){
	  int meio;
	  if(menor < maior){
		  meio=(menor + maior)/2;
		  merge_sort(menor, meio);
		  merge_sort(meio + 1, maior);
		  merge(menor, meio, maior);
	  }
	}
	
	
	public void merge(int menor,int meio,int maior){
		int h,i,j,k;
		int b[]=new int[50];
		h=menor;
		i=menor;
		j=meio+1;

		while( (h<=meio) && (j<=maior) ){
			if(a[h] <= a[j]){
				b[i]=a[h];
				h++;
			}
		else{
			b[i]=a[j];
			j++;
		}
			i++;
		}
		if(h>meio){
			for(k=j; k<=maior; k++){
				b[i]=a[k];
				i++;
			}
		}
		else{
			for(k=h; k<=meio; k++){
				b[i]=a[k];
				i++;
			}
		}
		for(k=menor; k<=maior; k++){
			a[k]=b[k];
		}
	}
	
	
	public MergeSort(){
		int num,i;

		System.out.println(" MERGE SORT ");
		System.out.println();
		
		System.out.println("Quantidade de Elementos da lista:");
		num=new Scanner(System.in).nextInt();
		
		System.out.println("Digite os  valores:");
		
		for(i=1; i<=num; i++){
			a[i]=new Scanner(System.in).nextInt() ;
		}
		
		merge_sort(1,num);
		
		System.out.println("Usando MergeSort a lista fica :");
		
		System.out.println();

		for(i=1;i<=num;i++)
			System.out.print(a[i]+"    ");
		
	}
	
	public static void main(String[] args) {
		
		new MergeSort();
		
	}

}//fim da classe
