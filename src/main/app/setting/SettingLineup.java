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
                return List.of(PersonService.DracoMalfoyLineup.createCommonSerpent());
            case "1":
                return List.of(PersonService.DracoMalfoyLineup.createImposingDarkWizard());
            case "2":
                return List.of(PersonService.DracoMalfoyLineup.createDracoMalfoy());
            case "3":
                return PersonService.DracoMalfoyLineup.createDracoMalfoyLineup();
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
                return List.of(PersonService.FenrirGreybackLineup.createImposingSnatcher());
            case "1":
                return List.of(PersonService.FenrirGreybackLineup.createDangerousWerewolf());
            case "2":
                return List.of(PersonService.FenrirGreybackLineup.createFenrirGreyback());
            case "3":
                return PersonService.FenrirGreybackLineup.createFenrirGreybackLineup();
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
                return List.of(PersonService.GilderoyLockhartLineup.createCommonPixie());
            case "1":
                return List.of(PersonService.GilderoyLockhartLineup.createDangerousPixie());
            case "2":
                return List.of(PersonService.GilderoyLockhartLineup.createGilderoyLockhart());
            case "3":
                return PersonService.GilderoyLockhartLineup.createGilderoyLockhartLineup();
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
                return List.of(PersonService.SlytherinsBasiliskLineup.createFormidableSerpent());
            case "1":
                return List.of(PersonService.SlytherinsBasiliskLineup.createFierceAcromantula());
            case "2":
                return List.of(PersonService.SlytherinsBasiliskLineup.createSlytherinsBasilisk());
            case "3":
                return PersonService.SlytherinsBasiliskLineup.createSlytherinsBasiliskLineup();
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
                return List.of(PersonService.AragogLineup.createCommonAcromantula());
            case "1":
                return List.of(PersonService.AragogLineup.createFierceAcromantula());
            case "2":
                return List.of(PersonService.AragogLineup.createAragog());
            case "3":
                return PersonService.AragogLineup.createAragogLineup();
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
                return List.of(PersonService.PeterPettigrewLineup.createFormidableDarkWizard());
            case "1":
                return List.of(PersonService.PeterPettigrewLineup.createViciousDeathEater());
            case "2":
                return List.of(PersonService.PeterPettigrewLineup.createPeterPettigrew());
            case "3":
                return PersonService.PeterPettigrewLineup.createPeterPettigrewLineup();
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
                return List.of(PersonService.AncientNorwegianRidgebackLineup.createCommonTroll());
            case "1":
                return List.of(PersonService.AncientNorwegianRidgebackLineup.createThreeHeadedDog());
            case "2":
                return List.of(PersonService.AncientNorwegianRidgebackLineup.createAncientNorwegianRidgeback());
            case "3":
                return PersonService.AncientNorwegianRidgebackLineup.createAncientNorwegianRidgebackLineup();
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
                return List.of(PersonService.AncientUkranianIronbellyLineup.createFormidablePoacher());
            case "1":
                return List.of(PersonService.AncientUkranianIronbellyLineup.createViciousMummy());
            case "2":
                return List.of(PersonService.AncientUkranianIronbellyLineup.createAncientUkranianIronbelly());
            case "3":
                return PersonService.AncientUkranianIronbellyLineup.createAncientUkranianIronbellyLineup();
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
                return List.of(PersonService.AncientHungarianHorntailLineup.createFormidableAcromantula());
            case "1":
                return List.of(PersonService.AncientHungarianHorntailLineup.createSphinx());
            case "2":
                return List.of(PersonService.AncientHungarianHorntailLineup.createAncientHungarianHorntail());
            case "3":
                return PersonService.AncientHungarianHorntailLineup.createAncientHungarianHorntailLineup();
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
                return List.of(PersonService.NarcissaMalfoyLineup.createFormidableSnatcher());
            case "1":
                return List.of(PersonService.NarcissaMalfoyLineup.createDarkWitch());
            case "2":
                return List.of(PersonService.NarcissaMalfoyLineup.createNarcissaMalfoy());
            case "3":
                return PersonService.NarcissaMalfoyLineup.createNarcissaMalfoyLineup();
            default:
                return chooseNarcissaMalfoyLineup();
        }
    }

}
