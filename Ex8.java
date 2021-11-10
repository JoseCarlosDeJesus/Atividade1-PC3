package lista1;

import java.util.HashMap;
import java.util.Map;

public class Ex8 {
	public static void main(String[] args) {
		Map<Integer, String> lista = new HashMap<>();
		

		lista.put(1, new String ("String 1"));
		lista.put(2, new String ("String 1"));
		lista.put(3, new String ("String 2"));
		lista.put(4, new String ("String 2"));
		lista.put(5, new String ("String 3"));
		lista.put(6, new String ("String 3"));
		
		for (Integer key : lista.keySet()) {
			String value = lista.get(key);
            System.out.println(key + " = " + value);
		}
		
	}
}
