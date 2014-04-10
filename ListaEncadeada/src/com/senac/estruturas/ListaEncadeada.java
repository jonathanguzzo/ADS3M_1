package com.senac.estruturas;

import com.senac.apps.Contato;

public class ListaEncadeada {
	
	private Nodo head;
	
	public void insert(Nodo nodo){
		
		//busca
		Nodo anterior = searchAnterior(nodo);
		
		//insercao
		if(anterior == null){
			nodo.setNext(head);
			head=nodo;
		}else{
			Nodo proximo = anterior.getNext();
			nodo.setNext(proximo);
			anterior.setNext(nodo);
		}
	}
	
	
	
	public Nodo getHead(){
		return head;
	}
	
	
	
	private Nodo searchAnterior(Nodo nodo){
		Nodo anterior =null;
		Nodo iter = head;
		
		while (iter != null){
			Contato inserindo = nodo.getData();
			Contato comparador= iter.getData();
			
			int comp = comparador.compareTo(inserindo);
			
			if(iter > nodo){
				return anterior;	
			}
			
			if(iter == nodo){
				
			}		
			anterior = iter;
			iter = iter.getNext();
		}
		return anterior;
	}//fim searchAnterior
	
	
	
	

}//fim
