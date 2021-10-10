package app.potion.models;

public interface Potion {

    String getName();
    void setName(String name);

    double getPower();
    void setPower(double power);

    int getCharge();
    void setCharge(int charge);

    int getMaxCharge();
    void setMaxCharge(int maxCharge);

    void useCharge();
    boolean isActif();

    Potion copy();
}
