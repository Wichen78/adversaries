package main.app.utils;

import main.app.person.models.Person;
import main.app.person.models.Wizard;
import main.app.potion.models.Potion;
import main.app.setting.Setting;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Utils {

    public static void printH133() {
        System.out.printf("%n%s%n", "-".repeat(133));
    }

    public static void printSUCCESS() {
        System.out.println("SUCCESS");
    }

    public static void printFAIL() {
        System.out.println("FAIL");
    }

    public static void printLine(Wizard wizard, List<Person> adversaries, int step) {
        printH133();
        System.out.print((step == 1) ? "  (*) " : "  ( ) ");
        System.out.print("Choose a profession | ");
        System.out.print((step == 2) ? " (*) " : " ( ) ");
        System.out.print("Choose adversaries lineup  | ");
        System.out.print((step == 3) ? "(*) " : "( ) ");
        System.out.print("Choose number of simulation | ");
        System.out.print((step == 4) ? "(*) " : "( ) ");
        System.out.print("Choose potion | fight | ");
        System.out.print((step == 5) ? "(*) " : "( ) ");
        System.out.println("Continue");
        System.out.print(getProfession(wizard) + " | ");
        System.out.print(getAdversaries(adversaries) + " | ");
        System.out.print(getParameter() + " | ");
        System.out.print(getPotion(wizard.getPotions()));
        printH133();
    }

    public static String getDigit(int number, int digit) {
        var space = Math.max(digit - String.valueOf(number).length(), 0);
        if (space > 0) {
            return String.format("%" + space + "s%d", "", number);
        }
        return String.format("%d", number).substring(0, digit);
    }

    public static String getDigit(String str, int digit) {
        if (str == null) {
            return String.format("%"+digit+"s", "");
        }
        int space = Math.max(digit - str.length(), 0);
        if (space > 0) {
            return String.format("%" + space + "s%s", "", str);
        }
        return str.substring(0, digit);
    }

    public static void printStatistic(Wizard wizard, Person person) {
        var accNumberSimulation = 0;
        printH133();
        System.out.printf("%s against %s: %s%n",
                wizard.getPerson().getName(),
                person.getName(),
                getPotion(wizard.getPotions()));

        for (var entry : wizard.getLife_remaining().entrySet()) {
            accNumberSimulation += entry.getValue();
            System.out.printf("> %s %s: %sx %s: %s%n",
                    getDigit(entry.getKey(), 10),
                    getDigit("health", 10),
                    getDigit(entry.getValue(), 10),
                    getDigit("sum rate", 10),
                    getDigit(String.valueOf((double) accNumberSimulation / (double) Setting.NUMBER_SIMULATION), 10)
            );
        }
        System.out.printf("total %d%n", accNumberSimulation);

        System.out.println();
        accNumberSimulation = 0;
        for (var entry : wizard.getEnergy_used().entrySet()) {
            accNumberSimulation += entry.getValue();
            System.out.printf("> %s %s: %sx %s: %s%n",
                    getDigit(entry.getKey(), 10),
                    getDigit("energies", 10),
                    getDigit(entry.getValue(), 10),
                    getDigit("sum rate", 10),
                    getDigit(String.valueOf((double) accNumberSimulation / (double) Setting.NUMBER_SIMULATION), 10)
            );
        }
        System.out.printf("total %d%n", accNumberSimulation);

        System.out.printf("%n%s against %s: %s%n",
                wizard.getPerson().getName(),
                person.getName(),
                getPotion(wizard.getPotions()));

        System.out.printf("average remaining health:  %s / %s%n" +
                        "average energies    used:  %s%n" +
                        "             win    rate:  %s%n",
                getDigit(String.valueOf((double) wizard.getSumLifeRemaining() / (double) Setting.NUMBER_SIMULATION), 10),
                wizard.getPerson().getMaxStamina(),
                getDigit(String.valueOf((double) wizard.getSumEnergyUsed() / (double) Setting.NUMBER_SIMULATION), 10),
                getDigit(String.valueOf(getWinRate(wizard)), 10)
        );
    }

    public static Set<Potion> copy(Set<Potion> list) {
        var copy = new HashSet<Potion>();
        for (var elem : list) {
            copy.add(elem.copy());
        }
        return copy;
    }

    public static void printFIGHT() {
        printH133();
        System.out.println(" _____   ___    ____   _   _   _____ \n" +
                "|  ___| |_ _|  / ___| | | | | |_   _|\n" +
                "| |_     | |  | |  _  | |_| |   | |  \n" +
                "|  _|    | |  | |_| | |  _  |   | |  \n" +
                "|_|     |___|  \\____| |_| |_|   |_|  \n"
        );
    }

    static String getProfession(Wizard wizard) {
        if (wizard != null && wizard.getPerson() != null) {
            return getDigit(wizard.getPerson().getName(), 25);
        }
        return getDigit(null, 25);
    }

    static String getAdversaries(List<Person> adversaries) {
        if (adversaries == null || adversaries.size() == 0) {
            return getDigit(null, 31);
        }
        return getDigit(
                String.format("%s (%d)",
                        adversaries.get(adversaries.size() - 1).getName(),
                        adversaries.size()),
                31);
    }

    static String getParameter() {
        if (Setting.NUMBER_SIMULATION > 0) {
            return getDigit(Setting.NUMBER_SIMULATION, 31);
        }
        return getDigit(null, 31);
    }

    public static String getPotion(Set<Potion> potions) {
        if (potions == null || potions.size() == 0) {
            return getDigit(null, 17);
        }
        return getDigit(
                potions
                        .stream().filter(Potion::isActive)
                        .map((Potion::getName))
                        .collect(Collectors.joining(" + ")),
                17);
    }

    static double getWinRate(Wizard wizard) {
        return wizard
                .getLife_remaining()
                .entrySet()
                .stream().filter((entry) -> entry.getKey() > 0)
                .mapToDouble(Map.Entry::getValue)
                .sum()
                / Setting.NUMBER_SIMULATION;
    }


}
