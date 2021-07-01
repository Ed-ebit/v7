public class Schaltjahr {


    public static void main(String[] args) {

        int i;
        //int aktjahr = i;
        System.out.println();
        System.out.println("Zwischen 1965 und 2045 sind folgende Jahre Schaltjahre:\n");
        Schaltjahre();

        System.out.println("\n\n Schönen Tag noch");
    }

    private static void Schaltjahre() {
        int block10 = 0;
        for (int i= 1956; i<=2045; i++){

            if (istSchaltjahr(i)){
                System.out.print(i + " ");
                block10++;

                if (block10 %10 == 0) {
                    System.out.println();
            }

            }

        }
    }
    static boolean istSchaltjahr (int aktJhar){

        if(aktJhar%4 == 0 && (aktJhar%100 != 0 || aktJhar%400 == 0)) {
            return true;
        }
        return false;


    }
}
