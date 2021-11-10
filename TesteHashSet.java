package lista1;

import java.util.HashSet;
import java.util.Set;

public class TesteHashSet {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		/* Aqui vai o código cuja execução você que cronometrar */
		Set<String> lista = new HashSet<>();
		for (int i = 0; i < 20000; i++) {
			String a = "String "+ i;
			lista.add(a);
		}
		String keyToSearch = "String 133";
		System.out.println(lista.contains(keyToSearch)); 
		long delay = System.currentTimeMillis() - start;
		System.out.println("Demorou " + delay + " milissegundos");
	}
}
