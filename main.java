public class main {
    public static void main(String[] args) {
        bengkel bengkel = new bengkel("Ambatuner", "Jl. Raya No. 123", "081234567890");

        pelanggan pelanggan1 = new pelanggan("Rakha Putra", "081234567890", "Jl. Pelanggan No. 1");
        pelanggan pelanggan2 = new pelanggan("Abigail", "081987654321", "Jl. Pelanggan No. 2");

        bengkel.tambahPelanggan(pelanggan1);
        bengkel.tambahPelanggan(pelanggan2);

        motor motor1 = new motor("B 6171 EFO", "Suzuki", "Shogun SP", 2006, pelanggan1);
        motor motor2 = new motor("B 6605 EHW", "Suzuki", "Smash SR", 2007, pelanggan2);

        bengkel.tambahmotor(motor1);
        bengkel.tambahmotor(motor2);

        mechanic mechanic1 = new mechanic("Budi", "Mesin", 5);
        mechanic mechanic2 = new mechanic("Andi", "Elektrik", 3);

        bengkel.tambahmechanic(mechanic1);
        bengkel.tambahmechanic(mechanic2);

        servis servis1 = new servis("Servis Rutin", "2023-07-01", motor1, mechanic1);
        servis servis2 = new servis("Ganti Oli", "2023-07-02", motor2, mechanic2);

        bengkel.tambahservis(servis1);
        bengkel.tambahservis(servis2);

        System.out.println("Informasi Bengkel:");
        bengkel.tampilkanInfo();
    }
}
