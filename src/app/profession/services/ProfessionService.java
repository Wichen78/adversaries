package app.profession.services;

import app.profession.models.Profession;
import app.profession.models.Species;
import app.profession.persistence.ProfessionData;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ProfessionService {

    //Mag -> Bea -> Aur -> Dar -> Pro -> Cur -> Mag
    public static boolean isProficiency(Profession p, Profession q) {
        return Profession.isProficiency(p, q);
    }

    //MAG -> ERK
    public static double getPowerBonus(Profession p, Set<Species> s) {
        return (p == Profession.MAGIZOOLOGIST && s.contains(Species.ERKLINGS))
                ? ProfessionData.POWER_VS_ERKLINGS
                : 0;
    }

    //AUR -> ADV
    public static double getPrecisionBonus(Profession p, Set<Species> s) {
        return (p == Profession.AUROR && s.contains(Species.DEATH_EATER))
                ? ProfessionData.PRECISION_VS_DEATH_EATERS
                : 0;
    }

    //ADV -> AUR
    public static double getProtegoBonus(Set<Species> s, Profession p) {
        return (s.contains(Species.DARK_WIZARD) && p == Profession.AUROR)
                ? ProfessionData.PROTEGO_POWER_VS_DARK_WIZARDS
                : 0;
    }

    //ADV -> MAG
    public static double getDefenseBonus(Set<Species> s, Profession p) {
        return (s.contains(Species.ACROMANTULA) && p == Profession.MAGIZOOLOGIST)
                ? ProfessionData.DEFENSE_VS_SPIDERS
                : 0;
    }

    //PRO -> PIXIE
    public static double getAccuracyBonus(Profession p, Set<Species> s) {
        return (p == Profession.PROFESSOR && s.contains(Species.PIXIE))
                ? ProfessionData.ACCURACY_VS_PIXIES
                : 0;
    }

    //PRO -> WEREWOLF
    public static double getBreachDefenseBonus(Profession p, Set<Species> s) {
        return (p == Profession.PROFESSOR && s.contains(Species.WEREWOLF))
                ? ProfessionData.DEFENSE_BREACH_VS_WEREWOLVES
                : 0;
    }

    //WIZ -> ADV
    public static double getAccuracyLethalBonus(Profession p, Set<Species> s) {
        return (p.isWizard() && s.contains(Species.LETHAL_ADV))
                ? ProfessionData.ACCURACY_VS_LETHAL
                : 0;
    }

    public static String allProfession() {
        return Arrays.stream(Profession.values()).map((Enum::toString))
                .collect(Collectors.joining("\n"));
    }

    public static Profession parseProfession(String newValue) {
        return Profession.parseProfession(newValue);
    }

    public static String allSpecies() {
        return Arrays.stream(Species.values()).map((Enum::toString))
                .collect(Collectors.joining("\n"));
    }

    public static Species parseSpecies(String newValue) {
        return Species.parseSpecies(newValue);
    }
}
