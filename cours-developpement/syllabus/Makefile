BUILD=build
LATEXMK=latexmk -recorder -pdf -outdir=$(BUILD)
RUBBER=rubber --into $(BUILD) --pdf

MASTER=dev1-dev-syllabus-master.tex

rubber: builddirs
	$(RUBBER) $(MASTER)

builddirs:
	mkdir -p build/base
	mkdir -p build/tableau
	mkdir -p build/intro
	mkdir -p build/annexes
	mkdir -p build/complements

latexmk: builddirs
	$(LATEXMK) $(MASTER)

preview: builddirs
	$(LATEXMK) -pvc -interaction=nonstopmode $(MASTER)

clean:
	rm -rf $(BUILD)
