package esi.dev1.td12;

public class Holidays {
    public static void sort(Holiday[] holidays) {
        for (int i = 0; i < holidays.length - 1; i++) {
            swap(holidays, i, getMinValueIndex(holidays, i));
        }
    }

    private static int compare(Holiday h1, Holiday h2) {
        return Dates.compare(h1.date, h2.date);
    }

    private static void swap(Holiday[] holidays, int index1, int index2) {
        Holiday tmp = holidays[index1];
        holidays[index1] = holidays[index2];
        holidays[index2] = tmp;
    }

    private static int getMinValueIndex(Holiday[] holidays, int from) {
        int minIndex = from;

        for (int j = from + 1; j < holidays.length; j++) {
            if (compare(holidays[minIndex], holidays[j]) > 0) {
                minIndex = j;
            }
        }

        return minIndex;
    }
}
