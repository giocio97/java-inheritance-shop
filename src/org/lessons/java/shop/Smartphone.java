package org.lessons.java.shop;

public class Smartphone extends Prodotto {
	private int IMEI;
	protected int memoria;

	public Smartphone(String nome, String marca, float prezzo, int iMEI, int memoria) {
		super(nome, marca, prezzo);
		IMEI = iMEI;
		this.memoria = memoria;
	}

}
