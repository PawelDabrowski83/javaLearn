package metody;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class MainMetodyTest {

    @Test
    public void doublifyTest() {
        int given = 19;
        int expected = 38;
        int actual = MainMetody.doublify(given);
        assertEquals(expected, actual);
    }

    @Test
    public void biggerTest() {
        int[] sample1 = {1, 3, 3};
        int[] sample2 = {0, 0, -1};
        int[] sample3 = {4, 1, 4};
        assertEquals(sample1[2], MainMetody.bigger(sample1[0], sample1[1]));
        assertEquals(sample2[2], MainMetody.bigger(sample2[0], sample2[1]));
        assertEquals(sample3[2], MainMetody.bigger(sample3[0], sample3[1]));
    }

    @ParameterizedTest
    @MethodSource
    void increaseArrayTest(int[] given, int increment, int[] expected) {
        int[] actual = MainMetody.increaseArray(given, increment);
        assertArrayEquals(expected, actual);
    }

    private static Stream<Arguments> increaseArrayTest() {
        return Stream.of(
            Arguments.of(new int[]{1}, 1, new int[]{2}),
            Arguments.of(new int[]{10, 20, 30}, 3, new int[]{13, 23, 33}),
            Arguments.of(new int[]{-9, 4, 19}, -1, new int[]{-10, 3, 18}),
            Arguments.of(new int[]{17, 22, 21}, 0, new int[]{17, 22, 21})
        );
    }

    @ParameterizedTest
    @MethodSource
    void shortenArrayTest(int[] given, int[] expected) {
        int[] actual = MainMetody.shortenArray(given);
        assertArrayEquals(expected, actual);
    }

    private static Stream<Arguments> shortenArrayTest() {
        return Stream.of(
                Arguments.of(new int[]{1}, new int[0]),
                Arguments.of(new int[]{19, 2, 2}, new int[]{19, 2}),
                Arguments.of(new int[]{1, 1, 0, 1, 2, 3, 1, 1000, -99, 13},
                        new int[]{1, 1, 0, 1, 2, 3, 1, 1000, -99})
        );
    }

    @ParameterizedTest
    @MethodSource
    void poleProstokataTest(int givenA, int givenB, int expected) {
        int actual = MainMetody.poleProstokata(givenA, givenB);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> poleProstokataTest(){
        return Stream.of(
                Arguments.of(2, 2, 4),
                Arguments.of(10, 15, 150),
                Arguments.of(1, 9, 9),
                Arguments.of(0, 9, 0)
        );
    }

    @ParameterizedTest
    @MethodSource
    void longestStringTest(String[] given, String expected) {
        String actual = MainMetody.longestString(given);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> longestStringTest() {
        return Stream.of(
                Arguments.of((Object) new String[]{"Ala", "ma", "kota"}, "kota"),
                Arguments.of((Object) new String[]{"Lorem", "ipsum", "avangardum", "i"}, "avangardum"),
                Arguments.of((Object) new String[]{"a"}, "a")
        );
    }

    @ParameterizedTest
    @MethodSource
    void generateIntTest(int lowerBound, int upperBound) {
        int repeats = 10000;
        int actual;
        while (repeats-- > 0) {
            actual = MainMetody.generateInt(lowerBound, upperBound);
            assertTrue(actual <= upperBound);
            assertTrue(actual >= lowerBound);
        }
    }

    private static Stream<Arguments> generateIntTest() {
        return Stream.of(
                Arguments.of(1, 10),
                Arguments.of(0, 20),
                Arguments.of(-100, 1000),
                Arguments.of(0, 0)
        );
    }

    @Test
    public void generateInt20Test() {
        int lowerBound = 1;
        int upperBound = 20;
        int loops = 10000;
        int actual;
        while(loops-- > 0) {
            actual = MainMetody.generateInt20();
            assertTrue(actual >=lowerBound);
            assertTrue(actual <= upperBound);
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 8, 11})
    void generateArrayTest(int given) {
        int[] actual = MainMetody.generateArray(given);
        assertEquals(given, actual.length);
        int maxVal = Arrays.stream(actual).max().orElse(0);
        assertTrue(maxVal <= 20);
        int minVal = Arrays.stream(actual).min().orElse(0);
        assertTrue(minVal >= 1);
    }

    @ParameterizedTest
    @MethodSource
    void generateArraysTest(int rows, int columns) {
        int UPPER_BOUND = 20;
        int LOWER_BOUND = 1;
        int[][] actual = MainMetody.generateArrays(rows, columns);
        assertEquals(rows, actual.length);
        assertEquals(columns, actual[0].length);
        int actualMax = Arrays.stream(actual).flatMapToInt(Arrays::stream).max().orElse(20);
        assertTrue(actualMax <= UPPER_BOUND);
        int actualMin = Arrays.stream(actual).flatMapToInt(Arrays::stream).min().orElse(1);
        assertTrue(actualMin >= LOWER_BOUND);
    }

    private static Stream<Arguments> generateArraysTest() {
        return Stream.of(
                Arguments.of(3, 4),
                Arguments.of(2, 2),
                Arguments.of(17, 18),
                Arguments.of(1, 16),
                Arguments.of(9, 0)
        );
    }




}
