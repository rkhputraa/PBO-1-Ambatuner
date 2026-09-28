public class pelanggan {
    private String nama;
    private String noTelp;
    private String alamat;

    public pelanggan(String nama, String noTelp, String alamat) {
        this.nama = nama;
        this.noTelp = noTelp;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("No Telp: " + noTelp);
        System.out.println("Alamat: " + alamat);
    }
}