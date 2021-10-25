package main.app.potion.services;

import main.app.potion.models.Potion;
import main.app.potion.persistence.PotionData;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class PotionService {

    public static void unselectExstimulo(Set<Potion> potions) {
        potions.removeIf(PotionService::isExstimulo);
    }

    public static void unselectWit(Set<Potion> potions) {
        potions.removeIf(PotionService::isWit);
    }

    public static void selectPotent(Set<Potion> potions) {
        unselectExstimulo(potions);
        potions.add(getPotent());
    }

    public static void selectStrong(Set<Potion> potions) {
        unselectExstimulo(potions);
        potions.add(getStrong());
    }

    public static void selectExstimulo(Set<Potion> potions) {
        unselectExstimulo(potions);
        potions.add(getExstimulo());
    }

    public static void selectWit(Set<Potion> potions) {
        unselectWit(potions);
        potions.add(getWit());
    }

    private static boolean isExstimulo(Potion potion) {
        return List.of("potent", "strong", "exstimulo")
                .contains(potion.getName().trim().toLowerCase());
    }

    private static boolean isWit(Potion potion) {
        return Objects.equals("wit", potion.getName().trim().toLowerCase());
    }

    static Potion getPotent() {
        return PotionData.getPotent();
    }

    static Potion getStrong() {
        return PotionData.getStrong();
    }

    static Potion getExstimulo() {
        return PotionData.getExstimulo();
    }

    public static Potion getWit() {
        return PotionData.getWit();
    }

}
