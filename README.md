# Convertisseur



• La méthode « Init » qui est exécutée au début de chaque méthode de test et qui initialise notre objet « convertisseur » avec le montant égal à 15 et qui affiche dans la console un message montrant le numéro de passage avant chaque test.
• La méthode « End » qui est exécutée après chaque test, qui affiche dans la console un message montrant le numéro de passage après chaque test et qui affiche aussi le résultat de l’objet « convertisseur »
• La méthode de test « Testing1 » qui fait appel à la méthode méthode « convertir » de l’objet « convertisseur » avec un taux de conversion égal à 1.5 et teste le résultat stocké dans 
« convertisseur » avec la méthode « Assert.assertEquals » ( A noter que la méthode assertEquals prend en paramètre 3 variables)
• La méthode de test « Testing2 » qui fait appel à la méthode méthode « convertir » de l’objet « convertisseur » avec un taux de conversion égal à 2.5 et teste le résultat stocké dans 
« convertisseur » avec la méthode « Assert.assertTrue »

la méthode « Convertir » pour tester le paramètre taux au cas où il est égal à 0. Dans ce cas il fera appel au constructeur de la classe « UniteDistincteException » qu’il faut créer etqui contient un attribut de type « Convertisseur » et la méthode toString 
qui retourne le « String » ‘Le convertisseur a rencontré une exception’.

La troisième méthode de test « Testing3 » similaire à la méthode « Testing1 » mais avec le taux 0. 
