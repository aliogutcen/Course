package example2;

public class Ogrenciler {

	private String adSoyad;
	private int ortalamaPuan;

	public Ogrenciler(String adSoyad, int ortalamaPuan) {
		super();
		this.adSoyad = adSoyad;
		this.ortalamaPuan = ortalamaPuan;
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public int getOrtalamaPuan() {
		return ortalamaPuan;
	}

	public void setOrtalamaPuan(int ortalamaPuan) {
		this.ortalamaPuan = ortalamaPuan;
	}

	@Override
	public String toString() {
		return "Ogrenciler [adSoyad=" + adSoyad + ", ortalamaPuan=" + ortalamaPuan + "]";
	}

}
