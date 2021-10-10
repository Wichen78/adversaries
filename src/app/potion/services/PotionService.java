package app.potion.services;

import app.potion.models.Potion;
import app.potion.persistence.PotionData;

public class PotionService {

    public static Potion getPotent() {
        return PotionData.getPotent();
    }

    public static Potion getStrong() {
        return PotionData.getStrong();
    }

    public static Potion getExstimulo() {
        return PotionData.getExstimulo();
    }

    public static Potion getWit() {
        return PotionData.getWit();
    }

}
