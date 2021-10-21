package main.app.person.persistence;

import main.app.person.models.Person;

import java.util.List;

public class AdversariesLineupData {

    // LINEUP 0 to 4

    public static List<Person> createDracoMalfoyLineup() {
        return List.of(
                PersonData.createCommonSerpent_DracoMalforLineup(),
                PersonData.createImposingDarkWizard_DracoMalforLineup(),
                PersonData.createDracoMalfoy_DracoMalforLineup()
        );
    }

    public static List<Person> createFenrirGreybackLineup() {
        return List.of(
                PersonData.createImposingSnatcher_FenrirGreybackLineup(),
                PersonData.createDangerousWerewolf_FenrirGreybackLineup(),
                PersonData.createFenrirGreyback_FenrirGreybackLineup()
        );
    }

    public static List<Person> createGilderoyLockhartLineup() {
        return List.of(
                PersonData.createCommonPixie_GilderoyLockhartLineup(),
                PersonData.createDangerousPixie_GilderoyLockhartLineup(),
                PersonData.createGilderoyLockhart_GilderoyLockhartLineup()
        );
    }

    public static List<Person> createSlytherinsBasiliskLineup() {
        return List.of(
                PersonData.createFormidableSerpent_SlytherinsBasiliskLineup(),
                PersonData.createFierceAcromantula_SlytherinsBasiliskLineup(),
                PersonData.createSlytherinsBasilisk_SlytherinsBasiliskLineup()
        );
    }

    public static List<Person> createAragogLineup() {
        return List.of(
                PersonData.createCommonAcromantula_AragogLineup(),
                PersonData.createFierceAcromantula_AragogLineup(),
                PersonData.createAragog_AragogLineup()
        );
    }

    // LINEUP 5 to 9

    public static List<Person> createPeterPettigrewLineup() {
        return List.of(
                PersonData.createFormidableDarkWizard_PeterPettigrewLineup(),
                PersonData.createViciousDeathEater_PeterPettigrewLineup(),
                PersonData.createPeterPettigrew_PeterPettigrewLineup()
        );
    }

    public static List<Person> createAncientNorwegianRidgebackLineup() {
        return List.of(
                PersonData.createCommonTroll_AncientNorwegianRidgebackLineup(),
                PersonData.createThreeHeadedDog_AncientNorwegianRidgebackLineup(),
                PersonData.createAncientNorwegianRidgeback_AncientNorwegianRidgebackLineup()
        );
    }

    public static List<Person> createAncientUkranianIronbellyLineup() {
        return List.of(
                PersonData.createFormidablePoacher_AncientUkranianIronbellyLineup(),
                PersonData.createViciousMummy_AncientUkranianIronbellyLineup(),
                PersonData.createAncientUkranianIronbelly_AncientUkranianIronbellyLineup()
        );
    }

    public static List<Person> createAncientHungarianHorntailLineup() {
        return List.of(
                PersonData.createFormidableAcromantula_AncientHungarianHorntailLineup(),
                PersonData.createSphinx_AncientHungarianHorntailLineup(),
                PersonData.createAncientHungarianHorntail_AncientHungarianHorntailLineup()
        );
    }

    public static List<Person> createNarcissaMalfoyLineup() {
        return List.of(
                PersonData.createFormidableSnatcher_NarcissaMalfoyLineup(),
                PersonData.createDarkWitch_NarcissaMalfoyLineup(),
                PersonData.createNarcissaMalfoy_NarcissaMalfoyLineup()
        );
    }

}
