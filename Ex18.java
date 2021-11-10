package lista1;

import java.util.HashSet;
import java.util.Set;

public class Ex18 {

	public static void main(String[] args) {
		Set<TurmaFaculdade> lista = new HashSet<>();
		TurmaFaculdade a1 = new TurmaFaculdade("Bruno", "19342", "Computação", 3);
		TurmaFaculdade a2 = new TurmaFaculdade("Bruno", "19342", "Computação", 3);
		TurmaFaculdade a3 = new TurmaFaculdade("João", "65342", "Computação", 3);
		TurmaFaculdade a4 = new TurmaFaculdade("Joana", "21342", "Eng da Computação", 3);
		TurmaFaculdade a5 = new TurmaFaculdade("Sávio", "44342", "Eng da Computação", 3);
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		lista.add(a5);
		
		for (TurmaFaculdade c1 : lista) {
			System.out.println(c1);
		}

	}

}
