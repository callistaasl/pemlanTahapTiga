public class Karyawan {
    private String nama;
    private double gajiPokok;
    private Perusahaan perusahaan;
    
    public void setNama(String nama) {
        if (nama == null || nama.length() < 4) {
            System.out.println("Nama tidak boleh kosong");
        } else {
            this.nama = nama;
        }
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void setPerusahaan(Perusahaan perusahaan) {
        this.perusahaan = perusahaan;
    }

    public String getPerusahaan() {
        return perusahaan.getNama();
    }

    public String infoGaji() {
        return "Nama: " + nama + "\nGaji Pokok: " + hitungGaji();
    }

    public double hitungGaji() {
        return gajiPokok;
    }

}
