package lista1;

import java.util.HashSet;
import java.util.Set;

public class Ex18 {

	public static void main(String[] args) {
		Set<TurmaFaculdade> lista = new HashSet<>();
		TurmaFaculdade a1 = new TurmaFaculdade("Bruno", "19342", "Computa��o", 3);
		TurmaFaculdade a2 = new TurmaFaculdade("Bruno", "19342", "Computa��o", 3);
		TurmaFaculdade a3 = new TurmaFaculdade("Jo�o", "65342", "Computa��o", 3);
		TurmaFaculdade a4 = new TurmaFaculdade("Joana", "21342", "Eng da Computa��o", 3);
		TurmaFaculdade a5 = new TurmaFaculdade("S�vio", "44342", "Eng da Computa��o", 3);
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
