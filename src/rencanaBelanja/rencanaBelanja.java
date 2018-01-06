package rencanaBelanja;

import java.sql.*;
import java.util.ArrayList;

public class rencanaBelanja {
    private varRencanaBelanja rencanaBelanja;
    private ArrayList<varRencanaBelanja> data = new ArrayList<varRencanaBelanja>();

    private Connection db;
    private Statement state;
    private ResultSet hasil;

    public rencanaBelanja(Connection conn) throws SQLException{
        this.db = conn;
        this.state = this.db.createStatement();
    }

    public void setRencanaBelanja(varRencanaBelanja attr) {
        this.rencanaBelanja = attr;
    }

    public boolean insert() throws SQLException{
        String query = "INSERT INTO rencana_belanja(nama_item, harga) VALUES(?, ?)";
        PreparedStatement sttmt = this.db.prepareStatement(query);

        sttmt.setString(1, this.rencanaBelanja.getNamaItem());
        sttmt.setInt(2, this.rencanaBelanja.getHarga());

        sttmt.executeUpdate();

        return true;
    }

    public boolean update() throws SQLException{
        String query = "UPDATE rencana_belanja SET " +
                "nama_item = ?, " +
                "harga = ? " +
                "WHERE id_rencana = ?";
        PreparedStatement sttmt = this.db.prepareStatement(query);

        sttmt.setString(1, this.rencanaBelanja.getNamaItem());
        sttmt.setInt(2, this.rencanaBelanja.getHarga());
        sttmt.setInt(3, this.rencanaBelanja.getIdRencanaBelanja());

        sttmt.executeUpdate();

        return true;
    }

    public boolean delete() throws SQLException{
        String query = "DELETE * FROM rencana_belanja WHERE id_rencana = ?";
        PreparedStatement sttmt = this.db.prepareStatement(query);

        sttmt.setInt(1, this.rencanaBelanja.getIdRencanaBelanja());

        sttmt.executeUpdate();

        return true;
    }

    public ArrayList<varRencanaBelanja> getRencanaBelanja() throws SQLException{
        String query = "SELECT * FROM rencana_belanja";
        this.hasil = this.state.executeQuery(query);

        while(hasil.next()){
            data.add(new varRencanaBelanja(hasil.getInt("id_rencana"), hasil.getString("nama_item"),
                    hasil.getInt("harga")));
        }

        return data;
    }

}
