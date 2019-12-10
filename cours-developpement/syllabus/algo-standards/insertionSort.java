/**
 * Tri par insertion.
 *
 * @param myArray tableau à trier
 */
public static void insertionSort(int[] myArray) {
    for (int nbSortedValues = 1;
         nbSortedValues < myArray.length;
         nbSortedValues++) {
        int value = myArray[nbSortedValues];
        int pos = nbSortedValues - 1;
        while (pos >= 0 && value < myArray[pos]) {
            myArray[pos + 1] = myArray[pos];
            pos = pos - 1;
        }
        myArray[pos + 1] = value;
    }
}
