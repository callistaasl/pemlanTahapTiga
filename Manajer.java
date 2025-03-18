public class Manajer extends Karyawan {
    private double insentif;
    private String divisi;

    public void setInsentif(double insentif) {
        this.insentif = insentif;
    }

    public double getInsentif() {
        return insentif;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    public String getDivisi() {
        return divisi;
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + insentif;
    }

    @Override
    public String infoGaji() {
        return super.infoGaji() + "'\nTunjangan: " + insentif + "\nDivisi: " + divisi;
    }
}
