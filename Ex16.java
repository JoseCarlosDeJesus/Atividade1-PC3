package lista1;

import java.util.HashSet;
import java.util.Set;

public class Ex16 {
	public static void main(String[] args) {
		Set <ContaCorrente> lista = new HashSet<>();
		ContaCorrente c1 = new ContaCorrente("12", "33", "Joao", "23178267271", 602.33);
		ContaCorrente c2 = new ContaCorrente("123", "133", "Joana", "123423167271", 902.33);
		ContaCorrente c3 = new ContaCorrente("923", "933", "Joelma", "923423167271", 222.33);
		ContaCorrente c4 = new ContaCorrente("2123", "2133", "Joabe", "223423167271", 1902.33);
		ContaCorrente c5 = new ContaCorrente("323", "332", "Joel", "523423167271", 502.33);
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		lista.add(c5);
		for (ContaCorrente conta : lista) {
			System.out.println(conta);
		}
	}
}
