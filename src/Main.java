import java.util.Scanner;

public class Main {

    private static final int MAXSTAMINALOSE = 10000;

    static Scanner in = new Scanner(System.in);
    static int val;

    static Person wizard;
    static Person[] adversaries;

    static int[] wizard_life;
    static int[] energy_used;
    static int sum_life;
    static int sum_energy;

    static Potion potion1;
    static Potion potion2;

    public static void main(String[] args) {
        chooseProfession();
    }

    public static void chooseProfession() {
        printLine(1);
        System.out.print("Choose a profession:\n(a) auror\n(m) magizoologist\n(p) professor\n" +
                "(q) quit\n" +
                "Enter a, m or p: ");
        switch (in.nextLine()) {
            case "a":
            case "auror":
                wizard = Person.createAuror();
                break;
            case "m":
            case "magizoologist":
                wizard = Person.createMagi();
                break;
            case "p":
            case "professor":
                wizard = Person.createProf();
                break;
            case "q":
            case "quit":
                return;
            default:
                chooseProfession();
                return;
        }
        chooseAdversaries();
    }

    public static void chooseAdversaries() {
        printLine(2);
        System.out.print("Choose adversaries lineup:\n" +
                "(0) draco malfoy lineup\n" +
                "(1) fenrir greyback lineup\n" +
                "(2) gilderoy lockhart lineup\n" +
                "(3) slytherins basilisk lineup\n" +
                "(4) aragog lineup\n" +
                "(5) peter pettigrew lineup\n" +
                "(6) ancient norwegian ridgeback lineup\n" +
                "(7) ancient ukranian ironbelly lineup\n" +
                "(8) ancient hungarian honrtail lineup\n" +
                "(9) narcissa malfoy lineup\n" +
                "(r) return\n" +
                "Enter a number between 0 and 9: ");
        switch (in.nextLine()) {
            case "0":
                chooseDracoMalfoyLineup();
                break;
            case "1":
                chooseFenrirGreybackLineup();
                break;
            case "2":
                chooseGilderoyLockhartLineup();
                break;
            case "3":
                chooseSlytherinsBasiliskLineup();
                break;
            case "4":
                chooseAragogLineup();
                break;
            case "5":
                choosePeterPettigrewLineup();
                break;
            case "6":
                chooseAncientNorwegianRidgebackLineup();
                break;
            case "7":
                chooseAncientUkranianIronbellyLineup();
                break;
            case "8":
                chooseAncientHungarianHorntailLineup();
                break;
            case "9":
                chooseNarcissaMalfoyLineup();
                break;
            case "r":
                chooseProfession();
                return;
            default:
                chooseAdversaries();
                //return;
        }
    }

    public static void chooseDracoMalfoyLineup() {
        printLine(2);
        System.out.print("Choose adversaries:\n" +
                "(0) Common Serpent\n" +
                "(1) Imposing Dark Wizard\n" +
                "(2) Draco Malfoy\n" +
                "(3) Draco Malfoy lineup\n" +
                "(r) return\n" +
                "Enter a number between 0 and 3: ");
        switch (in.nextLine()) {
            case "0":
                adversaries = new Person[]{Person.createCommonSerpent()};
                break;
            case "1":
                adversaries = new Person[]{Person.createImposingDarkWizard()};
                break;
            case "2":
                adversaries = new Person[]{Person.createDracoMalfoy()};
                break;
            case "3":
                adversaries = Person.createDracoMalfoyLineup();
                break;
            case "r":
                chooseAdversaries();
                return;
            default:
                chooseDracoMalfoyLineup();
                return;
        }
        chooseParameter();
    }

    public static void chooseFenrirGreybackLineup() {
        printLine(2);
        System.out.print("Choose adversaries:\n" +
                "(0) Imposing Snatcher\n" +
                "(1) Dangerous Werewolf\n" +
                "(2) Fenrir Greyback\n" +
                "(3) Fenrir Greyback lineup\n" +
                "(r) return\n" +
                "Enter a number between 0 and 3: ");
        switch (in.nextLine()) {
            case "0":
                adversaries = new Person[]{Person.createImposingSnatcher()};
                break;
            case "1":
                adversaries = new Person[]{Person.createDangerousWerewolf()};
                break;
            case "2":
                adversaries = new Person[]{Person.createFenrirGreyback()};
                break;
            case "3":
                adversaries = Person.createFenrirGreybackLineup();
                break;
            case "r":
                chooseAdversaries();
                return;
            default:
                chooseFenrirGreybackLineup();
                return;
        }
        chooseParameter();
    }

