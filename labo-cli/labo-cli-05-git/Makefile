xcommentheader=\#+LATEX_HEADER_EXTRA: \usepackage{xcomment}\xcomment{tdaction,tdimportant}


all: git.pdf git.html
	@echo Done!

.PHONY: all

git.pdf: git.org
	emacs --batch git.org -f org-latex-export-to-pdf

git.html: git.org
	emacs --batch git.org -f org-html-export-to-html

git-actions.pdf: git.org
	echo '${xcommentheader}' > git-actions.org
	cat git.org >> git-actions.org
	emacs --batch git-actions.org -f org-latex-export-to-pdf
	rm git-actions.org
