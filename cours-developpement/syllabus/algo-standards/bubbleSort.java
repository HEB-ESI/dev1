/**
 * Tri bulle d'un tableau d'entiers.
 *
 * @param myArray
 */
public static void bubbleSort(int[] myArray) {
    // La bulle part de la droite, 
    // en faisant remonter l'élément le plus petit,
    // et éclate à gauche.
    for (int burstPos = 0;
         burstPos < myArray.length - 1;
         burstPos++) {
        for (int bubblePos = myArray.length - 1;
             bubblePos > burstPos;
             bubblePos--) {
            if (myArray[bubblePos] < myArray[bubblePos - 1]) {
                swap(myArray, bubblePos, bubblePos - 1);
            }
        }
    }
}
/**
 * Echange deux valeurs dans un tableau
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
