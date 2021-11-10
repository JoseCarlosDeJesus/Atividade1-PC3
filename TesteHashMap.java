package lista1;

import java.util.HashMap;
import java.util.Map;

public class TesteHashMap {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		/* Aqui vai o c�digo cuja execu��o voc� que cronometrar */
		Map<Integer, String> lista = new HashMap<>();
		for (int i = 0; i < 20000; i++) {
			String a = "String "+ i;
			lista.put(i, a);
		}
		Integer keyToSearch = 133;
		if ( lista.containsKey( keyToSearch ) ) {
            System.out.println("Valor da Chave "+keyToSearch+
             " = "+lista.get(keyToSearch));
        }
		else{
                  System.err.println("Chave n�o existe");
        }
		long delay = System.currentTimeMillis() - start;
		System.out.println("Demorou " + delay + " milissegundos");
	}
}
