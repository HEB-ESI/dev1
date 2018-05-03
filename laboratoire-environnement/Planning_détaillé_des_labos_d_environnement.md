**Proposition de plans pour l’AA Environnement (Système) **

Indiquez vos commentaires soit comme commentaires soit dans la zone
grise en dessous de chacune des propositions (en commençant par votre
acronyme)

Merci

David

Proposition DNA
---------------

Propositions pour le cours de Proposition 12H sur 6 séances étalées sur
tout Q1

60h labo = 12h sys et 48 java

Par ½ groupe par semaine : SYS 2h tous les 15 jours et Java 4 h par
semaine.

Ce qui est proposé n’est qu’une “proposition” elle doit être affinée.

  ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  COURS 1     1H   **Découvrir et installer Linux**                     Installer linux (version ???)                                                                  a
                   ================================                                                                                                                    
                                                                        Partitionner son disque                                                                        
                                                                                                                                                                       
                                                                        Installez Linux dans une machine virtuelle                                                     
                                                                                                                                                                       
                                                                        Installer un programme                                                                         
  ----------- ---- ---------------------------------------------------- ---------------------------------------------------------------------------------------------- ---------------------------
              1H   **Manipuler la console et les fichiers**             cd, ls, mkdir, rm, mv, dossier courant etc…                                                    
                   ========================================                                                                                                            
                                                                        chemin absolu/relatif , groupe, permission, PW, bref tout ce qui faut savoir pour bien gérer   
                                                                                                                                                                       
                   =                                                                                                                                                   

  COURS 2     2H   **Manipuler la console et les fichiers**                                                                                                            
                   ========================================                                                                                                            
                                                                                                                                                                       
                                                                                                                                                                       
                   =                                                                                                                                                   

  COURS 3     2H   **Contrôler les processus et les flux de données**   Extraire, trier et filtrer des données                                                         Evaluation / cours 1 et 2
                   ==================================================                                                                                                  
                                                                        Les flux de redirection                                                                        
                                                                                                                                                                       
                   =                                                    Surveiller l'activité du système                                                               
                                                                                                                                                                       
                                                                        javac, java et package                                                                         

  COURS 4-5   4H   **Automatisez les tâches avec des scripts Bash**     Vi                                                                                             
                   ================================================                                                                                                    
                                                                        Introduction aux scripts shell                                                                 
                                                                                                                                                                       
                   =                                                    Afficher et manipuler des variables                                                            
                                                                                                                                                                       
                                                                        Les conditions                                                                                 
                                                                                                                                                                       
                                                                        Les boucles                                                                                    
                                                                                                                                                                       
                                                                        Les fonctions….                                                                                

  COURS 6     2H                                                                                                                                                       Evaluation générale
                   =                                                                                                                                                   
  ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  Commentaires / proposition DNA
  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  SRV: Ce planning me semble serré. Si je compare au planning actuel, il y a moins de temps prévu (et plus de matière: les scripts), de plus les étudiants ne pratiquent pas la ligne de commande lors des séances dédiées à la programmation.
  
  C’est aujourd’hui une force de nos étudiants que d’être à l’aise avec la ligne de commande, je trouve que ce serait dommage que ce ne soit plus le cas à l’avenir.
  
  DNA : Ton argument (SRV) est un peu bateau, croire que grâce à dev1 ils mannipulle la ligne de commande comme des pro, voudrait dire que DEV 1 et DEV 2 **doivent** revenir à la ligne de commande. C’est les labo Système en bloc 2/3 qui feront le travaille, ICI c’est un cours d’introduction qui donne à l’étudiant une autre vision de “l’informatique” tout en essayant de les intéresser à du non graphique
  
  NRI : les étudiants semblent déjà oublier des choses d’une semaine à l’autre, alors je trouve que 2 semaines c’est trop lent. Faire 2h/semaine permet de garder un rythme tant pour eux que pour nous, et évite de faire une bizarrerie dans l’horaire. Perdre un cours signifie aussi la perte de 2h/12h (versus 2h/24h si 2h/semaine), d’où proportionnellement moins grave.
  
  NRI: Sur le contenu, je crois que installer un linux prend du temps, et ça me semble intéressant à faire mais
  
  > \(i) n’est-ce pas fait ailleurs (intro…) ?
  >
  > \(ii) pratiquement : ils l’installaraient sur leur portable ? quid des
  > backup? ou alors sur une machine virtuelle sur les machines de l’école ?
  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Proposition SRV
---------------

**12 séances de 2h**, 2h par semaine BIM1 et BIM2, par demi-groupe.

C’est aujourd’hui une force de nos étudiants que d’être à l’aise avec la
ligne de commande, Je trouve important qu’il en soit toujours ainsi à
l’avenir.

Etant donné que les étudiants ne pratiqueront plus la ligne de commande
pour la programmation il faut, je pense, qu’il y ait un nombre d’heures
pas trop restreint pour compenser ce manque de pratique.

