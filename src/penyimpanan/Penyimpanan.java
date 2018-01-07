package penyimpanan;

import java.sql.*;
import java.util.ArrayList;

public class Penyimpanan {
	private varPenyimpanan penyimpanan;
	private ArrayList<varPenyimpanan> data = new ArrayList<varPenyimpanan>();

	public Connection db;
	public Statement state;
	private ResultSet hasil;
	
	public Penyimpanan(Connection conn) throws SQLException{
		this.db = conn;
		this.state = this.db.createStatement();
	}

    public void setPenyimpanan(varPenyimpanan penyimpanan) {
        this.penyimpanan = penyimpanan;
    }

    public void getAllStorage() throws SQLException{
    	String query = "SELECT * FROM penyimpanan";
    	this.hasil = this.state.executeQuery(query);

        while(hasil.next()){
            data.add(new varPenyimpanan(hasil.getInt("id_penyimpanan"), hasil.getString("nama"),
                    hasil.getString("catatan"), hasil.getInt("saldo_awal"),
                    hasil.getInt("saldo_akhir")));
        }
    }
    
    public ArrayList<varPenyimpanan> getPenyimpanan() throws SQLException{
    	String query = "SELECT * FROM penyimpanan";
    	this.hasil = this.state.executeQuery(query);
    	
    	while(hasil.next()){
    		data.add(new varPenyimpanan(hasil.getInt("id_penyimpanan"), hasil.getString("nama"),
                    hasil.getString("catatan"), hasil.getInt("saldo_awal"),
                    hasil.getInt("saldo_akhir")));
    	}

    	return data;
    }
    
    public boolean insert() throws SQLException{
    	String query = "INSERT INTO penyimpanan(nama, catatan, saldo_awal, saldo_akhir) VALUES(?, ?, ?, ?)";
    	PreparedStatement prep = this.db.prepareStatement(query);
    	//memberikan value
    	prep.setString(1, this.penyimpanan.getNama());
    	prep.setString(2, this.penyimpanan.getCatatan());
    	prep.setInt(3, this.penyimpanan.getSaldoAwal());
    	prep.setInt(4, this.penyimpanan.getSaldoAkhir());
    	
    	prep.executeUpdate();
    	
    	return true;
    }
    
    public boolean update() throws SQLException{
    	String query = "UPDATE penyimpanan SET nama = ?, catatan = ? WHERE id_penyimpanan = ?";
    	PreparedStatement prep = this.db.prepareStatement(query);
    	//memberikan value
    	prep.setString(1, this.penyimpanan.getNama());
    	prep.setString(2, this.penyimpanan.getCatatan());
    	prep.setInt(3, this.penyimpanan.getIdPenyimpanan());
    	
    	prep.executeUpdate();
    	
    	return true;
    }
    
    public boolean delete() throws SQLException{
    	
    	String query = "DELETE * FROM penyimpanan WHERE id_penyimpanan = ?";
    	PreparedStatement prep = this.db.prepareStatement(query);
    	//memberikan value
    	prep.setInt(1, this.penyimpanan.getIdPenyimpanan());
    	
    	prep.executeUpdate();
    	
    	return true;
    }
}
