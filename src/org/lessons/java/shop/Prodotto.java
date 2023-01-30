package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	private int codice;
	protected String nome;
	protected String marca;
	protected float prezzo;
	protected float iva;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public int getCodice() {
		return codice;
	}

	public Prodotto(String nome, int codice, String marca, float prezzo) {
		super();
		Random r = new Random();
		this.codice = r.nextInt(999999);
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = 22;

	}

	public void prezzoConIva() {
		float prezzoConIva = ((prezzo * iva) / 100F) + prezzo;
		return;
	}

}
