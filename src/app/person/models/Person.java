package app.person.models;

import app.profession.models.Profession;
import app.profession.models.Species;

import java.util.Set;

public interface Person {

    String getName();
    void setName(String name);

    int getStamina();
    void setStamina(int stamina);
    void decreaseStamina(int stamina);

    int getMaxStamina();
    void setMaxStamina(int maxStamina);

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

    double getBonusDodge();
    void setBonusDodge(double bonusDodge);

    double getBonusPrecisionFeared();
    void setBonusPrecisionFeared(double bonusPrecisionFeared);

    double getBonusPower50();
    void setBonusPower50(double bonusPower50);

    double getBonusDefense50();
    void setBonusDefense50(double bonusDefense50);

    double getBonusPrecisionFirst();
    void setBonusPrecisionFirst(double bonusPrecisionFirst);

    double getBonusCriticalPowerFirst();
    void setBonusCriticalPowerFirst(double bonusCriticalPowerFirst);

    Profession getProfession();
    void setProfession(Profession profession);

    Set<Species> getSpecies();
    void setSpecies(Set<Species> species);

    Person copy();
}
