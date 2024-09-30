# TP1: Insertion et Récupération des Données avec JDBC 
# Introduction:
Ce TP a pour objectif de maîtriser l’insertion et la récupération de données dans une base de données MySQL ou Oracle en utilisant Java. L'objectif principal est de mettre en œuvre l'API JDBC en manipulant les objets Connection, Statement et ResultSet tout en gérant les erreurs potentielles.
# Prérequis :
.Java JDK installé
.MySQL installé
.IDE ( NetBeans)
.JDBC Driver (MySQL JDBC Driver )
# Étapes Suivies:
# 1. Création du Projet Java:
Dans cette étape, j'ai créé un projet Java à l'aide de l'IDE NetBeans pour entamer le développement de l'application. J'ai commencé par lancer NetBeans, puis j'ai cliqué sur "Menu File" et sélectionné "New Project". Dans la fenêtre qui s'est ouverte, j'ai choisi "Java Application" comme type de projet. Ensuite, j'ai donné le nom demo à ce projet pour faciliter son identification et j'ai confirmé les paramètres de création.
# 2. Configuration du Pilote JDBC:
Dans cette étape, j'ai configuré le pilote JDBC MySQL nécessaire pour permettre la connexion entre mon application Java et la base de données MySQL. Pour ce faire, j'ai fait un clic droit sur le projet dans NetBeans, puis j'ai sélectionné "Properties" pour accéder aux propriétés du projet. Ensuite, dans l'onglet "Libraries", j'ai cliqué sur "Add Library" et choisi "MySQL JDBC Driver" dans la liste des bibliothèques disponibles. Cette action a permis d'ajouter le pilote JDBC MySQL au projet, rendant ainsi possible la communication entre mon application Java et la base de données MySQL.
# 3. Création de la Base de Données et de la Table:
Dans cette étape, j'ai utilisé l'interface phpMyAdmin pour créer la base de données nécessaire à mon projet. J'ai commencé par accéder à phpMyAdmin, où j'ai ajouté une nouvelle base de données que j'ai nommée db. Ensuite, j'ai créé une table appelée Site dans cette base de données. La table comprend deux colonnes : la première colonne, id, est de type INT, définie comme clé primaire et configurée en auto-incrémentation (A_I) pour que chaque enregistrement ait un identifiant unique. La seconde colonne, nom, est de type VARCHAR et permet de stocker les noms des sites.
# 4. Insertion des Données:
Dans cette étape, j'ai d'abord créé une classe Java nommée Site dans le package beans. Cette classe représente les entités de la table Site dans ma base de données. J'y ai défini deux attributs : id et nom. J'ai ensuite ajouté un constructeur par défaut ainsi qu'un constructeur paramétré pour initialiser les objets Site avec un nom spécifique. De plus, j'ai mis en place les méthodes "getter" et "setter" pour permettre l'accès et la modification de ces attributs.Par la suite, j'ai créé une classe Test dans laquelle j'ai ajouté une méthode save. Cette méthode permet d'insérer un objet Site dans la table Site de la base de données db. J'ai utilisé les objets Connection et Statement de JDBC pour établir la connexion à la base de données et exécuter une requête SQL INSERT. Cette requête insère les données de l'objet Site dans la table, assurant ainsi la persistance des informations dans la base de données.
# 5. Récupération des Données:
Dans cette étape, j'ai cree une classe nommée Main ou j'ai ajouté une méthode main pour tester la fonctionnalité de récupération des données. J'ai appelé la méthode load que j'avais précédemment créée afin de vérifier qu'elle pouvait récupérer les enregistrements de la table Site de manière efficace. En exécutant cette méthode main, j'ai pu observer les données qui avaient été insérées dans la base de données, confirmant ainsi que la méthode load fonctionnait correctement et affichait les informations présentes dans la table Site. Cela a validé que l'opération de récupération des données à partir de la base de données était réussie.
# Conclusion
Ce projet permet de se familiariser avec les bases de l'utilisation de JDBC en Java pour la gestion des bases de données. En plus de l'insertion et la récupération des données, il met en lumière les bonnes pratiques de gestion des connexions et des ressources.
# demonstration vidéo :
https://github.com/user-attachments/assets/6f5bc7f7-f4e2-4873-b369-9063f7b3611b
