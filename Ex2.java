package lista1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex2 {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		lista.add("String 1");
		lista.add("String 1");
		lista.add("String 2");
		lista.add("String 2");
		lista.add("String 3");
		lista.add("String 3");	
		
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("Desordenando: ");
		//desordenando usando o Collections Ex3
		Collections.shuffle(lista);
		
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		//pesquisando "String 2" Ex4
		String b = "String 2";
		int index = Collections.binarySearch(lista, b);
		System.out.println("Posicao de String 2: "+index+" elemento da lista");
		
		//ordenando
		System.out.println("Lista ordenada: ");
		Collections.sort(lista);
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		}

	
	}

	

