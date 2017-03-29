package view;

import java.util.Scanner;

public class InserirSocios {
	
	private Scanner scanner;

	public InserirSocios() {
		
	}
	
	public Socio InserirSocios(){
		
		scanner = new Scanner(System.in);
		
		System.out.println("Introduza o nome do socio: ");
		String nome = Scanner.nextLine();
		
		System.out.println("Introduza a localidade: ");
		String localidade = Scanner.nextLine();
		
		System.out.println("Introduza o contacto: ");
		String contacto = Scanner.nextLine();
		
		Socio s = new Socio (nome, localidade, contacto);
		s.setnome(nome);
		s.setlocalidade(localidade);
		s.setcontacto(contacto);
		
		return s;
		
	}

}
