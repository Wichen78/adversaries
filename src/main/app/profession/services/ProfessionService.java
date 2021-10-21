package main.app.profession.services;

import main.app.person.models.Person;
import main.app.profession.models.Profession;
import main.app.profession.models.Species;
import main.app.profession.persistence.ProfessionData;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ProfessionService {

    //Mag -> Bea -> Aur -> Dar -> Pro -> Cur -> Mag
    public static boolean isProficiency(Profession p, Profession q) {
        return Profession.isProficiency(p, q);
    }

    /**
     * AUROR -> ALL SPECIES <50% stamina: power +10
     * PROFESSOR -> ALL SPECIES: power +17
     * MAGIZOOLOGIST
     * -> ALL SPECIES: power +50
     * -> ERKLINGS: power +25
     */
    public static double getPowerBonus(Person p, Person q) {
        switch (p.getProfession()) {
            case AUROR:
                return (q.getStamina() < q.getMaxStamina() / 2)
                        ? ProfessionData.AUROR_POWER_50_PERCENT
                        : 0;
            case PROFESSOR:
                return ProfessionData.PROFESSOR_POWER_2_ENHANCEMENTS;
            case MAGIZOOLOGIST:
                return ProfessionData.MAGIZOOLOGIST_POWER_5_FOCUS
                        + (q.getSpecies().contains(Species.ERKLINGS)
                        ? ProfessionData.POWER_VS_ERKLINGS
                        : 0);
            default:
                return 0;
        }
    }

    /**
     * AUROR
     * -> ALL SPECIES 100% stamina: precision +35%
     * -> DEATH_EATER: precision +25%
     * AUROR, PROFESSOR, MAGIZOOLOGIST -> FEARED_ADV: precision +50%
     */
    public static double getPrecisionBonus(Person p, Person q) {
        var precision = 0.0;
        switch (p.getProfession()) {
            case AUROR:
                if (q.isFullStamina()) {
                    precision += ProfessionData.AUROR_PRECISION_FIRST_STRIKE;
                }
                if (q.getSpecies().contains(Species.DEATH_EATER)) {
                    precision += ProfessionData.PRECISION_VS_DEATH_EATERS;
                }
            case PROFESSOR:
            case MAGIZOOLOGIST:
                if (q.getSpecies().contains(Species.FEARED_ADV)) {
                    precision += ProfessionData.PRECISION_VS_FEARED;
                }
                return precision;
            default:
                return 0;
        }
    }

    /**
     * AUROR
     * -> ALL SPECIES 100% stamina: critical power +50%
     */
    public static double getCriticalPowerBonus(Person p, Person q) {
        switch (p.getProfession()) {
            case AUROR:
                return (q.isFullStamina())
                        ? ProfessionData.AUROR_CRITICAL_POWER_FIRST_STRIKE
                        : 0;
            default:
                return 0;
        }
    }

    /**
     * DARK_WIZARD -> AUROR: protego +20%
     */
    public static double getProtegoBonus(Person p, Person q) {
        switch (q.getProfession()) {
            case AUROR:
                return (p.getSpecies().contains(Species.DARK_WIZARD))
                        ? ProfessionData.PROTEGO_POWER_VS_DARK_WIZARDS
                        : 0;
            default:
                return 0;
        }
    }

    /**
     * ALL SPECIES <50% stamina -> AUROR: defense +10%
     * ALL SPECIES
     * -> PROFESSOR: defense +15%
     * -> MAGIZOOLOGIST: defense +21%
     * ACROMANTULE -> MAGIZOOLOGIST: defense +20%
     */
    public static double getDefenseBonus(Person p, Person q) {
        switch (q.getProfession()) {
            case AUROR:
                return (p.getStamina() < p.getMaxStamina()/2)
                        ? ProfessionData.AUROR_DEFENSE_50_PERCENT
                        : 0;
            case PROFESSOR:
                return ProfessionData.PROFESSOR_DEFENSE_2_ENHANCEMENTS;
            case MAGIZOOLOGIST:
                return ProfessionData.MAGIZOOLOGIST_DEFENSE_5_FOCUS
                        + (p.getSpecies().contains(Species.ACROMANTULA)
                        ? ProfessionData.DEFENSE_VS_SPIDERS
                        : 0);
            default:
                return 0;
        }
    }

    /**
     * PROFESSOR -> PIXIE: accuracy +30%
     * AUROR, PROFESSOR, MAGIZOOLOGIST -> LETHAL_ADV: accuracy +100%
     */
    public static double getAccuracyBonus(Person p, Person q) {
        var accuracy = 0.0;
        switch (p.getProfession()) {
            case PROFESSOR:
                if (q.getSpecies().contains(Species.PIXIE)) {
                    accuracy += ProfessionData.ACCURACY_VS_PIXIES;
                }
            case AUROR:
            case MAGIZOOLOGIST:
                if (q.getSpecies().contains(Species.LETHAL_ADV)) {
                    accuracy += ProfessionData.ACCURACY_VS_LETHAL;
                }
                return accuracy;
            default:
                return 0;
        }
    }

    /**
     * PROFESSOR -> WEREWOLF: defense breach +30%
     */
    public static double getDefenseBreachBonus(Person p, Person q) {
        switch (p.getProfession()) {
            case PROFESSOR:
                return  (q.getSpecies().contains(Species.WEREWOLF))
                        ? ProfessionData.DEFENSE_BREACH_VS_WEREWOLVES
                        : 0;
            default:
                return 0;
        }
    }

    /**
     * FEARED_ADV -> AUROR, PROFESSOR, MAGIZOOLOGIST: dodge +50%
     */
    public static double getDodgeBonus(Person p, Person q) {
        switch (q.getProfession()) {
            case AUROR:
            case PROFESSOR:
            case MAGIZOOLOGIST:
                return  (p.getSpecies().contains(Species.FEARED_ADV))
                        ? ProfessionData.DODGE_VS_FEARED
                        : 0;
            default:
                return 0;
        }
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
