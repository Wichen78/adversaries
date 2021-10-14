package app.person.models;

import app.potion.models.Potion;

import java.util.Map;
import java.util.Set;

public interface Wizard {

    Person getPerson();
    void setPerson(Person person);

    Map<Integer, Integer> getLife_remaining();
    void setLife_remaining(Map<Integer, Integer> life_remaining);

    Map<Integer, Integer> getEnergy_used();
    void setEnergy_used(Map<Integer, Integer> energy_used);

    Set<Potion> getPotions();
    void setPotions(Set<Potion> potions);
    void resetPotions();

    int getSumLifeRemaining();
    void incrementLifeRemaining(Integer key);

    int getSumEnergyUsed();
    void incrementEnergyUsed(Integer key);

    Wizard copy();
    void resetFightStats();
    boolean edit();
}
