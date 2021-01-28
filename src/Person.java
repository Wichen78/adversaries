public class Person {

    public String name;
    public int maxStamina,currentStamina;
    public float power, protego, precision, critpower, proficiency, deficiency,
            defense, breachdefense, accuracy, dodge;
    public float bonusprecisionfirst, bonuscritpowerfirst, bonuspower50, bonusdefense50;
    public Profession.PRECISIONBONUS precisionbonus;
    public Profession.PROFESSION profession;
    public Profession.PROTEGOBONUS protegobonus;
    public Profession.DEFENSEBONUS defensebonus;
    public Profession.BREACHDEFENSEBONUS breachdefensebonus;

    private Person() {}

    public void resetStamina() {
        this.currentStamina = this.maxStamina;
    }

    // WIZARD

    public static Person createAuror() {
        Person p = new Person();
        p.name =                "Auror";
        p.maxStamina =          296;
        p.currentStamina =      296;
        p.power =               100;
        p.protego =             0.35f;
        p.precision =           0.85f;
        p.critpower =           1.2f;
        p.proficiency =         1.48f;
        p.deficiency =          0.5f;
        p.defense =             0.39f;
        p.breachdefense =       0.32f;
        p.accuracy =            0.15f;
        p.dodge =               0.5f;
        p.bonusprecisionfirst = 0.35f; //does not work 0.35f;
        p.bonuscritpowerfirst = 0.5f;
        p.bonuspower50 =        10;
        p.bonusdefense50 =      0.1f;
        p.precisionbonus =      Profession.PRECISIONBONUS.AUR;
        p.profession =          Profession.PROFESSION.AUR;
        p.protegobonus =        Profession.PROTEGOBONUS.AUR;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createMagi() {
        Person p = new Person();
        p.name =                "Magizoologist";
        p.maxStamina =          525;
        p.currentStamina =      525;
        p.power =               109;
        p.protego =             0.49f;
        p.precision =           0.70f;
        p.critpower =           0.98f;
        p.proficiency =         1.48f;
        p.deficiency =          0.6f;
        p.defense =             0.71f;
        p.breachdefense =       0.22f;
        p.accuracy =            0.2f;
        p.dodge =               0.5f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.MAG;
        p.protegobonus =        Profession.PROTEGOBONUS.NEU;
        p.defensebonus =        Profession.DEFENSEBONUS.MAG;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createProf() {
        Person p = new Person();
        p.name =                "Professor";
        p.maxStamina =          397;
        p.currentStamina =      397;
        p.power =               96;
        p.protego =             0.45f;
        p.precision =           0.73f;
        p.critpower =           1.11f;
        p.proficiency =         1.5f;
        p.deficiency =          0.5f;
        p.defense =             0.59f;
        p.breachdefense =       0.15f;
        p.accuracy =            0.32f;
        p.dodge =               0.5f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.PRO;
        p.protegobonus =        Profession.PROTEGOBONUS.NEU;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.PRO;
        return p;
    }

    // LINEUP 0 to 4

    public static Person[] createDracoMalfoyLineup() {
        return new Person[]{createCommonSerpent(), createImposingDarkWizard(), createDracoMalfoy()};
    }

    public static Person[] createFenrirGreybackLineup() {
        return new Person[]{createImposingSnatcher(), createDangerousWerewolf(), createFenrirGreyback()};
    }

    public static Person[] createGilderoyLockhartLineup() {
        return new Person[]{createCommonPixie(), createDangerousPixie(), createGilderoyLockhart()};
    }

    public static Person[] createSlytherinsBasiliskLineup() {
        return new Person[]{createFormidableSerpent(), createFierceAcromantula(), createSlytherinsBasilisk()};
    }

    public static Person[] createAragogLineup() {
        return new Person[]{createCommonAcromantula(), createFierceAcromantula2(), createAragog()};
    }

    // ADVERSARIES 0 to 4

    public static Person createCommonSerpent() {
        Person p = new Person();
        p.name =                "Common Serpent";
        p.maxStamina =          188;
        p.currentStamina =      188;
        p.power =               16;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0.505f;
        p.deficiency =          0.75f;
        p.defense =             0.25f;
        p.breachdefense =       0.2f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.BEA;
        p.protegobonus =        Profession.PROTEGOBONUS.NEU;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createImposingDarkWizard() {
        Person p = new Person();
        p.name =                "Imposing Dark Wizard";
        p.maxStamina =          763;
        p.currentStamina =      763;
        p.power =               49;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0.50f;
        p.deficiency =          0.76f;
        p.defense =             0.4f;
        p.breachdefense =       0.25f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.DAR;
        p.protegobonus =        Profession.PROTEGOBONUS.ADV;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createDracoMalfoy() {
        Person p = new Person();
        p.name =                "Draco Malfoy";
        p.maxStamina =          1635;
        p.currentStamina =      1635;
        p.power =               80;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0;
        p.deficiency =          0;
        p.defense =             0.5f;
        p.breachdefense =       0.2f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.NEU;
        p.protegobonus =        Profession.PROTEGOBONUS.ADV;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createImposingSnatcher() {
        Person p = new Person();
        p.name =                "Imposing Snatcher";
        p.maxStamina =          206;
        p.currentStamina =      206;
        p.power =               18;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0.50f;
        p.deficiency =          0.75f;
        p.defense =             0.25f;
        p.breachdefense =       0.2f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.CUR;
        p.protegobonus =        Profession.PROTEGOBONUS.ADV;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createDangerousWerewolf() {
        Person p = new Person();
        p.name =                "Dangerous Werewolf";
        p.maxStamina =          802;
        p.currentStamina =      802;
        p.power =               51;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0.50f;
        p.deficiency =          0.76f;
        p.defense =             0.4f;
        p.breachdefense =       0.2f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.CUR;
        p.protegobonus =        Profession.PROTEGOBONUS.NEU;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.ADV;
        return p;
    }

    public static Person createFenrirGreyback() {
        Person p = new Person();
        p.name =                "Fenrir Greyback";
        p.maxStamina =          1693;
        p.currentStamina =      1693;
        p.power =               83;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0;
        p.deficiency =          0;
        p.defense =             0.5f;
        p.breachdefense =       0.25f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.NEU;
        p.protegobonus =        Profession.PROTEGOBONUS.ADV;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createCommonPixie() {
        Person p = new Person();
        p.name =                "Common Pixie";
        p.maxStamina =          337;
        p.currentStamina =      337;
        p.power =               23;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0.50f;
        p.deficiency =          0.75f;
        p.defense =             0.25f;
        p.breachdefense =       0.2f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.CUR;
        p.protegobonus =        Profession.PROTEGOBONUS.NEU;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createDangerousPixie() {
        Person p = new Person();
        p.name =                "Dangerous Pixie";
        p.maxStamina =          842;
        p.currentStamina =      842;
        p.power =               53;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0.50f;
        p.deficiency =          0.76f;
        p.defense =             0.4f;
        p.breachdefense =       0.2f;
        p.accuracy =            0.2f;
        p.dodge =               0.25f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.CUR;
        p.protegobonus =        Profession.PROTEGOBONUS.NEU;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createGilderoyLockhart() {
        Person p = new Person();
        p.name =                "Gilderoy Lockhart";
        p.maxStamina =          1750;
        p.currentStamina =      1750;
        p.power =               112;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0;
        p.deficiency =          0;
        p.defense =             0.5f;
        p.breachdefense =       0.2f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.NEU;
        p.protegobonus =        Profession.PROTEGOBONUS.ADV;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createFormidableSerpent() {
        Person p = new Person();
        p.name =                "Formidable Serpent";
        p.maxStamina =          486;
        p.currentStamina =      486;
        p.power =               30;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0.50f;
        p.deficiency =          0.75f;
        p.defense =             0.25f;
        p.breachdefense =       0.2f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.BEA;
        p.protegobonus =        Profession.PROTEGOBONUS.NEU;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createFierceAcromantula() {
        Person p = new Person();
        p.name =                "Fierce Acromantula";
        p.maxStamina =          1382;
        p.currentStamina =      1382;
        p.power =               67;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0.50f;
        p.deficiency =          0.76f;
        p.defense =             0.4f;
        p.breachdefense =       0.25f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.BEA;
        p.protegobonus =        Profession.PROTEGOBONUS.NEU;
        p.defensebonus =        Profession.DEFENSEBONUS.ADV;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createSlytherinsBasilisk() {
        Person p = new Person();
        p.name =                "Slytherins Basilisk";
        p.maxStamina =          2411;
        p.currentStamina =      2411;
        p.power =               119;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0;
        p.deficiency =          0;
        p.defense =             0.5f;
        p.breachdefense =       0.2f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.NEU;
        p.protegobonus =        Profession.PROTEGOBONUS.NEU;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createCommonAcromantula() {
        Person p = new Person();
        p.name =                "Common Acromantula";
        p.maxStamina =          486;
        p.currentStamina =      486;
        p.power =               28;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0.50f;
        p.deficiency =          0.76f;
        p.defense =             0.25f;
        p.breachdefense =       0.2f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.BEA;
        p.protegobonus =        Profession.PROTEGOBONUS.NEU;
        p.defensebonus =        Profession.DEFENSEBONUS.ADV;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createFierceAcromantula2() {
        Person p = new Person();
        p.name =                "Fierce Acromantula";
        p.maxStamina =          1382;
        p.currentStamina =      1382;
        p.power =               62;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0.50f;
        p.deficiency =          0.76f;
        p.defense =             0.4f;
        p.breachdefense =       0.25f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.BEA;
        p.protegobonus =        Profession.PROTEGOBONUS.NEU;
        p.defensebonus =        Profession.DEFENSEBONUS.ADV;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createAragog() {
        Person p = new Person();
        p.name =                "Aragog";
        p.maxStamina =          2411;
        p.currentStamina =      2411;
        p.power =               115;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0;
        p.deficiency =          0;
        p.defense =             0.5f;
        p.breachdefense =       0.2f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.NEU;
        p.protegobonus =        Profession.PROTEGOBONUS.ADV;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    // LINEUP 5 to 9

    public static Person[] createPeterPettigrewLineup() {
        return new Person[]{createFormidableDarkWizard(), createViciousDeathEater(), createPeterPettigrew()};
    }

    public static Person[] createAncientNorwegianRidgebackLineup() {
        return new Person[]{createCommonTroll(), createCerberus(), createAncientNorwegianRidgeback()};
    }

    public static Person[] createAncientUkranianIronbellyLineup() {
        return new Person[]{createFormidablePoacher(), createViciousMummy(), createAncientUkranianIronbelly()};
    }

    public static Person[] createAncientHungarianHorntailLineup() {
        return new Person[]{createFormidableAcromantula(), createSphinx(), createAncientHungarianHorntail()};
    }

    public static Person[] createNarcissaMalfoyLineup() {
        return new Person[]{createFormidableSnatcher(), createDarkWitch(), createNarcissaMalfoy()};
    }

    // ADVERSARIES 5 to 9

    public static Person createFormidableDarkWizard() {
        Person p = new Person();
        p.name =                "Formidable Dark Wizard";
        p.maxStamina =          559;
        p.currentStamina =      559;
        p.power =               33;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0.50f;
        p.deficiency =          0.76f;
        p.defense =             0.25f;
        p.breachdefense =       0.2f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.DAR;
        p.protegobonus =        Profession.PROTEGOBONUS.ADV;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createViciousDeathEater() {
        Person p = new Person();
        p.name =                "Vicious Death Eater";
        p.maxStamina =          1512;
        p.currentStamina =      1512;
        p.power =               70;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0.50f;
        p.deficiency =          0.76f;
        p.defense =             0.4f;
        p.breachdefense =       0.2f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.ADV;
        p.profession =          Profession.PROFESSION.DAR;
        p.protegobonus =        Profession.PROTEGOBONUS.NEU;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createPeterPettigrew() {
        Person p = new Person();
        p.name =                "Peter Pettigrew";
        p.maxStamina =          2565;
        p.currentStamina =      2565;
        p.power =               122;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0;
        p.deficiency =          0;
        p.defense =             0.4f;
        p.breachdefense =       0.2f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.NEU;
        p.protegobonus =        Profession.PROTEGOBONUS.ADV;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createCommonTroll() {
        Person p = new Person();
        p.name =                "Common Troll";
        p.maxStamina =          807;
        p.currentStamina =      807;
        p.power =               41;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0.50f;
        p.deficiency =          0.75f;
        p.defense =             0.25f;
        p.breachdefense =       0.25f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.CUR;
        p.protegobonus =        Profession.PROTEGOBONUS.ADV;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createCerberus() {
        Person p = new Person();
        p.name =                "Cerberus";
        p.maxStamina =          1576;
        p.currentStamina =      1576;
        p.power =               73;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0.50f;
        p.deficiency =          0.76f;
        p.defense =             0.4f;
        p.breachdefense =       0.3f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.BEA;
        p.protegobonus =        Profession.PROTEGOBONUS.NEU;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createAncientNorwegianRidgeback() {
        Person p = new Person();
        p.name =                "Ancient Norwegian Ridgeback";
        p.maxStamina =          2587;
        p.currentStamina =      2587;
        p.power =               122;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0;
        p.deficiency =          0;
        p.defense =             0.5f;
        p.breachdefense =       0.5f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.NEU;
        p.protegobonus =        Profession.PROTEGOBONUS.ADV;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createFormidablePoacher() {
        Person p = new Person();
        p.name =                "Formidable Poacher";
        p.maxStamina =          860;
        p.currentStamina =      860;
        p.power =               44;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0.50f;
        p.deficiency =          0.76f;
        p.defense =             0.25f;
        p.breachdefense =       0.2f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.DAR;
        p.protegobonus =        Profession.PROTEGOBONUS.NEU;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.ADV;
        return p;
    }

    public static Person createViciousMummy() {
        Person p = new Person();
        p.name =                "Vicious Mummy";
        p.maxStamina =          1641;
        p.currentStamina =      1641;
        p.power =               76;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0.50f;
        p.deficiency =          0.75f;
        p.defense =             0.5f;
        p.breachdefense =       0.2f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.CUR;
        p.protegobonus =        Profession.PROTEGOBONUS.ADV;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createAncientUkranianIronbelly() {
        Person p = new Person();
        p.name =                "Ancient Ukranian Ironbelly";
        p.maxStamina =          2606;
        p.currentStamina =      2606;
        p.power =               122;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0;
        p.deficiency =          0;
        p.defense =             0.7f;
        p.breachdefense =       0.2f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.NEU;
        p.protegobonus =        Profession.PROTEGOBONUS.ADV;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createFormidableAcromantula() {
        Person p = new Person();
        p.name =                "Formidable Acromantula";
        p.maxStamina =          912;
        p.currentStamina =      912;
        p.power =               46;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0.50f;
        p.deficiency =          0.75f;
        p.defense =             0.25f;
        p.breachdefense =       0.25f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.BEA;
        p.protegobonus =        Profession.PROTEGOBONUS.NEU;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createSphinx() {
        Person p = new Person();
        p.name =                "Sphinx";
        p.maxStamina =          1706;
        p.currentStamina =      1706;
        p.power =               79;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0.50f;
        p.deficiency =          0.76f;
        p.defense =             0.4f;
        p.breachdefense =       0.2f;
        p.accuracy =            0.2f;
        p.dodge =               0.2f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.CUR;
        p.protegobonus =        Profession.PROTEGOBONUS.NEU;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createAncientHungarianHorntail() {
        Person p = new Person();
        p.name =                "Ancient Hungarian Horntail";
        p.maxStamina =          2625;
        p.currentStamina =      2625;
        p.power =               122;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0;
        p.deficiency =          0;
        p.defense =             0.4f;
        p.breachdefense =       0.4f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.NEU;
        p.protegobonus =        Profession.PROTEGOBONUS.NEU;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createFormidableSnatcher() {
        Person p = new Person();
        p.name =                "Formidable Snatcher";
        p.maxStamina =          965;
        p.currentStamina =      965;
        p.power =               49;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0.50f;
        p.deficiency =          0.75f;
        p.defense =             0.25f;
        p.breachdefense =       0.2f;
        p.accuracy =            0.2f;
        p.dodge =               0f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.CUR;
        p.protegobonus =        Profession.PROTEGOBONUS.ADV;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createDarkWitch() {
        Person p = new Person();
        p.name =                "Dark Witch";
        p.maxStamina =          1771;
        p.currentStamina =      1771;
        p.power =               86;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0.50f;
        p.deficiency =          0.76f;
        p.defense =             0.4f;
        p.breachdefense =       0.2f;
        p.accuracy =            0.2f;
        p.dodge =               0.2f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.DAR;
        p.protegobonus =        Profession.PROTEGOBONUS.ADV;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

    public static Person createNarcissaMalfoy() {
        Person p = new Person();
        p.name =                "Narcissa Malfoy";
        p.maxStamina =          2642;
        p.currentStamina =      2642;
        p.power =               125;
        p.protego =             0;
        p.precision =           0;
        p.critpower =           0;
        p.proficiency =         0;
        p.deficiency =          0;
        p.defense =             0.5f;
        p.breachdefense =       0.2f;
        p.accuracy =            0.2f;
        p.dodge =               0.4f;
        p.bonuscritpowerfirst = 0;
        p.bonuscritpowerfirst = 0;
        p.bonuspower50 =        0;
        p.bonusdefense50 =      0;
        p.precisionbonus =      Profession.PRECISIONBONUS.NEU;
        p.profession =          Profession.PROFESSION.NEU;
        p.protegobonus =        Profession.PROTEGOBONUS.ADV;
        p.defensebonus =        Profession.DEFENSEBONUS.NEU;
        p.breachdefensebonus =  Profession.BREACHDEFENSEBONUS.NEU;
        return p;
    }

}
