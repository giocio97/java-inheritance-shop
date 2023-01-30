package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	protected int codice;
	protected String nome;
	protected String marca;
	protected float prezzo;
	protected float iva;

	public int getCodice() {
		return codice;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public Prodotto(String nome, String marca, float prezzo) {
		super();
		Random r = new Random();
		codice = r.nextInt(999999);
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = 22;

	}

	float prezzoConIva() {
		float prezzoConIva = ((prezzo * iva) / 100) + prezzo;
		return prezzoConIva;
	}

}