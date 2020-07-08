# Project Animal Kingdom Search

A student that completes this project shows that they can:

* Use and implement abstract classes
* Use and implement Lambda Expressions

## Introduction

Using a combination of abstract classes and lambda expressions, students will create and manipulate a list of animals using object oriented design principles.

## Instruction

* [x] Please fork and clone this repository. This repository does not have a starter project, so create one inside of the cloned repository folder. Regularly commit and push your code as appropriate.
* [x] Create an abstract class for animals
  * [x] All animals consume food the same way
  * [x] Each animal is assigned a unique number, a name, and year discovered regardless of classification.

- [x] Methods will return a string saying how that animal implements the action
  - [x] All animals can move, breath, reproduce. How they do that, so what string should get returned when the method is executed, varies by animal type.

* [x] Create classes for mammals, birds, fish
  * [x] Mammals move - walk, breath - lungs, reproduce - live births
  * [x] Birds move - fly, breath - lungs, reproduce - eggs
  * [x] Fish move - swim, breath - gills, reproduce - eggs

Hint: think about abstract classes and creating an ArrayList using an abstract class type.

Create a collection for the animals using the following data

* [x] **Mammals:**

    | Name      | Year Named |
    |-----------|-------|
    | Panda     | 1869  |
    | Zebra     | 1778  |
    | Koala     | 1816  |
    | Sloth     | 1804  |
    | Armadillo | 1758  |
    | Raccoon   | 1758  |
    | Bigfoot   | 2021  |

* [x] **Birds:**

    | Name      | Year Named |
    |-----------|------|
    | Pigeon    | 1837 |
    | Peacock   | 1821 |
    | Toucan    | 1758 |
    | Parrot    | 1824 |
    | Swan      | 1758 |

* [x] **Fish:**

    | Name      | Year Named |
    |-----------|------|
    | Salmon    | 1758 |
    | Catfish   | 1817 |
    | Perch     | 1758 |

* Using Lambda Expressions and displaying the results to the console
  * [x] List all the animals in descending order by year named
  * [x] List all the animals alphabetically
  * [x] List all the animals order by how they move
  * [x] List only those animals the breath with lungs
  * [x] List only those animals that breath with lungs and were named in 1758
  * [x] List only those animals that lay eggs and breath with lungs
  * [x] List alphabetically only those animals that were named in 1758

* Stretch Goal
  * [ ] For the list of animals, list alphabetically those animals that are mammals.

## Results

### MPV

The MVP of this application would produce the following output

```TEXT
*** MVP ***

*** List all the animals in descending order by year named ***
[Animals{id=6, name='Bigfoot', yearNamed=2021}
, Animals{id=0, name='Panda', yearNamed=1869}
, Animals{id=7, name='Pigeon', yearNamed=1837}
, Animals{id=10, name='Parrot', yearNamed=1824}
, Animals{id=8, name='Peacock', yearNamed=1821}
, Animals{id=13, name='Catfish', yearNamed=1817}
, Animals{id=2, name='Koala', yearNamed=1816}
, Animals{id=3, name='Sloth', yearNamed=1804}
, Animals{id=1, name='Zebra', yearNamed=1778}
, Animals{id=4, name='Armadillo', yearNamed=1758}
, Animals{id=5, name='Raccoon', yearNamed=1758}
, Animals{id=9, name='Toucan', yearNamed=1758}
, Animals{id=11, name='Swan', yearNamed=1758}
, Animals{id=12, name='Salmon', yearNamed=1758}
, Animals{id=14, name='Perch', yearNamed=1758}
]

*** List all the animals alphabetically ***
[Animals{id=4, name='Armadillo', yearNamed=1758}
, Animals{id=6, name='Bigfoot', yearNamed=2021}
, Animals{id=13, name='Catfish', yearNamed=1817}
, Animals{id=2, name='Koala', yearNamed=1816}
, Animals{id=0, name='Panda', yearNamed=1869}
, Animals{id=10, name='Parrot', yearNamed=1824}
, Animals{id=8, name='Peacock', yearNamed=1821}
, Animals{id=14, name='Perch', yearNamed=1758}
, Animals{id=7, name='Pigeon', yearNamed=1837}
, Animals{id=5, name='Raccoon', yearNamed=1758}
, Animals{id=12, name='Salmon', yearNamed=1758}
, Animals{id=3, name='Sloth', yearNamed=1804}
, Animals{id=11, name='Swan', yearNamed=1758}
, Animals{id=9, name='Toucan', yearNamed=1758}
, Animals{id=1, name='Zebra', yearNamed=1778}
]

*** List all the animals order by how they move ***
[Animals{id=10, name='Parrot', yearNamed=1824}
, Animals{id=8, name='Peacock', yearNamed=1821}
, Animals{id=7, name='Pigeon', yearNamed=1837}
, Animals{id=11, name='Swan', yearNamed=1758}
, Animals{id=9, name='Toucan', yearNamed=1758}
, Animals{id=13, name='Catfish', yearNamed=1817}
, Animals{id=14, name='Perch', yearNamed=1758}
, Animals{id=12, name='Salmon', yearNamed=1758}
, Animals{id=4, name='Armadillo', yearNamed=1758}
, Animals{id=6, name='Bigfoot', yearNamed=2021}
, Animals{id=2, name='Koala', yearNamed=1816}
, Animals{id=0, name='Panda', yearNamed=1869}
, Animals{id=5, name='Raccoon', yearNamed=1758}
, Animals{id=3, name='Sloth', yearNamed=1804}
, Animals{id=1, name='Zebra', yearNamed=1778}
]

*** List only those animals the breath with lungs ***
Parrot eggs fly lungs 1824
Peacock eggs fly lungs 1821
Pigeon eggs fly lungs 1837
Swan eggs fly lungs 1758
Toucan eggs fly lungs 1758
Armadillo live births walk lungs 1758
Bigfoot live births walk lungs 2021
Koala live births walk lungs 1816
Panda live births walk lungs 1869
Raccoon live births walk lungs 1758
Sloth live births walk lungs 1804
Zebra live births walk lungs 1778

*** List only those animals that breath with lungs and were named in 1758 ***
Swan eggs fly lungs 1758
Toucan eggs fly lungs 1758
Armadillo live births walk lungs 1758
Raccoon live births walk lungs 1758

*** List only those animals that lay eggs and breath with lungs ***
Parrot eggs fly lungs 1824
Peacock eggs fly lungs 1821
Pigeon eggs fly lungs 1837
Swan eggs fly lungs 1758
Toucan eggs fly lungs 1758

*** List alphabetically only those animals that were named in 1758 ***
Armadillo live births walk lungs 1758
Perch eggs swim gills 1758
Raccoon live births walk lungs 1758
Salmon eggs swim gills 1758
Swan eggs fly lungs 1758
Toucan eggs fly lungs 1758
```

### Stretch Goal

The Stretch Goals would produce the following output.

```TEXT
*** Stretch Goal ***

*** For the list of animals, list alphabetically those animals that are mammals ***
Armadillo live births walk lungs 1758
Bigfoot live births walk lungs 2021
Koala live births walk lungs 1816
Panda live births walk lungs 1869
Raccoon live births walk lungs 1758
Sloth live births walk lungs 1804
Zebra live births walk lungs 1778
```
