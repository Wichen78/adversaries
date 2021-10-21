package main.app.setting;

import main.app.person.models.Person;
import main.app.potion.models.Potion;
import main.app.profession.models.Profession;
import main.app.profession.models.Species;
import main.app.profession.services.ProfessionService;
import main.app.utils.Utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Custom {

    public static boolean edit(Person person) {
        while (true) {
            Utils.printH133();
            System.out.print(person +
                    "\n( q) quit\n" +
                    "Choose the parameter to modify: ");
            switch (Setting.in.nextLine()) {
                case "0":
                    person.setName(editName(person.getName()));
                    break;
                case "1":
                    person.setMaxStamina(editStamina(person.getMaxStamina()));
                    break;
                case "2":
                    person.setPower(editPower(person.getPower()));
                    break;
                case "3":
                    person.setProtegoPower(editProtego(person.getProtegoPower()));
                    break;
                case "4":
                    person.setPrecision(editPrecision(person.getPrecision()));
                    break;
                case "5":
                    person.setCriticalPower(editCriticalPower(person.getCriticalPower()));
                    break;
                case "6":
                    person.setProficiencyPower(editProficiency(person.getProficiencyPower()));
                    break;
                case "7":
                    person.setDeficiencyPower(editDeficiency(person.getDeficiencyPower()));
                    break;
                case "8":
                    person.setDefense(editDefense(person.getDefense()));
                    break;
                case "9":
                    person.setDefenseBreach(editDefenseBreach(person.getDefenseBreach()));
                    break;
                case "10":
                    person.setAccuracy(editAccuracy(person.getAccuracy()));
                    break;
                case "11":
                    person.setDodge(editDodge(person.getDodge()));
                    break;
                case "12":
                    person.setProfession(editProfession(person.getProfession()));
                    break;
                case "13":
                    person.setSpecies(editSpecies(person.getSpecies()));
                    break;
                case "q":
                case "quit":
                    return true;
            }
        }
    }

    public static boolean edit(List<Person> adversaries) {
        Utils.printH133();
        var index = 0;
        for (var person : adversaries) {
            System.out.printf("(%d) %s%n", index++, person.getName());
        }
        System.out.printf("Choose a number between 0 and %d: ", index - 1);
        var newValue = Setting.in.nextLine();
        try {
            var value = Integer.parseInt(newValue);
            if (value >= 0 && value < index) {
                Utils.printSUCCESS();
                return edit(adversaries.get(value));
            }
        } catch (NumberFormatException ignored) {}
        Utils.printFAIL();
        return edit(adversaries);
    }

    public static boolean editPotion(Potion potion) {
        while (true) {
            Utils.printH133();
            System.out.print(potion +
                    "\n( q) quit\n" +
                    "Choose the parameter to modify: ");
            switch (Setting.in.nextLine()) {
                case "0":
                    potion.setName(editName(potion.getName()));
                    break;
                case "1":
                    potion.setPower(editPower(potion.getPower()));
                    break;
                case "2":
                    var charge = editCharge(potion.getMaxCharge());
                    potion.setCharge(charge);
                    potion.setMaxCharge(charge);
                    break;
                case "q":
                case "quit":
                    return true;
            }
        }
    }

    public static boolean editPotions(Set<Potion> potions) {
        Utils.printH133();
        var index = 0;
        for (var potion : potions) {
            System.out.printf("(%d) %s%n", index++, potion.getName());
        }
        System.out.printf("Choose a number between 0 and %d: ", index - 1);
        var newValue = Setting.in.nextLine();
        try {
            var value = Integer.parseInt(newValue);
            if (value >= 0 && value < index) {
                Utils.printSUCCESS();
                return editPotion((Potion) potions.toArray()[value]);
            }
        } catch (NumberFormatException ignored) {}
        Utils.printFAIL();
        return editPotions(potions);
    }

    private static int editInt(String name, int oldValue) {
        return editInt(name, oldValue, 0, 1_000);
    }

    private static int editInt(String name, int oldValue, int minValue, int maxValue) {
        System.out.printf("%n%s: %d%nChoose a number between %d and %d excluded (default %d): ", name, oldValue, minValue, maxValue, oldValue);
        var newValue = Setting.in.nextLine();
        try {
            var value = Integer.parseInt(newValue);
            if (value > minValue && value < maxValue) {
                Utils.printSUCCESS();
                return value;
            }
        } catch (NumberFormatException ignored) {}
        Utils.printFAIL();
        return oldValue;
    }

    private static double editDouble(String name, double oldValue) {
        return editDouble(name, oldValue, 0, 10);
    }

    private static double editDouble(String name, double oldValue, double minValue, double maxValue) {
        System.out.printf("%n%s: %f%nChoose a number between %f and %f excluded (default %f): ", name, oldValue, minValue, maxValue, oldValue);
        var newValue = Setting.in.nextLine();
        try {
            var value = Double.parseDouble(newValue);
            if (value > minValue && value < maxValue) {
                Utils.printSUCCESS();
                return value;
            }
        } catch (NumberFormatException ignored) {}
        Utils.printFAIL();
        return oldValue;
    }

    static String editName(String oldName) {
        System.out.printf("%nname: %s%nChoose new name (default %s): ", oldName, oldName);
        var newName = Setting.in.nextLine();
        if (newName == null || newName.isBlank()) {
            Utils.printFAIL();
            return oldName;
        }
        Utils.printSUCCESS();
        return newName;
    }

    static int editStamina(int oldStamina) {
        return editInt("stamina", oldStamina, 0, 1_000_000);
    }

    static double editPower(double oldPower) {
        return editDouble("power", oldPower, 0, 1_000);
    }

    static double editProtego(double oldProtego) {
        return editDouble("protego", oldProtego);
    }

    static double editPrecision(double oldPrecision) {
        return editDouble("precision", oldPrecision);
    }

    static double editCriticalPower(double oldCriticalPower) {
        return editDouble("critical power", oldCriticalPower);
    }

    static double editProficiency(double oldProficiency) {
        return editDouble("proficiency", oldProficiency);
    }

    static double editDeficiency(double oldDeficiency) {
        return editDouble("deficiency", oldDeficiency);
    }

    static double editDefense(double oldDefense) {
        return editDouble("defense", oldDefense);
    }

    static double editDefenseBreach(double oldDefenseBreach) {
        return editDouble("defense breach", oldDefenseBreach);
    }

    static double editAccuracy(double oldAccuracy) {
        return editDouble("accuracy", oldAccuracy);
    }

    static double editDodge(double oldDodge) {
        return editDouble("dodge", oldDodge);
    }

    static Profession editProfession(Profession oldProfession) {
        System.out.printf("%nold profession: %s%nlist of all professions:%n%s%nChoose a profession (default %s): ", oldProfession, ProfessionService.allProfession(), oldProfession);
        var newValue = Setting.in.nextLine();
        var value = ProfessionService.parseProfession(newValue);
        if (value == null) {
            Utils.printFAIL();
            return oldProfession;
        }
        Utils.printSUCCESS();
        return value;
    }

    static Set<Species> editSpecies(Set<Species> oldSpecies) {
        var speciesStr = oldSpecies.stream().map(Enum::toString).collect(Collectors.joining(", "));
        System.out.printf("%nold species: %s%n", speciesStr);
        System.out.print("Choose an action:\n" +
                "(0) clear species\n" +
                "(1) add species\n" +
                "(q) quit\n" +
                "Enter 0 or 1: ");
        switch (Setting.in.nextLine()) {
            case "0":
                Utils.printSUCCESS();
                return editSpecies(Set.of());
            case "1":
                return addSpecies(oldSpecies);
            case "q":
            case "quit":
                return oldSpecies;
            default:
                Utils.printFAIL();
                return editSpecies(oldSpecies);
        }
    }

    static Set<Species> addSpecies(Set<Species> oldSpecies) {
        var speciesStr = oldSpecies.stream().map(Enum::toString).collect(Collectors.joining(", "));
        Utils.printH133();
        System.out.printf("old species: %s%nlist of all scpecies:%n%s%nChoose a specie (default %s): ", speciesStr, ProfessionService.allSpecies(), speciesStr);
        var newValue = Setting.in.nextLine();
        var value = ProfessionService.parseSpecies(newValue);
        if (value != null) {
            try {
                oldSpecies.add(value);
            } catch (UnsupportedOperationException e) {
                oldSpecies = new HashSet<>(oldSpecies);
                oldSpecies.add(value);
            }
            Utils.printSUCCESS();
        } else {
            Utils.printFAIL();
        }
        return oldSpecies;
    }

    static int editCharge(int oldCharge) {
        return editInt("charge", oldCharge);
    }

}
