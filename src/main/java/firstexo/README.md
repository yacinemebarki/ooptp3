# Exercice 1 – Generics & Repository Management

---



## Structure du projet

```bash
firstexo/
├── Identifiable.java     # Interface commune
├── liver.java            # Classe Livre
├── videoCours.java       # Classe Vidéo de cours
├── depot.java            # Classe générique Depot<T>
├── utilitaire.java       # Méthodes génériques utilitaires
└── DemoGenerics.java     # Programme principal de test
```

---

## Travail réalisé

---

### 1. Interface `Identifiable`

Création d’une interface commune permettant d’identifier toutes les ressources.

```java
public interface Identifiable {
    int getid();
}
```

Chaque ressource possède donc un identifiant unique.

---

### 2. Classes métier

Deux classes différentes implémentent l’interface.

#### Livre (`liver`)

Attributs :
- id
- titre
- auteur
- nombre de pages

Fonctionnalités :
- constructeur
- getters / setters
- redéfinition de `toString()`

```java
@Override
public String toString() {
    return "Book: " + titre + ", Author: " + auteur +
           ", ID: " + id + ", Pages: " + nb_page;
}
```

---

#### Vidéo de cours (`videoCours`)

Attributs :
- id
- titre
- enseignant
- durée

Fonctionnalités :
- constructeur
- getters / setters
- redéfinition de `toString()`

```java
@Override
public String toString() {
    return "video course: " + titre +
           " Author: " + ens +
           " ID: " + id +
           " time: " + duree;
}
```

---

### 3. Classe générique `Depot<T extends Identifiable>`

Classe permettant de stocker n’importe quel type de ressource identifiable.

Structure interne :

```java
List<T> arr = new ArrayList<>();
```

Fonctionnalités implémentées :

- ajouter une ressource (`add`)
- afficher toutes les ressources (`display`)
- rechercher par identifiant (`search`)
- supprimer une ressource (`delete`)

Exemple :

```java
public T search(int id){
    for(T obj : arr){
        if(obj.getid()==id)
            return obj;
    }
    return null;
}
```

Cette classe fonctionne avec plusieurs types sans duplication de code.

---

### 4. Classe utilitaire générique

Plusieurs méthodes génériques ont été implémentées.

---

#### Affichage d’une liste inconnue (Wildcard)

```java
public static void display(List<?> arr)
```

Utilisation du wildcard `?`.

---

#### Maximum entre deux objets comparables

```java
public static <T extends Comparable<T>> T compare(T a,T b)
```

Retourne le plus grand élément.

---

#### Permutation de deux cases

```java
public static <T> void permute(List<T> arr,int a,int b)
```

Échange deux positions d’une liste.

---

#### Copier les identifiants

```java
public static <T extends Identifiable>
void copier(List<T> arr, Collection<Integer> des)
```

Copie tous les identifiants vers une autre collection.

---

### 5. Utilisation des Wildcards et Bornes Génériques

Exemples utilisés dans le projet :

- `T extends Identifiable`
- `List<?>`
- Méthodes génériques paramétrées

Ces mécanismes garantissent la sécurité de type à la compilation.

---

### 6. Classe `DemoGenerics`

Programme principal démontrant l’utilisation des générics.

Création :

```java
depot<liver> Depot_liver = new depot<>();
depot<videoCours> Depot_video = new depot<>();
```

Tests réalisés :

- ajout de livres et vidéos
- affichage des ressources
- recherche par identifiant
- suppression d’éléments
- utilisation des méthodes utilitaires génériques
- copie des identifiants

---

## Contraintes respectées

- aucune duplication de code (`DepotLivre` interdit)
- utilisation des générics Java
- vérification des types à la compilation
- absence de transtypage manuel
- utilisation pertinente de wildcards

---

## Résultat obtenu

Le même code `Depot<T>` fonctionne avec plusieurs types :

- `Depot<liver>`
- `Depot<videoCours>`

Une recherche retourne directement le bon type :

```java
liver l = Depot_liver.search(id);
videoCours v = Depot_video.search(id);
```

Aucun cast manuel n’est nécessaire.

---
