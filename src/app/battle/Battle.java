package app.battle;

import app.person.models.Person;
import app.person.models.Wizard;
import app.potion.models.Potion;
import app.profession.services.ProfessionService;
import app.utils.Utils;

import java.util.Collections;
import java.util.List;

public class Battle {

    public static final double multi_attack = 0.2;

    public static void battle(Wizard wizard, Person person, boolean verbose) {
        int energy_used = 0;
        while(person.getStamina() > 0) {
            // Attaque phase
            if (verbose) {
                System.out.printf("me : %s,%sadv : %s%n",
                        Utils.getDigit(wizard.getPerson().getStamina(), 10),
                        Utils.getDigit(null, 10),
                        Utils.getDigit(person.getStamina(), 10));
            }

            do {
                if (isDodged(wizard.getPerson(), person)) {
                    if (verbose) {
                        System.out.printf("%sadv dodge%n",
                                Utils.getDigit(null, 33));
                    }
                } else {
                    if (verbose) {
                        System.out.printf("%s",
                                Utils.getDigit(null, 32));
                    }
                    person.decreaseStamina(damage(wizard.getPerson(), person, wizard.getPotions(), verbose));
                }
                energy_used++;
                if (person.getStamina() < 0) {
                    wizard.incrementLifeRemaining(wizard.getPerson().getStamina());
                    wizard.incrementEnergyUsed(energy_used);
                    return;
                }
            } while(Math.random() < multi_attack);

            // Defense phase
            if (verbose) {
                System.out.printf("me : %s,%sadv : %s%n",
                        Utils.getDigit(wizard.getPerson().getStamina(), 10),
                        Utils.getDigit(null, 10),
                        Utils.getDigit(person.getStamina(), 10));
            }

            do {
                if (isDodged(person, wizard.getPerson())) {
                    if (verbose) {
                        System.out.println("       me dodge");
                    }
                } else {
                    if (verbose) {
                        System.out.print("     ");
                    }
                    wizard.getPerson().decreaseStamina(damage(person, wizard.getPerson(), Collections.emptyList(), verbose));
                }
            } while(Math.random() < multi_attack);
        }
    }

    static int damage(Person p, Person q, List<Potion> potions, boolean verbose) {
        double baseDamage = getPower(p, q) * getProficiency(p, q) * getDefense(p, q) * getProtego(p, q) * getPotion(potions);
        double criticalPower = isCritical(p, q)
                ? p.getCriticalPower()
                : 0;
        double criticalPowerFirst = (q.getStamina() == q.getMaxStamina())
                ? p.getBonusCriticalPowerFirst()
                : 0;
        int damage = (int) Math.ceil(baseDamage * (1 + criticalPower + criticalPowerFirst));
        if (verbose) {
            System.out.printf("%s%n",
                    Utils.getDigit(-damage, 10));
        }
        return damage;
    }

    static double getPower(Person p, Person q) {
        double bonusPower50 = (q.getStamina() < q.getMaxStamina()/2)
                ? p.getBonusPower50()
                : 0;
        return p.getPower() + bonusPower50;
    }

    static double getPotion(List<Potion> potions) {
        return 1 + potions.stream()
                .filter(Potion::isActif)
                .mapToDouble(potion -> {
                    potion.useCharge();
                    return potion.getPower();
                }).sum();
    }

    static double getProficiency(Person p, Person q) {
        double proficiency = (ProfessionService.isProficiency(p.getProfession(), q.getProfession()))
                ? p.getProficiencyPower() - q.getDeficiencyPower()
                : 0;
        return 1 + Math.max(proficiency, 0);
    }

    static boolean isCritical(Person p, Person q) {
        double bonusPrecision = ProfessionService.getPrecisionBonus(p.getProfession(), q.getSpecies());
        double bonusPrecisionFirst = (q.getStamina() == q.getMaxStamina())
                ? p.getBonusPrecisionFirst()
                : 0;
        return (Math.random() < (p.getPrecision() + bonusPrecision + bonusPrecisionFirst));
    }

    static double getProtego(Person p, Person q) {
        double bonusProtego = ProfessionService.getProtegoBonus(p.getSpecies(), q.getProfession());
        return Math.max(1 - q.getProtegoPower() - bonusProtego, 0);
    }

    static double getDefense(Person p, Person q) {
        double bonusDefense = ProfessionService.getDefenseBonus(p.getSpecies(), q.getProfession());
        double bonusBreachDefense = ProfessionService.getBreachDefenseBonus(p.getProfession(), q.getSpecies());
        double bonusDefense50 = (q.getStamina() < q.getMaxStamina()/2)
                ? q.getBonusDefense50()
                : 0;
        return Math.min(Math.max(1 - q.getDefense() - bonusDefense - bonusDefense50 + p.getDefenseBreach() + bonusBreachDefense, 0), 1);
    }

    static boolean isDodged(Person p, Person q) {
        double bonusAccuracyLethal = ProfessionService.getAccuracyLethalBonus(p.getProfession(), q.getSpecies());
        return Math.random() < (q.getBonusDodge() - p.getAccuracy() - bonusAccuracyLethal);
    }

}
