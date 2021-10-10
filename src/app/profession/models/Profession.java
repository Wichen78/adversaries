package app.profession.models;

public enum Profession {

    AUROR {
        @Override
        public boolean isWizard() {
            return true;
        }
    },
    DARK_FORCES,
    PROFESSOR {
        @Override
        public boolean isWizard() {
            return true;
        }
    },
    CURIOSITIES,
    MAGIZOOLOGIST {
        @Override
        public boolean isWizard() {
            return true;
        }
    },
    BEASTS,
    NONE;

    private static final int PROFESSION_NUMBER = 6;

    public static boolean isProficiency(Profession p, Profession q) {
        return (p.ordinal() + 1) % PROFESSION_NUMBER == q.ordinal();
    }

    public boolean isWizard() {
        return false;
    }

}
