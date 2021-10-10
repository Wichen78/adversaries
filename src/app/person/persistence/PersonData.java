package app.person.persistence;

import app.person.models.Person;
import app.person.models.PersonImpl;
import app.profession.models.Profession;
import app.profession.models.Species;

import java.util.List;

public class PersonData {

    private static Person builder(String name, int maxStamina, double power, double proficiencyPower, double deficiencyPower, double defense, double defenseBreach, double accuracy, double bonusDodge, Profession profession, List<Species> species) {
        return builder(name, maxStamina, power, 0, 0, 0, proficiencyPower, deficiencyPower, defense, defenseBreach, accuracy, bonusDodge, 0, 0, 0, 0, 0, profession, species);
    }

    private static Person builder(String name, int maxStamina, double power, double protegoPower, double precision, double criticalPower, double proficiencyPower, double deficiencyPower, double defense, double defenseBreach, double accuracy, double bonusDodge, double bonusPrecisionFeared, Profession profession, List<Species> species) {
        return builder(name, maxStamina, power, protegoPower, precision, criticalPower, proficiencyPower, deficiencyPower, defense, defenseBreach, accuracy, bonusDodge, bonusPrecisionFeared, 0, 0, 0, 0, profession, species);
    }

    private static Person builder(String name, int maxStamina, double power, double protegoPower, double precision, double criticalPower, double proficiencyPower, double deficiencyPower, double defense, double defenseBreach, double accuracy, double bonusDodge, double bonusPrecisionFeared, double bonusPower50, double bonusDefense50, double bonusPrecisionFirst, double bonusCriticalPowerFirst, Profession profession, List<Species> species) {
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
                .withBonusDodge(bonusDodge)
                .withBonusPrecisionFeared(bonusPrecisionFeared)
                .withBonusPower50(bonusPower50)
                .withBonusDefense50(bonusDefense50)
                .withBonusPrecisionFirst(bonusPrecisionFirst)
                .withBonusCriticalPowerFirst(bonusCriticalPowerFirst)
                .withProfession(profession)
                .withSpecies(species)
                .build();
    }

    // WIZARD

    public static Person createAuror() {
        return builder("auror", 296, 100, 0.35, 0.35, 1.2, 1.48, 0.5, 0.39, 0.32, 0.15, 0.5, 0.5, 10, 0.1, 0.35, 0.5, Profession.AUROR, List.of(Species.AUROR));
    }

    public static Person createAurorBis() {
        return builder("auror without DwD", 296, 100, 0.35, 0.35, 1.2, 1.48, 0.5, 0.39, 0.32, 0.15, 0.5, 0.5, 10, 0.1, 0, 0.5, Profession.AUROR, List.of(Species.AUROR));
    }

    public static Person createMagi() {
        return builder("magizoologist", 525, 109, 0.49, 0.20, 0.98, 1.48, 0.6, 0.71, 0.22, 0.2, 0.5, 0.5, Profession.MAGIZOOLOGIST, List.of(Species.MAGIZOOLOGIST));
    }

    public static Person createProf() {
        return builder("professor", 397, 96, 0.45, 0.23, 1.11, 1.5, 0.5, 0.59, 0.15, 0.32, 0.5, 0.5, Profession.PROFESSOR, List.of(Species.PROFESSOR));
    }

    // ADVERSARIES 0 to 4

    public static Person createCommonSerpent_DracoMalforLineup() {
        return builder("common serpent", 188, 16,0.505, 0.75, 0.25, 0.2, 0.2, 0, Profession.BEASTS, List.of(Species.SERPENT, Species.FEARED_ADV));
    }

    public static Person createImposingDarkWizard_DracoMalforLineup() {
        return builder("imposing dark wizard", 763, 49,0.50, 0.76, 0.4, 0.25, 0.2, 0, Profession.DARK_FORCES, List.of(Species.DARK_WIZARD, Species.FEARED_ADV));
    }

