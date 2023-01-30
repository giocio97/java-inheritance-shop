package org.lessons.java.shop;

public class Cuffie extends Prodotto {
	protected String colore;
	protected boolean wirless;

	public Cuffie(String nome, int codice, String marca, float prezzo, String colore, boolean wirless) {
		super(nome, codice, marca, prezzo);
		this.colore = colore;
		this.wirless = wirless;
	}

}
