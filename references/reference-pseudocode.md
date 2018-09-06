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
\ThisULCornerWallPaper{1}{resources/images/simple_msp430_cut.png}
\vspace{-4.5mm}
\begin{flushright}
\includegraphics[width=40mm]{resources/images/HE2B-Logo-ESI.png}
\end{flushright}


\dosecttoc
\setcounter{tocdepth}{1}
\tableofcontents

\bigskip 
\bigskip 

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

Nous présentons ici ce que nous pensons être le sous-ensemble minimal de règles
à respecter pour ne pas être (trop) ambigü et pour ne pas devoir *apprendre* le
pseudocode. Ceci dit, si le lecteur trouve que c'est ambigü, c'est ambigü. 



# Un traitement, un mot, un algorithme

Pour faire appel à un traitement, une opération, un algorithme, nous utilisons
un mot en *mixedCase*. 

Un mot en *mixedCase* est un mot composé de plusieurs mots. Collés.
Chaque mot commencant par une majuscule excepté le premier. Par exemple:
\pc{faireUnTrou}, \pc{remplirLeFiltre}, \pc{putLeekInHole}… 

\begin{pseudocode}
	\Stmt faireUnTrou()
	\Stmt remplirLeFiltre()
	\Stmt putLeekInHole()
\end{pseudocode}

Certaines actions sont des actions élémentaires qui ne demandent aucune
explication, d'autres sont plus complexes et doivent être expliquées. Elles le
sont dans un algorithme. Un algorithme est une suite d'opérations… qui sont des
actions élémentaires ou des opérations plus complexes qui doivent être
expliquées… et ainsi de suite. 

Définir un algorithme, c'est: 

- lui donner un nom représentatif de ce qu'il fait;
- commencer par le mot \pc{algorithm} (ou \pc{algorithme} ou encore \pc{algo});
- **indenter** les opérations de manière à **marquer clairement le bloc**
d'opérations (avec une ligne verticale blanche, ou au crayon, ou sans, ou… du
moment que l'ensemble est cohérent).

\begin{pseudocode}
	\Algo{plantOneLeek}{}{}
	   \Stmt makeHole()
	   \Stmt putLeekInHole()
	\EndAlgo
\end{pseudocode}


# Les structures conditionnelles, \pc{if}

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
verticale mais un \pc{endIf} pourrait faire l'affaire;
- nous utilisons \pc{if-then} mais nous comprenons \pc{si-alors}[^f1];

[^f1]:Nous comprenons aussi \pc{if-alors} ou \pc{si-then}… mais bon, *faut pas
  pousser* !

- …

Les autres structures conditionnelles se représentent comme suit:

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
l'utilisation d'un tiret;
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

\begin{pseudocode}
	\For {i}{1}{n}
		\Stmt statement
	\EndFor
\end{pseudocode}

Remarques:

- nous utilisons des mots anglais mais comprenons les équivalents français;
- todo

# Les paramètes

todo 

# Les entrées-sorties

todo





# Exemple

todo à revoir

\begin{center}
\begin{tikzpicture}[node distance=2cm]
\node (start) [startstop] {Start};
\node (in1) [io, below of=start] {Input};
\draw [arrow] (start) -- (in1);
\node (pro1) [process, below of=in1] {Process 1};
\draw [arrow] (in1) -- (pro1);
\node (dec1) [decision, below of=pro1, yshift=-15mm] {Question ?};
\draw [arrow] (pro1) -- (dec1);
\node (pro2a) [process, below of=dec1, yshift=-15mm] {Process 2 if YES};
\node (pro2b) [process, right of=pro2a, xshift=3cm] {Process 2 if NO };
\draw [arrow] (dec1) -- node[anchor=east] {yes} (pro2a);
\draw [arrow] (dec1) -- node[anchor=south] {no} (pro2b);
\node (out1) [io, below of=pro2a] {Output};
\draw [arrow] (pro2a) -- (out1);
\draw [arrow] (pro2b) -- (out1);
\node (stop) [startstop, below of=out1] {Stop};
\draw [arrow] (out1) -- (stop);
\end{tikzpicture}
\captionof{Organigramme}{Exemple récapitulatif}
\end{center}


\vfill

*Crédit photo chez [DeviantArt][deviantart] par [Susyspider][by].Code des
symboles issus de [ShareLaTeX][lien].*

\includegraphics[width=20mm]{resources/images/cc-by-sa.png}


[deviantart]:http://deviantart.com
[by]:https://www.deviantart.com/art/Simple-MSP430-Game-Subroutine-Flowcharts-302014732
[lien]:https://fr.sharelatex.com/blog/2013/08/29/tikz-series-pt3.html
