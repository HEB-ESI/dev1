---
title:  \Huge\bf
		{\color{white} Organigramme }\\
		\Large
		{\color{white}Ordinogramme ou organigramme de programmation}
author: |
		\Large\color{white}\bfseries 
		Équipe DEV1
date: 	\Large\tt\color{white}\bfseries 
abstract: |
	\color{white} version 0.1
	\par mai 2018
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


Un **organigramme de programmation** ou un **ordinogramme** — nous utiliserons
le terme raccourci d'**organigramme** — est un graphique à base de symboles
représentant des données ou des traitement. Ce graphique analyse un problème de
traitement de l'information, représentant l'enchainement des opérations d'un
programme. 

Les différents symboles ont un sens particulier. Par exemple un **rectangle**
représente un traitement. 

Voyons les différents symboles que nous allons utiliser.


# Le rectangle pour les traitements

\begin{floatingfigure}[r]{.3\linewidth}
	\begin{tikzpicture}
		\node (traitement) [process] {Mon joli traitement};
	\end{tikzpicture}
\end{floatingfigure}

Le rectangle sert à représenter un traitement, une tâche ou encore une opération. 

Exemples:

- Remplir le filtre de café.
- Incrémenter *i* de 1.


# Le losange pour les décisions

\begin{floatingfigure}[r]{.3\linewidth}
	\begin{tikzpicture}
		\node (si) [decision] {Ma jolie question};
	\end{tikzpicture}
\end{floatingfigure}

Le losange sert à représenter une décision. Il permet de poser une question et 
le flux de traitement change en fonction de la réponse. 

Exemples:

- Est-ce qu'il reste du café dans le pot ?
- La variable *i* vaut-elle 5 ? 

\vspace{1cm}

\begin{center}
\begin{tikzpicture}[node distance=2cm]
		\node (si) [decision] {Ma jolie question};
		\node (traitement1) [process, below of=si, yshift=-2cm] 
			{Mon joli traitement si oui};
		\node (traitement2) [process, right of=si, xshift=3cm] 
			{Mon joli traitement si non};
		\draw [arrow] (si) -- node[anchor=east] {oui} (traitement1);
		\draw [arrow] (si) -- node[anchor=south] {non} (traitement2);

\end{tikzpicture}
\captionof{Organigramme}{Exemple de décision}
\end{center}


# Le parallélogramme pour les entrées-sorties

\begin{floatingfigure}[r]{.3\linewidth}
	\begin{tikzpicture}[node distance=2cm]
		\node (io) [io] {Ma jolie entrée};
		\node (io2) [io, below of=io] {Ma jolie sortie};
	\end{tikzpicture}
\end{floatingfigure}

Le parallélogramme sert à représenter des entrées-sorties du programme. 

Une entrée du programme est ce que l'utilisateur entre tandis qu'une sortie est typiquement un affichage sur la sortie standard, à l'écran. 

Exemples:

- Quel est ton nom ?
- Le résultat du calcul est: 27.


# Le cercle pour le début et la fin

\begin{floatingfigure}[r]{.4\linewidth}
	\begin{tikzpicture}[node distance=2cm]
		\node (start) [startstop] {Début};
		\node (stop) [startstop, right of=start, xshift=2cm] {Fin};
	\end{tikzpicture}
\end{floatingfigure}

Le cercle — ou le rectangle à coins arrondis — sert à représenter le début de
l'algorithme.

À la place de « Début » ou « Fin », on peut écrire le nom de la procédure ou de
la méthode que l'on décrit. 

\bigskip
\bigskip


# Le double rectangle pour les sous-programmes

\begin{floatingfigure}[r]{.3\linewidth}
	\begin{tikzpicture}[node distance=2cm]
		\node (subprocess) [subprocess] {\nodepart{two} Appel de procédure};
	\end{tikzpicture}
\end{floatingfigure}

Le double rectangle sert à l'appel d'une procédure, méthode, fonction définie
ailleurs. 


\bigskip
\bigskip

# Les flèches pour les unir tous

Les flèches entre les différents symboles servent à indiquer le sens de lecture.



# Exemple

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