    public static void chooseGilderoyLockhartLineup() {
        printLine(2);
        System.out.print("Choose adversaries:\n" +
                "(0) Common Pixie\n" +
                "(1) Dangerous Pixie\n" +
                "(2) Gilderoy Lockhart\n" +
                "(3) Gilderoy Lockhart lineup\n" +
                "(r) return\n" +
                "Enter a number between 0 and 3: ");
        switch (in.nextLine()) {
            case "0":
                adversaries = new Person[]{Person.createCommonPixie()};
                break;
            case "1":
                adversaries = new Person[]{Person.createDangerousPixie()};
                break;
            case "2":
                adversaries = new Person[]{Person.createGilderoyLockhart()};
                break;
            case "3":
                adversaries = Person.createGilderoyLockhartLineup();
                break;
            case "r":
                chooseAdversaries();
                return;
            default:
                chooseGilderoyLockhartLineup();
                return;
        }
        chooseParameter();
    }

    public static void chooseSlytherinsBasiliskLineup() {
        printLine(2);
        System.out.print("Choose adversaries:\n" +
                "(0) Formidable Serpent\n" +
                "(1) Fierce Acromantula\n" +
                "(2) Slytherins Basilisk\n" +
                "(3) Slytherins Basilisk lineup\n" +
                "(r) return\n" +
                "Enter a number between 0 and 3: ");
        switch (in.nextLine()) {
            case "0":
                adversaries = new Person[]{Person.createFormidableSerpent()};
                break;
            case "1":
                adversaries = new Person[]{Person.createFierceAcromantula()};
                break;
            case "2":
                adversaries = new Person[]{Person.createSlytherinsBasilisk()};
                break;
            case "3":
                adversaries = Person.createSlytherinsBasiliskLineup();
                break;
            case "r":
                chooseAdversaries();
                return;
            default:
                chooseSlytherinsBasiliskLineup();
                return;
        }
        chooseParameter();
    }

    public static void chooseAragogLineup() {
        printLine(2);
        System.out.print("Choose adversaries:\n" +
                "(0) Common Acromantula\n" +
                "(1) Fierce Acromantula\n" +
                "(2) Aragog\n" +
                "(3) Aragog lineup\n" +
                "(r) return\n" +
                "Enter a number between 0 and 3: ");
        switch (in.nextLine()) {
            case "0":
                adversaries = new Person[]{Person.createCommonAcromantula()};
                break;
            case "1":
                adversaries = new Person[]{Person.createFierceAcromantula2()};
                break;
            case "2":
                adversaries = new Person[]{Person.createAragog()};
                break;
            case "3":
                adversaries = Person.createAragogLineup();
                break;
            case "r":
                chooseAdversaries();
                return;
            default:
                chooseAragogLineup();
                return;
        }
        chooseParameter();
    }

    public static void choosePeterPettigrewLineup() {
        printLine(2);
        System.out.print("Choose adversaries:\n" +
                "(0) Formidable Dark Wizard\n" +
                "(1) Vicious Death Eater\n" +
                "(2) Peter Pettigrew\n" +
                "(3) Peter Pettigrew lineup\n" +
                "(r) return\n" +
                "Enter a number between 0 and 3: ");
        switch (in.nextLine()) {
            case "0":
                adversaries = new Person[]{Person.createFormidableDarkWizard()};
                break;
            case "1":
                adversaries = new Person[]{Person.createViciousDeathEater()};
                break;
            case "2":
                adversaries = new Person[]{Person.createPeterPettigrew()};
                break;
            case "3":
                adversaries = Person.createPeterPettigrewLineup();
                break;
            case "r":
                chooseAdversaries();
                return;
            default:
                choosePeterPettigrewLineup();
                return;
        }
        chooseParameter();
    }

