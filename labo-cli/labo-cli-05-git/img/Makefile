PNGFILES=montravailLineaire.png montravailNonLineaire.png travail-equipe.png branche-without-merge.png branche-with-merge.png


all: $(PNGFILES)

.PHONY: all

$(PNGFILES): %.png: %.dot
	neato -Tpng $< > $@
