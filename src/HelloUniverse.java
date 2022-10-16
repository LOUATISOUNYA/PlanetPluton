public class HelloUniverse {
    public static void main(String... args){
       int mois=7 ;
     /*  switch (mois) {
           case 1 :
               System.out.println("Janvier");
               break;
case 2 :
               System.out.println("Février");
               break;
case 3 :
                  System.out.println("Mars");
                break;
case 4 :
                  System.out.println("Avril");
                break;
case 5 :
                  System.out.println("Mai");
                break;
case 6 :
                  System.out.println("Juin");
                break;
case 7 :
                  System.out.println("Juillet");
                break;
case 8 :
                  System.out.println("Aout");
       }*/

        switch (mois) {
            case 1 :
            case 2 :
            case 3 :
                System.out.println("C'est l'hiver");
                break;
            case 4 :
            case 5 :
            case 6 :
                System.out.println("C'est le printemps");
                break;
            case 7 :
            case 8 :
            case 9 :
                System.out.println("C'est l'été");
                break;
            case 10 :
            case 11 :
            case 12 :
                System.out.println("C'est l'automne");
                break;
            default:
                System.out.println("Ce n'est pas un mois");
        }
    }
}