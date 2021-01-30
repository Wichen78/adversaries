public class Battle {

    private static float multi_attack = 0.166f;

    public static int[] battle(Person p, Person q, boolean verbose, Potion p1, Potion p2) {
        int count_wiz = 0;
        while(q.currentStamina > 0) {
            //Attaque phase

            //p not dodge
            do {
                if (Math.random() > (q.dodge - p.accuracy)) {
                    if(verbose) {
                        System.out.println("me : " + p.currentStamina + ",      adv : " + q.currentStamina);
                        System.out.print("                   ");
                    }
                    q.currentStamina = q.currentStamina - damage(p, q, isCritical(p, q), verbose, p1, p2);
                } else {
                    if(verbose) {
                        System.out.println("me : " + p.currentStamina + ",      adv : " + q.currentStamina);
                        System.out.println("               adv dodge");
                    }
                }
                count_wiz++;
                if (q.currentStamina < 0)
                    return new int[]{p.currentStamina, q.currentStamina, count_wiz};
            }while(Math.random() < multi_attack);

            //Defense phase

            //this not dodge
            do {
                if (Math.random() > (p.dodge - q.accuracy)) {
                    if(verbose) {
                        System.out.println("me : " + p.currentStamina + ",      adv : " + q.currentStamina);
                        System.out.print("    ");
                    }
                    p.currentStamina = p.currentStamina - damage(q, p, isCritical(q, p), verbose, null, null);
                } else {
                    if(verbose) {
                        System.out.println("me dodge");
                        System.out.println("me : " + p.currentStamina + ",      adv : " + q.currentStamina);
                    }
                }
            }while(Math.random() < multi_attack);
        }
        return new int[]{p.currentStamina, q.currentStamina, count_wiz};
    }


    public static int damage(Person p, Person q, boolean crit, boolean verbose, Potion p1, Potion p2) {
        float basedamage = getPower(p, q) * getProficiency(p, q) * getDefense(p, q) * getProtego(p, q) * getPotion(p1, p2);
        double value;
        if(crit) {
            if (q.maxStamina == q.currentStamina) {
                value = Math.ceil(basedamage * (1 + p.critpower + p.bonuscritpowerfirst));
                if(verbose)
                    System.out.println("-" + value);
                return (int) value;
            } else {
                value = Math.ceil(basedamage * (1 + p.critpower));
                if(verbose)
                    System.out.println("-" + value);
                return (int) value;
            }
        }
        value = Math.ceil(basedamage);
        if(verbose)
            System.out.println("-" + value);
        return (int) value;
    }

    public static float getPower(Person p, Person q) {
        if(q.currentStamina >= q.maxStamina/2) {
            return p.power;
        } else {
            return p.power + p.bonuspower50;
        }
    }

    public static float getProficiency(Person p, Person q) {
        if(Profession.isProficiency(p.profession, q.profession)) {
            return Math.max(1 + p.proficiency - q.deficiency, 1);
        } else {
            return 1;
        }
    }

    public static float getDefense(Person p, Person q) {
        float defense = (Profession.isDefenseBonus(p.defensebonus, q.defensebonus)) ? (q.defense + Profession.defensebonusvalue) : (q.defense);
        float breachdefense = (Profession.isBreachDefenseBonus(p.breachdefensebonus, q.breachdefensebonus)) ? (p.breachdefense + Profession.breachdefensebonusvalue) : (p.breachdefense);
        if(p.currentStamina >= p.maxStamina/2) {
            return Math.min(1 - defense + breachdefense, 1);
        } else {
            return Math.min(1 - defense - q.bonusdefense50 + breachdefense, 1);
        }
    }

    public static float getProtego(Person p, Person q) {
        if(Profession.isProtegoBonus(p.protegobonus, q.protegobonus)) {
            return 1 - q.protego - Profession.protegobonusvalue;
        } else {
            return 1 - q.protego;
        }
    }

    public static float getPotion(Potion p1, Potion p2) {
        if(p1 != null && p1.isActif()) {
            if(p2 != null && p2.isActif()) {
                p1.useCharge();
                p2.useCharge();
                return (1 + p1.getPower_bonus() + p2.getPower_bonus());
            } else {
                p1.useCharge();
                return (1 + p1.getPower_bonus());
            }
        } else {
            if(p2 != null && p2.isActif()) {
                p2.useCharge();
                return (1 + p2.getPower_bonus());
            } else {
                return 1;
            }
        }
    }

    public static boolean isCritical(Person p, Person q) {
        float bonus = (Profession.isPrecisionBonus(p.precisionbonus, q.precisionbonus)) ? Profession.precisionbonusvalue : 0;
        if(q.currentStamina == q.maxStamina) {
            return (Math.random() < (p.bonusprecisionfirst + p.precision + bonus));
        } else {
            return (Math.random() < (p.precision + bonus));
        }
    }

}
