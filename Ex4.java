package lista1;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		lista.add("String 1");
		lista.add("String 1");
		lista.add("String 2");
		lista.add("String 2");
		lista.add("String 3");
		lista.add("String 3");
		
		for(int i=0; i<lista.size(); i++) {
			if(lista.get(i).equals("String 2")) {
				System.out.println("Posição de String 2: " + i);
			}
		}
		

	}
	
}
