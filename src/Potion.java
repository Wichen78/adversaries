public class Potion {

    private String name;
    private float power_bonus;
    private int maxCharge, charge;

    private Potion() {}

    public String getName() {
        return this.name;
    }

    public float getPower_bonus() {
        return this.power_bonus;
    }

    public boolean isActif() {
        return this.charge > 0;
    }

    public void useCharge() {
        this.charge--;
    }

    public void restartCharge() {
        this.charge = this.maxCharge;
    }

    public static Potion getPotent1() {
        Potion p = new Potion();
        p.name = "potent (6)";
        p.power_bonus = 2.5f;
        p.maxCharge = 6;
        p.charge = 6;
        return p;
    }

    public static Potion getPotent2() {
        Potion p = getPotent1();
        p.name = "potent (12)";
        p.maxCharge = 12;
        return p;
    }

    public static Potion getPotent3() {
        Potion p = getPotent1();
        p.name = "potent (18)";
        p.maxCharge = 18;
        return p;
    }

    public static Potion getStrong1() {
        Potion p = new Potion();
        p.name = "strong (5)";
        p.power_bonus = 1.5f;
        p.maxCharge = 5;
        p.charge = 5;
        return p;
    }

    public static Potion getStrong2() {
        Potion p = getStrong1();
        p.name = "strong (10)";
        p.maxCharge = 10;
        return p;
    }

    public static Potion getStrong3() {
        Potion p = getStrong1();
        p.name = "strong (15)";
        p.maxCharge = 15;
        return p;
    }

    public static Potion getExstimulo1() {
        Potion p = new Potion();
        p.name = "exstimulo (4)";
        p.power_bonus = 0.75f;
        p.maxCharge = 4;
        p.charge = 4;
        return p;
    }

    public static Potion getExstimulo2() {
        Potion p = getExstimulo1();
        p.name = "exstimulo (8)";
        p.maxCharge = 8;
        return p;
    }

    public static Potion getExstimulo3() {
        Potion p = getExstimulo1();
        p.name = "exstimulo (12)";
        p.maxCharge = 12;
        return p;
    }

    public static Potion getWit1() {
        Potion p = new Potion();
        p.name = "wit (4)";
        p.power_bonus = 0.8f;
        p.maxCharge = 4;
        p.charge = 4;
        return p;
    }

    public static Potion getWit2() {
        Potion p = getWit1();
        p.name = "wit (8)";
        p.maxCharge = 8;
        return p;
    }

    public static Potion getWit3() {
        Potion p = getWit1();
        p.name = "wit (12)";
        p.maxCharge = 12;
        return p;
    }

    public static Potion getWit4() {
        Potion p = getWit1();
        p.name = "wit (16)";
        p.maxCharge = 16;
        return p;
    }
}
