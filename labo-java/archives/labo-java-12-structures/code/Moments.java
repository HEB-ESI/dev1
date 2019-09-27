package esi.dev1.td12;

public class Moments {
    public static void addASecond(Moment moment) {
        if(moment.second == 59) {
            moment.second = 0;
            addAMinute(moment);
        } else {
            moment.second++;
        }
    }

    private static void addAMinute(Moment moment) {
        if(moment.minute == 59) {
            moment.minute = 0;
            addAnHour(moment);
        } else {
            moment.minute++;
        }
    }

    private static void addAnHour(Moment moment) {
        if(moment.hour == 23) {
            moment.hour = 0;
        } else {
            moment.hour++;
        }
    }
}