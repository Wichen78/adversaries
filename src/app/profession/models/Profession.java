package app.profession.models;

import java.util.Arrays;

public enum Profession {

    AUROR {
        @Override
        public String toString() {
            return "auror";
        }

        @Override
        public boolean isWizard() {
            return true;
        }
        },
    DARK_FORCES {
        @Override
        public String toString() {
            return "dark forces";
        }
        },
    PROFESSOR {
        @Override
        public String toString() {
            return "professor";
        }

        @Override
        public boolean isWizard() {
            return true;
        }
        },
    CURIOSITIES {
        @Override
        public String toString() {
            return "curiosities";
        }
        },
    MAGIZOOLOGIST {
        @Override
        public String toString() {
            return "magizoologist";
        }

        @Override
        public boolean isWizard() {
            return true;
        }
        },
    BEASTS {
        @Override
        public String toString() {
            return "beasts";
        }
        },
    NONE {
        @Override
        public String toString() {
            return "none";
        }
    };

    private static final int PROFESSION_NUMBER = 6;

    public static boolean isProficiency(Profession p, Profession q) {
        return (p.ordinal() + 1) % PROFESSION_NUMBER == q.ordinal();
    }

    public static Profession parseProfession(String newValue) {
        return Arrays.stream(Profession.values())
                .filter((profession -> profession.toString().equals(newValue.trim().toLowerCase())))
                .findAny()
                .orElse(null);
    }

    public boolean isWizard() {
        return false;
    }

}
