package ify;

public class MainIf {
    public static void main(String[] args) {
        /*
        INSTRUKCJA IF

        if (warunek true/false) {
            // instrukcje jeśli true
        } else {
            // instrukcje jeśli false
        }

         */

        // 1. Zmienna int przekazuje informację o roku do sprawdzenia. Za pomocą instrukcji if sprawdź czy rok jest
        // przestępny podzielny przez 4 i przez 100, ale niepodzielny przez 400



        // 2. Napisz program, który odczytuję liczbę losową z Math.random() i wyświetla komunikat:
        // "niewielka" jeśli liczba jest mniejsza niż 0,2
        // "w normie" jeśli liczba nie spełnia tego warunku

//        double i = Math.random();
//        if(i < 0.2) System.out.println("niewielka");
//        else System.out.println("w normie");
//
//        System.out.println(i);



        // 3. Napisz program, który odczytuje liczbę losową i wyświetla komunikat:
        // "niewielka" dla wartości mniejszych niż 0,3
        // "średnia" dla wartości mniejszych nie przekraczających 0,6
        // "duża" dla wartości mniejszych nie przekraczających 0,9
        // "bardzo duża" dla wartości 0,9 i większych



        // 4. Napisz program, który wylosuje dwie liczby a i b.
        // wyświetl informację która z nich jest mniejsza

         double a = Math.random();
         double b = Math.random();
         if(a>b){
             System.out.println("a jest większa");
         }else{
             System.out.println("b jest większa");
         }
         System.out.println("a = " + a);
         System.out.println("b = " + b);




        // 5. Dane są liczby a i b. Wyświetl wynik dzielenia a / b.
        // Zastosuj instrukcję warunkową, aby uniknąć dzielenia przez zero.





    }
}
