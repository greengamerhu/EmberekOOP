package hu.petrik.emberekoop;

public class Main {
    public static void main(String[] args) {
        Ember e1 = new Ember("Gipsz Jakab", "1988-1-12", "Budapest");
        Ember e2 = new Ember("Teszt Elek", "2003-12-5", "Debrecen");
        Ember e3 = new Ember("Kovács István", "1973-9-22", "Pécs");
        Ember e4 = new Ember("Lakatos József", "2002-5-21", "Veszprém");
        Ember e5 = new Ember("Senki Nber", "1999-12-01", "Bivalybasznád");
        Ember[] emberTomb = new Ember[] {e1,e2,e3,e4,e5};
        Emberek ek = new Emberek(emberTomb);
        System.out.println(ek);
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(e1 + " " + e1.getSzuletesiEv());
        System.out.println(e2);
        System.out.println(e3);
    }
}
