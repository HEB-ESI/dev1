.PHONY: authors
authors:
	@git log --format="%aN <%aE>  " | sort -u
