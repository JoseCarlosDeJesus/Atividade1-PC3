package lista1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex5 {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		lista.add("String 1");
		lista.add("String 1");
		lista.add("String 2");
		lista.add("String 2");
		lista.add("String 3");
		lista.add("String 3");	
		
		//desordenando usando o Collections Ex3
		Collections.shuffle(lista);
		
		System.out.println("Desordenada: " + lista);
		
		Collections.sort(lista);
		System.out.println("Ordenada: " + lista);
	}
}
