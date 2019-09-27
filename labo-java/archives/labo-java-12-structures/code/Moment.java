package esi.dev1.td12;

public class Moment {
    int hour;
    int minute;
    int second;

    Moment(int anHour, int aMinute, int aSecond) {
        hour = anHour;
        minute = aMinute;
        second = aSecond;
    }

    public String toString() {
        return String.format("%2d:%2d:%2d", hour, minute, second);
    }
}
