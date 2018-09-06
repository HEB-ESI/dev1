xcommentheader=\#+LATEX_HEADER_EXTRA: \usepackage{xcomment}\xcomment{tdaction,tdimportant}
emacs_cmd=emacs --batch


all: git.pdf git.html
	@echo Done!

.PHONY: all

git.pdf: git.org
	${emacs_cmd} git.org -f org-latex-export-to-pdf

git.html: git.org
	${emacs_cmd} git.org -f org-html-export-to-html

git-actions.pdf: git.org
	echo '${xcommentheader}' > git-actions.org
	cat git.org >> git-actions.org
	${emacs_cmd} git-actions.org -f org-latex-export-to-pdf
	rm git-actions.org
