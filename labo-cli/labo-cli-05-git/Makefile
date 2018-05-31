PNGFILES=montravailLineaire.png montravailNonLineaire.png travail-equipe.png branche-without-merge.png branche-with-merge.png

all: git.pdf git.html

.PHONY: all

git.pdf git.html: %: git.md $(PNGFILES)
	pandoc -s -o $@ $<

$(PNGFILES): %.png: %.dot
	neato -Tpng $< > $@
