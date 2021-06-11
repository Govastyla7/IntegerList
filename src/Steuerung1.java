import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Steuerung1  {


    public static void main(String[] args) throws IOException {
        int input =0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Laenge der Liste eingeben");
            input = Integer.parseInt(in.readLine());
        } while (input < 0);
        ArrayIntegerList l = new ArrayIntegerList(input);

        // Auswahl
        while(true) {
            System.out.println("einen der folgenden Werte eingeben: \n 0 = getLength \n 1 = instertLast \n 2 = getFirst \n 3 = delteFirst \n 4 = search \n 5 = print \n 6= exit");

            do {
                input = Integer.parseInt(in.readLine());
            } while (input < 0 || input > 6);


            switch (input) {

                //getLength
                case 0:
                    System.out.println(l.getLength());
                    break;
                //insterLast
                case 1:
                    System.out.println("Bitte Wert eingeben: ");
                    input  = Integer.parseInt(in.readLine());
                    System.out.println(l.insertLast(input));
                    break;
                //getFirst
                case 2:
                    System.out.println(l.getFirst());
                    break;
                //deleteFirst
                case 3:
                    System.out.println(l.deleteFirst());
                    break;
                    //search
                case 4:
                    System.out.println("Bitte Wert zum Suchen eingeben: ");
                    input  = Integer.parseInt(in.readLine());
                    System.out.println(l.search(input));
                    break;
                case 5:
                    l.print();
                    break;
                case 6:
                    System.exit(-2);
                    break;
            }


        }
    }
}
