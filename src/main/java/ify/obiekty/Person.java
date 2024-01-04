package ify.obiekty;

public class Person {
    String nazwisko;
    int rokUrodzenia;

    public Person(String nazwisko, int rokUrodzenia) {
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }


    public int zwrocLiczbe() {
        return 7;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void zmienNazwisko(String noweNazwisko) {
        this.nazwisko = noweNazwisko;
    }
}
