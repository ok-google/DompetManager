package kategori;

public class varKategori {
	private int idKategori;
	private String namaKategori;
	private String icon;
	private String tipe;
	
	public varKategori(int idKategori, String namaKategori, String icon, String type) {
		this.idKategori = idKategori;
		this.namaKategori = namaKategori;
		this.icon = icon;
		this.tipe = type;
	}

	public int getIdKategori() {
		return idKategori;
	}

	public void setIdKategori(int idKategori) {
		this.idKategori = idKategori;
	}

	public String getNamaKategori() {
		return namaKategori;
	}

	public void setNamaKategori(String namaKategori) {
		this.namaKategori = namaKategori;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getType() {
		return tipe;
	}

	public void setType(String type) {
		this.tipe = type;
	}
}
