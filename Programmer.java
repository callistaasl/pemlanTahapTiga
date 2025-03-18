public class Programmer extends Karyawan{
    private double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + bonus;
    }

    @Override
    public String infoGaji() {
        return super.infoGaji() + "\nBonus: " + bonus;
    }
}
