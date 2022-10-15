public class HelloUniverse {
    public static void main(String... args){
        /*int anneeCourante=2022;
        int nombrePlanete=8;
        if (anneeCourante>2006){
            System.out.printf("En %d, les planètes du système solaire étaient au nombre de : %d",anneeCourante, nombrePlanete);
        }*/
        //correction
        String phraseIntro=" En %d, les planètes du système solaire étaient au nombre de : %d";
        int nbPalnetes =0;
        short annee =2014;
        if (annee>=2006) {
            nbPalnetes = 8;
        }
        if (annee<2006) {
            nbPalnetes = 9;
        }
        System.out.printf(phraseIntro, annee, nbPalnetes);
    }
}