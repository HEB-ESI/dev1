package esi.dev1.td12;

public class Date {
    int day;
    int month;
    int year;

    public Date(int aDay, int aMonth, int aYear) {
        day = aDay;
        month = aMonth;
        year = aYear;
    }

    public String toString() {
        return String.format("%d %s %d",
                day,
                getWording(month - 1),
                year);
    }

    private static String getWording(int month) {
        return new String[]{
                "Janvier",
                "Février",
                "Mars",
                "Avril",
                "Mai",
                "Juin",
                "Juillet",
                "Août",
                "Septembre",
                "Octobre",
                "Novembre",
                "Décembre"
        }[month];
    }
}
