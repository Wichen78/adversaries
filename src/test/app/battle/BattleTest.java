package test.app.battle;

import main.app.battle.Battle;
import main.app.person.models.Person;
import main.app.person.services.PersonService;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class BattleTest {

    private static final Person[] adversaries;

    static {
        adversaries = new Person[]{
                // Draco Malfoy
                PersonService.DracoMalfoyLineup.createCommonSerpent(),
                PersonService.DracoMalfoyLineup.createImposingDarkWizard(),
                PersonService.DracoMalfoyLineup.createDracoMalfoy(),
                // Fenrir Greyback
                PersonService.FenrirGreybackLineup.createImposingSnatcher(),
                PersonService.FenrirGreybackLineup.createDangerousWerewolf(),
                PersonService.FenrirGreybackLineup.createFenrirGreyback(),
                // Gilderoy Lockhart
                PersonService.GilderoyLockhartLineup.createCommonPixie(),
                PersonService.GilderoyLockhartLineup.createDangerousPixie(),
                PersonService.GilderoyLockhartLineup.createGilderoyLockhart(),
                // Slytherins Basilisk
                PersonService.SlytherinsBasiliskLineup.createFormidableSerpent(),
                PersonService.SlytherinsBasiliskLineup.createFierceAcromantula(),
                PersonService.SlytherinsBasiliskLineup.createSlytherinsBasilisk(),
                // Aragog
                PersonService.AragogLineup.createCommonAcromantula(),
                PersonService.AragogLineup.createFierceAcromantula(),
                PersonService.AragogLineup.createAragog(),
                // Peter Pettigrew
                PersonService.PeterPettigrewLineup.createFormidableDarkWizard(),
                PersonService.PeterPettigrewLineup.createViciousDeathEater(),
                PersonService.PeterPettigrewLineup.createPeterPettigrew(),
                // Ancient Norwegian Ridgeback
                PersonService.AncientNorwegianRidgebackLineup.createCommonTroll(),
                PersonService.AncientNorwegianRidgebackLineup.createThreeHeadedDog(),
                PersonService.AncientNorwegianRidgebackLineup.createAncientNorwegianRidgeback(),
                // Ancient Ukranian Ironbelly
                PersonService.AncientUkranianIronbellyLineup.createFormidablePoacher(),
                PersonService.AncientUkranianIronbellyLineup.createViciousMummy(),
                PersonService.AncientUkranianIronbellyLineup.createAncientUkranianIronbelly(),
                // Ancient Hungarian Horntail
                PersonService.AncientHungarianHorntailLineup.createFormidableAcromantula(),
                PersonService.AncientHungarianHorntailLineup.createSphinx(),
                PersonService.AncientHungarianHorntailLineup.createAncientHungarianHorntail(),
                // Narcissa Malfoy
                PersonService.NarcissaMalfoyLineup.createFormidableSnatcher(),
                PersonService.NarcissaMalfoyLineup.createDarkWitch(),
                PersonService.NarcissaMalfoyLineup.createNarcissaMalfoy(),
        };
    }

    private static void assertEquals(Integer value1, Integer value2) {
        assert value1.equals(value2);
    }

    private static void assertOrEquals(Integer value1, Integer value2, Integer valueMin, Integer valueMax) {
        assert value1.equals(value2) ||
                value2 >= valueMin && value2 <= valueMax;
    }

    private static <T extends Number> void assertDamage(Integer real, T calc) {
        assertEquals(real, (int) Math.ceil(calc.doubleValue()));
    }

    private static <T extends Number> void assertDamage(Integer real, T calc, Double crit) {
        assertOrEquals(real, (int) Math.ceil(calc.doubleValue()), (int) Math.ceil((real - 1) * crit), (int) Math.ceil(real * crit));
    }

    @Nested
    public class Auror {

        private final Integer[] outputDamage = {
                100, 159, 82,
                100, 92, 82,
                100, 92, 82,
                100, 92, 82,
                100, 92, 82,
                172, 159, 92,
                100, 92, 82,
                172, 82, 62,
                100, 92, 82,
                100, 159, 82,
        };

        private final Integer[] inputDamage = {
                9, 19, 30,
                7, 27, 33,
                13, 28, 41,
                16, 38, 61,
                16, 38, 44,
                13, 37, 45,
                16, 44, 55,
                24, 28, 45,
                26, 42, 80,
                18, 32, 46,
        };

        void assertOutputDamage(Person adversary, Integer real) {
            var damage = Battle.damage(
                    PersonService.createAuror().getPerson(),
                    adversary,
                    Set.of());
            double AUROR_CRIT_FIRST = 2.7;
            BattleTest.assertDamage(real, damage, AUROR_CRIT_FIRST);
        }

        void assertInputDamage(Person adversary, Integer real) {
            var damage = Battle.damage(
                    adversary,
                    PersonService.createAuror().getPerson(),
                    Set.of());
            BattleTest.assertDamage(real, damage);
        }

        @Test
        void testOutputDamage() {
            assert adversaries.length == outputDamage.length;
            for (var i = 0; i < outputDamage.length; i++) {
                assertOutputDamage(adversaries[i], outputDamage[i]);
            }
        }

        @Test
        void testInputDamage() {
            assert adversaries.length == inputDamage.length;
            for (var i = 0; i < inputDamage.length; i++) {
                assertInputDamage(adversaries[i], inputDamage[i]);
            }
        }

    }

    @Nested
    public class AurorBis {

        private final Integer[] outputDamage = {
                110, 175, 91,
                110, 102, 91,
                110, 102, 91,
                110, 102, 91,
                110, 102, 91,
                190, 175, 102,
                110, 102, 91,
                190, 91, 69,
                110, 102, 91,
                110, 175, 91,
        };

        private final Integer[] inputDamage = {
                8, 17, 26,
                6, 24, 29,
                11, 25, 36,
                14, 34, 54,
                14, 34, 39,
                11, 33, 39,
                15, 39, 55,
                21, 25, 39,
                23, 37, 73,
                16, 28, 40,
        };

        void assertOutputDamage(Person adversary, Integer real) {
            adversary.setStamina(1);
            var damage = Battle.damage(
                    PersonService.createAuror().getPerson(),
                    adversary,
                    Set.of());
            adversary.setStamina(adversary.getMaxStamina());
            double AUROR_CRIT_FIRST = 2.2;
            BattleTest.assertDamage(real, damage, AUROR_CRIT_FIRST);
        }

        void assertInputDamage(Person adversary, Integer real) {
            adversary.setStamina(1);
            var damage = Battle.damage(
                    adversary,
                    PersonService.createAuror().getPerson(),
                    Set.of());
            adversary.setStamina(adversary.getMaxStamina());
            BattleTest.assertDamage(real, damage);
        }

        @Test
        void testOutputDamage() {
            assert adversaries.length == outputDamage.length;
            for (var i = 0; i < outputDamage.length; i++) {
                assertOutputDamage(adversaries[i], outputDamage[i]);
            }
        }

        @Test
        void testInputDamage() {
            assert adversaries.length == inputDamage.length;
            for (var i = 0; i < inputDamage.length; i++) {
                assertInputDamage(adversaries[i], inputDamage[i]);
            }
        }

    }

    @Nested
    public class Magizoologist {

        private final Integer[] outputDamage = {
                183, 90, 79,
                106, 90, 79,
                106, 90, 79,
                183, 154, 79,
                182, 154, 79,
                106, 90, 90,
                106, 154, 79,
                106, 79, 57,
                183, 90, 79,
                106, 90, 79,
        };

        private final Integer[] inputDamage = {
                4, 14, 20,
                5, 13, 23,
                6, 14, 28,
                8, 12, 29,
                5, 12, 30,
                9, 18, 31,
                12, 22, 50,
                11, 19, 31,
                13, 20, 43,
                13, 22, 32,
        };

        void assertOutputDamage(Person adversary, Integer real) {
            var damage = Battle.damage(
                    PersonService.createMagi().getPerson(),
                    adversary,
                    Set.of());
            double MAGI_CRIT = 1.98;
            BattleTest.assertDamage(real, damage, MAGI_CRIT);
        }

        void assertInputDamage(Person adversary, Integer real) {
            var damage = Battle.damage(
                    adversary,
                    PersonService.createMagi().getPerson(),
                    Set.of());
            BattleTest.assertDamage(real, damage);
        }

        @Test
        void testOutputDamage() {
            assert adversaries.length == outputDamage.length;
            for (var i = 0; i < outputDamage.length; i++) {
                assertOutputDamage(adversaries[i], outputDamage[i]);
            }
        }

        @Test
        void testInputDamage() {
            assert adversaries.length == inputDamage.length;
            for (var i = 0; i < inputDamage.length; i++) {
                assertInputDamage(adversaries[i], inputDamage[i]);
            }
        }

    }

    @Nested
    public class Professor {

        private final Integer[] outputDamage = {
                87, 72, 63,
                152, 168, 63,
                151, 126, 63,
                87, 72, 63,
                87, 72, 63,
                87, 72, 72,
                152, 72, 63,
                96, 110, 44,
                87, 126, 63,
                152, 72, 63,
        };

        private final Integer[] inputDamage = {
                6, 18, 27,
                7, 18, 31,
                8, 18, 38,
                11, 25, 39,
                11, 25, 40,
                12, 24, 41,
                15, 29, 62,
                15, 26, 41,
                17, 27, 55,
                17, 29, 42,
        };

        void assertOutputDamage(Person adversary, Integer real) {
            var damage = Battle.damage(
                    PersonService.createProf().getPerson(),
                    adversary,
                    Set.of());
            double PROF_CRIT = 2.11;
            BattleTest.assertDamage(real, damage, PROF_CRIT);
        }

        void assertInputDamage(Person adversary, Integer real) {
            var damage = Battle.damage(
                    adversary,
                    PersonService.createProf().getPerson(),
                    Set.of());
            BattleTest.assertDamage(real, damage);
        }

        @Test
        void testOutputDamage() {
            assert adversaries.length == outputDamage.length;
            for (var i = 0; i < outputDamage.length; i++) {
                assertOutputDamage(adversaries[i], outputDamage[i]);
            }
        }

        @Test
        void testInputDamage() {
            assert adversaries.length == inputDamage.length;
            for (var i = 0; i < inputDamage.length; i++) {
                assertInputDamage(adversaries[i], inputDamage[i]);
            }
        }

    }
}
