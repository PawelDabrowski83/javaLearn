package tablice;

public class MainArrays {
    public static void main(String[] args) {
        // deklaracja tablicy
        int[] array1 = new int[6]; // tablica z 6 elementami (same zera) {0, 0, 0, 0, 0, 0}

        int[] array2 = {1, 2, 3, 4, 5, 6}; //tablica inicjalizowana konkretnymi wartościami
        // uwaga - indeksy tablicy liczymy od 0 a nie od 1!

        // odczytanie elementu z tablicy:
        int a, b;
        a = array1[0]; // odczytuję liczbę z indeksu '0' (początek tablicy)
        b = array1[1]; // odczytuję liczbę z indeksu 1 (czyli drugą w kolejności)

        // przypisanie elementu do tablicy:
        array1[3] = 7; // wartość 7 przypisuję do elementu nr 3 tablicy (czyli tak naprawdę czwarty element)

        // 1. Stwórz tablicę Stringów składającą się z 3 dowolnych słów



        // 2. Stwórz tablicę intów o rozmiarze 10 elementów



        // 3. Stwórz tablicę charów składającą się z liter: L, o, r, e, m

        char[] chars = {'L', 'o', 'r', 'e', 'm'};
        String varr = new String(chars);
        System.out.println(varr);

        // 4.
    }
}