    public static Person createDracoMalfoy_DracoMalforLineup() {
        return builder("draco malfoy", 1635, 80,0, 0, 0.5, 0.2, 0.2, 0, Profession.NONE, List.of(Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createImposingSnatcher_FenrirGreybackLineup() {
        return builder("imposing snatcher", 206, 18,0.5, 0.75, 0.25, 0.2, 0.2, 0, Profession.CURIOSITIES, List.of(Species.SNATCHER, Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createDangerousWerewolf_FenrirGreybackLineup() {
        return builder("dangerous werewolf", 802, 51,0.5, 0.76, 0.4, 0.2, 0.2, 0, Profession.CURIOSITIES, List.of(Species.WEREWOLF, Species.FEARED_ADV));
    }

    public static Person createFenrirGreyback_FenrirGreybackLineup() {
        return builder("fenrir greyback", 1693, 83,0, 0, 0.5, 0.25, 0.2, 0, Profession.NONE, List.of(Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createCommonPixie_GilderoyLockhartLineup() {
        return builder("common pixie", 337, 23,0.5, 0.75, 0.25, 0.2, 0.2, 0, Profession.CURIOSITIES, List.of(Species.PIXIE, Species.FEARED_ADV));
    }

    public static Person createDangerousPixie_GilderoyLockhartLineup() {
        return builder("dangerous pixie", 842, 53,0.5, 0.76, 0.4, 0.2, 0.2, 0.3, Profession.CURIOSITIES, List.of(Species.PIXIE, Species.FEARED_ADV));
    }

    public static Person createGilderoyLockhart_GilderoyLockhartLineup() {
        return builder("gilderoy lockhart", 1750, 112,0, 0, 0.5, 0.2, 0.2, 0, Profession.NONE, List.of(Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createFormidableSerpent_SlytherinsBasiliskLineup() {
        return builder("formidable serpent", 486, 30,0.5, 0.75, 0.25, 0.2, 0.2, 0, Profession.BEASTS, List.of(Species.SERPENT, Species.FEARED_ADV));
    }

    public static Person createFierceAcromantula_SlytherinsBasiliskLineup() {
        return builder("fierce acromantula", 1382, 67,0.5, 0.76, 0.4, 0.25, 0.2, 0, Profession.BEASTS, List.of(Species.ACROMANTULA, Species.FEARED_ADV));
    }

    public static Person createSlytherinsBasilisk_SlytherinsBasiliskLineup() {
        return builder("slytherins basilisk", 2411, 115,0, 0, 0.5, 0.2, 0.2, 0, Profession.NONE, List.of(Species.FEARED_ADV));
    }

    public static Person createCommonAcromantula_AragogLineup() {
        return builder("common acromantula", 522, 30,0.5, 0.76, 0.25, 0.2, 0.2, 0, Profession.BEASTS, List.of(Species.ACROMANTULA, Species.FEARED_ADV));
    }

    public static Person createFierceAcromantula_AragogLineup() {
        return builder("fierce acromantula", 1447, 67,0.5, 0.76, 0.4, 0.25, 0.2, 0, Profession.BEASTS, List.of(Species.ACROMANTULA, Species.FEARED_ADV));
    }

    public static Person createAragog_AragogLineup() {
        return builder("aragog", 2488, 119,0, 0, 0.5, 0.2, 0.2, 0, Profession.NONE, List.of(Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    // ADVERSARIES 5 to 9

    public static Person createFormidableDarkWizard_PeterPettigrewLineup() {
        return builder("formidable dark wizard", 559, 33,0.5, 0.76, 0.25, 0.2, 0.2, 0, Profession.DARK_FORCES, List.of(Species.DARK_WIZARD, Species.FEARED_ADV));
    }

    public static Person createViciousDeathEater_PeterPettigrewLineup() {
        return builder("vicious death eater", 1512, 70,0.5, 0.76, 0.4, 0.2, 0.2, 0, Profession.DARK_FORCES, List.of(Species.DEATH_EATER, Species.FEARED_ADV));
    }

    public static Person createPeterPettigrew_PeterPettigrewLineup() {
        return builder("peter pettigrew", 2565, 122,0, 0, 0.4, 0.2, 0.2, 0, Profession.NONE, List.of(Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createCommonTroll_AncientNorwegianRidgebackLineup() {
        return builder("common troll", 807, 41,0.5, 0.75, 0.25, 0.25, 0.2, 0, Profession.CURIOSITIES, List.of(Species.TROLL, Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createThreeHeadedDog_AncientNorwegianRidgebackLineup() {
        return builder("three-headed dog", 1576, 73,0.5, 0.76, 0.4, 0.3, 0.2, 0, Profession.BEASTS, List.of(Species.THREE_HEADED_DOD, Species.FEARED_ADV));
    }

    public static Person createAncientNorwegianRidgeback_AncientNorwegianRidgebackLineup() {
        return builder("ancient norwegian ridgeback", 2587, 122,0, 0, 0.5, 0.5, 0.2, 0, Profession.NONE, List.of(Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createFormidablePoacher_AncientUkranianIronbellyLineup() {
        return builder("formidable poacher", 860, 44,0.5, 0.76, 0.25, 0.2, 0.2, 0, Profession.DARK_FORCES, List.of(Species.POACHER, Species.FEARED_ADV, Species.WEREWOLF));
    }

    public static Person createViciousMummy_AncientUkranianIronbellyLineup() {
        return builder("vicious mummy", 1641, 76,0.5, 0.75, 0.5, 0.2, 0.2, 0, Profession.CURIOSITIES, List.of(Species.MUMMY, Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createAncientUkranianIronbelly_AncientUkranianIronbellyLineup() {
        return builder("ancient ukranian ironbelly", 2606, 122,0, 0, 0.7, 0.2, 0.2, 0, Profession.NONE, List.of(Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createFormidableAcromantula_AncientHungarianHorntailLineup() {
        return builder("formidable acromantula", 912, 46,0.5, 0.75, 0.25, 0.25, 0.2, 0, Profession.BEASTS, List.of(Species.FEARED_ADV));
        // Bug no Species.ACROMANTULA bonus
    }

    public static Person createSphinx_AncientHungarianHorntailLineup() {
        return builder("sphinx", 1706, 79,0.5, 0.76, 0.4, 0.2, 0.2, 0, Profession.CURIOSITIES, List.of(Species.SPHINX, Species.FEARED_ADV));
    }

    public static Person createAncientHungarianHorntail_AncientHungarianHorntailLineup() {
        return builder("ancient hungarian horntail", 2625, 122,0, 0, 0.4, 0.4, 0.2, 0, Profession.NONE, List.of(Species.FEARED_ADV));
    }

    public static Person createFormidableSnatcher_NarcissaMalfoyLineup() {
        return builder("formidable snatcher", 965, 49,0.5, 0.75, 0.25, 0.2, 0.2, 0, Profession.CURIOSITIES, List.of(Species.SNATCHER, Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createDarkWitch_NarcissaMalfoyLineup() {
        return builder("dark witch", 1771, 86,0.5, 0.76, 0.4, 0.2, 0.2, 0.2, Profession.DARK_FORCES, List.of(Species.DARK_WITCH, Species.FEARED_ADV, Species.DARK_WIZARD));
    }

    public static Person createNarcissaMalfoy_NarcissaMalfoyLineup() {
        return builder("narcissa malfoy", 2642, 125,0, 0, 0.5, 0.2, 0.2, 0.4, Profession.NONE, List.of(Species.FEARED_ADV, Species.DARK_WIZARD));
    }

}
