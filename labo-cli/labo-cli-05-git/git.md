% git - the stupid content tracker
% Nicolas Richard <nrichard@he2b.be>
% Année 2018-2019

# Contexte
## But
Le but du TD est d'apprendre le maniement basique de Git.

Git est un logiciel de gestion de versions ("revision control" ou "version
control"). Ce type de logiciels, et git en particulier, est utilisé par de
nombreux développeurs, tant en solitaire qu'en équipes, notamment pour :

* revenir et comparer différentes versions de leur code
* comprendre l'apparition de bugs éventuels
* travailler en équipe

Au travers de ce TD nous vous montrerons comment Git aide à réaliser ces
objectifs.

## Pré-requis
Utilisation basique de la ligne de commande sur Git Bash et linux1

## Savoirs terminaux
Voici les commandes que vous connaitrez à la fin de ce TD.
Revenez-y en fin de TD pour vérifier que vous comprenez chacune d'elle.

    git init
    git status
    git add <file>...
    git commit -m <message>
    git branch [-a]
    git log [--stat]
    git show <commit>
    git diff [--cached]
    git diff <commit1> <commit2>
    git merge <branch>
    git remote add <name> <url>
    git remote [-a] -v
    git remote update

Nous décrirons également `.gitignore`.


# Contenu
## Introduction
### Notion de contrôle de version
Si vous avez déjà écrit un document un peu long, vous vous êtes sans doute déjà
trouvé dans la situation où, après une grosse modification, vous changez d'avis
et décidez que la version précédente était meilleure.

La façon la plus courante de s'en sortir est simplement de faire des copies de
votre travail avant (ou après) chaque modification importante. Si vous écrivez
un fichier `monTravail.doc` et que tout va bien, les versions se succèdent
simplement et ça doit donner ceci :

    monTravail-version-du-3-juin.doc
    monTravail-version-du-12-juin.doc
    monTravail-version-du-13-juin.doc
    monTravail.doc <= Ceci est la version finale.

FIXME : prévoir un petit graphe type
digraph versions-lineaire {
    "3 juin" -> "12 juin" -> "13 juin" -> "monTravail.doc"
}

En pratique, il est probable que vous allez obtenir des fichiers un peu comme
ceci (dans l'ordre chronologique) :

    monTravail-version-du-3-juin.doc
    monTravail-version-du-12-juin.doc
    monTravail-version-finale.doc
    monTravail-version-finale-avec-remerciements.doc
    monTravail-version-finale-corrigée.doc
    monTravail-version-finale-corrigée-avec-remerciements.doc
    monTravail-version-vraiment-finale.doc
    monTravail.doc <= Hm, à quoi ça correspond déjà ?

Ceci illustre un point : le processus de création n'est pas toujours linéaire,
même quand on travaille tout seul. Essayez de représenter les liens logiques
entre les différentes versions[^Ici c'est facile, dans la réalité vous aurez aussi des "Copie de monTravail.doc" dans le tas.].

FIXME : prévoir un petit graphe type
digraph versions-non-lineaire {
    "3 juin" -> "12 juin" -> "finale"
    "finale" -> {"corrigée", "avec remerciements"}
    "corrigée" -> "vraiment finale"
    "avec remerciements" -> "vraiment finale"
    "monTravail.doc" -??-> "monTravail.doc"
}

## Création d'un dépôt Git et de commits
Pour créer un dépôt Git, c'est-à-dire préparer le terrain pour sauver notre travail, il faut "Initialiser un dépôt". Tapez donc :

    git init




### sélection des fichiers : l'index, le cache, la staging area
## Affichage et lecture de l'historique (variante linéaire)
## Création de branches
## Lecture de l'historique (variante arborescente)
## diff et merge
## Lecture de l'historique (variante DAG)
## Gestion des conflits de fusion
## Ajout de /remotes/
### Gitlab

### linux1
## git et NetBeans ??


# Annexe
## Configuration

## Anatomie d'un commit

```
git cat-file commit HEAD
```

## commit, branches, tag et HEAD

## "A..B" versus "A B" : intervalle versus paire de commits
git diff A B -- path


## merge versus cherry-pick

## Nettoyage

Après ce TD vous avez normalement un dépôt Git :

- sur votre `z:\`
- sur votre machine actuelle
- sur `linux1`
- sur l'instance Gitlab de l'ESI

Il y a également des fichiers de configuration "globaux" qui résident sur le `z:\`

Le dépôt Gitlab était un test que vous pouvez maintenant supprimer.
Nous vous suggérons de réellement le supprimer car il existe une limite sur le nombre de dépôts que vous pouvez créer sur Gitlab.
