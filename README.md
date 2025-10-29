# SOLID-Principles

## Description
Ce projet présente les 5 principes SOLID avec des exemples pratiques en Java.
Pour chaque principe, vous trouverez :
- 1-before/ : Code qui viole le principe
- 2-after/: Code refactorisé qui respecte le principe

## Principes Implémentés

### 1. SRP 
Problème : La classe `Book` gère les données, l'affichage, la persistance et la logique métier.
Solution : Séparation en classes ayant chacune sa responsabilité (`BookSRP`, `BookPrinter`,`BookSaver`, `BookBusinessLogic`).

### 2. OCP 
Problème : `AreaCalculator` nécessite des modifications pour chaque nouvelle forme.
Solution : Utilisation du polymorphisme avec une interface `Shape`.

### 3. LSP 
Problème : `Square` hérite de `Rectangle` mais viole le comportement attendu.
Solution : `Square` et `Rectangle` implémentent séparément l'interface `Shape`.

### 4. ISP 
Problème : `RobotWorker` est forcé d'implémenter `eat()` qu'il n'utilise pas.
Solution : Interfaces ségrégées (`Workable` et `Eatable`).

### 5. DIP 
Problème : `OrderProcessor` dépend directement de `MySQLDatabase`.
Solution : Injection de dépendance via l'interface `Database`.


## Comment Exécuter

### Prérequis
- Java JDK 11 ou supérieur
- Maven ou Gradle (optionnel)
- IDE (IntelliJ IDEA, Eclipse, VS Code)

### Compilation et Exécution

#### Pour SRP

```bash

# Avant
cd 01-SRP/1-before
javac *.java
java Main

# Après
cd ../2-after
javac *.java
java Main
```

#### Pour OCP

```bash

# Avant
cd 02-OCP/1-before
javac *.java
java Main

# Après
cd ../2-after
javac *.java
java Main
```

Répétez pour les autres principes...


