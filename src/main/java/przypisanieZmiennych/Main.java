package przypisanieZmiennych;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Utwórz metod¦ merge przyjmuj¡c¡ dwie tablice elementów typu int oraz zwracaj¡c¡
        // ich poa¡czenie w postaci nowej tablicy, której elementy b¦d¡ wstawiane naprzemiennie
        // (raz z jednej tablicy, raz z drugiej). Gdy elementy której± z tablic si¦ wyczerpi¡,
        // dopeanij tablic¦ wynikow¡ pozostaaymi elementami z drugiej tablicy.

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {10, 30, 40};
        int[] wynik = merge(arr1, arr2);
        System.out.println(Arrays.toString(wynik));
    }

    public static int[] merge(int[]arr1, int[]arr2) {
        // arr1 0..(lenght-1)
        // arr2 0.. length-1
        int dlugoscTablic = arr1.length + arr2.length;
        int[]wynik = new int[dlugoscTablic];

        for (int i = 0; i < arr1.length; i++) {
            wynik[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++ ) {
            wynik[i + arr1.length] = arr2[i];
        }


        return wynik;
    }



    public static int findMax(int i, int z, int y){
        int max = 0;

        if(i<z){
            max = z;
        }else{
            max = i;
        }
        // max jest największą <i z>
        if(max<y) {
            max = y;
        }

        return max;

    }







    public static void modifyValue(int[] i ){
        // 0 ... x (length)
        // 1, 2, 3
        i = new int[0];

    }





    public static void show(String i, int e) {
        System.out.println("los: " + e);
        for(int x = 0;x <e ;x++){
        System.out.println(i);


        }

    }


}
