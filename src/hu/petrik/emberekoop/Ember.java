package hu.petrik.emberekoop;

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

    @Override
    public String toString() {
        return String.format("%30s | %10s | %-20s", this.nev, this.szuldatum, this.szulhely);
    }

}
