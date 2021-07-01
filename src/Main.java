public class Main {

    public static void main(String[] args) {
	// verflixte 7: 1-100 alle durch 7 teilbaren eliminieren, sowie alle die eine 7 enthalten

        int [] array = new int[99];
        int i, mod, modzehn, modein;

        for (i = 0;i<100;i++) {
            array[i] = i + 1;
            mod = (i+1) % 7;
            modein = (i+1) % 10;
            modzehn = (i+1) / 10;

            if (mod == 0) {
               array[i] = (0);
            }
            else if (modein == 7){
                array[i] = (0);
            }
            else if (modzehn == 7){
                array[i] = (0);
            }

            System.out.print(array [i] + "  ");
        }

        // Lehrerlösung


    }
}
