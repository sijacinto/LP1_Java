package loja;

import java.util.Scanner;

public class TestePessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		String cpf;
		char sexo;
		Scanner sc =new Scanner (System.in);
		Pessoa p1= new Pessoa();
		
		
		System.out.println("Digite nome: ");
		nome=sc.next();
		System.out.println("Digite cpf: ");
		cpf=sc.next();
		Pessoa p2= new Pessoa(cpf, nome);
		Pessoa p3=new Pessoa("João", 'M');
		p1.setNome("Manuel");
		

	}

}
