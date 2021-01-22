public class Battle {

    private static float multi_attack = 0.166f;

    //for potion usage
    static float bonus_power_potion1 = 0f;
    static float bonus_power_potion2 = 0f;
    static int bonus_hit_potion1 = 0;
    static int bonus_hit_potion2 = 0;


    public static int[] battle(Person p, Person q, boolean verbose) {
        int count = 0;
        float power = p.power; //for potion
        while(q.currentStamina > 0) {
            //Attaque phase

            //p not dodge
            do {
                if (Math.random() > (q.dodge - p.accuracy)) {
                    if(verbose) {
                        System.out.println("me : " + p.currentStamina + ",      adv : " + q.currentStamina);
                        System.out.print("                   ");
                    }
                    p.power = powerWithPotion(p);
                    q.currentStamina = q.currentStamina - damage(p, q, isCritical(p, q), verbose);
                    p.power = power;
                } else {
                    if(verbose)
                        System.out.println("               adv dodge");
                }
                count++;
                if (q.currentStamina < 0)
                    return new int[]{p.currentStamina, q.currentStamina, count};
            }while(Math.random() < multi_attack);

            //Defense phase

            //this not dodge
            do {
                if (Math.random() > (p.dodge - q.accuracy)) {
                    if(verbose) {
                        System.out.println("me : " + p.currentStamina + ",      adv : " + q.currentStamina);
                        System.out.print("    ");
                    }
                    p.currentStamina = p.currentStamina - damage(q, p, isCritical(q, p), verbose);
                } else {
                    if(verbose)
                        System.out.println("me dodge");
                }
            }while(Math.random() < multi_attack);
        }
        return new int[]{p.currentStamina, q.currentStamina, count};
    }


    public static int damage(Person p, Person q, boolean crit, boolean verbose) {
        float basedamage = getPower(p, q) * getProficiency(p, q) * getDefense(p, q) * getProtego(p, q);
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

    public static float powerWithPotion(Person p) {
        if(bonus_hit_potion1 > 0) {
            if(bonus_hit_potion2 > 0) {
                bonus_hit_potion1--;
                bonus_hit_potion2--;
                return p.power * (1 + bonus_power_potion1 + bonus_power_potion2);
            } else {
                bonus_hit_potion1--;
                return p.power * (1 + bonus_power_potion1);
            }
        } else {
            if(bonus_hit_potion2 > 0) {
                bonus_hit_potion2--;
                return p.power * (1 + bonus_power_potion2);
            } else {
                return p.power;
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
