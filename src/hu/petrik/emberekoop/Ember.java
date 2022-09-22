package hu.petrik.emberekoop;

import java.time.LocalDate;
import java.util.Date;

public class Ember {
    private String nev;
    private String szuldatum;
    private String szulhely;

    public Ember(String nev, String szuldatum, String szulhely) {
        this.nev = nev;
        this.szuldatum = szuldatum;
        this.szulhely = szulhely;

    }
    public int getSzuletesiEv() {
        return Integer.parseInt(this.szuldatum.substring(0,4));
    }
    public int  getSzuletesiHonap () {
        String[] szuletesiAdatok = this.szuldatum.split("-");
        return  Integer.parseInt(szuletesiAdatok[1]);
    }
    public int  getSzuletesiNap () {
        String[] szuletesiAdatok = this.szuldatum.split("-");
        return  Integer.parseInt(szuletesiAdatok[2]);
    }
    public int getEletkor() {

        return LocalDate.now().getYear() - this.getSzuletesiEv();
    }
    @Override
    public String toString() {
        return String.format("%30s | %10s (%3s)| %-20s ", this.nev, this.szuldatum,this.getEletkor(), this.szulhely);
    }

}
