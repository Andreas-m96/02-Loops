public class Loops {

    /* Andreas Meier
     * StudOn Kennung: zi70byto
     * Matrikelnummer: 21998536
     */

    public static void main(String[] args){

        //Aufgabe 2.2.2
        for (int i = 0; i < 11; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 6; i <= 42; i+=6){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 23; i >= 11; i-=2){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 8; i <= 17; i+=2){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 16; i <= 711; i*=2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Aufgabe 2.2.3
        int m = 7;
        int j = 0;

        while (j <= m){
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        int k = 42;

        while (2*k > m){
            System.out.print(k + " ");
            k-=6;
        }
        System.out.println();

        //Aufgabe 2.2.4
        j = 0;
        while (true){
            System.out.print(j + " ");
            if (j >= m){
                break;
            }
            j++;
        }
        System.out.println();

        k = 42;

        while (true){
            if (2 * k < m){
                break;
            }
            System.out.print(k + " ");
            k-=6;
        }
        System.out.println();


        //Aufgabe 2.2.5
        int nMax = 5;
        double x = 2;
        double a = 2;

        for (int n = 0; n <= nMax; n++) {
            x = 0.5 * (x + a/x);
            System.out.println("Approximation at step " + n + ": " + x);
        }


    }
}
