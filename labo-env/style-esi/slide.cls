%=====================================================================
%						slide.cls
%
%	Classe pour des slides à l'ÉSI (utilise beamer)
%=====================================================================

\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{style-esi/slide}[2018/06/01 Classe pour des slides a l'ESI]

%=====================================================================
% On se base sur beamer
%=====================================================================

%--- Toutes les options passées à cette classe sont données à beamer
\DeclareOption*{\PassOptionsToClass{\CurrentOption}{beamer}}
\ProcessOptions\relax
%--- On appelle beamer avec qq options nécessaires/utiles
\LoadClass[xcolor=table]{beamer}

%=====================================================================
% On inclut la version .sty
% Dans "LATEX2ε for class and package writers" il est plutôt conseillé
% de tout mettre ici et que le .sty l'utilise.
%=====================================================================

\RequirePackage{style-esi/slide}