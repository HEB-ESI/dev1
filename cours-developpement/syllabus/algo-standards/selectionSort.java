/**
 * Trie le tableau reçu en paramètre via un tri par sélection 
 * des minima successifs
 *
 * @param myArray le tableau à trier
 */
public static void selectionSort(int[] myArray) {
    for (int i = 0; i < myArray.length - 1; i++) {
        int minIndex = searchMinIndex(myArray, i, myArray.length - 1);
        if (minIndex != i) {
            swap(myArray, i, minIndex);
        }
    }
}

/**
 * Retourne l'indice du minimum entre les indices début et fin 
 * du tableau reçu. 
 *
 * En cas d'égalité, c'est l'indice le plus petit qui est retourné.
 *
 * @param myArray le tableau d'entiers
 * @param begin l'indice de début
 * @param end l'indice de fin
 */
public static int searchMinIndex(
                                 int[] myArray,
                                 int begin,
                                 int end) {
    int minIndex = begin;
    for (int i = begin + 1; i <= end; i++) {
        if (myArray[i] < myArray[minIndex]) {
            minIndex = i;
        }
    }
    return minIndex;
}

/**
 * Échange deux valeurs dans un tableau
 * 
 * @param myArray un tableau
 * @param pos1 une position
 * @param pos2 une (autre) position
 */
private static void swap(int[] myArray, int pos1, int pos2) {
    int value = myArray[pos1];
    myArray[pos1] = myArray[pos2];
    myArray[pos2] = value;
}
