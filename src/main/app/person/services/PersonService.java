package main.app.person.services;

import main.app.person.models.Person;
import main.app.person.models.Wizard;
import main.app.person.models.WizardImpl;
import main.app.person.persistence.AdversariesLineupData;
import main.app.person.persistence.PersonData;
import main.app.setting.Custom;

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

    public static final class DracoMalfoyLineup {

        public static Person createCommonSerpent() {
            return PersonData.createCommonSerpent_DracoMalfoyLineup();
        }

        public static Person createImposingDarkWizard() {
            return PersonData.createImposingDarkWizard_DracoMalfoyLineup();
        }

        public static Person createDracoMalfoy() {
            return PersonData.createDracoMalfoy_DracoMalfoyLineup();
        }

        public static List<Person> createDracoMalfoyLineup() {
            return AdversariesLineupData.createDracoMalfoyLineup();
        }

    }

    public static final class FenrirGreybackLineup {

        public static Person createImposingSnatcher() {
            return PersonData.createImposingSnatcher_FenrirGreybackLineup();
        }

        public static Person createDangerousWerewolf() {
            return PersonData.createDangerousWerewolf_FenrirGreybackLineup();
        }

        public static Person createFenrirGreyback() {
            return PersonData.createFenrirGreyback_FenrirGreybackLineup();
        }

        public static List<Person> createFenrirGreybackLineup() {
            return AdversariesLineupData.createFenrirGreybackLineup();
        }

    }

    public static final class GilderoyLockhartLineup {

        public static Person createCommonPixie() {
            return PersonData.createCommonPixie_GilderoyLockhartLineup();
        }

        public static Person createDangerousPixie() {
            return PersonData.createDangerousPixie_GilderoyLockhartLineup();
        }

        public static Person createGilderoyLockhart() {
            return PersonData.createGilderoyLockhart_GilderoyLockhartLineup();
        }

        public static List<Person> createGilderoyLockhartLineup() {
            return AdversariesLineupData.createGilderoyLockhartLineup();
        }

    }

    public static final class SlytherinsBasiliskLineup {

        public static Person createFormidableSerpent() {
            return PersonData.createFormidableSerpent_SlytherinsBasiliskLineup();
        }

        public static Person createFierceAcromantula() {
            return PersonData.createFierceAcromantula_SlytherinsBasiliskLineup();
        }

        public static Person createSlytherinsBasilisk() {
            return PersonData.createSlytherinsBasilisk_SlytherinsBasiliskLineup();
        }

        public static List<Person> createSlytherinsBasiliskLineup() {
            return AdversariesLineupData.createSlytherinsBasiliskLineup();
        }

    }

    public static final class AragogLineup {

        public static Person createCommonAcromantula() {
            return PersonData.createCommonAcromantula_AragogLineup();
        }

        public static Person createFierceAcromantula() {
            return PersonData.createFierceAcromantula_AragogLineup();
        }

        public static Person createAragog() {
            return PersonData.createAragog_AragogLineup();
        }

        public static List<Person> createAragogLineup() {
            return AdversariesLineupData.createAragogLineup();
        }

    }


    // ADVERSARIES 5 to 9

    public static final class PeterPettigrewLineup {

        public static Person createFormidableDarkWizard() {
            return PersonData.createFormidableDarkWizard_PeterPettigrewLineup();
        }

        public static Person createViciousDeathEater() {
            return PersonData.createViciousDeathEater_PeterPettigrewLineup();
        }

        public static Person createPeterPettigrew() {
            return PersonData.createPeterPettigrew_PeterPettigrewLineup();
        }

        public static List<Person> createPeterPettigrewLineup() {
            return AdversariesLineupData.createPeterPettigrewLineup();
        }

    }

    public static final class AncientNorwegianRidgebackLineup {

        public static Person createCommonTroll() {
            return PersonData.createCommonTroll_AncientNorwegianRidgebackLineup();
        }

        public static Person createThreeHeadedDog() {
            return PersonData.createThreeHeadedDog_AncientNorwegianRidgebackLineup();
        }

        public static Person createAncientNorwegianRidgeback() {
            return PersonData.createAncientNorwegianRidgeback_AncientNorwegianRidgebackLineup();
        }

        public static List<Person> createAncientNorwegianRidgebackLineup() {
            return AdversariesLineupData.createAncientNorwegianRidgebackLineup();
        }

    }

    public static final class AncientUkranianIronbellyLineup {

        public static Person createFormidablePoacher() {
            return PersonData.createFormidablePoacher_AncientUkranianIronbellyLineup();
        }

        public static Person createViciousMummy() {
            return PersonData.createViciousMummy_AncientUkranianIronbellyLineup();
        }

        public static Person createAncientUkranianIronbelly() {
            return PersonData.createAncientUkranianIronbelly_AncientUkranianIronbellyLineup();
        }

        public static List<Person> createAncientUkranianIronbellyLineup() {
            return AdversariesLineupData.createAncientUkranianIronbellyLineup();
        }

    }

    public static final class AncientHungarianHorntailLineup {

        public static Person createFormidableAcromantula() {
            return PersonData.createFormidableAcromantula_AncientHungarianHorntailLineup();
        }

        public static Person createSphinx() {
            return PersonData.createSphinx_AncientHungarianHorntailLineup();
        }

        public static Person createAncientHungarianHorntail() {
            return PersonData.createAncientHungarianHorntail_AncientHungarianHorntailLineup();
        }

        public static List<Person> createAncientHungarianHorntailLineup() {
            return AdversariesLineupData.createAncientHungarianHorntailLineup();
        }

    }

    public static final class NarcissaMalfoyLineup {

        public static Person createFormidableSnatcher() {
            return PersonData.createFormidableSnatcher_NarcissaMalfoyLineup();
        }

        public static Person createDarkWitch() {
            return PersonData.createDarkWitch_NarcissaMalfoyLineup();
        }

        public static Person createNarcissaMalfoy() {
            return PersonData.createNarcissaMalfoy_NarcissaMalfoyLineup();
        }

        public static List<Person> createNarcissaMalfoyLineup() {
            return AdversariesLineupData.createNarcissaMalfoyLineup();
        }

    }

    public static boolean edit(Wizard wizard) {
        return wizard.edit();
    }

    public static boolean editPotions(Wizard wizard) {
        if (wizard.getPotions().size() == 1) {
            return Custom.editPotion(wizard.getPotions().iterator().next());
        }
        return Custom.editPotions(wizard.getPotions());
    }

    public static boolean edit(List<Person> adversaries) {
        if (adversaries.size() == 1) {
            return Custom.edit(adversaries.get(0));
        }
        return Custom.edit(adversaries);
    }
}
