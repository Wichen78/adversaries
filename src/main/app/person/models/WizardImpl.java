package main.app.person.models;

import main.app.potion.models.Potion;
import main.app.setting.Custom;
import main.app.utils.Utils;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;

public class WizardImpl implements Wizard {

    private Person person;
    private Map<Integer, Integer> life_remaining;
    private Map<Integer, Integer> energy_used;
    private Set<Potion> potions;

    private WizardImpl() {
        this.person = PersonImpl.builder().build();
        this.life_remaining = new ConcurrentSkipListMap<>();
        this.energy_used = new ConcurrentSkipListMap<>();
        this.potions = new HashSet<>();
    }

    @Override
    public Person getPerson() {
        return person;
    }

    @Override
    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public Map<Integer, Integer> getLife_remaining() {
        return life_remaining;
    }

    @Override
    public void setLife_remaining(Map<Integer, Integer> life_remaining) {
        this.life_remaining = life_remaining;
    }

    @Override
    public Map<Integer, Integer> getEnergy_used() {
        return energy_used;
    }

    @Override
    public void setEnergy_used(Map<Integer, Integer> energy_used) {
        this.energy_used = energy_used;
    }

    @Override
    public Set<Potion> getPotions() {
        return potions;
    }

    @Override
    public void setPotions(Set<Potion> potions) {
        this.potions = potions;
    }

    @Override
    public void resetPotions() {
        this.potions = new HashSet<>();
    }

    @Override
    public int getSumLifeRemaining() {
        return this.life_remaining
                .entrySet()
                .stream().mapToInt((entry) -> entry.getKey() * entry.getValue())
                .sum();
    }

    @Override
    public void incrementLifeRemaining(Integer key) {
        this.life_remaining.compute(key, (k, v) -> (v == null) ? 1 : v + 1);
    }

    @Override
    public int getSumEnergyUsed() {
        return this.energy_used
                .entrySet()
                .stream().mapToInt((entry) -> entry.getKey() * entry.getValue())
                .sum();
    }

    @Override
    public void incrementEnergyUsed(Integer key) {
        this.energy_used.compute(key, (k, v) -> (v == null) ? 1 : v + 1);
    }

    @Override
    public Wizard copy() {
        return WizardImpl.builder()
                .withPerson(this.person.copy())
                .withLife_remaining(this.life_remaining)
                .withEnergy_used(this.energy_used)
                .withPotions(Utils.copy(this.potions))
                .build();
    }

    @Override
    public void resetFightStats() {
        this.life_remaining = new ConcurrentSkipListMap<>();
        this.energy_used = new ConcurrentSkipListMap<>();
    }

    @Override
    public boolean edit() {
        return Custom.edit(this.getPerson());
    }

    public static WizardImplBuilder builder() {
        return new WizardImplBuilder();
    }

    public static final class WizardImplBuilder {
        private final WizardImpl wizardImpl;

        private WizardImplBuilder() {
            wizardImpl = new WizardImpl();
        }

        public WizardImplBuilder withPerson(Person person) {
            wizardImpl.setPerson(person);
            return this;
        }

        public WizardImplBuilder withLife_remaining(Map<Integer, Integer> life_remaining) {
            wizardImpl.setLife_remaining(life_remaining);
            return this;
        }

        public WizardImplBuilder withEnergy_used(Map<Integer, Integer> energy_used) {
            wizardImpl.setEnergy_used(energy_used);
            return this;
        }

        public WizardImplBuilder withPotions(Set<Potion> potions) {
            wizardImpl.setPotions(potions);
            return this;
        }

        public WizardImpl build() {
            return wizardImpl;
        }
    }
}
