package recurso;

import java.util.HashSet;

public class ExemploConjunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet conjunto =new HashSet();
		conjunto.add("azul");
		conjunto.add(1.3);
		conjunto.add(5);
		conjunto.add("amarelo");
		conjunto.add("azul");
		System.out.println(conjunto.toString());
		conjunto.remove("azul");
		System.out.println(conjunto.toString());
		conjunto.remove(1.3);
		conjunto.add("vermelho");
		conjunto.add("dourado");
		System.out.println(conjunto.toString());
		
		
	}

}
