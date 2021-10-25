package main.app.person.models;

import main.app.profession.models.Profession;
import main.app.profession.models.Species;

import java.util.Set;

public interface Person {

    String getName();
    void setName(String name);

    int getStamina();
    void setStamina(int stamina);
    void decreaseStamina(int stamina);

    int getMaxStamina();
    void setMaxStamina(int maxStamina);
    boolean isFullStamina();

    double getPower();
    void setPower(double power);

    double getProtegoPower();
    void setProtegoPower(double protegoPower);

    double getPrecision();
    void setPrecision(double precision);

    double getCriticalPower();
    void setCriticalPower(double criticalPower);

    double getProficiencyPower();
    void setProficiencyPower(double proficiencyPower);

    double getDeficiencyPower();
    void setDeficiencyPower(double deficiencyPower);

    double getDefense();
    void setDefense(double defense);

    double getDefenseBreach();
    void setDefenseBreach(double defenseBreach);

    double getAccuracy();
    void setAccuracy(double accuracy);

    double getDodge();
    void setDodge(double dodge);

    Profession getProfession();
    void setProfession(Profession profession);

    Set<Species> getSpecies();
    void setSpecies(Set<Species> species);

    Person copy();
}
