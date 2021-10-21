package main.app.setting;

import main.app.person.models.Person;
import main.app.person.services.PersonService;

import java.util.List;

public class SettingLineup {

    public static List<Person> chooseDracoMalfoyLineup() {
        System.out.print("Choose adversaries:\n" +
                "(0) Common Serpent\n" +
                "(1) Imposing Dark Wizard\n" +
                "(2) Draco Malfoy\n" +
                "(3) Draco Malfoy lineup\n" +
                "Enter a number between 0 and 3: ");
        switch (Setting.in.nextLine()) {
            case "0":
                return List.of(PersonService.createCommonSerpent_DracoMalforLineup());
            case "1":
                return List.of(PersonService.createImposingDarkWizard_DracoMalforLineup());
            case "2":
                return List.of(PersonService.createDracoMalfoy_DracoMalforLineup());
            case "3":
                return PersonService.createDracoMalfoyLineup();
            default:
                return chooseDracoMalfoyLineup();
        }
    }

    public static List<Person> chooseFenrirGreybackLineup() {
        System.out.print("Choose adversaries:\n" +
                "(0) Imposing Snatcher\n" +
                "(1) Dangerous Werewolf\n" +
                "(2) Fenrir Greyback\n" +
                "(3) Fenrir Greyback lineup\n" +
                "Enter a number between 0 and 3: ");
        switch (Setting.in.nextLine()) {
            case "0":
                return List.of(PersonService.createImposingSnatcher_FenrirGreybackLineup());
            case "1":
                return List.of(PersonService.createDangerousWerewolf_FenrirGreybackLineup());
            case "2":
                return List.of(PersonService.createFenrirGreyback_FenrirGreybackLineup());
            case "3":
                return PersonService.createFenrirGreybackLineup();
            default:
                return chooseFenrirGreybackLineup();
        }
    }

    public static List<Person> chooseGilderoyLockhartLineup() {
        System.out.print("Choose adversaries:\n" +
                "(0) Common Pixie\n" +
                "(1) Dangerous Pixie\n" +
                "(2) Gilderoy Lockhart\n" +
                "(3) Gilderoy Lockhart lineup\n" +
                "Enter a number between 0 and 3: ");
        switch (Setting.in.nextLine()) {
            case "0":
                return List.of(PersonService.createCommonPixie_GilderoyLockhartLineup());
            case "1":
                return List.of(PersonService.createDangerousPixie_GilderoyLockhartLineup());
            case "2":
                return List.of(PersonService.createGilderoyLockhart_GilderoyLockhartLineup());
            case "3":
                return PersonService.createGilderoyLockhartLineup();
            default:
                return chooseGilderoyLockhartLineup();
        }
    }

    public static List<Person> chooseSlytherinsBasiliskLineup() {
        System.out.print("Choose adversaries:\n" +
                "(0) Formidable Serpent\n" +
                "(1) Fierce Acromantula\n" +
                "(2) Slytherins Basilisk\n" +
                "(3) Slytherins Basilisk lineup\n" +
                "Enter a number between 0 and 3: ");
        switch (Setting.in.nextLine()) {
            case "0":
                return List.of(PersonService.createFormidableSerpent_SlytherinsBasiliskLineup());
            case "1":
                return List.of(PersonService.createFierceAcromantula_SlytherinsBasiliskLineup());
            case "2":
                return List.of(PersonService.createSlytherinsBasilisk_SlytherinsBasiliskLineup());
            case "3":
                return PersonService.createSlytherinsBasiliskLineup();
            default:
                return chooseSlytherinsBasiliskLineup();
        }
    }

    public static List<Person> chooseAragogLineup() {
        System.out.print("Choose adversaries:\n" +
                "(0) Common Acromantula\n" +
                "(1) Fierce Acromantula\n" +
                "(2) Aragog\n" +
                "(3) Aragog lineup\n" +
                "Enter a number between 0 and 3: ");
        switch (Setting.in.nextLine()) {
            case "0":
                return List.of(PersonService.createCommonAcromantula_AragogLineup());
            case "1":
                return List.of(PersonService.createFierceAcromantula_AragogLineup());
            case "2":
                return List.of(PersonService.createAragog_AragogLineup());
            case "3":
                return PersonService.createAragogLineup();
            default:
                return chooseAragogLineup();
        }
    }

