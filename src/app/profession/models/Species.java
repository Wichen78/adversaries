package app.profession.models;

public enum Species {

    AUROR,
    PROFESSOR,
    MAGIZOOLOGIST,
    FEARED_ADV,
    LETHAL_ADV,
    DARK_WIZARD {
        @Override
        public Profession getProfession() {
            return Profession.DARK_FORCES;
        }
    },
    DEATH_EATER {
        @Override
        public Profession getProfession() {
            return Profession.DARK_FORCES;
        }
    },
    POACHER {
        @Override
        public Profession getProfession() {
            return Profession.DARK_FORCES;
        }
    },
    DARK_WITCH {
        @Override
        public Profession getProfession() {
            return Profession.DARK_FORCES;
        }
    },
    PIXIE {
        @Override
        public Profession getProfession() {
            return Profession.CURIOSITIES;
        }
    },
    WEREWOLF {
        @Override
        public Profession getProfession() {
            return Profession.CURIOSITIES;
        }
    },
    SNATCHER {
        @Override
        public Profession getProfession() {
            return Profession.CURIOSITIES;
        }
    },
    TROLL {
        @Override
        public Profession getProfession() {
            return Profession.CURIOSITIES;
        }
    },
    MUMMY {
        @Override
        public Profession getProfession() {
            return Profession.CURIOSITIES;
        }
    },
    SPHINX {
        @Override
        public Profession getProfession() {
            return Profession.CURIOSITIES;
        }
    },
    ACROMANTULA {
        @Override
        public Profession getProfession() {
            return Profession.BEASTS;
        }
    },
    ERKLINGS {
        @Override
        public Profession getProfession() {
            return Profession.BEASTS;
        }
    },
    SERPENT {
        @Override
        public Profession getProfession() {
            return Profession.BEASTS;
        }
    },
    THREE_HEADED_DOD {
        @Override
        public Profession getProfession() {
            return Profession.BEASTS;
        }
    },
    NONE;

    public Profession getProfession() {
        return Profession.NONE;
    }
}
