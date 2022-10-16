public class HelloUniverse {
    public static void main(String... args) {
        String phraseIntro = "En %d, les planétes du système solaire étaient au nombre de %d";
        int nbPlanets = 0;
        short annee = 2022;
        if (annee < 1600 || annee > 2020) {
            System.out.printf("Le programme ne peut pas fournir de résultat pour %d", annee);
        } else {
            if (annee < 1700) {
                nbPlanets = 7;
            } else if (annee < 1800) {
                nbPlanets = 8;
            } else if (annee < 2006) {
                nbPlanets = 9;
            } else {
                nbPlanets = 8;
            }
            System.out.printf(phraseIntro, annee, nbPlanets);
        }
    }
}
/********* Ennoncé de l'ecxercice ************/
/*Utiliser if, else if et else
Notre code n’est pas tout à fait correct fonctionnellement.

En réalité personne ne sait si les scientifiques ne changeront pas d’avis dans le futur et excluront pourquoi pas Mercure du rang de planète.

De la même manière, les planètes n’ont pas toutes été découvertes d’un coup, Uranus par exemple fut découverte au 17ème siècle et Neptune au 18ème.

On va améliorer notre code de manière à restreindre notre gamme de valeurs acceptables. On acceptera des valeurs à partir de l’an 1600 et jusqu’à disons 2020 incluse.

Dans le cas contraire, il faudra alors afficher le message :

Le programme ne peut pas fournir de résultat pour l'année <année>

Si en revanche l'année choisi est acceptable, alors on va également considérer les 2 cas supplémentaires qui corresponde à la découverte de Uranus et Neptune.

Si l'année est inférieure à 1700 alors le nombre de planètes est de 7

Sinon si l'année est inférieure à 1800 alors le nombre de planètes est de 8

Note :

Pour les passionnés, Uranus à été réellement découverte par William Hershel en 1781 et Neptune par John Couch en 1846 mais je n'ai pas réussi à trouver à quelle date la communauté des astronomes a officiellement considéré la découverte dans le nombre officiel de planètes du système solaire donc j'ai préféré rester vague, mais si vous préférez utilisez ces valeurs exactes pas de problème !



Pour réaliser cet exercice, vous allez devoir utiliser:

2 blocs conditionnels imbriqués

une séquence de if - else if - else qui comporte 2 fois un else if



Notes :

Il existe plusieurs manières d’aboutir au résultat mais la meilleure option consiste à considérer d’abord le cas des valeurs hors limite.

Les valeurs 1600, 1700, 1800, 2006 et 2020 sont des valeurs particulières car elles délimitent nos différents comportements. Elles sont d'ailleurs très sensibles car c'est ici que les erreurs de "off-by-one" peuvent se produire, elles méritent donc une attention particulière notamment lorsque l'on cherche à vérifier si le programme fonctionne de manière attendue.

  
*/