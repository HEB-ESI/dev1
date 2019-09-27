package esi.dev1.td12;

public class Holiday {
    String wording;
    Date date;

    public Holiday(String aWording, Date aDate) {
        wording = aWording;
        date = aDate;
    }

    public String toString() {
        return wording + "  -  " + date;
    }
}
