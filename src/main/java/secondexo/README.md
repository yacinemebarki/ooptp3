# Exercice 2 – Réflexivité en Java (Mini Inspecteur)

---



---

## Structure du projet

```bash
secondexo/
├── CompteUtilisateur.java   # Classe métier principale
├── produit.java             # Deuxième classe test
└── MiniInspecteur.java      # Outil de réflexion
```

---

## Travail réalisé

---

## 1. Classe métier `CompteUtilisateur`

Classe représentant un utilisateur du système.

### Attributs privés :

- id
- nom
- email
- active

---

### Constructeurs :

#### Constructeur vide
```java
public CompteUtilisateur(){
    this.id = 0;
    this.email = "";
    this.nom = "";
    this.active = false;
}
```

#### Constructeur paramétré
```java
public CompteUtilisateur(int id, String nom, String email, boolean active)
```

---

### Méthodes principales :

- `activer()`
- `desactiver()`
- `presentation()`

```java
public String presentation(){
    return id + " " + nom + " " + email + " actif= " + active;
}
```

---

## 2. Classe métier secondaire `produit`

Deuxième classe utilisée pour tester la généricité de l’inspecteur.

### Attributs :

- id
- name
- valable

### Méthodes :

- constructeur vide et paramétré
- getters / setters
- `presentation()`
- `activer()` / `desactiver()`

---

## 3. Classe `MiniInspecteur`

Classe principale qui utilise la **réflexivité Java**.

---

## 3.1 Récupération de la classe (3 méthodes)

```java
Class<?> c1 = CompteUtilisateur.class;
Class<?> c2 = obj.getClass();
Class<?> c3 = Class.forName("secondexo.CompteUtilisateur");
```

---

## 3.2 Affichage des informations de la classe

Le programme affiche :

- nom complet
- nom simple
- package
- super-classe
- constructeurs
- méthodes
- attributs

Exemple :

```java
System.out.println(c.getName());
System.out.println(c.getSimpleName());
System.out.println(c.getPackageName());
System.out.println(c.getSuperclass());
```

---

## 3.3 Création dynamique d’objets

### Constructeur vide :

```java
Object u1 = c1.getDeclaredConstructor().newInstance();
```

### Constructeur paramétré :

```java
Constructor<?> cons =
    c1.getConstructor(int.class, String.class, String.class, boolean.class);

Object u2 = cons.newInstance(1245, "yacine", "yacine@gmail.com", true);
```

---

## 3.4 Invocation dynamique de méthodes

```java
Method presentation = c1.getMethod("presentation");
Object result = presentation.invoke(u2);
```

---

## 3.5 Modification d’un attribut privé

```java
Field nom = c1.getDeclaredField("nom");
nom.setAccessible(true);
nom.set(u2, "mebarki");
```

L’objet est modifié sans passer par les setters classiques.

---

## 3.6 Test sur une deuxième classe

La classe `produit` est inspectée dynamiquement :

```java
inspecter("secondexo.produit");
```

Cela démontre que l’inspecteur fonctionne avec **n’importe quelle classe**.

---

## 4. Gestion des exceptions

Le projet gère les principales exceptions liées à la réflexion :

- ClassNotFoundException
- NoSuchMethodException
- NoSuchFieldException
- IllegalAccessException
- InvocationTargetException

```java
catch(Exception e){
            e.printStackTrace();
        }
```

---

## 5. Résultats attendus

Le programme affiche :

- la classe inspectée ;
- ses constructeurs, méthodes et attributs ;
- les objets créés dynamiquement ;
- les résultats des méthodes invoquées ;
- la valeur d’un attribut privé avant et après modification.

---
