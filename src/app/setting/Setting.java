package app.setting;

import app.battle.Battle;
import app.person.models.Person;
import app.person.models.Wizard;
import app.person.services.PersonService;
import app.potion.services.PotionService;
import app.utils.Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Setting {

    public static int NUMBER_SIMULATION = 1_000;
    public static final Scanner in = new Scanner(System.in);

    private static final int MAX_CONCURRENT_THREAD = 1_000;

    private static Wizard wizard = PersonService.createWizard();
    private static List<Person> adversaries = Collections.emptyList();

    public static void startConfig() {
        check();
    }

    private static void check() {
        while ((!wizard.getPerson().getName().isBlank() || chooseProfession())
                && (!adversaries.isEmpty() || chooseAdversaries())) {
            continu();
        }
    }

    private static boolean chooseProfession() {
        wizard = PersonService.createWizard();
        Utils.printLine(wizard, adversaries, 1);
        System.out.print("Choose a profession:\n" +
                "(a) Auror 2/2 plans\n" +
                "(b) Auror 2/2 plans without DwD\n" +
                "(m) Magizoologist 2/2 plans\n" +
                "(p) Professor 2/2 plans\n" +
                "Enter a, b, m or p: ");
        switch (in.nextLine()) {
            case "a":
                wizard = PersonService.createAuror();
                break;
            case "b":
                wizard = PersonService.createAurorBis();
                break;
            case "m":
                wizard = PersonService.createMagi();
                break;
            case "p":
                wizard = PersonService.createProf();
                break;
            default:
                return chooseProfession();
        }
        return true;
    }

    private static boolean chooseAdversaries() {
        adversaries = Collections.emptyList();
        Utils.printLine(wizard, adversaries, 2);
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
                "Enter a number between 0 and 9: ");
        switch (in.nextLine()) {
            case "0":
                adversaries = SettingLineup.chooseDracoMalfoyLineup();
                break;
            case "1":
                adversaries = SettingLineup.chooseFenrirGreybackLineup();
                break;
            case "2":
                adversaries = SettingLineup.chooseGilderoyLockhartLineup();
                break;
            case "3":
                adversaries = SettingLineup.chooseSlytherinsBasiliskLineup();
                break;
            case "4":
                adversaries = SettingLineup.chooseAragogLineup();
                break;
            case "5":
                adversaries = SettingLineup.choosePeterPettigrewLineup();
                break;
            case "6":
                adversaries = SettingLineup.chooseAncientNorwegianRidgebackLineup();
                break;
            case "7":
                adversaries = SettingLineup.chooseAncientUkranianIronbellyLineup();
                break;
            case "8":
                adversaries = SettingLineup.chooseAncientHungarianHorntailLineup();
                break;
            case "9":
                adversaries = SettingLineup.chooseNarcissaMalfoyLineup();
                break;
            default:
                return chooseAdversaries();
        }
        return true;
    }

    private static boolean chooseParameter() {
        Utils.printLine(wizard, adversaries, 3);
        System.out.print("Choose number of simulation:\n" +
                "Enter a number between 1 and 1.000.000: ");
        try {
            int number = Integer.parseInt(in.nextLine());
            NUMBER_SIMULATION = Math.min(Math.max(number, 0), 1000000);
        } catch (NumberFormatException ignored) {
            return chooseParameter();
        }
        return true;
    }

    private static boolean choosePotion1() {
        wizard.resetPotions();
        Utils.printLine(wizard, adversaries, 4);
        System.out.print("Choose potion 1:\n" +
                "(n)   no exstimulo\n" +
                "(p)   potent      (6x)\n" +
                "(s)   strong      (5x)\n" +
                "(e)   exstimulo   (4x)\n" +
                "Enter a potion letter: ");
        switch (in.nextLine()) {
            case "n":
                break;
            case "p":
                wizard.getPotions().add(PotionService.getPotent());
                break;
            case "s":
                wizard.getPotions().add(PotionService.getStrong());
                break;
            case "e":
                wizard.getPotions().add(PotionService.getExstimulo());
                break;
            default:
                return choosePotion1();
        }
        return choosePotion2();
    }

    private static boolean choosePotion2() {
        Utils.printLine(wizard, adversaries, 4);
        System.out.print("Choose potion 2:\n" +
                "(n)    no wit\n" +
                "(w)    wit  (4x)\n" +
                "Enter a potion letter: ");
        switch (in.nextLine()) {
            case "n":
                break;
            case "w":
                wizard.getPotions().add(PotionService.getWit());
                break;
            default:
                return choosePotion2();
        }
        return true;
    }

    private static void fight() {
        Utils.printFIGHT();
        int numberOfThread = (NUMBER_SIMULATION < MAX_CONCURRENT_THREAD) ? 0 : MAX_CONCURRENT_THREAD;
        int numberOfIteration = NUMBER_SIMULATION / MAX_CONCURRENT_THREAD;
        int numberOfIterationRemaining = NUMBER_SIMULATION % MAX_CONCURRENT_THREAD;

        for (Person adversary : adversaries) {
            wizard.resetFightStats();
            ExecutorService service = null;
            var calls = new ArrayList<Callable<Boolean>>();
            try {
                service = Executors.newFixedThreadPool(NUMBER_SIMULATION);
                Callable<Boolean> call = () -> {
                    for (int i = 0; i < numberOfIteration; i++) {
                        Battle.battle(wizard.copy(), adversary.copy(), false);
                    }
                    return true;
                };

                Callable<Boolean> callRemainder = () -> {
                    for (int i = 0; i < numberOfIterationRemaining; i++) {
                        Battle.battle(wizard.copy(), adversary.copy(), NUMBER_SIMULATION == 1);
                    }
                    return true;
                };

                for (var i = 0; i < numberOfThread; i++) {
                    calls.add(call);
                }
                calls.add(callRemainder);

                service.invokeAll(calls);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                if (service != null) {
                    service.shutdown();
                }
            }
            try {
                if (service.awaitTermination(100, TimeUnit.SECONDS)) {
                    Utils.printStatistic(wizard, adversary);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void continu() {
        Utils.printLine(wizard, adversaries, 5);
        System.out.print("Continue ?\n" +
                "(0) fight\n" +
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
                choosePotion1();
                break;
            case "2":
                chooseParameter();
                break;
            case "3":
                chooseAdversaries();
                break;
            case "4":
                chooseProfession();
                break;
            case "q":
            case "quit":
                System.exit(0);
        }
    }
}
