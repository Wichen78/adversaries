package main.app.battle;

import main.app.person.models.Person;
import main.app.person.models.Wizard;
import main.app.potion.models.Potion;
import main.app.profession.services.ProfessionService;
import main.app.utils.Utils;

import java.util.Collections;
import java.util.Set;

public class Battle {

    public static final double multi_attack = 0.2;

    public static boolean isPossible(Wizard wizard, Person person) {
        return damage(wizard.getPerson(), person, wizard.getPotions()) > 0;
    }

    public static void battle(Wizard wizard, Person person, boolean verbose) {
        var energy_used = 0;
        while(person.getStamina() > 0) {
            // Attaque phase
            if (verbose) {
                System.out.printf("me : %s,%sadv : %s%n",
                        Utils.getDigit(wizard.getPerson().getStamina(), 10),
                        Utils.getDigit(null, 10),
                        Utils.getDigit(person.getStamina(), 10));
            }

            do {
                var potions = "";
                if (verbose) {
                    potions = Utils.getPotion(wizard.getPotions());
                }
                var damage = damage(wizard.getPerson(), person, wizard.getPotions());
                if (isDodged(wizard.getPerson(), person)) {
                    if (verbose) {
                        System.out.printf("%sadv dodge %s%n",
                                Utils.getDigit(null, 33),
                                Utils.getDigit(potions, 20));
                    }
                } else {
                    if (verbose) {
                        System.out.printf("%s%s %s%n",
                                Utils.getDigit(null, 32),
                                Utils.getDigit(-damage, 10),
                                Utils.getDigit(potions, 20));
                    }
                    person.decreaseStamina(damage);
                }
                energy_used++;
                if (person.getStamina() <= 0) {
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
                var damage = damage(person, wizard.getPerson(), Collections.emptySet());
                if (isDodged(person, wizard.getPerson())) {
                    if (verbose) {
                        System.out.println("       me dodge");
                    }
                } else {
                    if (verbose) {
                        System.out.printf("     %s%n",
                                Utils.getDigit(-damage, 10));
                    }
                    wizard.getPerson().decreaseStamina(damage);
                }
            } while(Math.random() < multi_attack);
        }

        // never happens
        wizard.incrementLifeRemaining(wizard.getPerson().getStamina());
        wizard.incrementEnergyUsed(energy_used);
    }

    public static int damage(Person p, Person q, Set<Potion> potions) {
        var baseDamage = getPower(p, q)
                * getCriticalPower(p, q)
                * getProficiency(p, q) // proficiency - deficiency
                * getDefense(p, q) // defense - breach defense
                * getProtego(p, q)
                * getPotion(potions);
        var damage = (int) Math.ceil(baseDamage);
        if (damage < 0) {
            System.out.println("ERROR: DAMAGE IS NEGATIVE");
            System.exit(1);
        }
        return damage;
    }

    static double getPower(Person p, Person q) {
        var bonusPower = ProfessionService.getPowerBonus(p, q);
        return p.getPower() + bonusPower;
    }

    static double getCriticalPower(Person p, Person q) {
        var bonusCriticalPower = (isCritical(p, q)
                ? p.getCriticalPower() + ProfessionService.getCriticalPowerBonus(p, q)
                : 0);
        return 1 + bonusCriticalPower;
    }

    static double getPotion(Set<Potion> potions) {
        var bonusPotion = potions.stream()
                .filter(Potion::isActif)
                .mapToDouble(potion -> {
                    potion.useCharge();
                    return potion.getPower();
                }).sum();
        return 1 + bonusPotion;
    }

    static double getProficiency(Person p, Person q) {
        var proficiency = (ProfessionService.isProficiency(p.getProfession(), q.getProfession()))
                ? Math.max(p.getProficiencyPower() - q.getDeficiencyPower(), 0)
                : 0;
        return 1 + proficiency;
    }

    static double getProtego(Person p, Person q) {
        var bonusProtego = ProfessionService.getProtegoBonus(p, q);
        return 1 - Math.min(q.getProtegoPower() + bonusProtego, 1);
    }

    static double getDefense(Person p, Person q) {
        var bonusDefense = ProfessionService.getDefenseBonus(p, q);
        var bonusDefenseBreach = ProfessionService.getDefenseBreachBonus(p, q);
        return 1 - Math.min(Math.max(q.getDefense() + bonusDefense - p.getDefenseBreach() - bonusDefenseBreach, 0), 1);
    }

    static boolean isDodged(Person p, Person q) {
        var bonusDodge = ProfessionService.getDodgeBonus(p, q);
        var bonusAccuracy = ProfessionService.getAccuracyBonus(p, q);
        return Math.random() < (q.getDodge() + bonusDodge - p.getAccuracy() - bonusAccuracy);
    }

    static boolean isCritical(Person p, Person q) {
        var bonusPrecision = ProfessionService.getPrecisionBonus(p, q);
        return Math.random() < (p.getPrecision() + bonusPrecision);
    }

}
