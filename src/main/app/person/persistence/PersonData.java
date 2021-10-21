package main.app.person.persistence;

import main.app.person.models.Person;
import main.app.person.models.PersonImpl;
import main.app.profession.models.Profession;
import main.app.profession.models.Species;

import java.util.Set;

public class PersonData {

    // DEFENSE

    private static final double FIRST_GUARD_DEFENSE_0_25 = 0.25;

    private static final double SECOND_GUARD_DEFENSE_0_4 = 0.4;
    private static final double SECOND_GUARD_DEFENSE_0_5 = 0.5; // Vicious Mummy

    private static final double FEARED_ADV_DEFENSE_0_4 = 0.4; // Peter Pettigrew
    private static final double FEARED_ADV_DEFENSE_0_5 = 0.5;
    private static final double FEARED_ADV_DEFENSE_0_7 = 0.7; // Ancient Ukranian Ironbelly

    // DEFENSE BREACH

    private static final double FIRST_GUARD_DEFENSE_BREACH_0_2 = 0.2;
    private static final double FIRST_GUARD_DEFENSE_BREACH_0_25 = 0.25; // Common Troll, Formidable Acromantula

    private static final double SECOND_GUARD_DEFENSE_BREACH_0_2 = 0.2;
    private static final double SECOND_GUARD_DEFENSE_BREACH_0_25 = 0.25;
    private static final double SECOND_GUARD_DEFENSE_BREACH_0_3 = 0.3; // Three Headed Dog

    private static final double FEARED_ADV_DEFENSE_BREACH_0_2 = 0.2;
    private static final double FEARED_ADV_DEFENSE_BREACH_0_25 = 0.25; // Fenrir Greyback
    private static final double FEARED_ADV_DEFENSE_BREACH_0_4 = 0.4; // Ancient Hungarian Horntail
    private static final double FEARED_ADV_DEFENSE_BREACH_0_5 = 0.5; // Ancient Norwegian Ridgeback

    // PROFICIENCY

    private static final double FIRST_GUARD_PROFICIENCY_0_5 = 0.5;
    private static final double FIRST_GUARD_PROFICIENCY_0_505 = 0.505; // Common Serpent

    private static final double SECOND_GUARD_PROFICIENCY_0_5 = 0.5;

    // DEFICIENCY

    private static final double FIRST_GUARD_DEFICIENCY_0_75 = 0.75;
    private static final double FIRST_GUARD_DEFICIENCY_0_76 = 0.76;

    private static final double SECOND_GUARD_DEFICIENCY_0_75 = 0.75;
    private static final double SECOND_GUARD_DEFICIENCY_0_76 = 0.76;

    // ACCURACY

    private static final double FEARED_ACCURACY_0_2 = 0.2;

    private static Person builder(String name, int maxStamina, double power, double proficiencyPower, double deficiencyPower, double defense, double defenseBreach, double accuracy, double dodge, Profession profession, Set<Species> species) {
        return builder(name, maxStamina, power, 0, 0, 0, proficiencyPower, deficiencyPower, defense, defenseBreach, accuracy, dodge, profession, species);
    }

    private static Person builder(String name, int maxStamina, double power, double protegoPower, double precision, double criticalPower, double proficiencyPower, double deficiencyPower, double defense, double defenseBreach, double accuracy, double dodge, Profession profession, Set<Species> species) {
        return PersonImpl
                .builder()
                .withName(name)
                .withStamina(maxStamina)
                .withMaxStamina(maxStamina)
                .withPower(power)
                .withProtegoPower(protegoPower)
                .withPrecision(precision)
                .withCriticalPower(criticalPower)
                .withProficiencyPower(proficiencyPower)
                .withDeficiencyPower(deficiencyPower)
                .withDefense(defense)
                .withDefenseBreach(defenseBreach)
                .withAccuracy(accuracy)
                .withDodge(dodge)
                .withProfession(profession)
                .withSpecies(species)
                .build();
    }

    // WIZARD

    public static Person createAuror() {
        return builder("auror", 296, 100,
                0.35, 0.35, 1.2,
                1.48, 0.5,
                0.39, 0.32,
                0.15, 0,
                Profession.AUROR, Set.of(Species.AUROR));
    }

    public static Person createProf() {
        return builder("professor", 397, 79,
                0.45, 0.23, 1.11,
                1.5, 0.5,
                0.44, 0.15,
                0.32, 0,
                Profession.PROFESSOR, Set.of(Species.PROFESSOR));
    }

    public static Person createMagi() {
        return builder("magizoologist", 525, 59,
                0.49, 0.20, 0.98,
                1.48, 0.6,
                0.5, 0.22,
                0.2, 0,
                Profession.MAGIZOOLOGIST, Set.of(Species.MAGIZOOLOGIST));
    }

