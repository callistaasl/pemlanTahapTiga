public class Main {
    public static void main(String[] args) {
        Perusahaan perusahaan = new Perusahaan();

        Karyawan karyawan1 = new Karyawan();
        karyawan1.setNama("Novita Karina");
        karyawan1.setGajiPokok(4500000);
        karyawan1.setPerusahaan(perusahaan);

        Karyawan karyawan2 = new Karyawan();
        karyawan2.setNama("Januar Putra");
        karyawan2.setGajiPokok(6700000);
        karyawan2.setPerusahaan(perusahaan);

        Programmer programmer = new Programmer();
        programmer.setNama("Restu Insan");
        programmer.setGajiPokok(100000000);
        programmer.setBonus(8000000);
        programmer.setPerusahaan(perusahaan);

        Manajer manajer = new Manajer();
        manajer.setNama("Alya Kasih");
        manajer.setGajiPokok(15000000);
        manajer.setDivisi("Keuangan");
        manajer.setInsentif(6500000);
        manajer.setPerusahaan(perusahaan);

        System.out.println("Informasi Karyawan");
        System.out.println("1. " + karyawan1.infoGaji());
        System.out.println("Nama Perusahaan: " + karyawan1.getPerusahaan());
        System.out.println("2. " + karyawan2.infoGaji());
        System.out.println("Nama Perusahaan: " + karyawan2.getPerusahaan());
        System.out.println("3. " + programmer.infoGaji());
        System.out.println("Nama Perusahaan: " + programmer.getPerusahaan());
        System.out.println("4. " + manajer.infoGaji());
        System.out.println("Nama Perusahaan: " + manajer.getPerusahaan());
        
    }
}
