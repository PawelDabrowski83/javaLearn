package petle;

import java.util.Arrays;

public class MainWhile {
    public static void main(String[] args) {
        /*

        while (warunek) {


        }

         */

        // 1. Za pomocą pętli while napisz program, który odlicza od 10 do 0.
//            int i = 10;
//            while (i >= 0) {
//                System.out.println(i);
//                i--;
//
//            }

            // 1a wyświetlenie 13 pierwszych liczb nieparzystych
//              int lol = 1;
//              int ilePetlaSieWykonuje = 0;
//              // 1.. 3.. 5
//              while (ilePetlaSieWykonuje<13){
//
//                  System.out.println(lol);
//                  lol= lol+2;
//                  ilePetlaSieWykonuje++;
//              }
//        System.out.println("ile było pętli" + ilePetlaSieWykonuje);


        // 2. Zadeklaruj dowolną tablicę. Za pomocą pętli while wyświetl jej elementy.
//        {
//            int[] array = {-10, 80, 30, -40, 50};
//            int counter = 0; // 0-4
//            int length = array.length; // 5
//
//            while (counter < length) {
//                System.out.println(    array[counter]     );
//                counter++;
//            }
//        }
              // 2a wyświetl elementy tablicy {'a', 'h', 'r', 'z', 'z'}

//            char[] array = {'a', 'h', 'r', 'z', 'z', '^', '5', ' ', 'l'}; // index 0..1..2..3..
//            int counter = array.length-1;
//            while (counter>-1) {
//                System.out.println(array[counter]);
//                counter = counter-1;
//
//            }




        // 3. Za pomocą pętli while wyświetl wszystkie elementy ciągu Fibonacciego, które są mniejsze niż 100.



        // 4. Za pomocą pętli while wylosuj 5 liczb. Wypisz ich wartości.
//       int xd = 5;
//
//        while (xd>0) {
//           System.out.println(Math.random() * 20);
//          xd = xd-1;
//
//
//       }


        // 5. Za pomocą pętli while losuj i wypisuj liczby z zakresu 1-20. Przerwij pętlę w momencie wylosowania liczby 20.
//          int i = 20;
//        int liczba = 0;
//        while (liczba != 20){
//            liczba = (int) (Math.random()*20) + 1;
//
//            System.out.println(liczba); // 0-19 + 1 = 1-20
//            // Math.random 0 ... 0,99999999999 - 1 poza zasięgiem
//            // 200* 1 = 20
////            if (liczba == 20) {
////                break;
////            }



        // 6. Wypisać pierwszych 7 liter alfabetu za pomocą pętli while

//        char[] lol = {'a' , 'b' , 'c', 'd', 'e' ,'f','g'}; // indeksy 0-...
//
//        char znak = 'a';
//
//        int i = 0;
//
//
//
//        while (i < 7){
//
//            System.out.println( (char) (znak + i) );
//            i++;
//
//        }

        // 7. Wypisuj losowe liczby w zakresie 1-13 w pętli while. Zatrzymaj wykonanie po wylosowaniu liczby 7.
            int liczba = 0;

         while (liczba!=7){
             liczba = (int)(Math.random()*13 + 1);
             System.out.println(liczba);

         }










        }






}
