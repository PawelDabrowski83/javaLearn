package przypisanieZmiennych;

public class Main {
    public static void main(String[] args) {
        // 1. Stwórz zmienną całkowitoliczbową i przypisz do niej wartość 17.
        int tab = 17;

        // 2. Stwórz zmienną całkowitoliczbową i przypisz do niej wynik operacji 2+2.
        int tab1 = 2+2;

        // 3. Stwórz zmienną całkowitoliczbową i przypisz do niej wynik dodawania zmiennych z punktów 1 i 2.
//            tab = 17;
//            tab1 = 2 + 2;
            System.out.println(tab + tab1);
        // 4. Stwórz zmienną typu boolean bez inicjacji wartości.
            boolean lol;

        // 5. Jaka wartość jest zapisana w zmiennej z punktu 4?
//         System.out.println(lol);

        // 6. Przypisz do zmiennej z punktu 4 wartość będącą wynikiem porównania czy
        // zmienna z punktu 1 jest większa od zmiennej z punktu 2.
              lol = tab > tab1;

        // 7. Stwórz zmienne liczbowe a i b o dowolnych przypisanych wartościach.
              int a =7;
                      int b =10;

        // 8. Korzystając ze zmiennej c dokonaj operacji, w wyniku której wartości a i b z poprzedniego punktu
        // zamienią się miejscami.
              int c = a;
              a = b;
              b = c;
              System.out.println("a="+a +"," +"b="+b);


                      //
        // A = 7
        // B = 10
        //



        // 9. Stwórz zmienną liczbową typu byte.
          byte kot = 60;


          // 256 0-255
        // -127 +126


        // 10. Przypisz do niej wartość zmiennej liczbowej z punktu 1.
            kot = (byte)tab;
            // byte 256 int 62636373


        // 11. Przypisz do zmiennej z p. 9 wartość większą o 2.
        kot = (byte)(2 + kot) ;
//        (int)kot = kot +2;
        int temp = (int) kot;


        // 12. Przypisz do zmiennej z p.9 wartość jej samej pomnożoną przez 100.
         int tym = (int) kot;
         tym = kot*100;
         System.out.println(tym);

         byte g = (byte) 200 + (byte) 100;
        System.out.println("g=" + g);


        // 13. Nie korzystając z operacji modulo sprawdź czy liczba 1342980 jest podzielna przez 9.
           int pies = 1342980;

           System.out.println(pies % 9 == 0);

           int cyfra = pies % 10;
           int cyfa2 = (pies/10) % 10;

        System.out.println(cyfra + " " + cyfa2);

        // 14. Przedstaw liczbę 15 w postaci binarnej.
        // 2^0 = 1  ....x
        // 2^1 = 2  ...x.
        // 2^2 = 4  ..x..
        // 2^3 = 8  .x...
        // 2^4 = 16 x....
           int xd = 9;

           String binarna15 = "";
           if (xd > 16){
               binarna15 = binarna15 + 1;
               xd = xd - 16;
           } else {
               binarna15 = binarna15 + 0;
           }

           if (xd >= 8){
               binarna15 = binarna15 + 1;
               xd = xd - 8;
           } else {
               binarna15 = binarna15 + 0;
           }
           if (xd >= 4){
               binarna15 = binarna15 + 1;
               xd = xd - 4;
           }else{
               binarna15 = binarna15 + 0;
           }
           if (xd >= 2){
               binarna15 = binarna15 + 1;
               xd = xd =2;
           }else{
               binarna15 = binarna15 + 0;
           }
           if (xd>= 1){
               binarna15 = binarna15 + 1;
               xd = xd-1;
           }else{
               binarna15 = binarna15 + 0;
           }



        System.out.println("binarna 15 = " + binarna15);


        // 15. Przedstaw liczbę 15 w postaci ósemkowej.
        // 8 ^ 0 = 1
        // 8 ^ 1 = 8
        // 8 ^ 2 = 64
        // 0-7
        // 13
        // 015


            int gol = 13;
            String su = "";
            // 0
            if (gol >= 64){
                su = su + 1;
            }else {
                su = su + 0;
            }

            // 1
            if (gol >= 8){
                su = su +1;
                gol = gol - 8;
            }else{
                su = su + 0;
            }

            // 5
            if (gol >= 1){
                su = su + gol;
            }else{
                su = su ;

        }
         System.out.println(su);

        // 16. Przedstaw liczbę 15 w postaci szesnastkowej.
        // 0-f 0-15


        int number = 7;
        Integer numberObj = 7;


        char ce = 't';
        Character C = ce;

        String val = "test";

        int[] array = new int[5];
        int k =1 ;
        int[] array2 = {k, 2, 3, 4, 5};
        // array = {1, 2, 3, 4, 5}

        int dlugoscTablicy = array2.length;
        int p = array[0];

    }
}
