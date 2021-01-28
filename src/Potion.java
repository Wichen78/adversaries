public class Potion {

    private String name;
    private float power_bonus;
    private int charge;

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
        if(this.power_bonus < 1) { //exstimulo + wit
            this.charge = 4;
        } else if (this.power_bonus < 2) { //strong
            this.charge = 5;
        } else if (this.power_bonus < 3) { //potent
            this.charge = 6;
        }
    }

    public static Potion getPotent() {
        Potion p = new Potion();
        p.name = "potent";
        p.power_bonus = 2.5f;
        p.charge = 6;
        return p;
    }

    public static Potion getStrong() {
        Potion p = new Potion();
        p.name = "strong";
        p.power_bonus = 1.5f;
        p.charge = 5;
        return p;
    }

    public static Potion getExstimulo() {
        Potion p = new Potion();
        p.name = "exstimulo";
        p.power_bonus = 0.75f;
        p.charge = 4;
        return p;
    }

    public static Potion getWit() {
        Potion p = new Potion();
        p.name = "wit";
        p.power_bonus = 0.8f;
        p.charge = 4;
        return p;
    }
}
