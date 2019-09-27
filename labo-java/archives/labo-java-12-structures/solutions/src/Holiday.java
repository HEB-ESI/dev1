package g12345.dev1.structure;

/**
 * The Holiday structure represents a holiday.
 *
 * @author esiProf
 */
public class Holiday {

    /**
     * The date of the holiday.
     */
    Date date;

    /**
     * The name of the holiday.
     */
    String label;

    /**
     * Constructs a holiday.
     *
     * @param aDate date of the holiday.
     * @param aLabel name of the holiday.
     *
     * @throw IllegalArgumentException if no date or no label is set.
     */
    public Holiday(Date aDate, String aLabel) {
        if (aDate == null) {
            throw new IllegalArgumentException("Aucune date en paramètre");
        }
        if (aLabel == null) {
            throw new IllegalArgumentException("Aucune libellé en paramètre");
        }
        date = aDate;
        label = aLabel;
    }

    /**
     * Constructs a holiday.
     *
     * @param aDay day of the holiday.
     * @param aMonth month of the holiday.
     * @param aYear year of the holiday.
     * @param aLabel name of the holiday.
     *
     * @throw IllegalArgumentException if no label is set.
     */
    public Holiday(int aDay, int aMonth, int aYear, String aLabel) {
        if (aLabel == null) {
            throw new IllegalArgumentException("Aucune libellé en paramètre");
        }
        date = new Date(aDay, aMonth, aYear);
        label = aLabel;
    }

    public String toString() {
        return label + " le " + date;
    }

}
