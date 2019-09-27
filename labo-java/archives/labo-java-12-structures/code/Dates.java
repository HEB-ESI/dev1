package esi.dev1.td12;

public class Dates {
    public static int compare(Date date1, Date date2) {
        if(date1.year != date2.year) {
            return date1.year - date2.year;
        } else if(date1.month != date2.month) {
            return date1.month - date2.month;
        } else {
            return date1.day - date2.day;
        }
    }
}
