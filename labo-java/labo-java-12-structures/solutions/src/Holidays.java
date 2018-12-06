package g12345.dev1.structure;

/**
 * Utility class for Holiday.
 *
 * @author esiProf
 */
public class Holidays {

    /**
     * Sort a tab of Holiday by date.
     *
     * @see
     * <a href="https://fr.wikibooks.org/wiki/Impl%C3%A9mentation_d%27algorithmes_classiques/Algorithmes_de_tri/Tri_%C3%A0_bulles#Java_ou_C#">
     * Explication du tri en bulle sur Wikibooks</a>
     *
     * @param holidays tab of Holiday to dort.
     */
    static void sort(Holiday[] holidays) {
        boolean permut;
        do {
            permut = false;
            for (int indice = 0; indice < holidays.length - 1; indice++) {
                if (Dates.compare(holidays[indice].date, holidays[indice + 1].date) > 0) {
                    swap(holidays, indice, indice + 1);
                    permut = true;
                }
            }
        } while (permut);
    }

    /**
     * Swaps the value at index1 for the value at index2.
     *
     * @param holidays data collection to swap.
     * @param index1 index of the first element.
     * @param index2 index of the second element.
     */
    private static void swap(Holiday[] holidays, int index1, int index2) {
        if (holidays == null || holidays.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }
        if (holidays.length <= index1) {
            throw new IllegalArgumentException("Le tableau ne contient pas autant d'élément "
                    + index1);
        }
        if (holidays.length <= index2) {
            throw new IllegalArgumentException("Le tableau ne contient pas autant d'élément "
                    + index2);
        }
        if (index1 < 0 || index2 < 0) {
            throw new IllegalArgumentException("Indice négatif interdit "
                    + index1 + " "
                    + index2);
        }
        Holiday temp = holidays[index1];
        holidays[index1] = holidays[index2];
        holidays[index2] = temp;
    }
}
