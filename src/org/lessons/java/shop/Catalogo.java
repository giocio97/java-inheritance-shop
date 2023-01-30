package org.lessons.java.shop;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sceltaUser;

		int n = 3;
		Prodotto[] catalogoProdotti = new Prodotto[n];

		for (int i = 1; i < n; i++) {
			catalogoProdotti[i].toString();
		}

		Scanner s = new Scanner(System.in);

		System.out.print("inserisci prodotto (Smartphone, Televisore o Cuffie): ");
		prodotto = s.nextLine();

		if (prodotto.equals("Smartphone"))

			System.out.print("inserisci il nome dello smartphone: ");
		nome = s.nextLine();

		s.close();

	}

}
