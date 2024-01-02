package metody;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
        return liczba1 == liczba2 ? -1 :
                Math.max(liczba1, liczba2);
    }

    /**
     * Napisz metodę increaseArray która przyjmie parametr int[] oraz liczbę, która będzie dodana do każdego
     * elementu tablicy. Zwróć tablicę po wykonanych obliczeniach.
     */
    public static int[] increaseArray(int[] array, int i) {
        return Arrays.stream(array).map(n -> n + i).toArray();
    }

    /**
     * Napisz metodę shortenArray, która przyjmuje tablicę wartości int[] i zwraca tablicę int[] krótszą o jeden element.
     */
    public static int[] shortenArray(int[] array) {
        int[] result = new int[array.length -1];
        System.arraycopy(array, 0, result, 0, result.length);
        return result;
    }

    /**
     * Napisz metodę poleProstokata, która przyjmuje parametry int a, int b opisujące długość boków prostokąta. Zwrócony
     * wynik jest polem prostokąta.
     */
    public static int poleProstokata(int a, int b){
        return a * b;
    }

    /**
     * Napisz metodę longestString, która przyjmuje tablicę Stringów i zwraca wyraz, który jest najdłuższy.
     */
    public static String longestString(String[] words) {
        return Arrays.stream(words).max(Comparator.comparingInt(String::length)).orElse("");
    }

    /**
     * Napisz metodę generateInt o parametrach int rangeStart i int rangeEnd, która zwróci liczbę losową int w podanych
     * widełkach (włącznie).
     */
    public static int generateInt(int rangeStart, int rangeEnd) {
        return ThreadLocalRandom.current().nextInt(rangeStart, rangeEnd + 1);
    }

    /**
     * Napisz metodę generateInt20 która nie przyjmuje parametrów i zwraca liczbę w zakresie od 1 do 20.
     */
    public static int generateInt20() {
        return generateInt(1, 20);
    }

    /**
     * Napisz metodę generateArray, która przyjmuje parametr int limit i zwraca tablicę losowych liczb z zakresu 1-20
     * o długości określonej przez limit.
     */
    public static int[] generateArray(int limit) {
        return IntStream.generate(MainMetody::generateInt20).limit(limit).toArray();
    }

    /**
     * Napisz metodę generateArrays, która przyjmuje parametr int rows (liczba tablic-wierszy) i int columns
     * (liczba tablic-kolumn). Wynikiem działania metody jest tablica dwuwymiarowa wypełniona wartościami z zakresu 1-20.
     */
    public static int[][] generateArrays(int rows, int columns) {
        return Stream.generate(() -> generateArray(columns)).limit(rows).toArray(int[][]::new);
    }
}
