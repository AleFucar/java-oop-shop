package org.lesson.java.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Prodotto prodottoNuovo = new Prodotto();
		
		
		System.out.println("Inserisci il nome del prodotto:");
		String nomeProdotto = scan.nextLine();
		
		System.out.println("Inserisci la descrizione del prodotto:");
		String descrizioneProdotto = scan.nextLine();

		

		System.out.println("Nome prodotto: " + prodottoNuovo.setNome(nomeProdotto) + "-" + prodottoNuovo.getCodice());
		
		System.out.println("Descrizione: " + prodottoNuovo.setDescrizione(descrizioneProdotto) );
		
		System.out.println("Codice prodotto: " + prodottoNuovo.getCodice());
		
		System.out.println("Prezzo base: " + prodottoNuovo.prezzoBase());
		
		System.out.println("Prezzo ivato: " + prodottoNuovo.prezzoIvato());
		
		
		

	}

}
