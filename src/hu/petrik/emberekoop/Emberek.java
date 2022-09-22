package hu.petrik.emberekoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Emberek {
    private List<Ember> emberek;

    public Emberek(Ember [] emberTomb) {
        emberek = new ArrayList<>();
        this.emberek.addAll(Arrays.asList(emberTomb));
    /*
    *  for (Ember e: emberTomb) {
            this.emberek.add(e);

    * */


    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(String.format("%30s | %10s (%3s)| %-20s ", "Név", "Szül-dátum", "kor", "Szülhely"));
        for (int i = 0; i < this.emberek.size(); i++) {
            s.append(System.lineSeparator()).append(this.emberek.get(i));
        }
        return s.toString();
    }
}
