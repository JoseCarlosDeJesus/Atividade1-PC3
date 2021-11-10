package lista1;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		List<String> Lista = new ArrayList<>();
		
		for(int i=0; i<200; i++) {
			String a = Integer.toString(i);
			Lista.add(a);
		}
	}

}