    public static void chooseAncientNorwegianRidgebackLineup() {
        printLine(2);
        System.out.print("Choose adversaries:\n" +
                "(0) Common Troll\n" +
                "(1) Cerberus\n" +
                "(2) Ancient Norwegian Ridgeback\n" +
                "(3) Ancient Norwegian Ridgeback lineup\n" +
                "(r) return\n" +
                "Enter a number between 0 and 3: ");
        switch (in.nextLine()) {
            case "0":
                adversaries = new Person[]{Person.createCommonTroll()};
                break;
            case "1":
                adversaries = new Person[]{Person.createCerberus()};
                break;
            case "2":
                adversaries = new Person[]{Person.createAncientNorwegianRidgeback()};
                break;
            case "3":
                adversaries = Person.createAncientNorwegianRidgebackLineup();
                break;
            case "r":
                chooseAdversaries();
                return;
            default:
                chooseAncientNorwegianRidgebackLineup();
                return;
        }
        chooseParameter();
    }

    public static void chooseAncientUkranianIronbellyLineup() {
        printLine(2);
        System.out.print("Choose adversaries:\n" +
                "(0) Formidable Poacher\n" +
                "(1) Vicious Mummy\n" +
                "(2) Ancient Ukranian Ironbelly\n" +
                "(3) Ancient Ukranian Ironbelly lineup\n" +
                "(r) return\n" +
                "Enter a number between 0 and 3: ");
        switch (in.nextLine()) {
            case "0":
                adversaries = new Person[]{Person.createFormidablePoacher()};
                break;
            case "1":
                adversaries = new Person[]{Person.createViciousMummy()};
                break;
            case "2":
                adversaries = new Person[]{Person.createAncientUkranianIronbelly()};
                break;
            case "3":
                adversaries = Person.createAncientUkranianIronbellyLineup();
                break;
            case "r":
                chooseAdversaries();
                return;
            default:
                chooseAncientUkranianIronbellyLineup();
                return;
        }
        chooseParameter();
    }

    public static void chooseAncientHungarianHorntailLineup() {
        printLine(2);
        System.out.print("Choose adversaries:\n" +
                "(0) Formidable Acromantula\n" +
                "(1) Sphinx\n" +
                "(2) Ancient Hungarian Horntail\n" +
                "(3) Ancient Hungarian Horntail lineup\n" +
                "(r) return\n" +
                "Enter a number between 0 and 3: ");
        switch (in.nextLine()) {
            case "0":
                adversaries = new Person[]{Person.createFormidableAcromantula()};
                break;
            case "1":
                adversaries = new Person[]{Person.createSphinx()};
                break;
            case "2":
                adversaries = new Person[]{Person.createAncientHungarianHorntail()};
                break;
            case "3":
                adversaries = Person.createAncientHungarianHorntailLineup();
                break;
            case "r":
                chooseAdversaries();
                return;
            default:
                chooseAncientHungarianHorntailLineup();
                return;
        }
        chooseParameter();
    }

    public static void chooseNarcissaMalfoyLineup() {
        printLine(2);
        System.out.print("Choose adversaries:\n" +
                "(0) Formidable Snatcher\n" +
                "(1) Dark Witch\n" +
                "(2) Narcissa Malfoy\n" +
                "(3) Narcissa Malfoy lineup\n" +
                "(r) return\n" +
                "Enter a number between 0 and 3: ");
        switch (in.nextLine()) {
            case "0":
                adversaries = new Person[]{Person.createFormidableSnatcher()};
                break;
            case "1":
                adversaries = new Person[]{Person.createDarkWitch()};
                break;
            case "2":
                adversaries = new Person[]{Person.createNarcissaMalfoy()};
                break;
            case "3":
                adversaries = Person.createNarcissaMalfoyLineup();
                break;
            case "r":
                chooseAdversaries();
                return;
            default:
                chooseNarcissaMalfoyLineup();
                return;
        }
        chooseParameter();
    }

