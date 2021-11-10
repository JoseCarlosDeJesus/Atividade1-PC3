package lista1;

import java.util.HashSet;
import java.util.Set;

public class Ex7 {
	public static void main(String[] args) {
		Set<String> lista = new HashSet<>();
		
		lista.add("String 1");
		lista.add("String 1");
		lista.add("String 2");
		lista.add("String 2");
		lista.add("String 3");
		lista.add("String 3");	
		
		for (String str : lista) {
			System.out.println(str);
		}
		System.out.println("Possui " + lista.size() + " elementos");
	}
}
