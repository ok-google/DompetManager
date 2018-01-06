package rencanaBelanja;

public class varRencanaBelanja {
    private int idRencanaBelanja;
    private String namaItem;
    private int harga;

    public varRencanaBelanja(int idRencanaBelanja, String namaItem, int harga) {
        this.idRencanaBelanja = idRencanaBelanja;
        this.namaItem = namaItem;
        this.harga = harga;
    }

    public int getIdRencanaBelanja() {
        return idRencanaBelanja;
    }

    public void setIdRencanaBelanja(int idRencanaBelanja) {
        this.idRencanaBelanja = idRencanaBelanja;
    }

    public String getNamaItem() {
        return namaItem;
    }

    public void setNamaItem(String namaItem) {
        this.namaItem = namaItem;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
