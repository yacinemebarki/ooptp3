# TP3 oop java Généricité et Réflexivité
---
## Informations:
- **Name:** Yacine Mebarki
- **Matricule:** 242431462209  
- **Group:** 2  
- **Section:** B 
- **Module:** POO2 / Data Structures
---
# 📝 Note

Les explications sont disponibles dans les fichiers `README.md` associés à chaque exercice.
---
# Question 8 exo3:
```txt
En Java, les génériques existent uniquement à la compilation, mais disparaissent à l’exécution (type erasure) donc La JVM ne peut pas créer un objet sans connaître la classe exacte.
On remplace la création directe par une référence explicite du type réel via Class<T> car  Class<T> contient l’information du type réel à l’exécution car La réflexion permet d’appeler dynamiquement le constructeur.
```

---
# 📁 Project Structure
```bash
.
└── src
    └── main
        └── java
            ├── firstexo
            │   ├── DemoGenerics.java
            │   ├── depot.java
            │   ├── Identifiable.java
            │   ├── liver.java
            │   ├── utilitaire.java
            │   └── videoCours.java
            ├── secondexo
            │   ├── CompteUtilisateur.java
            │   ├── MiniInspecteur.java
            │   └── produit.java
            └── thirdexo3
                ├── DemoFabrique.java
                ├── exportcsv.java
                ├── NettoyageTemp.java
                ├── NotificationConsole.java
                ├── operation.java
                └── RegistreOperations.java

6 directories, 15 files
```
---

# Exercice 1 Generics & Repository Management
### path: `src/main/java/firstexo`

### files:

- `DemoGenerics.java`
- `depot.java`
- `Identifiable.java`
- `liver.java`
- `utilitaire.java`
- `videoCours.java`
---

# Exercice 2 Réflexivité en Java (Mini Inspecteur)

### path: `src/main/java/secondexo`

### files:

- `CompteUtilisateur.java`
-  `MiniInspecteur.java`
-  `produit.java`

---


# Exercice 2 Réflexivité en Java (Mini Inspecteur)

### path: `src/main/java/thirdexo`

### files:

- `DemoFabrique.java`
-  `exportcsv.java`
-  `NettoyageTemp.java`
-  `NotificationConsole.java`
-  `operation.java`
-  `RegistreOperations.java`
---

---
