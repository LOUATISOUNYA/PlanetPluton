public class HelloUniverse {

    public static void main(String... args){
        String phrase="Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
        System.out.println(phrase);
        int nbPlanetes=8;
        System.out.println(nbPlanetes);
        phrase="Il y a quelques années cependant, elles étaient au nombre de : ";
        System.out.println(phrase);
        int nbPlanetesPluton=++nbPlanetes;
        System.out.println(nbPlanetesPluton);

    }


}