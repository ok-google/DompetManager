package kategori;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Kategori {
	private varKategori kategori;
	private ArrayList<varKategori> data = new ArrayList<varKategori>();
	
	public Connection db;
	public Statement state;
	private ResultSet hasil;
	
	public Kategori(Connection conn) throws SQLException{
		this.db = conn;
		this.state = this.db.createStatement();
	}

    public Kategori(varKategori kategori) {
        this.kategori = kategori;
    }

    public void setKategori(varKategori kategori) {
        this.kategori = kategori;
    }

    public boolean insert() throws SQLException{
    	String query = "INSERT INTO kategori(nama, icon, tipe) VALUES(?, ?, ?)";
    	PreparedStatement prep = this.db.prepareStatement(query);
    	prep.setString(1, this.kategori.getNamaKategori());
    	prep.setString(2, this.kategori.getIcon());
    	prep.setString(3, this.kategori.getType());
    	
    	prep.executeUpdate();
    	
    	return true;
    }
    
    public ArrayList<varKategori> getKategori() throws SQLException{
    	String query = "SELECT * FROM kategori";
    	this.hasil = this.state.executeQuery(query);
    	
    	while(hasil.next()){
    		data.add(new varKategori(hasil.getInt("id_kategori"), hasil.getString("nama"), hasil.getString("icon"), hasil.getString("tipe")));
    	}
    	
    	return data;
    }
    
    public boolean update() throws SQLException{
    	String query = "UPDATE kategori SET nama = ?, icon = ?, tipe = ? WHERE id_kategori = ?";
    	PreparedStatement prep = this.db.prepareStatement(query);
    	prep.setString(1, this.kategori.getNamaKategori());
    	prep.setString(2, this.kategori.getIcon());
    	prep.setString(3, this.kategori.getType());
    	prep.setInt(4, this.kategori.getIdKategori());
    	
    	prep.executeUpdate();
    	
    	return true;
    }
    
    public boolean delete() throws SQLException{
    	String query = "DELETE * FROM kategori WHERE id_kategori = ?";
    	PreparedStatement prep = this.db.prepareStatement(query);
    	//memberikan value
    	prep.setInt(1, this.kategori.getIdKategori());
    	
    	prep.executeUpdate();
    	
    	return true;
    }
}
