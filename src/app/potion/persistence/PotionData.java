package app.potion.persistence;

import app.potion.models.Potion;
import app.potion.models.PotionImpl;

public class PotionData {

    private static Potion builder(String name, double power, int charge) {
        return builder(name, power, charge, charge);
    }

    private static Potion builder(String name, double power, int charge, int maxCharge) {
        return PotionImpl
                .builder()
                .withName(name)
                .withPower(power)
                .withCharge(charge)
                .withMaxCharge(maxCharge)
                .build();
    }

    public static Potion getPotent() {
        return builder("potent", 2.5, 6);
    }

    public static Potion getStrong() {
        return builder("strong", 1.5, 5);
    }

    public static Potion getExstimulo() {
        return builder("exstimulo", 0.75, 4);
    }

    public static Potion getWit() {
        return builder("wit", 0.8, 4);
    }

}
