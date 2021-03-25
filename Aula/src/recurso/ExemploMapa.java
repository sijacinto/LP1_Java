package recurso;

import java.util.HashMap;

public class ExemploMapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap mp=new HashMap();
		mp.put("Hello","Alô");
		mp.put("Hi", "Oi");
		mp.put("Big", "Grande");
		System.out.println(mp.get("Big"));
		System.out.println(mp.get("Hello"));
		

	}

}
