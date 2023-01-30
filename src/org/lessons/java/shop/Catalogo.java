package org.lessons.java.shop;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prodotto;
		Scanner s = new Scanner(System.in);

		System.out.print("inserisci prodotto (Smartphone, Televisore o Cuffie): ");
		prodotto = s.nextLine();

		s.close();

	}

}
