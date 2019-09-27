package g12345.dev1.structure;

/**
 * Utility class for Moment.
 *
 * @author esiProf
 */
public class Moments {

    /**
     * Add a second to a moment.
     *
     * @param moment moment to update.
     */
    static void addASecond(Moment moment) {
        int limit = 59;
        if (moment.seconds == limit) {
            moment.seconds = 0;
            if (moment.minutes == limit) {
                moment.minutes = 0;
                moment.hours = moment.hours + 1;
            } else {
                moment.minutes = moment.minutes + 1;
            }
        } else {
            moment.seconds = moment.seconds + 1;
        }
    }
}
