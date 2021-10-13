package app.person.models;

import app.profession.models.Profession;
import app.profession.models.Species;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PersonImpl implements Person {

    private String name;
    private int stamina,
            maxStamina;
    private double power;
    private double protegoPower;
    private double precision;
    private double criticalPower;
    private double proficiencyPower;
    private double deficiencyPower;
    private double defense;
    private double defenseBreach;
    private double accuracy;
    private double dodge;
    private Profession profession;
    private Set<Species> species;

    private PersonImpl() {
        this.name = "";
        this.stamina = 0;
        this.maxStamina = 0;
        this.power = 0;
        this.protegoPower = 0;
        this.precision = 0;
        this.criticalPower = 0;
        this.proficiencyPower = 0;
        this.deficiencyPower = 0;
        this.defense = 0;
        this.defenseBreach = 0;
        this.accuracy = 0;
        this.dodge = 0;
        this.profession = Profession.NONE;
        this.species = new HashSet<>();
    }

    @Override
    public String toString() {
        return "\n( 0) name: " + this.getName() +
                "\n( 1) stamina: " + this.getMaxStamina() +
                "\n( 2) power: " + this.getPower() +
                "\n( 3) protego: " + this.getProtegoPower() +
                "\n( 4) precision: " + this.getPrecision() +
                "\n( 5) critical power: " + this.getCriticalPower() +
                "\n( 6) proficiency: " + this.getProficiencyPower() +
                "\n( 7) deficiency: " + this.getDeficiencyPower() +
                "\n( 8) defense: " + this.getDefense() +
                "\n( 9) defense breach: " + this.getDefenseBreach() +
                "\n(10) accuracy: " + this.getAccuracy() +
                "\n(11) dodge: " + this.getDodge() +
                "\n(12) profession: " + this.getProfession() +
                "\n(13) list species: "  + this.getSpecies().stream().map((Enum::toString)).collect(Collectors.joining(", "));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getStamina() {
        return stamina;
    }

    @Override
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public void decreaseStamina(int stamina) {
        this.stamina -= stamina;
    }

    @Override
    public int getMaxStamina() {
        return maxStamina;
    }

    @Override
    public void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }

    @Override
    public boolean isFullStamina() {
        return this.stamina == this.maxStamina;
    }

    @Override
    public double getPower() {
        return power;
    }

    @Override
    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public double getProtegoPower() {
        return protegoPower;
    }

    @Override
    public void setProtegoPower(double protegoPower) {
        this.protegoPower = protegoPower;
    }

    @Override
    public double getPrecision() {
        return precision;
    }

    @Override
    public void setPrecision(double precision) {
        this.precision = precision;
    }

    @Override
    public double getCriticalPower() {
        return criticalPower;
    }

    @Override
    public void setCriticalPower(double criticalPower) {
        this.criticalPower = criticalPower;
    }

    @Override
    public double getProficiencyPower() {
        return proficiencyPower;
    }

    @Override
    public void setProficiencyPower(double proficiencyPower) {
        this.proficiencyPower = proficiencyPower;
    }

    @Override
    public double getDeficiencyPower() {
        return deficiencyPower;
    }

    @Override
    public void setDeficiencyPower(double deficiencyPower) {
        this.deficiencyPower = deficiencyPower;
    }

    @Override
    public double getDefense() {
        return defense;
    }

    @Override
    public void setDefense(double defense) {
        this.defense = defense;
    }

    @Override
    public double getDefenseBreach() {
        return defenseBreach;
    }

    @Override
    public void setDefenseBreach(double defenseBreach) {
        this.defenseBreach = defenseBreach;
    }

    @Override
    public double getAccuracy() {
        return accuracy;
    }

    @Override
    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public double getDodge() {
        return dodge;
    }

    @Override
    public void setDodge(double dodge) {
        this.dodge = dodge;
    }

    @Override
    public Profession getProfession() {
        return profession;
    }

    @Override
    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    @Override
    public Set<Species> getSpecies() {
        return species;
    }

    @Override
    public void setSpecies(Set<Species> species) {
        this.species = species;
    }

    @Override
    public Person copy() {
        return PersonImpl
                .builder()
                .withName(this.name)
                .withStamina(this.maxStamina)
                .withMaxStamina(this.maxStamina)
                .withPower(this.power)
                .withProtegoPower(this.protegoPower)
                .withPrecision(this.precision)
                .withCriticalPower(this.criticalPower)
                .withProficiencyPower(this.proficiencyPower)
                .withDeficiencyPower(this.deficiencyPower)
                .withDefense(this.defense)
                .withDefenseBreach(this.defenseBreach)
                .withAccuracy(this.accuracy)
                .withDodge(this.dodge)
                .withProfession(this.profession)
                .withSpecies(this.species)
                .build();
    }

    public static PersonImplBuilder builder() {
        return new PersonImplBuilder();
    }

    public static final class PersonImplBuilder {
        private final PersonImpl personImpl;

        private PersonImplBuilder() {
            personImpl = new PersonImpl();
        }

        public PersonImplBuilder withName(String name) {
            personImpl.setName(name);
            return this;
        }

        public PersonImplBuilder withStamina(int stamina) {
            personImpl.setStamina(stamina);
            return this;
        }

        public PersonImplBuilder withMaxStamina(int maxStamina) {
            personImpl.setMaxStamina(maxStamina);
            return this;
        }

        public PersonImplBuilder withPower(double power) {
            personImpl.setPower(power);
            return this;
        }

        public PersonImplBuilder withProtegoPower(double protegoPower) {
            personImpl.setProtegoPower(protegoPower);
            return this;
        }

        public PersonImplBuilder withPrecision(double precision) {
            personImpl.setPrecision(precision);
            return this;
        }

        public PersonImplBuilder withCriticalPower(double criticalPower) {
            personImpl.setCriticalPower(criticalPower);
            return this;
        }

        public PersonImplBuilder withProficiencyPower(double proficiencyPower) {
            personImpl.setProficiencyPower(proficiencyPower);
            return this;
        }

        public PersonImplBuilder withDeficiencyPower(double deficiencyPower) {
            personImpl.setDeficiencyPower(deficiencyPower);
            return this;
        }

        public PersonImplBuilder withDefense(double defense) {
            personImpl.setDefense(defense);
            return this;
        }

        public PersonImplBuilder withDefenseBreach(double defenseBreach) {
            personImpl.setDefenseBreach(defenseBreach);
            return this;
        }

        public PersonImplBuilder withAccuracy(double accuracy) {
            personImpl.setAccuracy(accuracy);
            return this;
        }

        public PersonImplBuilder withDodge(double dodge) {
            personImpl.setDodge(dodge);
            return this;
        }

        public PersonImplBuilder withProfession(Profession profession) {
            personImpl.setProfession(profession);
            return this;
        }

        public PersonImplBuilder withSpecies(Set<Species> species) {
            personImpl.setSpecies(species);
            return this;
        }

        public PersonImpl build() {
            return personImpl;
        }
    }
}
