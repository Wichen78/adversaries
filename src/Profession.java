public class Profession {

    public enum PROFESSION {MAG, BEA, AUR, DAR, PRO, CUR, NEU}

    /*
     * Mag -> Bea -> Aur -> Dar -> Pro -> Cur -> Mag
     * Neu neutral
     */

    public enum PROTEGOBONUS {AUR, ADV, NEU}
    public static final float protegobonusvalue = 0.2f;

    /*
     * ADV -> AUR
     */

    public enum PRECISIONBONUS {AUR, ADV, NEU}
    public static final float precisionbonusvalue = 0.25f;

    /*
     * AUR -> ADV
     */

    public enum DEFENSEBONUS {MAG, ADV, NEU}
    public static float defensebonusvalue = 0.2f;

    /*
     * ADV -> MAG
     */

    public enum BREACHDEFENSEBONUS {PRO, ADV, NEU}
    public static final float breachdefensebonusvalue = 0.3f;

    /*
     * PRO -> ADV
     */

    //Mag -> Bea -> Aur -> Dar -> Pro -> Cur -> Mag
    public static boolean isProficiency(PROFESSION p, PROFESSION q) {
        return (p == PROFESSION.MAG && q == PROFESSION.BEA ||
                p == PROFESSION.BEA && q == PROFESSION.AUR ||
                p == PROFESSION.AUR && q == PROFESSION.DAR ||
                p == PROFESSION.DAR && q == PROFESSION.PRO ||
                p == PROFESSION.PRO && q == PROFESSION.CUR ||
                p == PROFESSION.CUR && q == PROFESSION.MAG);
    }

    //AUR -> ADV
    public static boolean isPrecisionBonus(PRECISIONBONUS p, PRECISIONBONUS q) {
        return (p == PRECISIONBONUS.AUR && q == PRECISIONBONUS.ADV);
    }

    //ADV -> AUR
    public static boolean isProtegoBonus(PROTEGOBONUS p, PROTEGOBONUS q) {
        return (p == PROTEGOBONUS.ADV && q == PROTEGOBONUS.AUR);
    }

    //ADV -> MAG
    public static boolean isDefenseBonus(DEFENSEBONUS p, DEFENSEBONUS q) {
        return (p == DEFENSEBONUS.ADV && q == DEFENSEBONUS.MAG);
    }

    //PRO -> ADV
    public static boolean isBreachDefenseBonus(BREACHDEFENSEBONUS p, BREACHDEFENSEBONUS q) {
        return (p == BREACHDEFENSEBONUS.PRO && q == BREACHDEFENSEBONUS.ADV);
    }

}
