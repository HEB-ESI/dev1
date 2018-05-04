---
title:  \Huge\bf
		{\color{white}Titre}\\ 
		{\color{white}Sous titre ou suite}
author: \Large\color{white}\bfseries 
		Pierre Bettens
date: 	\Large\tt\color{white}\bfseries 
		Sujet
abstract: |
	\color{white} version 0.1
	\par janvier 2016
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
---

<!-- ajout d'une image et du logo -->
\ThisULCornerWallPaper{1}{resources/images/pigeons.jpg}
\vspace{-9mm}
\begin{flushright}
\includegraphics[width=40mm]{resources/images/HE2B-Logo-ESI.png}
\end{flushright}


\dosecttoc
\setcounter{tocdepth}{1}
\tableofcontents

# Encore un titre

\secttoc

## Sous titre
bla bla bla

```java
public class Hello{
	public static void main (String[] args) { 
		 System.out.println("plop");
	}
}
```



\vfill

*Crédit photo chez [DeviantArt][deviantart] par [baspunk][by] parce…*

\includegraphics[width=20mm]{resources/images/cc-by-nc-sa.png}


[deviantart]:http://deviantart.com
[by]:http://baspunk.deviantart.com/art/the-shit-squad-298522568
