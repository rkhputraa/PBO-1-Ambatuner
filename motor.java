public class motor {
        private String nomorplat;
        private String merk;
        private String tipe;
        private int tahun;
        private pelanggan pemilik;

        public motor (String nomorplat, String merk, String tipe, int tahun, pelanggan pemilik) {
            this.nomorplat = nomorplat;
            this.merk = merk;
            this.tipe = tipe;
            this.tahun = tahun;
            this.pemilik = pemilik;
        }  
        public String getNomorplat() {
            return nomorplat;
        }
        public void setNomorplat(String nomorplat) {
            this.nomorplat = nomorplat;
        }
        public String getMerk() {
            return merk;
        }
        public void setMerk(String merk) {
            this.merk = merk;
        }
        public String getTipe() {
            return tipe;
        }
        public void setTipe(String tipe) {
            this.tipe = tipe;
        }
        public int getTahun() {
            return tahun;
        }
        public void setTahun(int tahun) {
            this.tahun = tahun;
        }  
        public pelanggan getPemilik() {
            return pemilik;
        }
        public void setPemilik(pelanggan pemilik) {
            this.pemilik = pemilik;
        }   
        
        public void displayInfo() {
            System.out.println("Nomor Plat: " + nomorplat);
            System.out.println("Merk: " + merk);
            System.out.println("Tipe: " + tipe);
            System.out.println("Tahun: " + tahun);
            System.out.println("Pemilik: " + pemilik.getNama());
            System.out.println("No Telp Pemilik: " + pemilik.getNoTelp());
            System.out.println("Alamat Pemilik: " + pemilik.getAlamat());
        }
}       

