package ify.obiekty;

public class MainObiekty {
    public static void main(String[] args) {
        Person osoba1 = new Person("Kowal", 1990);
        Person osoba2 = new Person("Nowak", 2000);
        Person osoba3 = new Person("Smith", 1990);
        System.out.println(osoba1.zwrocLiczbe());

        System.out.println(osoba2.getNazwisko());
        osoba2.zmienNazwisko("Kowalski");
        System.out.println(osoba2.getNazwisko());


    }
}
