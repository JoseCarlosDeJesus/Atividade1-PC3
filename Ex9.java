package lista1;

import java.util.ArrayList;
import java.util.List;

public class Ex9 {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		
		lista.add(100);
		lista.add(20);
		lista.add(200);
		lista.add(30);
		lista.add(80);
		lista.add(40);	
		lista.add(100);
		lista.add(200);
		Double media = 0.0;
		for (Integer valor : lista) {
			media+=valor;
		}
		media/=lista.size();
		System.out.println("Média = " + media);
	}
}
