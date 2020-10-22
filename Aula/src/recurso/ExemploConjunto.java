package recurso;

import java.util.HashSet;

public class ExemploConjunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet conjunto =new HashSet();
		conjunto.add("azul");
		conjunto.add("amarelo");
		conjunto.add("azul");
		for(int i=0; i< conjunto.size(); i++)
		{
			System.out.println(conjunto.toString());
		}
		
	}

}
