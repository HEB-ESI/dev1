%=====================================================================
%				    style-esi/syllabus.cls
%
%	Classe pour des syllabus à l'ÉSI (utilise book)
%=====================================================================

\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{style-esi/syllabus}[2018/06/01 Classe pour des syllabus a l'ESI]

%=====================================================================
% On se base sur book
%=====================================================================

%--- Toutes les options passées à cette classe sont données à book
\DeclareOption*{\PassOptionsToClass{\CurrentOption}{book}}
\ProcessOptions\relax
%--- On appelle book (a été testé avec a4paper et twoside)
\LoadClass{book}

%=====================================================================
% On inclut la version .sty
% Dans "LATEX2ε for class and package writers" il est plutôt conseillé
% de tout mettre ici et que le .sty l'utilise.
%=====================================================================

\RequirePackage{style-esi/syllabus}