package main.app.profession.models;

import java.util.Arrays;

public enum Species {

    AUROR {
        @Override
        public String toString() {
            return "auror";
        }
        },
    PROFESSOR {
        @Override
        public String toString() {
            return "professor";
        }
        },
    MAGIZOOLOGIST {
        @Override
        public String toString() {
            return "magizoologist";
        }
        },
    FEARED_ADV {
        @Override
        public String toString() {
            return "feared";
        }
        },
    LETHAL_ADV {
        @Override
        public String toString() {
            return "lethal";
        }
        },
    DARK_WIZARD {
        @Override
        public String toString() {
            return "dark wizard";
        }

        @Override
        public Profession getProfession() {
            return Profession.DARK_FORCES;
        }
        },
    DEATH_EATER {
        @Override
        public String toString() {
            return "death eater";
        }

        @Override
        public Profession getProfession() {
            return Profession.DARK_FORCES;
        }
        },
    POACHER {
        @Override
        public String toString() {
            return "poacher";
        }

        @Override
        public Profession getProfession() {
            return Profession.DARK_FORCES;
        }
        },
    DARK_WITCH {
        @Override
        public String toString() {
            return "dark witch";
        }

        @Override
        public Profession getProfession() {
            return Profession.DARK_FORCES;
        }
        },
    PIXIE {
        @Override
        public String toString() {
            return "pixie";
        }

        @Override
        public Profession getProfession() {
            return Profession.CURIOSITIES;
        }
        },
    WEREWOLF {
        @Override
        public String toString() {
            return "werewolf";
        }

        @Override
        public Profession getProfession() {
            return Profession.CURIOSITIES;
        }
        },
    SNATCHER {
        @Override
        public String toString() {
            return "snatcher";
        }

        @Override
        public Profession getProfession() {
            return Profession.CURIOSITIES;
        }
        },
    TROLL {
        @Override
        public String toString() {
            return "troll";
        }

        @Override
        public Profession getProfession() {
            return Profession.CURIOSITIES;
        }
        },
    MUMMY {
        @Override
        public String toString() {
            return "mummy";
        }

        @Override
        public Profession getProfession() {
            return Profession.CURIOSITIES;
        }
        },
    SPHINX {
        @Override
        public String toString() {
            return "sphinx";
        }

        @Override
        public Profession getProfession() {
            return Profession.CURIOSITIES;
        }
        },
    ACROMANTULA {
        @Override
        public String toString() {
            return "acromantula";
        }

        @Override
        public Profession getProfession() {
            return Profession.BEASTS;
        }
        },
    ERKLINGS {
        @Override
        public String toString() {
            return "erklings";
        }

        @Override
        public Profession getProfession() {
            return Profession.BEASTS;
        }
        },
    SERPENT {
        @Override
        public String toString() {
            return "serpent";
        }

        @Override
        public Profession getProfession() {
            return Profession.BEASTS;
        }
        },
    THREE_HEADED_DOG {
        @Override
        public String toString() {
            return "three headed dog";
        }

        @Override
        public Profession getProfession() {
            return Profession.BEASTS;
        }
        },
    NONE {
        @Override
        public String toString() {
            return "none";
        }
    };

    public static Species parseSpecies(String newValue) {
        return Arrays.stream(Species.values())
            .filter((specie -> specie.toString().equals(newValue.trim().toLowerCase())))
            .findAny()
            .orElse(null);
    }

    public Profession getProfession() {
        return Profession.NONE;
    }
}
