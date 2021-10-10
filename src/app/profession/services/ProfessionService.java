package app.profession.services;

import app.profession.models.Profession;
import app.profession.models.Species;
import app.profession.persistence.ProfessionData;

import java.util.List;

public class ProfessionService {

    //Mag -> Bea -> Aur -> Dar -> Pro -> Cur -> Mag
    public static boolean isProficiency(Profession p, Profession q) {
        return Profession.isProficiency(p, q);
    }

    //AUR -> ADV
    public static double getPrecisionBonus(Profession p, List<Species> s) {
        return (p == Profession.AUROR && s.contains(Species.DEATH_EATER))
                ? ProfessionData.PRECISION_VS_DEATH_EATERS
                : 0;
    }

    //ADV -> AUR
    public static double getProtegoBonus(List<Species> s, Profession p) {
        return (s.contains(Species.DARK_WIZARD) && p == Profession.AUROR)
                ? ProfessionData.PROTEGO_POWER_VS_DARK_WIZARDS
                : 0;
    }

    //ADV -> MAG
    public static double getDefenseBonus(List<Species> s, Profession p) {
        return (s.contains(Species.ACROMANTULA) && p == Profession.MAGIZOOLOGIST)
                ? ProfessionData.DEFENSE_VS_SPIDERS
                : 0;
    }

    //PRO -> ADV
    public static double getBreachDefenseBonus(Profession p, List<Species> s) {
        return (p == Profession.PROFESSOR && s.contains(Species.WEREWOLF))
                ? ProfessionData.DEFENSE_BREACH_VS_WEREWOLVES
                : 0;
    }

    //WIZ -> ADV
    public static double getAccuracyLethalBonus(Profession p, List<Species> s) {
        return (p.isWizard() && s.contains(Species.LETHAL_ADV))
                ? ProfessionData.ACCURACY_VS_LETHAL
                : 0;
    }

}
