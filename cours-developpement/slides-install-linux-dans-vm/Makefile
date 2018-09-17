# ===== Cibles =====
# session : un pdf par séance
# full    : un pdf complet pour toutes les séances (version étudiant)
# prof    : idem full mais avec notes
# notes   : juste les notes
# all     : tout
# default : prof (pour avoir les notes)
# ==================
 
# =============
# Configuration
# =============

# Noms des dossiers utilisés
# --------------------------
# Tous les sources sont dans SRC
# Tout se construit dans BUILD
# Les PDF finaux sont dans DIST

SRC   = sources
BUILD = build
DIST  = dist

# Noms utilisés pour les fichiers
# -------------------------------
# Les différents documents maitres
# - version etudiant              : NOM-COMPLET.tex
# - version prof (notes includes) : NOM-PROF.tex
# - notes uniquement              : NOM-NOTES.tex
# - document commun               : NOM-COMMON.tex

# Les différentes leçons sont dans les fichiers   : NOM-CHAPITRE-*.tex
# On donne également tous les fichiers de support dont dépendent les .tex

NOM-COMPLET  = dev1-jav-install-linux
NOM-PROF     = $(NOM-COMPLET)-prof
NOM-NOTES    = $(NOM-COMPLET)-notes
NOM-CHAPITRE = seance
NOM-COMMON   = $(NOM-COMPLET)-master
#SUPPORT      = $(SRC)/esi.sty $(SRC)/toc.tex
SUPPORT      = $(SRC)/esi.sty

# Options pour Rubber
# -------------------
# -v : verbeux
# -f : force au moins une compilation (je ne sais plus pourquoi c'est utile)
# --pdf : génère du PDF via pdflatex
# --into : Indique où générer les fichiers de la compilation

RUBBEROPT = -v -f --pdf --into $(BUILD) 

# =========================================
# Notes de syntaxe pour comprendre la suite
# =========================================

# wildcard : permet d'avoir une liste où les wildcard sont utilés
# basename : enlève l'extension
# notdir   : enlève les dossiers devant
# Dans une cible : '%' est l'équivalent du '*'
# Dans les dépendances et les règles, '$@' signifie la cible
# Dans les dépendances, $* signifie ce qui a été choisi pour le % dans la cible

# ====================================================
# On génère quelques noms à partir de la configuration
# ====================================================

TEX-COMPLET   = $(SRC)/$(NOM-COMPLET).tex
TEX-PROF      = $(SRC)/$(NOM-PROF).tex
TEX-NOTES     = $(SRC)/$(NOM-NOTES).tex
TEX-COMMON    = $(SRC)/$(NOM-COMMON).tex

PDF-COMPLET   = $(DIST)/$(NOM-COMPLET).pdf
PDF-PROF      = $(DIST)/$(NOM-PROF).pdf
PDF-NOTES     = $(DIST)/$(NOM-NOTES).pdf

TEX-CHAPITRES   = $(wildcard $(SRC)/$(NOM-CHAPITRE)*.tex)
LISTE-CHAPITRES = $(basename $(notdir $(TEX-CHAPITRES)))
PDF-CHAPITRES   = $(addprefix $(DIST)/$(NOM-COMPLET)-, $(addsuffix .pdf, $(LISTE-CHAPITRES)))

# ==========================================
# Identifie les étapes à demander à Makefile
# ==========================================
# clean   : nettoye les dossiers DIST et BUILD
# chapter : crée les PDF pour les chapitres (les n° peuvent être mauvais)
# all     : les versions complètes + chapitres
#
# debug   : affiche le contenu des variables pour comprendre quand ça va pas
# par défaut : chapter 
# ==========================================

.PHONY: default
.PHONY: clean
.PHONY: chapter
.PHONY: all
.PHONY: prof
.PHONY: complet
.PHONY: notes
.PHONY: init

default: init prof
session: init $(PDF-CHAPITRES)
prof:    init $(PDF-PROF)
full:    init $(PDF-COMPLET)
notes:   init $(PDF-NOTES)
all:     init prof full notes session

# Nettoye tout
clean:
	@echo "On vide $(BUILD) et $(DIST)"
	@rm -rf $(BUILD) $(DIST)

init:
	@mkdir -p $(BUILD)
	@mkdir -p $(DIST)
	
debug:
	@echo "*** SRC-BUILD-DIST : $(SRC)-$(BUILD)-$(DIST)"
	@echo "*** NOM-COMPLET    : $(NOM-COMPLET)"
	@echo "*** NOM-PRINT      : $(NOM-PRINT)"
	@echo "*** NOM-COMMON     : $(NOM-COMMON)"
	@echo "*** NOM-CHAPITRE   : $(NOM-CHAPITRE)"
	@echo "*** TEX-COMPLET    : $(TEX-COMPLET)"
	@echo "*** TEX-PRINT      : $(TEX-PRINT)"
	@echo "*** TEX-COMMON     : $(TEX-COMMON)"
	@echo "*** PDF-COMPLET    : $(PDF-COMPLET)"
	@echo "*** PDF-PRINT      : $(PDF-PRINT)"
	@echo "*** SUPPORT        : $(SUPPORT)"
	@echo "*** LISTE-CHAPITRES: $(LISTE-CHAPITRES)"
	@echo "*** TEX-CHAPITRES  : $(TEX-CHAPITRES)" 
	@echo "*** PDF-CHAPITRES  : $(PDF-CHAPITRES)" 

# Comment créer un pdf du chapitre
# Dépend du source du chapitre + des 2 documents englobants + des supports
# Option rubber : On n'inclut que le chapiter voulu
$(DIST)/$(NOM-COMPLET)-$(NOM-CHAPITRE)-%.pdf : $(SRC)/$(NOM-CHAPITRE)-%.tex $(SUPPORT) $(TEX-COMPLET) $(TEX-COMMON)
	@echo "\n=====  Création ${NOM-CHAPITRE} $*"
	rubber --only $(NOM-CHAPITRE)-$* $(RUBBEROPT) $(TEX-COMPLET)
	mv $(BUILD)/$(NOM-COMPLET).pdf $@

$(PDF-COMPLET) : $(SUPPORT) $(TEX-CHAPITRES) $(TEX-COMPLET) $(TEX-COMMON)
	@echo "\n====== Version complète étudiant (notes exclues)"
	rubber $(RUBBEROPT) $(TEX-COMPLET)
	mv $(BUILD)/$(NOM-COMPLET).pdf $@
	# Il faut reconstruire les chapitres pour être sûr qu'ils aient le bon numéro.
	rm -f $(PDF-CHAPITRES)
	make chapter

$(PDF-PROF) : $(SUPPORT) $(TEX-CHAPITRES) $(TEX-PROF) $(TEX-COMMON)
	@echo "\n======  Version complète prof (notes incluses)"
	rubber $(RUBBEROPT) $(TEX-PROF)
	mv $(BUILD)/$(NOM-PROF).pdf $@

# rubber bugge ici, je fais tout à la main
$(PDF-NOTES) : $(SUPPORT) $(TEX-CHAPITRES) $(TEX-NOTES) $(TEX-COMMON)
	@echo "\n======  Version avec uniquement les notes"
	(cd $(SRC); pdflatex $(NOM-NOTES).tex)
	rm -f $(SRC)/*.log $(SRC)/*.vrb
	mv $(SRC)/$(NOM-NOTES).pdf $@
