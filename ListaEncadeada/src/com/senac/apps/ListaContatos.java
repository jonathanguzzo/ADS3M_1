package com.senac.apps;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.senac.estruturas.ListaEncadeada;
import com.senac.estruturas.Nodo;

public class ListaContatos {

	public static void main(String[] args){
		
		ListaEncadeada lista = new ListaEncadeada();
		
		//lista.insert( new Nodo ( new Contato ("Rafael", "555-1234") ) );
		

		//abre arquivo
		try{
			Scanner arquivo = new Scanner(new FileReader("telefones.txt"));
		} catch (FileNotFoundException e){
			e.printStackTrace();
			System.exit(0);
		}
		
		
		Scanner arquivo = null;
		while(arquivo.hasNext()){
			String nome= arquivo.nextLine();
			String telefone= arquivo.nextLine();
			lista.insert(new Nodo(new Contato(nome,telefone)));
		}
		
		
		//fecha arquivo
		arquivo.close();
		
		Nodo iter= lista.getHead();
		while(iter != null){
			System.out.println(iter.getData().getNome());
			iter = iter.getNome();
		}
		
		
		//grava arquivo
		FileWriter salvar;
		
		try{
			salvar = new FileWriter("telefone.txt");
			iter= lista.getHead();
			while(iter != null){
				Contato contato= iter.getData();
				salvar.write(contato.getNome() +"\n");
				salvar.write(contato.getTelefone() +"\n");
				iter = iter.getNext();
			}
			salvar.close();
		} catch(IOException e){
			e.printStackTrace();
			
		}
		
		
		
	}//fim do main
	
	
}//fim
