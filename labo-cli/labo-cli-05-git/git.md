% git - the stupid content tracker
% Nicolas Richard <nrichard@he2b.be>
% Année 2018-2019

# Contexte
## But
Le but du TD est d'apprendre le maniement basique de Git.

Git est un logiciel de gestion de versions ("revision control" ou "version
control"). Ce type de logiciels, et git en particulier, est utilisé par de
nombreux développeurs, tant en solitaire qu'en équipes, notamment pour :

* revenir et comparer différentes versions de leur code ou tout document 
stocké comme un texte,
* comprendre l'apparition de bugs éventuels
* travailler en équipe

Au travers de ce TD nous vous montrerons comment Git aide à réaliser ces
objectifs.

## Pré-requis
Utilisation basique :

* de la ligne de commande sur Git Bash et linux1
  * éditer des fichiers
  * lancer des commandes
  * copier-coller depuis Windows vers linux1,
* de Netbeans
  * créer un projet Java
* du langage Java
  * écriture sur la sortie standard

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
    gitk
    git remote add <name> <url>
    git remote [-a] -v
    git remote update

Nous décrirons également le fichier `.gitignore`.


# Contenu
## Introduction
### Notion de contrôle de version
Si vous avez déjà écrit un document un peu long, vous vous êtes sans doute déjà
trouvé dans la situation où, après une grosse modification, vous changez d'avis
et décidez que la version précédente était meilleure.

La façon la plus courante de s'en sortir est simplement de faire des copies de
votre travail avant (ou après) chaque modification importante. Si vous écrivez
un fichier `monTravail.txt` et que tout va bien, les versions se succèdent
simplement et ça doit donner ceci :

    monTravail-version-du-3-juin.txt
    monTravail-version-du-12-juin.txt
    monTravail-version-du-13-juin.txt
    monTravail.txt <= Ceci est la version finale.

FIXME : prévoir un petit graphe type
digraph versions-lineaire {
    "3 juin" -> "12 juin" -> "13 juin" -> "monTravail.txt"
}

Cela fonctionne assez bien mais nous verrons que même dans ce cas simple, Git
pourra nous aider.

Cependant, en pratique, il est plus probable que vous obteniez des fichiers un
peu comme ceci (dans l'ordre chronologique) :

    monTravail-version-du-3-juin.txt
    monTravail-version-du-12-juin.txt
    monTravail-version-finale.txt
    monTravail-version-finale-avec-remerciements.txt
    monTravail-version-finale-corrigée.txt
    monTravail-version-finale-corrigée-avec-remerciements.txt
    monTravail-version-vraiment-finale.txt
    monTravail.txt <= Hm, à quoi ça correspond déjà ?

Ceci illustre un point : le processus de création n'est pas toujours linéaire,
même quand on travaille tout seul. Essayez de représenter les liens logiques
entre les différentes versions.

Voici une telle représentation :

FIXME : prévoir un petit graphe type

    digraph versionsNonLineaire {
        minlen=1000;
        juin3 [label="3 juin"];
        juin12 [label="12 juin"];
        corrigee [label="Corrigée"];
        remerciee [label="Avec remerciements"];
        finale [label="Version finale"];
        vraimentFinale [label="Vraiment finale"];
        monTravail [label="monTravail.txt"];
        juin3 -> juin12 -> finale [len=1.2];
        finale -> {corrigee, remerciee} -> vraimentFinale [len=1.7];
        monTravail -> monTravail [label="???"];
    }

En première approche, le travail avec Git ressemblera au travail sans Git :

1. création d'un document
2. sauvegarde dans Git
3. modification du document
4. retour à l'étape 2 (sauf si le document est fini)
5. fini !

À ce stade les aspects importants de Git sont notamment qu'il :
* va gérer pour vous les liens logiques entre les versions,
* vous propose des outils pour comparer et fusionner des versions.

### Environnement de travail
Dans l'école, Git est déjà installé, tant sur les machines Windows que sur le
serveur `linux1`.

Par ailleurs la conception de `Git` est telle que nous allons travailler *dans
un répertoire dédié* à notre projet. Cela peut vous sembler étrange si vous
pensez à l'exemple `monTravail.txt` (dans lequel il n'y a finalement qu'un
document en plusieurs versions) mais d'un autre côté, un projet de programmation
va généralement rassembler de nombreux fichiers qu'il est naturel de mettre dans
un répertoire dédié.

Commençons par créer et aller dans le répertoire `~/dev1/td-git/ex1/` (utilisez `mkdir -p`).

## Création d'un dépôt Git et de commits
### Initialisation : git init
Initialisons un "dépôt Git" dans notre répertoire de travail~:

    git init

Voyez-vous ce qui a changé dans le répertoire courant ?

Si vous ne voyez pas, pensez aux fichiers cachés.

R: un répertoire `.git` est apparu (voir `ls -a`)

Astuce : pour voir tous les fichiers (y compris dans les sous-répertoires) du
répertoire courant, utilisez: `find . -type f`. Essayez aussi `find .` tout seul
pour voir la différence.

### Intermède : créer un projet
Utiliser Git sans projet à construire, c'est un peu comme braquer une caméra de
surveillance sur un mur.

Nous allons donc développer un projet. Il ne sera pas très ambitieux car le but
est d'apprendre Git en moins de 2 heures, mais c'est mieux que rien.

ASTUCE: Si vous avez un projet Java en tête, sentez-vous libre de remplacer le
projet HelloWorld ci-dessous par votre propre projet. Pensez seulement à adapter
les instructions.

ACTION: Lancez NetBeans et créez un projet de type Java Application dans le
répertoire suivant: `Z:\dev1\td-git\` que vous nommez `HelloWorld`. Cliquez
"Finish" mais ne faites rien de plus (ne compilez pas tout de suite).

Les prochaines étapes consisteront en l'élaboration de notre projet. À chaque
étape, nous allons sauver l'état du répertoire, comme une sauvegarde du travail.

### Sélection des fichiers : git add
ACTION: Revenez à Git Bash, et allez dans le répertoire de votre projet
`HelloWorld`. Inspectez le contenu de votre répertoire, puis créez un dépôt Git
dans ce répertoire.

Netbeans crée de nombreux fichiers dans le répertoire du projet, y compris dans
des sous-répertoires. Nous n'allons pas détailler maintenant le contenu de ces
fichiers, mais simplement accepter qu'ils sont là.

Astuce : si vous êtes curieux, vous pouvez regarder précisément quels fichiers
ont été créés par NetBeans (rappel: `find . -type f`).

ACTION: Pour voir ce que Git comprend de votre répertoire, entrez :

    git status

Cette commande ne modifie rien, mais montre l'état des choses. Nous apprendrons
à comprendre ce qu'elle dit, mais pour l'heure concentrons nous sur:

    Untracked files:
      (use "git add <file>..." to include in what will be committed)

        build.xml
        manifest.mf
        nbproject/
        src/

    nothing added to commit but untracked files present (use "git add" to track)

Git nous explique qu'il y a un dépôt à cet endroit, mais qu'aucun fichier n'est
suivi ("tracked"), donc rien n'est enregistré. Git s'attend à ce qu'on lui dise
précisément les fichiers à enregistrer.

ACTION: Commençons par indiquer que nous voulons sauvegarder tous les fichiers
du répertoire `src` :

    git add src
    git status

Vous constatez une différence. Notez que Git a été chercher le fichier `.java`
dans un sous-répertoire.

ACTION: Indiquons maintenant que nous voulons en fait sauvegarder tous les
fichiers du répertoire courant :

    git add .

Pensez à lancer `git status` pour voir ce que Git a compris.

Nous sommes prêt à lancer notre premier sauvegarde. Git appelle cela un
/commit/. Nous parlerons donc de "faire un commit" ou de "committer" ("to make a
commit", ou "to commit").

ASTUCE: Allez voir ce que "to commit" veut dire dans un dictionnaire anglais, et
voyez quel sens s'approche le plus de ce que nous faisons.

### Sauvegarde d'une version : git commit
Il est (presque) obligatoire, avec Git, de donner une description à nos commits.

Notre projet en est au stade où Netbeans a généré des fichiers, sans que rien
d'autre n'ait été fait. Nous pouvons donc décrire l'état du projet par :

    HelloWorld: projet créé avec Netbeans

ACTION: Nous l'indiquons à Git :

    git commit -m "HelloWorld: projet créé avec Netbeans"

N.B.: N'oubliez pas les guillemets.

ACTION: Lisez bien ce que Git vous répond et faites ce qui vous est suggéré
(indiquez *votre* adresse email et *votre* nom).

    git config --global user.email "xxx@student.he2b.be"
    git config --global user.name "Votre Nom"

et:

    git commit --amend --reset-author --no-edit

Vérifiez que Git a bien sauvé votre projet avec `git status`. La réponse devrait être:

    On branch master
    nothing to commit, working directory clean


### Laisser des fichiers de côté : `.gitignore`
Lorsque vous lancez une compilation avec NetBeans, ce dernier crée les fichiers
`.class` (et d'autres fichiers) dans le répertoire `build/` de votre projet.

Ce répertoire ne contiendra jamais rien d'autre que ces produits de compilation.
En conséquence de quoi, il n'est pas pertinent de les préserver dans nos
commits. Nous allons donc le faire savoir à Git.


ACTION: Avant chacune des étapes suivantes, utilisez `ls` et `git status` pour
voir l'état de votre répertoire et de votre dépôt.
1. Lancez: `touch qsdf`
2. Indiquez à git d'ignorer `qsdf` avec: `echo qsdf > .gitignore`
3. Nettoyez tout cela avec `rm qsdf .gitignore`.

Qu'avez vous constaté ?

R : 
1. `qsdf` est apparu.
2. `qsdf` a été ignoré par Git (mais toujours présent), mais `.gitignore` est apparu.
3. `qsdf` et ` .gitignore` ont disparu.

Astuce : cherchez ce que fait `touch` sur l'Internet.
Astuce : le sens du symbole `>` vous sera expliqué dans un TD ultérieur (c'est une redirection)

Nous utiliserons ce fichier `.gitignore` pour éviter que certains types de
fichiers apparaissent dans `git status`.

Par exemple les fichiers `.class` seront ignorés de la sorte : ils sont
re-générés à chaque compilation, ils ne sont donc pas nécessaires pour notre
projet. En fait nous allons ignorer tout ce qui se trouvera dans le répertoire
`build`. 

ACTION:
1. Ignorez le répertoire `build` (de la même manière que nous avions ignoré `qsdf`).
2. Incluez `.gitignore` dans un commit dont le message est ".gitignore: new file"

R:

    echo build > .gitignore
    git add .gitignore
    git commit -m "Ignore le répertoire 'build'"


### Intermède : avancer dans le projet
Il est temps d'avancer dans votre projet en suivant les étapes suivantes :

1. Modifier quelque chose (sous Netbeans ou autre éditeur)
2. Ajouter les fichiers modifiés avec `git add` (utilisez `git status` pour voir ce qui est modifié).
3. Committer.
4. Retour à l'étape 1 pour continuer à avancer.

Pour `HelloWorld` nous vous proposons les quelques étapes simples suivantes.

Notez qu'il est possible que `.gitignore` soit encore modifié automatiquement
par Netbeans. Vous pouvez committer ces changements.

#### Faites afficher "Hello, World !" à votre programme java.

ACTION:

1. Modifiez votre code sous Netbeans (et testez avec F6) pour que votre
   application affiche "Hello, World !" sur la sortie standard.
2. Retournez dans Git Bash, et utilisez `git status` pour constater que votre
   fichier .java a été modifié
3. Créez un commit incluant ce fichier `.java`.

Astuce: Dans Netbeans, tapez `sout` suivi d'un appui sur la touche TAB pour insérer
automatiquement de quoi écrire sur la sortie standard.

#### Créez un test pour votre programme de la façon suivante :

ACTION: Créez le fichier `test.sh` suivant dans votre répertoire projet,
lancez-le avec `sh test.sh`, puis si tout fonctionne, committez.

    #!/bin/sh

    ant jar # Compile le projet

    expected_output='Hello, World !'
    output=$(java -jar "dist/HelloWorld.jar") # Lance le projet et sauve le résultat

    if [ "$output" = "$expected_output" ]; then
        echo Test réussi.
    else
        echo Test échoué.
    fi


#### Modularisez "Hello, World!"
ACTION:
Votre méthode principale `main()` contient sans doute un code tel que

    System.out.println("Hello, World !");

Modifiez cela pour obtenir :

    System.out.println(getHelloMessage());

et écrivez la méthode `getHelloMessage()` pour que le résultat final soit le même. Une telle transformation s'appelle une refactorisation".

Dans Git Bash, utilisez encore `sh test.sh` pour vérifier que tout se passe comme prévu.

Astuce : Dans Netbeans, sélectionnez le texte "Hello, World !" (y compris les
guillemets), et utilisez le raccourci Alt+Enter et choisissez l'option "Introduce
Method". Donnez à cette méthode le nom `getHelloMessage`. /Job done./

#### La suite du projet
Nous développerons notre projet plus tard. Passons à autre chose.

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