    // ADVERSARIES 0 to 4

    public static Person createCommonSerpent_DracoMalforLineup() {
        return builder("common serpent", 188, 16,
                FIRST_GUARD_PROFICIENCY_0_505, FIRST_GUARD_DEFICIENCY_0_75,
                FIRST_GUARD_DEFENSE_0_25, FIRST_GUARD_DEFENSE_BREACH_0_2,
                FEARED_ACCURACY_0_2, 0,
                Profession.BEASTS, Set.of(Species.SERPENT, Species.FEARED_ADV));
    }

    public static Person createImposingDarkWizard_DracoMalforLineup() {
        return builder("imposing dark wizard", 763, 49,
                SECOND_GUARD_PROFICIENCY_0_5, SECOND_GUARD_DEFICIENCY_0_76,
                SECOND_GUARD_DEFENSE_0_4, SECOND_GUARD_DEFENSE_BREACH_0_25,
                FEARED_ACCURACY_0_2, 0,
                Profession.DARK_FORCES, Set.of(Species.DARK_WIZARD, Species.FEARED_ADV));
    }

    public static Person createDracoMalfoy_DracoMalforLineup() {
        return builder("draco malfoy", 1635, 80,
                0, 0,
                FEARED_ADV_DEFENSE_0_5, FEARED_ADV_DEFENSE_BREACH_0_2,
                FEARED_ACCURACY_0_2, 0,
                Profession.NONE, Set.of(Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createImposingSnatcher_FenrirGreybackLineup() {
        return builder("imposing snatcher", 206, 18,
                FIRST_GUARD_PROFICIENCY_0_5, FIRST_GUARD_DEFICIENCY_0_75,
                FIRST_GUARD_DEFENSE_0_25, FIRST_GUARD_DEFENSE_BREACH_0_2,
                FEARED_ACCURACY_0_2, 0,
                Profession.CURIOSITIES, Set.of(Species.SNATCHER, Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createDangerousWerewolf_FenrirGreybackLineup() {
        return builder("dangerous werewolf", 802, 51,
                SECOND_GUARD_PROFICIENCY_0_5, SECOND_GUARD_DEFICIENCY_0_76,
                SECOND_GUARD_DEFENSE_0_4, SECOND_GUARD_DEFENSE_BREACH_0_2,
                FEARED_ACCURACY_0_2, 0,
                Profession.CURIOSITIES, Set.of(Species.WEREWOLF, Species.FEARED_ADV));
    }

    public static Person createFenrirGreyback_FenrirGreybackLineup() {
        return builder("fenrir greyback", 1693, 83,
                0, 0,
                FEARED_ADV_DEFENSE_0_5, FEARED_ADV_DEFENSE_BREACH_0_25,
                FEARED_ACCURACY_0_2, 0,
                Profession.NONE, Set.of(Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createCommonPixie_GilderoyLockhartLineup() {
        return builder("common pixie", 337, 23,
                FIRST_GUARD_PROFICIENCY_0_5, FIRST_GUARD_DEFICIENCY_0_76,
                FIRST_GUARD_DEFENSE_0_25, FIRST_GUARD_DEFENSE_BREACH_0_2,
                0, 0,
                Profession.CURIOSITIES, Set.of(Species.PIXIE));
        // BUG no Species.FEARED_ADV bonus
    }

    public static Person createDangerousPixie_GilderoyLockhartLineup() {
        return builder("dangerous pixie", 842, 53,
                SECOND_GUARD_PROFICIENCY_0_5, SECOND_GUARD_DEFICIENCY_0_76,
                SECOND_GUARD_DEFENSE_0_4, SECOND_GUARD_DEFENSE_BREACH_0_2,
                FEARED_ACCURACY_0_2, 0.3,
                Profession.CURIOSITIES, Set.of(Species.PIXIE, Species.FEARED_ADV));
    }

    public static Person createGilderoyLockhart_GilderoyLockhartLineup() {
        return builder("gilderoy lockhart", 1750, 112,
                0, 0,
                FEARED_ADV_DEFENSE_0_5, FEARED_ADV_DEFENSE_BREACH_0_2,
                FEARED_ACCURACY_0_2, 0,
                Profession.NONE, Set.of(Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createFormidableSerpent_SlytherinsBasiliskLineup() {
        return builder("formidable serpent", 486, 30,
                FIRST_GUARD_PROFICIENCY_0_5, FIRST_GUARD_DEFICIENCY_0_75,
                FIRST_GUARD_DEFENSE_0_25, FIRST_GUARD_DEFENSE_BREACH_0_2,
                FEARED_ACCURACY_0_2, 0, Profession.BEASTS,
                Set.of(Species.SERPENT, Species.FEARED_ADV));
    }

    public static Person createFierceAcromantula_SlytherinsBasiliskLineup() {
        return builder("fierce acromantula", 1382, 67,
                SECOND_GUARD_PROFICIENCY_0_5, SECOND_GUARD_DEFICIENCY_0_76,
                SECOND_GUARD_DEFENSE_0_4, SECOND_GUARD_DEFENSE_BREACH_0_25,
                FEARED_ACCURACY_0_2, 0,
                Profession.BEASTS, Set.of(Species.ACROMANTULA, Species.FEARED_ADV));
    }

    public static Person createSlytherinsBasilisk_SlytherinsBasiliskLineup() {
        return builder("slytherins basilisk", 2411, 115,
                0, 0,
                FEARED_ADV_DEFENSE_0_5, FEARED_ADV_DEFENSE_BREACH_0_2,
                FEARED_ACCURACY_0_2, 0,
                Profession.NONE, Set.of(Species.FEARED_ADV));
    }

    public static Person createCommonAcromantula_AragogLineup() {
        return builder("common acromantula", 522, 30,
                FIRST_GUARD_PROFICIENCY_0_5, FIRST_GUARD_DEFICIENCY_0_76,
                FIRST_GUARD_DEFENSE_0_25, FIRST_GUARD_DEFENSE_BREACH_0_2,
                FEARED_ACCURACY_0_2, 0,
                Profession.BEASTS, Set.of(Species.ACROMANTULA, Species.FEARED_ADV));
    }

    public static Person createFierceAcromantula_AragogLineup() {
        return builder("fierce acromantula", 1447, 67,
                SECOND_GUARD_PROFICIENCY_0_5, SECOND_GUARD_DEFICIENCY_0_76,
                SECOND_GUARD_DEFENSE_0_4, SECOND_GUARD_DEFENSE_BREACH_0_25,
                FEARED_ACCURACY_0_2, 0,
                Profession.BEASTS, Set.of(Species.ACROMANTULA, Species.FEARED_ADV));
    }

    public static Person createAragog_AragogLineup() {
        return builder("aragog", 2488, 119,
                0, 0,
                FEARED_ADV_DEFENSE_0_5, FEARED_ADV_DEFENSE_BREACH_0_2,
                FEARED_ACCURACY_0_2, 0,
                Profession.NONE, Set.of(Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    // ADVERSARIES 5 to 9

    public static Person createFormidableDarkWizard_PeterPettigrewLineup() {
        return builder("formidable dark wizard", 559, 33,
                FIRST_GUARD_PROFICIENCY_0_5, FIRST_GUARD_DEFICIENCY_0_76,
                FIRST_GUARD_DEFENSE_0_25, FIRST_GUARD_DEFENSE_BREACH_0_2,
                FEARED_ACCURACY_0_2, 0,
                Profession.DARK_FORCES, Set.of(Species.DARK_WIZARD, Species.FEARED_ADV));
    }

    public static Person createViciousDeathEater_PeterPettigrewLineup() {
        return builder("vicious death eater", 1512, 70,
                SECOND_GUARD_PROFICIENCY_0_5, SECOND_GUARD_DEFICIENCY_0_76,
                SECOND_GUARD_DEFENSE_0_4, SECOND_GUARD_DEFENSE_BREACH_0_2,
                FEARED_ACCURACY_0_2, 0,
                Profession.DARK_FORCES, Set.of(Species.DEATH_EATER, Species.FEARED_ADV));
    }

    public static Person createPeterPettigrew_PeterPettigrewLineup() {
        return builder("peter pettigrew", 2565, 122,
                0, 0,
                FEARED_ADV_DEFENSE_0_4, FEARED_ADV_DEFENSE_BREACH_0_2,
                FEARED_ACCURACY_0_2, 0,
                Profession.NONE, Set.of(Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createCommonTroll_AncientNorwegianRidgebackLineup() {
        return builder("common troll", 807, 41,
                FIRST_GUARD_PROFICIENCY_0_5, FIRST_GUARD_DEFICIENCY_0_75,
                FIRST_GUARD_DEFENSE_0_25, FIRST_GUARD_DEFENSE_BREACH_0_25,
                FEARED_ACCURACY_0_2, 0,
                Profession.CURIOSITIES, Set.of(Species.TROLL, Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createThreeHeadedDog_AncientNorwegianRidgebackLineup() {
        return builder("three-headed dog", 1576, 73,
                SECOND_GUARD_PROFICIENCY_0_5, SECOND_GUARD_DEFICIENCY_0_76,
                SECOND_GUARD_DEFENSE_0_4, SECOND_GUARD_DEFENSE_BREACH_0_3,
                FEARED_ACCURACY_0_2, 0,
                Profession.BEASTS, Set.of(Species.THREE_HEADED_DOG, Species.FEARED_ADV));
    }

    public static Person createAncientNorwegianRidgeback_AncientNorwegianRidgebackLineup() {
        return builder("ancient norwegian ridgeback", 2587, 122,
                0, 0,
                FEARED_ADV_DEFENSE_0_5, FEARED_ADV_DEFENSE_BREACH_0_5,
                FEARED_ACCURACY_0_2, 0,
                Profession.NONE, Set.of(Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createFormidablePoacher_AncientUkranianIronbellyLineup() {
        return builder("formidable poacher", 860, 44,
                FIRST_GUARD_PROFICIENCY_0_5, FIRST_GUARD_DEFICIENCY_0_76,
                FIRST_GUARD_DEFENSE_0_25, FIRST_GUARD_DEFENSE_BREACH_0_2,
                FEARED_ACCURACY_0_2, 0,
                Profession.DARK_FORCES, Set.of(Species.POACHER, Species.FEARED_ADV, Species.WEREWOLF));
    }

    public static Person createViciousMummy_AncientUkranianIronbellyLineup() {
        return builder("vicious mummy", 1641, 76,
                SECOND_GUARD_PROFICIENCY_0_5, SECOND_GUARD_DEFICIENCY_0_75,
                SECOND_GUARD_DEFENSE_0_5, SECOND_GUARD_DEFENSE_BREACH_0_2,
                FEARED_ACCURACY_0_2, 0,
                Profession.CURIOSITIES, Set.of(Species.MUMMY, Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createAncientUkranianIronbelly_AncientUkranianIronbellyLineup() {
        return builder("ancient ukranian ironbelly", 2606, 122,
                0, 0,
                FEARED_ADV_DEFENSE_0_7, FEARED_ADV_DEFENSE_BREACH_0_2,
                FEARED_ACCURACY_0_2, 0,
                Profession.NONE, Set.of(Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createFormidableAcromantula_AncientHungarianHorntailLineup() {
        return builder("formidable acromantula", 912, 46,
                FIRST_GUARD_PROFICIENCY_0_5, FIRST_GUARD_DEFICIENCY_0_75,
                FIRST_GUARD_DEFENSE_0_25, FIRST_GUARD_DEFENSE_BREACH_0_25,
                FEARED_ACCURACY_0_2, 0,
                Profession.BEASTS, Set.of(Species.FEARED_ADV));
        // BUG no Species.ACROMANTULA bonus
    }

    public static Person createSphinx_AncientHungarianHorntailLineup() {
        return builder("sphinx", 1706, 79,
                SECOND_GUARD_PROFICIENCY_0_5, SECOND_GUARD_DEFICIENCY_0_76,
                SECOND_GUARD_DEFENSE_0_4, SECOND_GUARD_DEFENSE_BREACH_0_2,
                FEARED_ACCURACY_0_2, 0,
                Profession.CURIOSITIES, Set.of(Species.SPHINX, Species.FEARED_ADV));
    }

    public static Person createAncientHungarianHorntail_AncientHungarianHorntailLineup() {
        return builder("ancient hungarian horntail", 2625, 122,
                0, 0,
                FEARED_ADV_DEFENSE_0_5, FEARED_ADV_DEFENSE_BREACH_0_4,
                FEARED_ACCURACY_0_2, 0,
                Profession.NONE, Set.of(Species.FEARED_ADV));
    }

    public static Person createFormidableSnatcher_NarcissaMalfoyLineup() {
        return builder("formidable snatcher", 965, 49,
                FIRST_GUARD_PROFICIENCY_0_5, FIRST_GUARD_DEFICIENCY_0_75,
                FIRST_GUARD_DEFENSE_0_25, FIRST_GUARD_DEFENSE_BREACH_0_2,
                FEARED_ACCURACY_0_2, 0,
                Profession.CURIOSITIES, Set.of(Species.SNATCHER, Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createDarkWitch_NarcissaMalfoyLineup() {
        return builder("dark witch", 1771, 86,
                SECOND_GUARD_PROFICIENCY_0_5, SECOND_GUARD_DEFICIENCY_0_76,
                SECOND_GUARD_DEFENSE_0_4, SECOND_GUARD_DEFENSE_BREACH_0_2,
                FEARED_ACCURACY_0_2, 0.2,
                Profession.DARK_FORCES, Set.of(Species.DARK_WITCH, Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createNarcissaMalfoy_NarcissaMalfoyLineup() {
        return builder("narcissa malfoy", 2642, 125,
                0, 0,
                FEARED_ADV_DEFENSE_0_5, FEARED_ADV_DEFENSE_BREACH_0_2,
                FEARED_ACCURACY_0_2, 0.4,
                Profession.NONE, Set.of(Species.FEARED_ADV, Species.DARK_WIZARD));
    }

}