    public static List<Person> choosePeterPettigrewLineup() {
        System.out.print("Choose adversaries:\n" +
                "(0) Formidable Dark Wizard\n" +
                "(1) Vicious Death Eater\n" +
                "(2) Peter Pettigrew\n" +
                "(3) Peter Pettigrew lineup\n" +
                "Enter a number between 0 and 3: ");
        switch (Setting.in.nextLine()) {
            case "0":
                return List.of(PersonService.createFormidableDarkWizard_PeterPettigrewLineup());
            case "1":
                return List.of(PersonService.createViciousDeathEater_PeterPettigrewLineup());
            case "2":
                return List.of(PersonService.createPeterPettigrew_PeterPettigrewLineup());
            case "3":
                return PersonService.createPeterPettigrewLineup();
            default:
                return choosePeterPettigrewLineup();
        }
    }

    public static List<Person> chooseAncientNorwegianRidgebackLineup() {
        System.out.print("Choose adversaries:\n" +
                "(0) Common Troll\n" +
                "(1) Three-Headed Dog\n" +
                "(2) Ancient Norwegian Ridgeback\n" +
                "(3) Ancient Norwegian Ridgeback lineup\n" +
                "Enter a number between 0 and 3: ");
        switch (Setting.in.nextLine()) {
            case "0":
                return List.of(PersonService.createCommonTroll_AncientNorwegianRidgebackLineup());
            case "1":
                return List.of(PersonService.createThreeHeadedDog_AncientNorwegianRidgebackLineup());
            case "2":
                return List.of(PersonService.createAncientNorwegianRidgeback_AncientNorwegianRidgebackLineup());
            case "3":
                return PersonService.createAncientNorwegianRidgebackLineup();
            default:
                return chooseAncientNorwegianRidgebackLineup();
        }
    }

    public static List<Person> chooseAncientUkranianIronbellyLineup() {
        System.out.print("Choose adversaries:\n" +
                "(0) Formidable Poacher\n" +
                "(1) Vicious Mummy\n" +
                "(2) Ancient Ukranian Ironbelly\n" +
                "(3) Ancient Ukranian Ironbelly lineup\n" +
                "Enter a number between 0 and 3: ");
        switch (Setting.in.nextLine()) {
            case "0":
                return List.of(PersonService.createFormidablePoacher_AncientUkranianIronbellyLineup());
            case "1":
                return List.of(PersonService.createViciousMummy_AncientUkranianIronbellyLineup());
            case "2":
                return List.of(PersonService.createAncientUkranianIronbelly_AncientUkranianIronbellyLineup());
            case "3":
                return PersonService.createAncientUkranianIronbellyLineup();
            default:
                return chooseAncientUkranianIronbellyLineup();
        }
    }

    public static List<Person> chooseAncientHungarianHorntailLineup() {
        System.out.print("Choose adversaries:\n" +
                "(0) Formidable Acromantula\n" +
                "(1) Sphinx\n" +
                "(2) Ancient Hungarian Horntail\n" +
                "(3) Ancient Hungarian Horntail lineup\n" +
                "Enter a number between 0 and 3: ");
        switch (Setting.in.nextLine()) {
            case "0":
                return List.of(PersonService.createFormidableAcromantula_AncientHungarianHorntailLineup());
            case "1":
                return List.of(PersonService.createSphinx_AncientHungarianHorntailLineup());
            case "2":
                return List.of(PersonService.createAncientHungarianHorntail_AncientHungarianHorntailLineup());
            case "3":
                return PersonService.createAncientHungarianHorntailLineup();
            default:
                return chooseAncientHungarianHorntailLineup();
        }
    }

    public static List<Person> chooseNarcissaMalfoyLineup() {
        System.out.print("Choose adversaries:\n" +
                "(0) Formidable Snatcher\n" +
                "(1) Dark Witch\n" +
                "(2) Narcissa Malfoy\n" +
                "(3) Narcissa Malfoy lineup\n" +
                "Enter a number between 0 and 3: ");
        switch (Setting.in.nextLine()) {
            case "0":
                return List.of(PersonService.createFormidableSnatcher_NarcissaMalfoyLineup());
            case "1":
                return List.of(PersonService.createDarkWitch_NarcissaMalfoyLineup());
            case "2":
                return List.of(PersonService.createNarcissaMalfoy_NarcissaMalfoyLineup());
            case "3":
                return PersonService.createNarcissaMalfoyLineup();
            default:
                return chooseNarcissaMalfoyLineup();
        }
    }

}
