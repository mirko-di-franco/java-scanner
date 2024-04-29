package scanner;

import java.util.Scanner;

public class InputUtente {

	public static void main(String[] args) {
		
		//inizializzo lo scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci il tuo nome: ");
		String nomeUtente = scanner.nextLine();
		
		System.out.print("Inserisci il tuo cognome: ");
		String cognomeUtente = scanner.nextLine().replace(" ", "");
		
		System.out.print("Inserisci il tuo colore preferito: ");
		String coloreUtente = scanner.nextLine();
		
		System.out.print("Inserisci il tuo numero preferito: ");
		int numeroUtente = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Inserisci il tuo animale preferito: ");
		String animaleUtente = scanner.nextLine();
		
		
		String passwordUtente = nomeUtente + cognomeUtente + coloreUtente + numeroUtente + animaleUtente;
		System.out.println("La tua password è: "+passwordUtente);
		
		scanner.close();

	}

}
