---
title:  \Huge\bf
		{\color{white} Pseudocode }\\
author: |
		\Large\color{white}\bfseries 
		Équipe DEV1
date: 	\Large\tt\color{white}\bfseries 
abstract: |
	\color{white} version 0.1
	\par septembre 2018
geometry: margin=3cm
fontsize: 12pt
highlight-style: tango
header-includes:
	- \renewcommand{\abstractname}{}
	- \renewcommand{\contentsname}{}
	- \usepackage{wallpaper}
	- \DeclareUnicodeCharacter{22C5}{·}
	- \usepackage{minitoc}
	- \usepackage{pdfpages}
	- \setcounter{secttocdepth}{3}
	- \renewcommand{\stctitle}{}
	- \usepackage[font=small,labelfont=sc,width=.8\textwidth, labelsep=endash]{caption}
	- \usepackage{url}
	- \let\oldhref\href
	- \renewcommand{\href}[2]{\oldhref{#1}{#2}\footnote{\url{#1}}} 
	- \usepackage{resources/styles/pseudocode}
	- \usepackage{resources/styles/esi-flowchart}
	- \usepackage{floatflt}
---

<!-- ajout d'une image et du logo -->
\ThisULCornerWallPaper{1}{resources/images/algo2.png}
\vspace{9mm}
\begin{flushright}
\includegraphics[width=40mm]{resources/images/HE2B-Logo-ESI.png}
\end{flushright}


\dosecttoc
\setcounter{tocdepth}{1}
\tableofcontents

\clearpage

Le **pseudocode** est une manière de décrire un algorithme en langage presque 
naturel. C'est un ensemble de phrases représentant l'enchainement des opérations
nécessaires à la résolution du problème. 


Par exemple, un jardinier pourrait dire: 

> Tant que l'on est pas arrivé à la fin de la route, faire un trou et repiquer
> un poireau. 

Nous allons formaliser un peu tout ça. 

On pourrait croire à priori, qu'il existe autant de pseudocodes que de personnes
décrivant un algorithme. C'est un peu vrai… et faux. Dès lors que l'on veut
décrire un algorithme, c'est pour le partager avec d'autres… Ceci implique que
certaines régles soient définies. 

Nous présentons ici ce que nous utilisons dans les notes et pensons être le
sous-ensemble minimal de règles à respecter pour ne pas être (trop) ambigu et
pour ne pas devoir *apprendre* le pseudocode. Ceci dit, si le lecteur d'un
algorithme trouve que c'est ambigu, c'est ambigu. 



# Un traitement, un mot, un algorithme

Pour faire appel à un traitement, une opération, un algorithme, nous utilisons
un mot en *mixedCase*. 

Un mot en *mixedCase* est un mot composé de plusieurs mots ! Collés.
Chaque mot commencant par une majuscule. Excepté le premier. Par exemple:
\pc{faireUnTrou}, \pc{remplirLeFiltre}, \pc{putLeekInHole}… 

\begin{pseudocode}
	\Stmt faireUnTrou()
	\Stmt remplirLeFiltre()
	\Stmt putLeekInHole()
\end{pseudocode}

Remarque:

- si nous écrivons \pc{faireUnTrou()}, nous comprenons *faire un trou*. L'usage
des parenthèses n'est pas toujours utile. 

Certaines actions sont des actions élémentaires qui ne demandent aucune
explication, d'autres sont plus complexes et doivent être expliquées. Elles le
sont dans un algorithme. Un algorithme est une suite d'opérations… qui sont des
actions élémentaires ou des opérations plus complexes qui doivent être
expliquées… et ainsi de suite. 

\clearpage

Définir un algorithme, c'est: 

- lui donner un nom représentatif de ce qu'il fait;
- commencer par le mot \pc{algorithm} (ou \pc{algorithme} ou encore \pc{algo}
voire rien);
- **indenter** les opérations de manière à **marquer clairement le bloc**
d'opérations (avec une ligne verticale blanche, ou au crayon, ou avec des
accolades, ou sans, ou… du moment que l'ensemble est cohérent).

\begin{pseudocode}
	\Algo{plantOneLeek}{}{}
	   \Stmt makeHole()
	   \Stmt putLeekInHole()
	\EndAlgo
\end{pseudocode}


# Les types

Nous voulons distinguer les nombres entiers des nombres décimaux. Nous voulons
distinguer (parfois)  les caractères des chaines de caractères. Nous voulons
pouvoir représenter des tableaux et des types plus complexes, définis par
le ou la dévelopeur·euse.

Nous utiliserons: 

- **integer** pour les nombres entiers et comprenons *int*, *long*, *entier*…
- **real** pour les nombres décimaux et comprenons *double*, *float*, *réel*,
*pseudoréel*…
- **char** pour les caractères et comprenons *character*…;
- **string** pour les chaines et comprenons *chaine* et ne nous inquiétons pas
de la casse;
- **[]** pour les tableaux. Ainsi, nous noterons un tableau d'entiers:
*integer[]*;

Pour déclarer une variable:

\begin{pseudocode}
	\Decl{beautifulReal}{real}
\end{pseudocode}

Pour l'initialiser, lui donner une valeur, nous utilisons naturellement le
symbole **\pc{=}**:

\begin{pseudocode}
	\Let beautifulInteger \Gets 7
\end{pseudocode}

\clearpage

Remarque

- nous utilisons \pc{=} pour l'assignation et \pc{==} pour tester l'égalité.
Nous comprenons l'usage de \pc{$\leftarrow$} pour l'assignation… mais nous
déconseillons d'utiliser \pc{=} pour tester l'égalité. 


Pour les types plus complexes nous utiliserons le mot **structure** (et nous
comprenons le mot classe):

\begin{pseudocode}
	\Struct{StructureName}
		\Decl{fieldName1}{type1}
		\Decl{fieldName2}{type2}
		\Stmt \dots
		\Decl{fieldNameN}{typeN}
	\EndStruct
\end{pseudocode}

# Les structures alternatives, \pc{if}

Pour représenter le **si** (**if**) nous utiliserons cette notation:

\begin{pseudocode}
	\If {condition}
		\Stmt statement
	\EndIf
\end{pseudocode}

où:

- \pc{condition} est une expression booléenne… une expression vraie ou fausse;
- \pc{statement} est une instruction (une opération) ou plusieurs.

Exemple: 

\begin{pseudocode}
	\If {thereAreLeeks}
		\Stmt plantOneLeek 
	\EndIf
\end{pseudocode}

Remarques:

- dans les notes, nous utiliserons l'anglais mais le français est bien aussi;
- il est important de marquer le bloc d'instructions. Nous utilisons une barre
verticale mais un \pc{endIf} ou des accolades pourrait faire l'affaire;
- le mot *then* peut être omis ou remplacé par des parenthèses lorsque 
la condition ne s'étend pas sur plusieurs lignes par exemple;
- nous utilisons \pc{if-then} mais nous comprenons \pc{si-alors}[^f1];
- …

[^f1]:Nous comprenons aussi \pc{if-alors} ou \pc{si-then}… mais bon, *faut pas
  pousser* !


Nous écrirons les autres structures conditionnelles comme suit:

\begin{pseudocode}
	\If {condition}
		\Stmt statement
	\Else 
		\Stmt statement
	\EndIf
\end{pseudocode}

\begin{pseudocode}
	\If {condition}
		\Stmt statement
	\ElsIf {condition} 
		\Stmt statement
	\Else
		\Stmt statement
	\EndIf
\end{pseudocode}

À nouveau nous comprenons si l'on délimite les blocs par des accolades et les 
expressions conditionnelles par des parenthèses[^f2]. 

[^f2]: Et pas l'inverse parce qu'aucun langage ne fait ça. 

## La structure \pc{switch}

Le *selon que* (\pc{switch}), s'écrit:

\begin{pseudocode}
	\Switch{dayNumber}
		\Case{1} dayName \Gets "lundi"
		\Case{2} dayName \Gets "mardi"
		\Case{3} dayName \Gets "mercredi"
		\Case{4} dayName \Gets "jeudi"
		\Case{5} dayName \Gets "vendredi"
		\Case{6} dayName \Gets "samedi"
		\Case{7} dayName \Gets "dimanche"
	\EndSwitch
\end{pseudocode}

Remarques:

- nous utilisons *switch* mais nous comprenons *selon que*;
- nous ajoutons un \pc{case} pour chaque cas mais nous comprenons *cas* ou
l'utilisation d'un tiret ou autre;
- en langage Java le \pc{switch} est associé au \pc{break}. Nous n'en utilisons
pas mais nous comprenons s'il y en a. 

… du moment que l'ensemble est cohérent. 


# Les structures répétitives

Nous formalisons les structrures répétitives les plus courantes: *tant que*
(*while*), *faire tant que* (*do while*) et *pour* (*for*). 

\begin{pseudocode}
	\While {condition}
		\Stmt statement
	\EndWhile
\end{pseudocode}

\begin{pseudocode}
	\Repeat 
		\Stmt statement
	\EndRepeat {condition}
\end{pseudocode}

Le **\pc{for}** est utilisé de deux manières différentes; pour parcourir de
*n* à *m* avec éventuellement un pas ou en définissant une situation de départ,
un condition de fin et un incrément. 

Pour un simple parcours, nous écrirons:

\begin{pseudocode}
	\For {i}{n}i{m}
		\Stmt statement
	\EndFor
	\For[-1] {i}{m}{n}
		\Stmt statement
	\EndFor
\end{pseudocode}

\clearpage

Pour un *for* plus général, nous écrirons:

\begin{pseudocode}
	\Forfor{initialisation}{condition}{update}
		\Stmt statement
	\EndForfor
\end{pseudocode}

Remarques:

- nous utilisons des mots anglais mais comprenons les équivalents français;
- il est toujours possible d'ajouter des parenthèses pour accroitre la
lisibilité.

# Les paramètres et la valeur de retour

Un paramètre est une valeur passée à un algorithme. Il vient entre parenthèses
après le nom de l'algorithme. Il peut être *en entrée* et ne sera pas modifié
par l'algorithme ou *en entrée-sortie* auquel cas, il pourra être modifié par
l'algorithme. Il peut y en avoir plusieurs, de sortes différentes, séparés par
une virgule. 

- en entrée, il peut être affublé d'une flèche:

\begin{pseudocode}
	\Algo {algorithmName}{\Par{paramName \In}{type}}{}
		\Stmt statement
	\EndAlgo 
\end{pseudocode}

- en entrée/sortie, il sera affublé d'une double flèche:

\begin{pseudocode}
	\Algo {algorithmName}{\Par{paramName \InOut}{type}}{}
		\Stmt statement
	\EndAlgo 
\end{pseudocode}


La valeur de retour est la valeur que retourne l'algorithme. Elle n'est pas
obligatoire. Nous la signalons pas une flèche « \pc{$\rightarrow$} » et
l'algorithme devra se terminer en « retournant » une valeur en utilisant
**\pc{return}**. 

\begin{pseudocode}
	\Algo {algorithmName}{}{type}
		\Stmt statement
		\Return expression
	\EndAlgo 
	
	\Algo {algorithmName}{\Par{paramName1 \In}{type}
		\Par{paramName2 \InOut}{type}
		}{type}
		\Stmt statement
		\Return expression
	\EndAlgo 
\end{pseudocode}

# Les interactions avec l'utilisateur

Pour faire une lecture « au clavier », nous utiliserons simplement **\pc{read}**
et pour une écriture à l'écran, **\pc{print}**. 

\begin{pseudocode}
	\Read a
	\Read "Entre une valeur: ", a
	\Write b
	\Write "L'aire du rectangle vaut: " area
\end{pseudocode}

# Les commentaires

Les commentaires commencent par **\pc{//}**. 

\begin{pseudocode}
	\LComment Fisrt comment
	\Stmt statement \RComment An other (rigth) comment
\end{pseudocode}

Nous comprenons également **\pc{\#}**, **\pc{/* … */}**… 


# Exemple

\begin{pseudocode}
	\Algo{friendsAtHome}{}{}
		\Decl{friendsAreThere}{boolean} \Gets true
		\While{friendsAreThere}
			\If{noMoreCoffee} 
				\Stmt makeCoffee()
			\EndIf 
			friendsAreThere \Gets lookArround()
		\EndWhile 
	\EndAlgo 

	\Algo{makeCoffee}{}{}
		\LComment Check ingredients
		\If{ !hasCoffeePowder 
			OR !hasFilter}
			\Write Missing ingredients
		\Else 
			\Stmt putWaterInPercolator
			\Stmt putFilterInPercolator
			\Stmt putCoffeeInFilter
			\Stmt pushOnButton
		\EndIf
	\EndAlgo 
	
	\Algo{lookArround}{}{boolean}
		\LComment Not yet implemented TODO
	\EndAlgo 
\end{pseudocode}

\vfill


\includegraphics[width=20mm]{resources/images/cc-by-sa.png}


[deviantart]:http://deviantart.com
[by]:https://www.deviantart.com/art/Simple-MSP430-Game-Subroutine-Flowcharts-302014732
[lien]:https://fr.sharelatex.com/blog/2013/08/29/tikz-series-pt3.html
