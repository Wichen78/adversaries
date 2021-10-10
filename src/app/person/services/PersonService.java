package app.person.services;

import app.person.models.Person;
import app.person.models.Wizard;
import app.person.models.WizardImpl;
import app.person.persistence.AdversariesLineupData;
import app.person.persistence.PersonData;

import java.util.List;

public class PersonService {

    public static Wizard createWizard() {
        return WizardImpl.builder().build();
    }

    public static Wizard createAuror() {
        return WizardImpl.builder()
                .withPerson(PersonData.createAuror())
                .build();
    }

    public static Wizard createAurorBis() {
        return WizardImpl.builder()
                .withPerson(PersonData.createAurorBis())
                .build();
    }

    public static Wizard createMagi() {
        return WizardImpl.builder()
                .withPerson(PersonData.createMagi())
                .build();
    }

    public static Wizard createProf() {
        return WizardImpl.builder()
                .withPerson(PersonData.createProf())
                .build();
    }

    // ADVERSARIES 0 to 4

    public static Person createCommonSerpent_DracoMalforLineup() {
        return PersonData.createCommonSerpent_DracoMalforLineup();
    }

    public static Person createImposingDarkWizard_DracoMalforLineup() {
        return PersonData.createImposingDarkWizard_DracoMalforLineup();
    }

    public static Person createDracoMalfoy_DracoMalforLineup() {
        return PersonData.createDracoMalfoy_DracoMalforLineup();
    }

    public static Person createImposingSnatcher_FenrirGreybackLineup() {
        return PersonData.createImposingSnatcher_FenrirGreybackLineup();
    }

    public static Person createDangerousWerewolf_FenrirGreybackLineup() {
        return PersonData.createDangerousWerewolf_FenrirGreybackLineup();
    }

    public static Person createFenrirGreyback_FenrirGreybackLineup() {
        return PersonData.createFenrirGreyback_FenrirGreybackLineup();
    }

    public static Person createCommonPixie_GilderoyLockhartLineup() {
        return PersonData.createCommonPixie_GilderoyLockhartLineup();
    }

    public static Person createDangerousPixie_GilderoyLockhartLineup() {
        return PersonData.createDangerousPixie_GilderoyLockhartLineup();
    }

    public static Person createGilderoyLockhart_GilderoyLockhartLineup() {
        return PersonData.createGilderoyLockhart_GilderoyLockhartLineup();
    }

    public static Person createFormidableSerpent_SlytherinsBasiliskLineup() {
        return PersonData.createFormidableSerpent_SlytherinsBasiliskLineup();
    }

    public static Person createFierceAcromantula_SlytherinsBasiliskLineup() {
        return PersonData.createFierceAcromantula_SlytherinsBasiliskLineup();
    }

    public static Person createSlytherinsBasilisk_SlytherinsBasiliskLineup() {
        return PersonData.createSlytherinsBasilisk_SlytherinsBasiliskLineup();
    }

    public static Person createCommonAcromantula_AragogLineup() {
        return PersonData.createCommonAcromantula_AragogLineup();
    }

    public static Person createFierceAcromantula_AragogLineup() {
        return PersonData.createFierceAcromantula_AragogLineup();
    }

    public static Person createAragog_AragogLineup_AragogLineup() {
        return PersonData.createAragog_AragogLineup();
    }

    // ADVERSARIES 5 to 9

    public static Person createFormidableDarkWizard_PeterPettigrewLineup() {
        return PersonData.createFormidableDarkWizard_PeterPettigrewLineup();
    }

    public static Person createViciousDeathEater_PeterPettigrewLineup() {
        return PersonData.createViciousDeathEater_PeterPettigrewLineup();
    }

    public static Person createPeterPettigrew_PeterPettigrewLineup() {
        return PersonData.createPeterPettigrew_PeterPettigrewLineup();
    }

    public static Person createCommonTroll_AncientNorwegianRidgebackLineup() {
        return PersonData.createCommonTroll_AncientNorwegianRidgebackLineup();
    }

    public static Person createThreeHeadedDog_AncientNorwegianRidgebackLineup() {
        return PersonData.createThreeHeadedDog_AncientNorwegianRidgebackLineup();
    }

    public static Person createAncientNorwegianRidgeback_AncientNorwegianRidgebackLineup() {
        return PersonData.createAncientNorwegianRidgeback_AncientNorwegianRidgebackLineup();
    }

    public static Person createFormidablePoacher_AncientUkranianIronbellyLineup() {
        return PersonData.createFormidablePoacher_AncientUkranianIronbellyLineup();
    }

    public static Person createViciousMummy_AncientUkranianIronbellyLineup() {
        return PersonData.createViciousMummy_AncientUkranianIronbellyLineup();
    }

    public static Person createAncientUkranianIronbelly_AncientUkranianIronbellyLineup() {
        return PersonData.createAncientUkranianIronbelly_AncientUkranianIronbellyLineup();
    }

    public static Person createFormidableAcromantula_AncientHungarianHorntailLineup() {
        return PersonData.createFormidableAcromantula_AncientHungarianHorntailLineup();
    }

    public static Person createSphinx_AncientHungarianHorntailLineup() {
        return PersonData.createSphinx_AncientHungarianHorntailLineup();
    }

    public static Person createAncientHungarianHorntail_AncientHungarianHorntailLineup() {
        return PersonData.createAncientHungarianHorntail_AncientHungarianHorntailLineup();
    }

    public static Person createFormidableSnatcher_NarcissaMalfoyLineup() {
        return PersonData.createFormidableSnatcher_NarcissaMalfoyLineup();
    }

    public static Person createDarkWitch_NarcissaMalfoyLineup() {
        return PersonData.createDarkWitch_NarcissaMalfoyLineup();
    }

    public static Person createNarcissaMalfoy_NarcissaMalfoyLineup() {
        return PersonData.createNarcissaMalfoy_NarcissaMalfoyLineup();
    }

    // Lineup

    public static List<Person> createDracoMalfoyLineup() {
        return AdversariesLineupData.createDracoMalfoyLineup();
    }

    public static List<Person> createFenrirGreybackLineup() {
        return AdversariesLineupData.createFenrirGreybackLineup();
    }

    public static List<Person> createGilderoyLockhartLineup() {
        return AdversariesLineupData.createGilderoyLockhartLineup();
    }

    public static List<Person> createSlytherinsBasiliskLineup() {
        return AdversariesLineupData.createSlytherinsBasiliskLineup();
    }

    public static List<Person> createAragogLineup() {
        return AdversariesLineupData.createAragogLineup();
    }

    // LINEUP 5 to 9

    public static List<Person> createPeterPettigrewLineup() {
        return AdversariesLineupData.createPeterPettigrewLineup();
    }

    public static List<Person> createAncientNorwegianRidgebackLineup() {
        return AdversariesLineupData.createAncientNorwegianRidgebackLineup();
    }

    public static List<Person> createAncientUkranianIronbellyLineup() {
        return AdversariesLineupData.createAncientUkranianIronbellyLineup();
    }

    public static List<Person> createAncientHungarianHorntailLineup() {
        return AdversariesLineupData.createAncientHungarianHorntailLineup();
    }

    public static List<Person> createNarcissaMalfoyLineup() {
        return AdversariesLineupData.createNarcissaMalfoyLineup();
    }

}
