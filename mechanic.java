public class mechanic {
    
    private String nama;
    private String spesialis;
    private int pengalaman;

    public mechanic(String nama, String spesialis, int pengalaman) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.pengalaman = pengalaman;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public int getPengalaman() {
        return pengalaman;
    }

    public void setPengalaman(int pengalaman) {
        this.pengalaman = pengalaman;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Spesialis: " + spesialis);
        System.out.println("Pengalaman: " + pengalaman + " tahun");
    }
}
