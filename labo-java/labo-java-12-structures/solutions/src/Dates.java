package g12345.dev1.structure;

/**
 * Utility class for Date.
 *
 * @author esiProf
 */
public class Dates {

    /**
     * Returns 1 if the first date is after the second one, 0 if the two dates
     * are similar and -1 in other cases.
     *
     * @param date1 first date.
     * @param date2 second date.
     * @return 1 if the first date is after the second one, 0 if the two dates
     * are similar and -1 in other cases.
     */
    static int compare(Date date1, Date date2) {
        int result = -1;
        if (date1.year == date2.year
                && date1.month == date2.month
                && date1.day == date2.day) {
            result = 0;
        } else if (date1.year > date2.year
                || (date1.year == date2.year
                    && (date1.month > date2.month
                        || (date1.month == date2.month 
                            && date1.day > date2.day)))) {
            result = 1;
        }
        return result;
    }
}