    public static void chooseParameter() {
        printLine(3);
        System.out.print("Choose number of simulation:\n" +
                "(1)       1 with combat detail\n" +
                "(2)   1.000\n" +
                "(3)  10.000\n" +
                "(4) 100.000\n" +
                "(r) return\n" +
                "Enter a number between 1 and 4: ");
        switch (in.nextLine()) {
            case "1":
                val = 1;
                break;
            case "2":
                val = 1000;
                break;
            case "3":
                val = 10000;
                break;
            case "4":
                val = 100000;
                break;
            case "r":
                chooseAdversaries();
                return;
            default:
                chooseParameter();
                return;
        }
        choosePotion();
    }

    public static void choosePotion() {
        printLine(4);
        System.out.print("Choose potion:\n" +
                "(0) any\n" +
                "(1) wit + potent\n" +
                "(2) wit + strong\n" +
                "(3) wit + exstimulo\n" +
                "(4) potent\n" +
                "(5) strong\n" +
                "(6) exstimulo\n" +
                "(7) wit\n" +
                "(r) return\n" +
                "Enter a number between 0 and 7: ");
        switch (in.nextLine()) {
            case "0":
                potion1 = null;
                potion2 = null;
                break;
            case "1":
                potion1 = Potion.getPotent();
                potion2 = Potion.getWit();
                break;
            case "2":
                potion1 = Potion.getStrong();
                potion2 = Potion.getWit();
                break;
            case "3":
                potion1 = Potion.getExstimulo();
                potion2 = Potion.getWit();
                break;
            case "4":
                potion1 = Potion.getPotent();
                potion2 = null;
                break;
            case "5":
                potion1 = Potion.getStrong();
                potion2 = null;
                break;
            case "6":
                potion1 = Potion.getExstimulo();
                potion2 = null;
                break;
            case "7":
                potion1 = null;
                potion2 = Potion.getWit();
                break;
            case "r":
                chooseParameter();
                return;
            default:
                choosePotion();
                return;
        }
        fight();
    }

    public static void fight() {
        int[] result; //[wizard_life, adversary_life, energy, adv_hit]
        for(int i = 0; i < adversaries.length; i++) {
            wizard_life = new int[MAXSTAMINALOSE];
            energy_used = new int[100];
            sum_life = 0;
            sum_energy = 0;
            for(int c = 0; c < val; c++) {
                result = Battle.battle(wizard, adversaries[i], val == 1, potion1, potion2);
                wizard_life[healthToWizard_life(result[0])]++;
                energy_used[result[2]]++;
                sum_life += result[0];
                sum_energy += result[2];
                wizard.resetStamina();
                adversaries[i].resetStamina();
                if(potion1 != null)
                    potion1.restartCharge();
                if(potion2 != null)
                    potion2.restartCharge();
            }
            printStatistic(i);
        }
        continu();
    }

    public static void printStatistic(int index) {
        System.out.println("\n" + wizard.name + " against " + adversaries[index].name);
        for(int i = 0; i < wizard_life.length; i++) {
            if(wizard_life[i] != 0) {
                System.out.println("> " + getDigit(wizard_lifeToHealth(i), 10) + "    health: " + getDigit(wizard_life[i], 10));
            }
        }
        System.out.println();
        for(int i = 0; i < energy_used.length; i++) {
            if(energy_used[i] != 0) {
                System.out.println("> " + getDigit(i, 10) + "  energies: " + getDigit(energy_used[i], 10));
            }
        }
        System.out.println("\n" + wizard.name + " against " + adversaries[index].name);
        System.out.println("average remaining health:  " + sum_life / (float) val + " / " + wizard.maxStamina + "\n" +
                "average energies    used:  " + sum_energy / (float) val + "\n" +
                "             win    rate:  " + getWinrate());
    }

    public static String getDigit(int number, int digit) {
        int length = String.valueOf(number).length();
        return String.format("%"+(digit-length)+"s", "") + number;
    }

    public static String getDigit(String str, int digit) {
        if(str == null) {
            return String.format("%" + digit +"s", "");
        }
        return String.format("%"+(digit-str.length())+"s", "") + str;
    }

    public static int wizard_lifeToHealth(int index) {
        return index - MAXSTAMINALOSE + wizard.maxStamina + 1;
    }

