package app.potion.models;

public class PotionImpl implements Potion {

    private String name;
    private double power;
    private int charge,
            maxCharge;

    private PotionImpl() {}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
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
    public int getCharge() {
        return charge;
    }

    @Override
    public void setCharge(int charge) {
        this.charge = charge;
    }

    @Override
    public int getMaxCharge() {
        return maxCharge;
    }

    @Override
    public void setMaxCharge(int maxCharge) {
        this.maxCharge = maxCharge;
    }

    public void useCharge() {
        this.charge--;
    }

    public boolean isActif() {
        return this.charge > 0;
    }

    @Override
    public Potion copy(){
        return PotionImpl.builder()
                .withName(this.name)
                .withPower(this.power)
                .withCharge(this.charge)
                .withMaxCharge(this.maxCharge)
                .build();
    }

    public static PotionImplBuilder builder() {
        return new PotionImplBuilder();
    }

    public static final class PotionImplBuilder {
        private final PotionImpl potionImpl;

        private PotionImplBuilder() {
            potionImpl = new PotionImpl();
        }

        public PotionImplBuilder withName(String name) {
            potionImpl.setName(name);
            return this;
        }

        public PotionImplBuilder withPower(double power) {
            potionImpl.setPower(power);
            return this;
        }

        public PotionImplBuilder withCharge(int charge) {
            potionImpl.setCharge(charge);
            return this;
        }

        public PotionImplBuilder withMaxCharge(int maxCharge) {
            potionImpl.setMaxCharge(maxCharge);
            return this;
        }

        public PotionImpl build() {
            return potionImpl;
        }
    }
}
