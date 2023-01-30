package org.lessons.java.shop;

public class Cuffie extends Prodotto {
	protected String colore;
	protected boolean wirless;

	public Cuffie(String nome, String marca, float prezzo, String colore, boolean wirless) {
		super(nome, marca, prezzo);
		this.colore = colore;
		this.wirless = wirless;
	}

}
