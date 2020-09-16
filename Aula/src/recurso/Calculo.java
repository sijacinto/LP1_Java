package recurso;

	
	import java.util.Scanner;

	public class Calculo {


		public static void main(String[] args) {
			int n1, n2, n3;
			double m;
			try{
			Scanner input = new Scanner ( System.in );
			System.out.println ("Digite sua primeira nota");
			n1 = input.nextInt();
			System.out.println ("Digite sua segunda nota");
			n2 = input.nextInt ();
			System.out.println ("Digite sua terceira nota");
			n3 = input.nextInt ();
			m = ((n1 + n2 + n3)/3);
			System.out.println ("A média é:" + m);
			if (m >= 6) {
				System.out.println ("Aprovado");
			}
			else {
				System.out.println ("Reprovado");
			}
			}catch (Exception e)
			{
				System.out.println("entrada inválida4.5");
			}

		}
	

}
