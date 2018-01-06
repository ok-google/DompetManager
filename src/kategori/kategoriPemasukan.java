package kategori;

import java.sql.Connection;
import java.sql.SQLException;

public class kategoriPemasukan extends Kategori {
	private int idKategori;
	private String namaKategori;
	private String icon;
	private String type;
	
	public kategoriPemasukan(Connection conn) throws SQLException {
		super(conn);
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
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
