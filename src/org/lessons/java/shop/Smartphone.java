package org.lessons.java.shop;

import java.util.Random;

public class Smartphone extends Prodotto {
	private int iMEI;
	protected int memoria;

	public Smartphone(String nome, int codice, String marca, float prezzo, int iMEI, int memoria) {
		super(nome, codice, marca, prezzo);
		Random r = new Random();
		iMEI = r.nextInt(99999);
		this.memoria = memoria;
	}

	public int getiMEI() {
		return iMEI;
	}

	public int getMemoria() {
		return memoria;
	}

}
