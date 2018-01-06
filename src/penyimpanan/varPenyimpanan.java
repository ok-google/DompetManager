package penyimpanan;

public class varPenyimpanan {
	private int idPenyimpanan;
	private String nama;
	private String catatan;
	private int saldoAwal;
	private int saldoAkhir;
	
	public varPenyimpanan(int idPenyimpanan, String nama, String catatan, int saldoAwal, int saldoAkhir) {
		this.idPenyimpanan = idPenyimpanan;
		this.nama = nama;
		this.catatan = catatan;
		this.saldoAwal = saldoAwal;
		this.saldoAkhir = saldoAkhir;
	}
	
	public int getIdPenyimpanan() {
		return idPenyimpanan;
	}
	
	public void setIdPenyimpanan(int idPenyimpanan) {
		this.idPenyimpanan = idPenyimpanan;
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getCatatan() {
		return catatan;
	}
	
	public void setCatatan(String catatan) {
		this.catatan = catatan;
	}

	public int getSaldoAwal() {
		return saldoAwal;
	}

	public void setSaldoAwal(int saldoAwal) {
		this.saldoAwal = saldoAwal;
	}

	public int getSaldoAkhir() {
		return saldoAkhir;
	}

	public void setSaldoAkhir(int saldoAkhir) {
		this.saldoAkhir = saldoAkhir;
	}
}
