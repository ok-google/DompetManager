package transaksi;

import java.sql.*;
import java.util.ArrayList;
import java.sql.Date;

public class Transaksi {
	private varTransaksi transaksi;
    private ArrayList<varTransaksi> data = new ArrayList<varTransaksi>();

	private Connection db;
	private Statement state;
	private ResultSet hasil;

	public Transaksi(Connection conn) throws SQLException{
		this.db = conn;
		this.state = this.db.createStatement();
	}

    public void setTransaksi(varTransaksi transaksi) {
        this.transaksi = transaksi;
    }

    public boolean insert() throws SQLException{
		String query = "INSERT INTO transaksi(id_Kategori, id_penyimpanan, tanggal, tipe, catatan, jumlah) " +
                "VALUES(?, ?, ?, ?, ?, ? )";
		PreparedStatement sttmt = this.db.prepareStatement(query);
		sttmt.setInt(1, this.transaksi.getIdKategori());
		sttmt.setInt(2, this.transaksi.getIdPenyimpanan());
		sttmt.setDate(3, this.transaksi.getTanggal());
		sttmt.setString(4, this.transaksi.getTipe());
		sttmt.setString(5, this.transaksi.getCatatan());
		sttmt.setInt(6, this.transaksi.getJumlah());
		
		return true;
	}

	public boolean update() throws SQLException{
		String query = "UPDATE transaksi SET" +
				"id_Kategori = ?, " +
				"id_penyimpanan = ?, " +
				"tanggal = ?, " +
				"tipe = ?, " +
				"catatan = ?, " +
                "jumlah = ? " +
				"WHERE id_transaksi = ?";
		PreparedStatement sttmt = this.db.prepareStatement(query);

        sttmt.setInt(1, this.transaksi.getIdKategori());
        sttmt.setInt(2, this.transaksi.getIdPenyimpanan());
        sttmt.setDate(3, this.transaksi.getTanggal());
        sttmt.setString(4, this.transaksi.getTipe());
        sttmt.setString(5, this.transaksi.getCatatan());
        sttmt.setInt(6, this.transaksi.getJumlah());
		sttmt.setInt(7, this.transaksi.getIdTransaksi());

		return true;
	}

	public boolean delete() throws SQLException{
        String query = "DELETE * FROM transaksi WHERE id_transaksi = ?";
        PreparedStatement sttmt = this.db.prepareStatement(query);
        sttmt.setInt(1, this.transaksi.getIdTransaksi());

        sttmt.executeUpdate();

        return true;
    }

    public ArrayList<varTransaksi> getTransaksi() throws SQLException{
        String query = "SELECT * FROM transaksi";
        this.hasil = this.state.executeQuery(query);

        while(hasil.next()){
            data.add(new varTransaksi(hasil.getInt("id_transaksi"), hasil.getInt("id_Kategori"),
                    hasil.getInt("id_penyimpanan"), hasil.getString("tipe"),
                    hasil.getDate("tanggal"), hasil.getString("catatan"),
                    hasil.getInt("jumlah")));
        }

        return data;
    }
}
