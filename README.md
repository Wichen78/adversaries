# adversaries

it's a simulation program against adversaires

use [Java 11](https://docs.oracle.com/en/java/javase/11/install/overview-jdk-installation.html) +

---
---

## Custom

- new features: custom wizard, adversary and potion stats
- if you want to customize lessons or specializations, you must modify `src/main.app/profession/persistence/ProfessionData.java` file

---
---

## Profession

- [AUROR](#professionauror)
- DARK_FORCES
- [PROFESSOR](#professionprofessor)
- CURIOSITIES
- [MAGIZOOLOGIST](#professionmagizoologist)
- BEASTS
- NONE

---

### Profession.AUROR

proficiency against: `Profession.BEAST -> Profession.AUROR -> Profession.DARK_FORCES`

#### stats

- stamina: 296
- power: 100
- protego power: 0.35
- precision: 0.35
- critical power: 1.2
- proficiency power: 1.48
- deficiency power: 0.5
- defense: 0.39
- defense breach: 0.32
- accuracy: 0.15
- dodge: 0

#### lessons

- power vs foes with less than 50% stamina
  - value `+10`
- defense vs foes with less than 50% stamina
  - value `+10%`
- precision vs foes with 100% stamina
  - value `+35%`
- critical power vs foes with 100% stamina
  - value `+50%`

#### specialization

- precision vs [death eaters](#speciesdeath_eater) : `Species.DEATH_EATER`
  - value `+25%`
- protego power vs [dark wizards](#speciesdark_wizard): `Species.DARK_WIZARD`
  - value `+20%`
- dodge vs [feared adversaries](#speciesfeared_adv): `Species.FEARED_ADV`
  - value `+50%`
- precision vs [feared adversaries](#speciesfeared_adv): `Species.FEARED_ADV`
  - value `+50%`
- accuracy vs [lethal adversaries](#specieslethal_adv): `Species.LETHAL_ADV`
  - value `+100%`

---

### Profession.PROFESSOR

proficiency against: `Profession.DARK_FORCES -> Profession.PROFESSOR -> Profession.CURIOSITIES`

#### stats

- stamina: 397
- power: 79
- protego power: 0.45
- precision: 0.23
- critical power: 1.11
- proficiency power: 1.5
- deficiency power: 0.5
- defense: 0.44
- defense breach: 0.15
- accuracy: 0.32
- dodge: 0

#### lessons

(PROFESSOR has always 2 Enhancements)

- power when you have 2 Enhancements
  - value `+17`
- defense when you have 2 Enhancements
  - value `+15%` 

#### specialization

- accuracy vs [pixies](#speciespixie): `Species.PIXIE`
  - value `+30%`
- defense breach vs [werewolves](#specieswerewolf): `Species.WEREWOLF`
  - value `+30%`
- dodge vs [feared adversaries](#speciesfeared_adv): `Species.FEARED_ADV`
  - value `+50%`
- precision vs [feared adversaries](#speciesfeared_adv): `Species.FEARED_ADV`
  - value `+50%`
- accuracy vs [lethal adversaries](#specieslethal_adv): `Species.LETHAL_ADV`
  - value `+100%`

---

### Profession.MAGIZOOLOGIST

proficiency against: `Profession.CURIOSITIES -> Profession.MAGIZOOLOGIST -> Profession.BEASTS`

#### stats

- stamina: 525
- power: 59
- protego power: 0.49
- precision: 0.2
- critical power: 0.98
- proficiency power: 1.48
- deficiency power: 0.6
- defense: 0.5
- defense breach: 0.22
- accuracy: 0.2
- dodge: 0

#### lessons

(MAGIZOOLOGIST has always 5 Focus and 50+ stamina)

- power when you have 5 Focus
  - value `+50`
- defense when you have 5 Focus
  - value `+21%`

#### specialization

- defense vs [spiders](#speciesacromantula): `Species.ACROMANTULA`
  - value `+20%`
- power vs [erklings](#specieserklings): `Species.ERKLINGS`
  - value `+25`
- dodge vs [feared adversaries](#speciesfeared_adv): `Species.FEARED_ADV`
  - value `+50%`
- precision vs [feared adversaries](#speciesfeared_adv): `Species.FEARED_ADV`
  - value `+50%`
- accuracy vs [lethal adversaries](#specieslethal_adv): `Species.LETHAL_ADV`
  - value `+100%`

---
---

## Species

- AUROR
- PROFESSOR
- MAGIZOOLOGIST
- [FEARED_ADV](#speciesfeared_adv)
- [LETHAL_ADV](#specieslethal_adv)
- [DARK_WIZARD](#speciesdark_wizard)
- [DEATH_EATER](#speciesdeath_eater)
- POACHER
- DARK_WITCH
- [PIXIE](#speciespixie)
- [WEREWOLF](#specieswerewolf)
- SNATCHER
- TROLL
- MUMMY
- SPHINX
- [ACROMANTULA](#speciesacromantula)
- [ERKLINGS](#specieserklings)
- SERPENT
- THREE_HEADED_DOG
- NONE

---

### Species.FEARED_ADV

`Species.FEARED_ADV` vs `Profession.AUROR`, `Profession.PROFESSOR`, `Profession.MAGIZOOLOGIST`:
- [AUROR](#professionauror), [PROFESSOR](#professionprofessor), [MAGIZOOLOGIST](#professionmagizoologist) dodge `+50%`

`Profession.AUROR`, `Profession.PROFESSOR`, `Profession.MAGIZOOLOGIST` vs `Species.FEARED_ADV`:
- [AUROR](#professionauror), [PROFESSOR](#professionprofessor), [MAGIZOOLOGIST](#professionmagizoologist) precision `+50%`

---

### Species.LETHAL_ADV

`Profession.AUROR`, `Profession.PROFESSOR`, `Profession.MAGIZOOLOGIST` vs `Species.FEARED_ADV`:
- [AUROR](#professionauror), [PROFESSOR](#professionprofessor), [MAGIZOOLOGIST](#professionmagizoologist) accuracy `+100%`

---

### Species.DARK_WIZARD

`Species.DARK_WIZARD` vs `Profession.AUROR`:
- [AUROR](#professionauror) protego `+20%`

---

### Species.DEATH_EATER

`Profession.AUROR` vs `Species.DEATH_EATER`
- [AUROR](#professionauror) precision `+25%`

---

### Species.PIXIE

`Profession.PROFESSOR` vs `Species.PIXIE`
- [PROFESSOR](#professionprofessor) accuracy `+30%`

---

### Species.WEREWOLF

`Profession.PROFESSOR` vs `Species.WEREWOLF`
- [PROFESSOR](#professionprofessor) defense breach `+30%`

---

### Species.ACROMANTULA

`Species.ACROMANTULA` vs `Profession.MAGIZOOLOGIST`:
- [MAGIZOOLOGIST](#professionmagizoologist) defense `+20%`

---

### Species.ERKLINGS

`Profession.MAGIZOOLOGIST` vs `Species.ERKLINGS`
- [MAGIZOOLOGIST](#professionmagizoologist) power `+25`

---
---

## Adversaries

- [Draco Malfoy](#draco-malfoy-lineup)
- [Fenrir Greyback](#fenrir-greyback-lineup)
- [Gilderoy Lockhart](#gilderoy-lockhart-lineup)
- [Slytherins Basilisk](#slytherins-basilisk-lineup)
- [Aragog](#aragog-lineup)
- [Peter Pettigrew](#peter-pettigrew-lineup)
- [Ancient Norwegian Ridgeback](#ancient-norwegian-ridgeback-lineup)
- [Ancient Ukranian Ironbelly](#ancient-ukranian-ironbelly-lineup)
- [Ancient Hungarian Horntail](#ancient-hungarian-horntail-lineup)
- [Narcissa Malfoy](#narcissa-malfoy-lineup)

---

### Draco Malfoy Lineup

- Common Serpent
- Imposing Dark Wizard
- Draco Malfoy

|         name         | stamina | power | proficiency | deficiency | defense | defense breach | accuracy | dodge |  profession |         species         |
|:--------------------:|:-------:|:-----:|:-----------:|:----------:|:-------:|:--------------:|:--------:|:-----:|:-----------:|:-----------------------:|
|    common serpent    |   188   |   16  |    0.505    |    0.75    |   0.25  |       0.2      |    0.2   |   0   |    BEASTS   |   SERPENT, [FEARED_ADV](#speciesfeared_adv)   |
| imposing dark wizard |   763   |   49  |     0.5     |    0.76    |   0.4   |      0.25      |    0.2   |   0   | DARK_FORCES | [DARK_WIZARD](#speciesdark_wizard), [FEARED_ADV](#speciesfeared_adv) |
|     draco malfoy     |   1635  |   80  |      0      |      0     |   0.5   |       0.2      |    0.2   |   0   |     NONE    | [FEARED_ADV](#speciesfeared_adv), [DARK_WIZARD](#speciesdark_wizard) |

---

### Fenrir Greyback Lineup

- Imposing Snatcher
- Dangerous Werewolf
- Fenrir Greyback

|        name        | stamina | power | proficiency | deficiency | defense | defense breach | accuracy | dodge |  profession |              species              |
|:------------------:|:-------:|:-----:|:-----------:|:----------:|:-------:|:--------------:|:--------:|:-----:|:-----------:|:---------------------------------:|
|  imposing snatcher |   206   |   18  |     0.5     |    0.75    |   0.25  |       0.2      |    0.2   |   0   | CURIOSITIES | SNATCHER, [FEARED_ADV](#speciesfeared_adv), [DARK_WIZARD](#speciesdark_wizard) |
| dangerous werewolf |   802   |   51  |     0.5     |    0.76    |   0.4   |       0.2      |    0.2   |   0   | CURIOSITIES |        [WEREWOLF](#specieswerewolf), [FEARED_ADV](#speciesfeared_adv)       |
|   fenrir greyback  |   1693  |   83  |      0      |      0     |   0.5   |      0.25      |    0.2   |   0   |     NONE    |      [FEARED_ADV](#speciesfeared_adv), [DARK_WIZARD](#speciesdark_wizard)      |

---

### Gilderoy Lockhart Lineup

- Common Pixie
- Dangerous Pixie
- Gilderoy Lockhart

|        name       | stamina | power | proficiency | deficiency | defense | defense breach | accuracy | dodge |  profession |         species         |
|:-----------------:|:-------:|:-----:|:-----------:|:----------:|:-------:|:--------------:|:--------:|:-----:|:-----------:|:-----------------------:|
|    common pixie   |   337   |   23  |     0.5     |    0.76    |   0.25  |       0.2      |     0    |   0   | CURIOSITIES |          [PIXIE](#speciespixie)          |
|  dangerous pixie  |   842   |   53  |     0.5     |    0.76    |   0.4   |       0.2      |    0.2   |   0   | CURIOSITIES |    [PIXIE](#speciespixie), [FEARED_ADV](#speciesfeared_adv)    |
| gilderoy lockhart |   1750  |  112  |      0      |      0     |   0.5   |       0.2      |    0.2   |   0   |     NONE    | [FEARED_ADV](#speciesfeared_adv), [DARK_WIZARD](#speciesdark_wizard) |

---

### Slytherins Basilisk Lineup

- Formidable Serpent
- Fierce Acromantula
- Slytherins Basilisk

|         name        | stamina | power | proficiency | deficiency | defense | defense breach | accuracy | dodge | profession |         species         |
|:-------------------:|:-------:|:-----:|:-----------:|:----------:|:-------:|:--------------:|:--------:|:-----:|:----------:|:-----------------------:|
|  formidable serpent |   486   |   30  |     0.5     |    0.75    |   0.25  |       0.2      |    0.2   |   0   |   BEASTS   |   SERPENT, [FEARED_ADV](#speciesfeared_adv)   |
|  fierce acromantula |   1382  |   67  |     0.5     |    0.76    |   0.4   |      0.25      |    0.2   |   0   |   BEASTS   | [ACROMANTULA](#speciesacromantula), [FEARED_ADV](#speciesfeared_adv) |
| slytherins basilisk |   2411  |  115  |      0      |      0     |   0.5   |       0.2      |    0.2   |   0   |    NONE    |        [FEARED_ADV](#speciesfeared_adv)       |

### Aragog Lineup

- Common Acromantula
- Fierce Acromantula
- Aragog

|        name        | stamina | power | proficiency | deficiency | defense | defense breach | accuracy | dodge | profession |         species         |
|:------------------:|:-------:|:-----:|:-----------:|:----------:|:-------:|:--------------:|:--------:|:-----:|:----------:|:-----------------------:|
| common acromantula |   522   |   30  |     0.5     |    0.76    |   0.25  |       0.2      |    0.2   |   0   |   BEASTS   | [ACROMANTULA](#speciesacromantula), [FEARED_ADV](#speciesfeared_adv) |
| fierce acromantula |   1447  |   67  |     0.5     |    0.76    |   0.4   |      0.25      |    0.2   |   0   |   BEASTS   | [ACROMANTULA](#speciesacromantula), [FEARED_ADV](#speciesfeared_adv) |
|       aragog       |   2488  |  119  |      0      |      0     |   0.5   |       0.2      |    0.2   |   0   |    NONE    | [FEARED_ADV](#speciesfeared_adv), [DARK_WIZARD](#speciesdark_wizard) |

---

### Peter Pettigrew Lineup

- Formaidable Dark Wizard
- Vicious Death Eater
- Peter Pettigrew

|          name          | stamina | power | proficiency | deficiency | defense | defense breach | accuracy | dodge |  profession |         species         |
|:----------------------:|:-------:|:-----:|:-----------:|:----------:|:-------:|:--------------:|:--------:|:-----:|:-----------:|:-----------------------:|
| formidable dark wizard |   559   |   33  |     0.5     |    0.76    |   0.25  |       0.2      |    0.2   |   0   | DARK_FORCES | [DARK_WIZARD](#speciesdark_wizard), [FEARED_ADV](#speciesfeared_adv) |
|   vicious death eater  |   1512  |   70  |     0.5     |    0.76    |   0.4   |       0.2      |    0.2   |   0   | DARK_FORCES | [DEATH_EATER](#speciesdeath_eater), [FEARED_ADV](#speciesfeared_adv) |
|     peter pettigrew    |   2565  |  122  |      0      |      0     |   0.4   |       0.2      |    0.2   |   0   |     NONE    | [FEARED_ADV](#speciesfeared_adv), [DARK_WIZARD](#speciesdark_wizard) |

---

### Ancient Norwegian Ridgeback Lineup

- Common Troll
- Three-Headed Dog
- Ancient Norwegian Ridgeback

|             name            | stamina | power | proficiency | deficiency | defense | defense breach | accuracy | dodge |  profession |             species            |
|:---------------------------:|:-------:|:-----:|:-----------:|:----------:|:-------:|:--------------:|:--------:|:-----:|:-----------:|:------------------------------:|
|         common troll        |   807   |   41  |     0.5     |    0.75    |   0.25  |      0.25      |    0.2   |   0   | CURIOSITIES | TROLL, [FEARED_ADV](#speciesfeared_adv), [DARK_WIZARD](#speciesdark_wizard) |
|       three-headed dog      |   1576  |   73  |     0.5     |    0.76    |   0.4   |       0.3      |    0.2   |   0   |    BEASTS   |  THREE_HEADED_DOG, [FEARED_ADV](#speciesfeared_adv)  |
| ancient norwegian ridgeback |   2587  |  122  |      0      |      0     |   0.5   |       0.5      |    0.2   |   0   |     NONE    |     [FEARED_ADV](#speciesfeared_adv), [DARK_WIZARD](#speciesdark_wizard)    |

---

### Ancient Ukranian Ironbelly Lineup

- Formidable Poacher
- Vicious Mummy
- Ancient Ukranian Ironbelly

|            name            | stamina | power | proficiency | deficiency | defense | defense breach | accuracy | dodge |  profession |             species            |
|:--------------------------:|:-------:|:-----:|:-----------:|:----------:|:-------:|:--------------:|:--------:|:-----:|:-----------:|:------------------------------:|
|     formidable poacher     |   860   |   44  |     0.5     |    0.76    |   0.25  |       0.2      |    0.2   |   0   | DARK_FORCES |  POACHER, [FEARED_ADV](#speciesfeared_adv), [WEREWOLF](#specieswerewolf) |
|        vicious mummy       |   1641  |   76  |     0.5     |    0.75    |   0.5   |       0.2      |    0.2   |   0   | CURIOSITIES | MUMMY, [FEARED_ADV](#speciesfeared_adv), [DARK_WIZARD](#speciesdark_wizard) |
| ancient ukranian ironbelly |   2606  |  122  |      0      |      0     |   0.7   |       0.2      |    0.2   |   0   |     NONE    |     [FEARED_ADV](#speciesfeared_adv), [DARK_WIZARD](#speciesdark_wizard)    |

---

### Ancient Hungarian Horntail Lineup

- Formidable Acromantula
- Sphinx
- Ancient Hungarian Horntail

|            name            | stamina | power | proficiency | deficiency | defense | defense breach | accuracy | dodge |  profession |       species      |
|:--------------------------:|:-------:|:-----:|:-----------:|:----------:|:-------:|:--------------:|:--------:|:-----:|:-----------:|:------------------:|
|   formidable acromantula   |   912   |   46  |     0.5     |    0.75    |   0.25  |      0.25      |    0.2   |   0   |    BEASTS   |     [FEARED_ADV](#speciesfeared_adv)     |
|           sphinx           |   1706  |   79  |     0.5     |    0.76    |   0.4   |       0.2      |    0.2   |   0   | CURIOSITIES | SPHINX, [FEARED_ADV](#speciesfeared_adv) |
| ancient hungarian horntail |   2625  |  122  |      0      |      0     |   0.5   |       0.4      |    0.2   |   0   |     NONE    |     [FEARED_ADV](#speciesfeared_adv)     |

---

### Narcissa Malfoy Lineup

- Formidable Snatcher
- Dark Witch
- Narcissa Malfoy

|         name        | stamina | power | proficiency | deficiency | defense | defense breach | accuracy | dodge |  profession |               species               |
|:-------------------:|:-------:|:-----:|:-----------:|:----------:|:-------:|:--------------:|:--------:|:-----:|:-----------:|:-----------------------------------:|
| formidable snatcher |   965   |   49  |     0.5     |    0.75    |   0.25  |      0.25      |    0.2   |   0   | CURIOSITIES |  SNATCHER, [FEARED_ADV](#speciesfeared_adv), [DARK_WIZARD](#speciesdark_wizard)  |
|      dark witch     |   1771  |   86  |     0.5     |    0.76    |   0.4   |       0.2      |    0.2   |   0   | DARK_FORCES | DARK_WITCH, [FEARED_ADV](#speciesfeared_adv), [DARK_WIZARD](#speciesdark_wizard) |
|   narcissa malfoy   |   2642  |  125  |      0      |      0     |   0.5   |       0.2      |    0.2   |  0.4  |     NONE    |       [FEARED_ADV](#speciesfeared_adv), [DARK_WIZARD](#speciesdark_wizard)       |


