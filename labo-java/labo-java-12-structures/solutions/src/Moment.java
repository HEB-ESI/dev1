package g12345.dev1.structure;

/**
 *
 * @author esiProf
 */
public class Moment {

    /**
     *
     */
    int hours;

    /**
     *
     */
    int minutes;

    /**
     *
     */
    int seconds;

    /**
     *
     * @param someHours
     * @param someMinutes
     * @param someSeconds
     */
    public Moment(int someHours, int someMinutes, int someSeconds) {
        hours = someHours;
        minutes = someMinutes;
        seconds = someSeconds;
    }

    public String toString() {
        return String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds);
    }

}
