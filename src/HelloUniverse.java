public class HelloUniverse {

    public static void main(String... args){
        int nbPlanetes=8;
        String phrase="Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de :";
        System.out.println(phrase+nbPlanetes);
        nbPlanetes++;
        phrase="Il y a quelques années cependant, elles étaient au nombre de :";
        System.out.println(phrase+nbPlanetes);

    }

}