Le planning de cette proposition comporte 10 séances. Il tient compte du
fait que le 27 septembre sera congé et donc qu’une séance pour certains
demi-groupes va sauter en BIM1.

Le contenu est bien sûr à discuter (installation de linux, zip, rar,
ftp, cron, etc ?), il me semble qu’il y a matière à faire 10 séances +
des évaluations.

  ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  Séance   Titre                                       Contenu                                                                                   Remarques
  -------- ------------------------------------------- ----------------------------------------------------------------------------------------- -------------------------------------------------------------------------------------------------------------
  1        Introduction                                Contenu: connexion à Linux, ls, cd, mkdir, etc                                            +- Actuel TD1

  2        Chemins et permissions                      Contenu: chemins relatifs, absolus, permissions                                           +- Actuel TD2

  3        Édition de fichier et premiers programmes   Contenu: nano (et/ou vim), javac, java. Mise en pratique: détection des erreurs en java   +- Actuel TD3
                                                                                                                                                 
                                                                                                                                                 On pratique le tout en corrigeant de petits programmes java (voir TD3)

  4        Gestionnaire de versions: git               Gestion de versions avec git                                                              Les TDs précédents rendent possible l’apprentissage de git.
                                                                                                                                                 
                                                       Mise en pratique:                                                                         Ce TD permet de pratiquer et approfondir les TDs précédents.
                                                                                                                                                 
                                                       git entre windows (git bash et Netbeans) et linux 1                                       Il y a un élément très motivant à l’utilisation de vrais outils professionnels et utilisés universellement.

  5                                                    grep, wc, find, variable d’env, fichiers de configuration (bashrc, nanorc)                Partie Linux des TD4 et 5 actuels
                                                                                                                                                 
                                                       Exercices: à définir.                                                                     

  6        javac et package,                           java, javac, option -d et -cp, classpath, utilisation de librairie (.jar)                 Mise en pratique des variables d’environnement (Actuel TD6)
                                                                                                                                                 
                                                                                                                                                 Ces TDs sur java/javac permettront de donner des exercices qui font sens dans les TDs suivants.

  7        ssh                                         ssh, clef privée, clef publique, scp, etc                                                 Incontournable aujourd’hui
                                                                                                                                                 
                                                       Mise en pratique avec git                                                                 

  8        Filters, redirections et pipes              Contenu: filtres, redirections et pipes                                                   Partie Linux des TD 10 + TD 13 actuels

  9        Scripts                                     scripts bash                                                                              Automatisation de tâches, par exemple: git clone -&gt; javac -&gt; javadoc -&gt; junit

  10       Scripts                                     scripts bash                                                                              

  11       Evaluation finale                                                                                                                     
  ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  Commentaires / proposition SRV
  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  DNA : je trouve que 12 séances c’est trop =&gt; réduit le temps imparti pour JAVA. Dans mon idée, c’était un cours d’introduction, pas un cours, où on doit tout voir en peu de temps. Si mon planning te (SRV) semble serré, le tien réduit java et bourre un max de matière comme si on voulait faire tout au 1er Q. Je préfère garder ce qu’on a aujourd’hui avec ses défauts que de voir surgire des cours mastodontes.
  
  SRV : le planning pour les labos Java est en cours d’élaboration et ne saurait tarder, il sera proposé à dev1 après concertation avec le groupe de travail. Au vu des éléments préliminaires (et puisque tu en parles ici) il n’est pas sûr que plus de 36h soit nécessaire.
  
  NRI : j’ai du mal à m’imaginer le temps que prennent chacune des séances mais j’aimerais bien,je crois comme NPX, qu’on puisse raccrocher/motiver chaque séance par le but commun : le développement java. Dans ce contexte je reste dubitatif par rapport à ssh. Et puis ssh mérite qu’on passe du temps sur les concepts de sécurité etc. Je suppose que c’est fait ailleurs ?
  
  SDR: J’aime beaucoup ce planning, car même s’il semble compter beaucoup d’heures, cela n’enlèvera rien à java. Je pense en effet que java débarrassé de la redondance actuelle du LDA, avancera beaucoup plus rapidement. De plus, il apporte beaucoup d’explication sur certaines choses qui semblent obscures actuellement pour les étudiants.
  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Commentaire :

npx : je préfère comme base de départ pour « système et console » la
proposition de SRV où git apparaît naturellement et permet d’être
utilisée dans les scripts et pour la gestion de la machine locale aussI

[]{#_clgih5jlfu2n .anchor}Je vote pour (indiquer votre acronyme)

=&gt; Il faut voter ailleurs (document “[*Organisation
\#5*](https://docs.google.com/document/d/1hK1qYGgD3gTz9o-THBKm9yEtfD6I_2N8uKsuOVbzqD0/edit#heading=h.kgrseidtevdc)”)
