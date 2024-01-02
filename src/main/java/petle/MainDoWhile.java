package petle;

public class MainDoWhile {
    public static void main(String[] args) {
//        int i = 0;
//
//
//        do {
//            System.out.println(i++);
//
//
//        } while(i < 6);

        // 1. wyświetl pierwszych 5 liter alfabetu korzystając z pętli do-while

//        char litera = 'a';
//        do{
//            System.out.println( ++litera );
//
//
//        } while (false);


        // 1. Stwórz tablicę Stringów składającą się z 3 dowolnych słów

        String text = "ALe jaj jalafjaoagnofaf" +
                "fjfjsfsfsfdfs" +
                " fdfsfsefewff";

        String[] words = {"test", "Ala", "java", "Tomaszew"};    // 0... końca
        String[] arrayW = new String[9];// {"", "" , "", ""};


        // 2. Stwórz tablicę intów o rozmiarze 10 elementów

//        int[] nazwa = new int[10]; // 9{..., ... , ... , ... , ... 0-9} 1...
//        //nazwa[0];
//        // nazwa[0] = 9;
//        int i = 0;
//
//        while (i<10) {
//            nazwa[i] = 13 - i; // 13.. 12.. 11
//            System.out.println(nazwa[i]);
//            i++;
//
//        }

        // 2a. wyświetl po kolei elementy z tej tablicy


        // 3. Stwórz tablicę charów składającą się z liter: L, o, r, e, m
//        char[] litery = {'L', 'o', 'r', 'e', 'm'}; /// 0-4
//
//        // m e r o L
//        char temp;
//        temp = litery[0];
//        litery[0] = litery[4];
//        litery[4]= temp; // temp = 'm'
//        temp = litery[1]; // temp =
//        litery[1]= litery[3];
//        litery[3] = temp;
//
//        int i = 0;
//        while (i<5) {
//
//            System.out.println(litery[i++]);
//        }

        // 4. Napisz program, który znajduje najniższą wartość w tablicy z p. 3.






        // 5. Stwórz tablicę intów o rozmiarze 10. Wypełnij je kolejnymi liczbami, zaczynając od liczby 5.



        // 6. Za pomocą pętli zwiększ o 3 wartość każdej liczby z tablicy z p. 5.




        // 1. Za pomocą pętli for wypisz liczby z zakresu 0 do 5.
//           for (int i = 0; i < 6; i++) {
//               System.out.println(i);
//               if (i == 2) {
//                   break;
//               }
//
//           }


        // 2. Za pomocą pętli for wypisz liczby z zakresu 1 do 10,
//            for (int i = 1; i<11;i= i+2){
//                System.out.println(i);
//            }


        // 3. Zadeklaruj dowolną tablicę. Za pomocą pętli for wypisz wszystkie jej elementy.
        /// zadeklaruj tablicę wartości losowych double 8 elementów
//            double[] tab = new double[8]; // 0-7 tab[i]
//            double suma = 0;
//
//            for(int i = 0; i<tab.length;i++){
//                tab[i] = Math.random();
//                System.out.println(tab[i]);
//                suma = suma + tab[i];
//                System.out.println("suma:" + suma);
//            }



        // 4. Za pomocą pętli for wypisz liczby od 20 do 1 (w kolejności malejącej) z pominięciem liczb 8 i 12.
//         for(int i = 20;i>0; i = i -1){
//             //System.out.println(i);
//             if(i != 8 && i!=12){
//                 System.out.println(i);
//             }
//         }


        // 5. Za pomocą pętli for napisz program liczący postać binarną (dwójkową) liczb mniejszych niż 32.
//        int liczba = 31; // 011111
//                        //  100000
//         String wynik = "";

         // 2^5 = 32
         // 2^4 = 16
         // 2^3 = 8
         // 2^2 = 4
         // 2^1 = 2
         // 2^0 = 1



        // 6. Za pomocą pętli for zainicjuj tablicę wartościami losowymi.



        // 7. Za pomocą pętli for napisz program, który znajdziej najmniejszą wartość w tablicy liczb.



        // 8. Za pomocą pętli for napisz program, który sprawdzi czy tablica liczb zawiera daną wartość.


        // 9. wyświetl w pętli for zawartość tablicy od ostatniego indeksu

        int[] arr = {8, 8, 7, 2}; // 0... (length-1)
        // arr[i]

        for (int i = arr.length-1;i>=0;i = i -1){
            System.out.println(arr[i]);
        }











    }
}