    public static int healthToWizard_life(int index) {
        return index + MAXSTAMINALOSE - wizard.maxStamina - 1;
    }

    public static double getWinrate() {
        int count = 0;
        for(int i = (wizard_life.length - wizard.maxStamina - 1); i < wizard_life.length; i++) {
            count += wizard_life[i];
        }
        return (float) count / (float) val;
    }

    public static void printLine(int step) {
        System.out.println("----------------------------------------");
        System.out.print((step == 1) ? "(*) " : "( ) ");
        System.out.print("Choose a profession | ");
        System.out.print((step == 2) ? "(*) " : "( ) ");
        System.out.print("Choose adversaries lineup | ");
        System.out.print((step == 3) ? "(*) " : "( ) ");
        System.out.print("Choose number of simulation | ");
        System.out.print((step == 4) ? "(*) " : "( ) ");
        System.out.print("Choose potion | fight | ");
        System.out.print((step == 5) ? "(*) " : "( ) ");
        System.out.println("Continue");
        System.out.print("    " + getProfession() + " | ");
        System.out.print("    " + getAdversaries() + " | ");
        System.out.print("    " + getParameter() + " | ");
        System.out.println("   " + getPotion());
        System.out.println("----------------------------------------");
    }

    public static String getProfession() {
        if(wizard == null) {
            return getDigit(null, 19);
        }
        return getDigit(wizard.name, 19);
    }

    public static String getAdversaries() {
        if(adversaries == null) {
            return getDigit(null, 25);
        }
        if(adversaries.length > 1) {
            return getDigit(adversaries[2].name + " lineup", 25);
        }
        return getDigit(adversaries[0].name, 25);
    }

    public static String getParameter() {
        if(val > 0) {
            return getDigit(val, 27);
        }
        return getDigit(null, 27);
    }

    public static String getPotion() {
        if(potion1 != null) {
            if(potion2 != null) {
                return getDigit(potion1.getName() + " + " + potion2.getName(), 14);
            } else {
                return getDigit(potion1.getName(), 14);
            }
        } else {
            if(potion2 != null) {
                return getDigit(potion2.getName(), 14);
            } else {
                return getDigit(null, 14);
            }
        }
    }

    public static String getProfession() {
        if(wizard == null) {
            return getDigit(null, 19);
        }
        return getDigit(wizard.name, 19);
    }

    public static String getAdversaries() {
        if(adversaries == null) {
            return getDigit(null, 25);
        }
        if(adversaries.length > 1) {
            return getDigit(adversaries[2].name + " lineup", 25);
        }
        return getDigit(adversaries[0].name, 25);
    }

    public static String getParameter() {
        if(val > 0) {
            return getDigit(val, 27);
        }
        return getDigit(null, 27);
    }

    public static String getPotion() {
        if(potion1 != null) {
            if(potion2 != null) {
                return getDigit(potion1.getName() + " + " + potion2.getName(), 14);
            } else {
                return getDigit(potion1.getName(), 14);
            }
        } else {
            if(potion2 != null) {
                return getDigit(potion2.getName(), 14);
            } else {
                return getDigit(null, 14);
            }
        }
    }

    public static void continu() {
        printLine(5);
        System.out.print("Continue ?\n" +
                "(0) fight again\n" +
                "(1) choose potion\n" +
                "(2) choose number of simulation\n" +
                "(3) choose adversaries lineup\n" +
                "(4) choose a profession\n" +
                "(q) quit\n" +
                "Enter a number between 0 and 4: ");
        switch (in.nextLine()) {
            case "0":
                fight();
                break;
            case "1":
                potion1 = null;
                potion2 = null;
                choosePotion();
                break;
            case "2":
                potion1 = null;
                potion2 = null;
                val = 0;
                chooseParameter();
                break;
            case "3":
                potion1 = null;
                potion2 = null;
                val = -1;
                adversaries = null;
                chooseAdversaries();
                break;
            case "4":
                potion1 = null;
                potion2 = null;
                val = -1;
                adversaries = null;
                wizard = null;
                chooseProfession();
                break;
            case "q":
            case "quit":
                return;
            default:
                continu();
                break;
        }
    }
}
