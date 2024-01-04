package metody;


import java.util.Arrays;

public class MainMetody {
    /**
     * Napisz metodę o nazwie doublify o parametrze int, która zwróci podwojoną wartość liczbową
     */
    public static int doublify(int liczba) {
        return liczba*2;
    }

    /**
     * Napisz metodę o nazwie bigger i parametrach dwóch liczbach int. Metoda zwraca większą z dwóch liczb.
     * Jeśli są równe, zwraca wartość -1.
     */
    public static int bigger(int liczba1, int liczba2) {
        if (liczba1 > liczba2){
            return liczba1;
        }
        if(liczba2> liczba1){
            return liczba2;
        }else{
            return -1;
        }

    }

    /**
     * Napisz metodę increaseArray która przyjmie parametr int[] oraz liczbę, która będzie dodana do każdego
     * elementu tablicy. Zwróć tablicę po wykonanych obliczeniach.
     */
    public static int[] increaseArray(int[] array, int k) {
        // array 0...(lenght-1)
        for(int i= 0; i < array.length; i++){
            array[i]= array[i] + k;
        }

        return array;
    }

    /**
     * Napisz metodę shortenArray, która przyjmuje tablicę wartości int[] i zwraca tablicę int[] krótszą o jeden element.
     */
    public static int[] shortenArray(int[] array) {
        // array {1, 2, 3} length
        // new array {1, 2}
        int[] arr = new int[array.length-1];
        for(int i = 0; i < arr.length;i++){
            arr[i]=array[i];
        }

        return arr;
    }

    /**
     * Napisz metodę poleProstokata, która przyjmuje parametry int a, int b opisujące długość boków prostokąta. Zwrócony
     * wynik jest polem prostokąta.
     */
    public static int poleProstokata(int a, int b){

        return a*b;
    }

    /**
     * Napisz metodę poleKwadratu z wykorzystaniem metody poleProstokata
     */
    public static int poleKwadratu(int a){
        return poleProstokata(a, a);
    }



    /**
     * Napisz metodę longestString, która przyjmuje tablicę Stringów i zwraca wyraz, który jest najdłuższy.
     */
    public static String longestString(String[] words) {
        // {"Lorem",  "ipsum", "konstytucja"}
        String najdluzszeSlowo = "";
        int dlugoscNajdluzszegoSlowa = 0;

//        for(int i = 0 ; i< words.length;i++){
//            String slowo = words[i];
//            int dlugosc = slowo.length();
//
//            if (dlugosc > dlugoscNajdluzszegoSlowa) {
//                najdluzszeSlowo = slowo;
//                dlugoscNajdluzszegoSlowa = dlugosc;
//            }
//
//        }
//

        return "";
    }

    /**
     * ZNajdz i zwroc najmniejszy element podanej tablicy .
     */
    public  static int najmniejszyElement(int[] arr){
        // {9} => 9
        // {1, 2, 3, 7, 0} => 0
        // {9, 10, 7, 11} => 7
        // {7, 6, 5}
        int pamiec = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(pamiec > arr[i]) {
                pamiec = arr[i];
            }
        }
        return pamiec;
    }



    /**
     * Napisz metodę generateInt o parametrach int rangeStart i int rangeEnd, która zwróci liczbę losową int w podanych
     * widełkach (włącznie).
     */
    public static int generateInt(int rangeStart, int rangeEnd) {
        // [2-5] {2, 3, 4, 5}
        int zasieg = rangeEnd - rangeStart + 1;
        int i = (int)(Math.random()* zasieg) + rangeStart; // 0-4

        return i;
    }

    /**
     * Napisz metodę generateInt20 która nie przyjmuje parametrów i zwraca liczbę w zakresie od 1 do 20.
     */
    public static int generateInt20() {
        int liczba = generateInt(1,20);
        return liczba;
    }

    /**
     * Napisz metodę generateArray, która przyjmuje parametr int limit i zwraca tablicę losowych liczb z zakresu 1-20
     * o długości określonej przez limit.
     */
    public static int[] generateArray(int limit) {
        int[] arr = new int[limit];
        for(int i = 0; i<arr.length; i++){
            arr[i]=generateInt20();
        }
        return  arr;
    }

    /**
     * Napisz metodę generateArrays, która przyjmuje parametr int rows (liczba tablic-wierszy) i int columns
     * (liczba tablic-kolumn). Wynikiem działania metody jest tablica dwuwymiarowa wypełniona wartościami z zakresu 1-20.
     */
    public static int[][] generateArrays(int rows, int columns) {
        //
        int[][] bigarr = new int[rows][];
        for(int i = 0; i<bigarr.length; i++){
            bigarr[i] = generateArray(columns);
        }



        return bigarr;
    }

    public static void main(String[] args) {
        int[][] arr = generateArrays(3, 3);
        /**
         * wyświetlić tablicę arr
         */
        for(int i = 0; i < arr.length;i++){
            // arr[i] => {...}
            // arr[i][j]
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }


}
