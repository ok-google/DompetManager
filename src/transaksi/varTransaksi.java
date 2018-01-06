package transaksi;

import java.sql.Date;

public class varTransaksi {
	private int idTransaksi;
	private int idKategori;
	private int idPenyimpanan;
	private String tipe;
	private Date tanggal;
	private String catatan;
	private int jumlah;

    public varTransaksi(int idTransaksi, int idKategori, int idPenyimpanan, String tipe, Date tanggal,
                        String catatan, int jumlah) {
		this.idTransaksi = idTransaksi;
		this.idKategori = idKategori;
		this.idPenyimpanan = idPenyimpanan;
		this.tipe = tipe;
		this.tanggal = tanggal;
		this.catatan = catatan;
		this.jumlah = jumlah;
	}
	public int getIdTransaksi() {
		return idTransaksi;
	}
	public void setIdTransaksi(int idTransaksi) {
		this.idTransaksi = idTransaksi;
	}
	public int getIdKategori() {
		return idKategori;
	}
	public void setIdKategori(int idKategori) {
		this.idKategori = idKategori;
	}
	public int getIdPenyimpanan() {
		return idPenyimpanan;
	}
	public void setIdPenyimpanan(int idPenyimpanan) {
		this.idPenyimpanan = idPenyimpanan;
	}
	public String getTipe() {
		return tipe;
	}
	public void setTipe(String tipe) {
		this.tipe = tipe;
	}
	public Date getTanggal() {
		return tanggal;
	}
	public void setTanggal(Date tanggal) {
		this.tanggal = tanggal;
	}
	public String getCatatan() {
		return catatan;
	}
	public void setCatatan(String catatan) {
		this.catatan = catatan;
	}
    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}
