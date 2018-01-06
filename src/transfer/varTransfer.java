package transfer;

import java.sql.Date;

public class varTransfer {
    private int idTransfer;
    private int idAsal;
    private int idTujuan;
    private int jumlah;
    private String deskripsi;
    private Date tanggal;

    public varTransfer(int idTransfer, int idAsal, int idTujuan, int jumlah, String deskripsi, Date tanggal) {
        this.idTransfer = idTransfer;
        this.idAsal = idAsal;
        this.idTujuan = idTujuan;
        this.jumlah = jumlah;
        this.deskripsi = deskripsi;
        this.tanggal = tanggal;
    }

    public int getIdTransfer() {
        return idTransfer;
    }

    public void setIdTransfer(int idTransfer) {
        this.idTransfer = idTransfer;
    }

    public int getIdAsal() {
        return idAsal;
    }

    public void setIdAsal(int idAsal) {
        this.idAsal = idAsal;
    }

    public int getIdTujuan() {
        return idTujuan;
    }

    public void setIdTujuan(int idTujuan) {
        this.idTujuan = idTujuan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
}
