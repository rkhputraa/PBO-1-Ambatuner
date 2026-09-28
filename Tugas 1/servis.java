public class servis {
    private String jenisServis;
    private String tanggalServis;
    private motor motor;
    private mechanic mechanic;
    private String status;
    private double biayaServis;

    public servis(String jenisServis, String tanggalServis, motor motor, mechanic mechanic) {
        this.jenisServis = jenisServis;
        this.tanggalServis = tanggalServis;
        this.motor = motor;
        this.mechanic = mechanic;
    }

    public String getJenisServis() {
        return jenisServis;
    }

    public void setJenisServis(String jenisServis) {
        this.jenisServis = jenisServis;
    }

    public String getTanggalServis() {
        return tanggalServis;
    }

    public void setTanggalServis(String tanggalServis) {
        this.tanggalServis = tanggalServis;
    }

    public motor getMotor() {
        return motor;
    }

    public void setMotor(motor motor) {
        this.motor = motor;
    }

    public mechanic getMechanic() {
        return mechanic;
    }

    public void setMechanic(mechanic mechanic) {
        this.mechanic = mechanic;
    }
    public void done()  {
        status = "Selesai";
    }

     public void displayInfo() {
        System.out.println("Jenis Servis: " + jenisServis);
        System.out.println("biaya Servis: " + biayaServis);
            String.format("%.2f", biayaServis);
        System.out.println("Tanggal Servis: " + tanggalServis);
        System.out.println("Status: " + status);
        System.out.println(
               "motor     : "
               + motor.getMerk() + " " + 
             motor.getTipe());
            
        motor.displayInfo();
        System.out.println("Informasi Mechanic:");
        
        mechanic.displayInfo();   
    }
}
