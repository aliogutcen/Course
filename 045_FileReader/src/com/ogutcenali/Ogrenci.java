package com.ogutcenali;

public class Ogrenci {

	private String adSoyad;
	private int notOrtalamasi;

	public Ogrenci(String adSoyad, int notOrtalamasi) {
		super();
		this.adSoyad = adSoyad;
		this.notOrtalamasi = notOrtalamasi;
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public int getnotOrtalamasi() {
		return notOrtalamasi;
	}

	public void setnotOrtalamasi(int notOrtalamasi) {
		this.notOrtalamasi = notOrtalamasi;
	}

	@Override
	public String toString() {
		return "Ogrenci [adSoyad=" + adSoyad + ", Not Ortalaması=" + notOrtalamasi + "]";
	}

}
