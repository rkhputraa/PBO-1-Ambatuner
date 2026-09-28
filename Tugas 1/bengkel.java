import java.util.ArrayList;
public class bengkel {
    private String nama;
    private String alamat;
    private String noTelp;

    public bengkel(
        String nama, 
        String alamat, 
        String noTelp) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

   private ArrayList<pelanggan> daftarPelanggan = new ArrayList<>();
   private ArrayList<motor> daftarmotor = new ArrayList<>();
   private ArrayList<mechanic> daftarmechanic = new ArrayList<>();
   private ArrayList<servis> daftarservis = new ArrayList<>();

   public bengkel(String nama, String alamat, String noTelp, ArrayList<pelanggan> daftarPelanggan, ArrayList<motor> daftarmotor, ArrayList<mechanic> daftarmechanic, ArrayList<servis> daftarservis) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.daftarPelanggan = daftarPelanggan;
        this.daftarmotor = daftarmotor;
        this.daftarmechanic = daftarmechanic;
        this.daftarservis = daftarservis;
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
    public void tambahPelanggan(pelanggan pelanggan) {
        daftarPelanggan.add(pelanggan);
    }
    public void tambahmotor(motor motor) {
        daftarmotor.add(motor);
    }
    public void tambahmechanic(mechanic mechanic) {
        daftarmechanic.add(mechanic);
    }
    public void tambahservis(servis servis) {
        daftarservis.add(servis);
    }
    public void tampilkanpelanggan() {
        for (pelanggan Pelanggan : daftarPelanggan) {
            System.out.println();
           Pelanggan.displayInfo();
        } 
        }
    public void tampilkanmotor() {
        for (motor motor : daftarmotor) {
            System.out.println();
            motor.displayInfo();
        }
    }
    public void tampilkanmechanic() {
        for (mechanic mechanic : daftarmechanic) {
            System.out.println();
            mechanic.displayInfo();
        }
    }
    public void tampilkanservis() {
        for (servis servis : daftarservis) {
            System.out.println();
            servis.displayInfo();
        }
    }
     public void tampilkanInfo() {

        System.out.println("====================================");
        System.out.println("          DATA BENGKEL MOTOR");
        System.out.println("====================================");

        System.out.println("Nama Bengkel : " + nama);
        System.out.println("Alamat       : " + alamat);
        System.out.println("No Telepon   : " + noTelp);

        System.out.println();
        System.out.println("========== DATA PELANGGAN ==========");

        tampilkanpelanggan();

        System.out.println();
        System.out.println("============ DATA MOTOR ============");

        tampilkanmotor();

        System.out.println();
        System.out.println("=========== DATA MEKANIK ===========");

        tampilkanmechanic();

        System.out.println();
        System.out.println("============ DATA SERVIS ===========");

        tampilkanservis();
    }
}
