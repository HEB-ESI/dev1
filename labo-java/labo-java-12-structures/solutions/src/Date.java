package g12345.dev1.structure;

/**
 * The Date structure represents a classic date.
 *
 * @author esiProf
 */
public class Date {

    /**
     * The day of the date.
     */
    int day;

    /**
     * The month of the date.
     */
    int month;

    /**
     * The year of the date.
     */
    int year;

    /**
     * Constructs a date.
     *
     * @param aDay day of the date.
     * @param aMonth month of the date.
     * @param aYear year of the date.
     *
     * @throws IllegalArgumentException if the year is before 0.
     */
    public Date(int aDay, int aMonth, int aYear) {
        if (aYear <= 0) {
            throw new IllegalArgumentException("Les dates négatves ne sont pas autorisées");
        }
        day = aDay;
        month = aMonth;
        year = aYear;
    }

    public String toString() {
        return String.format("%02d", day) + "/" + String.format("%02d", month) + "/" + String.format("%02d", year);
    }

}
