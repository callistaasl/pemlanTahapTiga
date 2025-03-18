public class Util {
    public static String formatRupiah(double hitungGaji) {
        return String.format("Rp%,.2f", hitungGaji);
    }

    public static String formatInsentif(double insentif) {
        return String.format("Rp%,.2f", insentif);
    }

    public static String formatBonus(double bonus) {
        return String.format("Rp%,.2f", bonus);
    }
}
