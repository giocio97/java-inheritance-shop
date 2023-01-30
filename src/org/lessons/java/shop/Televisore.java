package org.lessons.java.shop;

public class Televisore extends Prodotto {

	protected int pollici;
	protected boolean smart;

	public Televisore(String nome, String marca, float prezzo, int pollici, boolean smart) {
		super(nome, marca, prezzo);
		this.pollici = pollici;
		this.smart = smart;
	}

}
