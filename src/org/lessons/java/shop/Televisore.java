package org.lessons.java.shop;

public class Televisore extends Prodotto {

	protected int pollici;
	protected boolean smart;

	public Televisore(String nome, int codice, String marca, float prezzo, int pollici, boolean smart) {
		super(nome, codice, marca, prezzo);
		this.pollici = pollici;
		this.smart = smart;

	}

	public int getPollici() {
		return pollici;
	}

	public boolean isSmart() {
		return smart;
	}

}
