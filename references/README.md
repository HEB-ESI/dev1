# Références générales pour le cours et pour l'unité d'enseignement



## Outils

Les notes sont générées à partir d'un document *markdown*/*LaTeX*. Lorsque
*markdown* ne permet pas de faire ce que l'on veut, on ajoute du *LaTeX*. 

Les fichiers pdf sont générés en utilisant **pandoc**[^pourquoi-latex_macros]. 

```
pandoc reference-organigramme.md -o reference-organigramme.md.pdf\
    --highlight-style=tango -f markdown-latex_macros
```

[^pourquoi-latex_macros]: L'option `-f markdown-latex_macros` indique
à pandoc de ne pas faire trop le malin et de laisser les commandes
LaTeX à LaTeX. cf http://pandoc.org/MANUAL.html#latex-macros

Pour les **organigrammes**, inclure la feuille de style `esi-flowchart.sty` qui 
contient un exemple d'utilisation. 

### Prérequis

- *pandoc* (voir ci-dessous)
- *LaTeX* et les packages renseignés en début de fichiers

#### Installation de pandoc
Pour installer pandoc sur les ordi de l'école pour utilisation dans Git Bash:
(Adapté de: https://pandoc.org/installing.html)

- (S'assurer que MikTeX parvient à installer des packages s'il en a besoin.)
- Télécharger https://github.com/jgm/pandoc/releases/download/2.2/pandoc-2.2-windows-x86_64.zip
- Dézipper dans un répertoire de votre choix (j'utilise `z:\opt` car `z:\` est le $HOME dans Git Bash)
- Depuis Git Bash : Ajouter ce répertoire à votre PATH (.bashrc) *ou* créer un lien symbolique depuis `z:\bin` (car ce dernier est déjà dans votre PATH)
  ```
  ln -sv ~/opt/pandoc-2.2/pandoc.exe ~/bin/
  ```

- Enjoy ! Testez avec
  ```
  pandoc -o README.pdf README.md
  ```

## Auteurs

- Pierre Bettens <pbettens@he2b.be>
- Nicolas Richard <nrichard@he2b.be>
