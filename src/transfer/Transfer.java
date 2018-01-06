package transfer;

import java.sql.*;
import java.util.ArrayList;

public class Transfer {
    private varTransfer transfer;
    private ArrayList<varTransfer> data;

    private Connection db;
    private Statement state;
    private ResultSet hasil;

    public Transfer(Connection db) throws SQLException{
        this.db = db;
        this.state = this.db.createStatement();
    }

    public void setTransfer(varTransfer transfer) {
        this.transfer = transfer;
    }

    public boolean insert() throws SQLException{
        String query = "INSERT INTO TRANSFER(id_asal, id_tujuan, jumlah, deskripsi, tanggal) " +
                "VALUES(?, ?, ?, ?, ?)";
        PreparedStatement sttmt = this.db.prepareStatement(query);

        sttmt.setInt(1, this.transfer.getIdAsal());
        sttmt.setInt(2, this.transfer.getIdTujuan());
        sttmt.setInt(3, this.transfer.getJumlah());
        sttmt.setString(4, this.transfer.getDeskripsi());
        sttmt.setDate(5, this.transfer.getTanggal());

        sttmt.executeUpdate();

        return true;
    }

    public boolean update() throws SQLException{
        String query = "UPDATE transfer SET " +
                "id_asal = ?, " +
                "id_tujuan = ?, " +
                "jumlah = ?, " +
                "deskripsi = ?, " +
                "tanggal = ?" +
                "WHERE id_transfer = ?";
        PreparedStatement sttmt = this.db.prepareStatement(query);

        sttmt.setInt(1, this.transfer.getIdAsal());
        sttmt.setInt(2, this.transfer.getIdTujuan());
        sttmt.setInt(3, this.transfer.getJumlah());
        sttmt.setString(4, this.transfer.getDeskripsi());
        sttmt.setDate(5, this.transfer.getTanggal());
        sttmt.setInt(6, this.transfer.getIdTransfer());

        sttmt.executeUpdate();

        return true;
    }

    public boolean delete() throws SQLException{
        String query = "DELETE * FROM transfer WHERE id_transfer = ?";
        PreparedStatement sttmt = this.db.prepareStatement(query);
        sttmt.setInt(1, this.transfer.getIdTransfer());

        sttmt.executeUpdate();

        return true;
    }

    public ArrayList<varTransfer> getTransfer() throws SQLException{
        String query = "SELECT * FROM transfer";
        this.hasil = this.state.executeQuery(query);

        while(hasil.next()){
            data.add(new varTransfer(hasil.getInt("id_transfer"), hasil.getInt("id_asal"),
                    hasil.getInt("id_tujuan"), hasil.getInt("jumlah"),
                    hasil.getString("deskripsi"), hasil.getDate("tanggal")));
        }

        return data;
    }
}
