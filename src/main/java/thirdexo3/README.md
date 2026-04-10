# Exercice 3 – Généricité + Réflexivité : Mini Fabrique d’Opérations

---



---

## Structure du projet

```bash
thirdexo3/
├── operation.java              # Interface de base
├── NettoyageTemp.java         # Opération 1
├── exportcsv.java             # Opération 2
├── NotificationConsole.java   # Opération 3
├── RegistreOperations.java    # Fabrique générique
└── DemoFabrique.java         # Programme de test
```

---

## Travail réalisé

---

## 1. Interface `operation`

Interface commune à toutes les opérations.

```java
public interface operation {
    void excute();
    String description();
}
```

---

## 2. Classes d’opérations

---

### 2.1 `NettoyageTemp`

Représente une opération de nettoyage temporaire.

Attribut :
- dirname

```java
@Override
public void excute(){
    System.out.println("entraine de nettoyer les fichier");
}

@Override
public String description(){
    return "10 fichier sont supprimés";
}
```

---

### 2.2 `exportcsv`

Représente une opération d’export CSV.

Attribut :
- fname

```java
@Override
public void excute(){
    System.out.println("exportation de csv en cours");
}

@Override
public String description(){
    return "export CSV avec durée estimée 100s";
}
```

---

### 2.3 `NotificationConsole`

Représente une notification console.

Attribut :
- message

```java
@Override
public void excute(){
    System.out.println("NotificationConsole en cours d'exécution");
}

@Override
public String description(){
    return "notification console active";
}
```

---

## 3. Classe générique `RegistreOperations<T extends operation>`

Cette classe agit comme une **fabrique dynamique d’objets**.

---

### 3.1 Structure interne

```java
Map<String, Class<? extends T>> map = new HashMap<>();
```

---

### 3.2 Enregistrement des opérations

```java
public void enregistrer(String nom, Class<? extends T> classe)
```

Permet d’associer un nom symbolique à une classe.

---

### 3.3 Liste des opérations

```java
public void lister()
```

Affiche toutes les opérations enregistrées.

---

## 3.4 Création dynamique (réflexivité)

### Constructeur vide

```java
public T creer(String nom)
```

Utilise :

```java
classe.getDeclaredConstructor().newInstance();
```

---

### Constructeur paramétré

```java
public T creer(String nom, Class<?>[] types, Object[] args)
```

Utilise :

```java
Constructor<? extends T> cons =
    classe.getDeclaredConstructor(types);

return cons.newInstance(args);
```

---

## 3.5 Inspection réflexive d’une opération

```java
public void discription(String nom)
```

Affiche :

- nom de la classe
- attributs privés
- méthodes déclarées
- constructeurs

Exemple :

```java
Field[] attr = classe.getDeclaredFields();
Method[] methods = classe.getDeclaredMethods();
Constructor[] cons = classe.getConstructors();
```

---

## 3.6 Exécution de plusieurs opérations

```java
public void excutetous(List<? extends T> operations)
```

Permet d’exécuter une liste d’opérations génériques :

```java
op.excute();
```

---

## 4. Classe `DemoFabrique`

Programme principal démontrant :

- enregistrement des opérations
- création dynamique d’objets
- exécution de plusieurs opérations
- inspection réflexive
- gestion des erreurs

---

## 4.1 Enregistrement

```java
operations.enregistrer("excute", NotificationConsole.class);
operations.enregistrer("description", NettoyageTemp.class);
operations.enregistrer("excute", exportcsv.class);
```

---

## 4.2 Création dynamique

### Sans paramètre

```java
operation op = operations.creer("excute");
```

### Avec paramètres

```java
operation op1 =
    operations.creer("excute",
    new Class[]{String.class},
    new Object[]{"data.csv"});
```

---

## 4.3 Exécution des opérations

```java
List<operation> liste = new ArrayList<>();
liste.add(op1);
liste.add(op);

operations.excutetous(liste);
```

---

## 4.4 Inspection réflexive

```java
operations.discription("description");
```

Affiche la structure complète de la classe.

---

## 5. Gestion des erreurs

Le système gère les cas suivants :

- nom d’opération inconnu
- constructeur invalide
- erreurs de réflexivité
- instanciation impossible

---

## 6. Résultat attendu

Le programme permet :

- d’exécuter des opérations sans connaître leurs classes ;
- de créer dynamiquement des objets ;
- d’inspecter les classes à l’exécution ;
- de manipuler une architecture extensible.

---
