import sorting.InsertSort;
import sorting.SelectSort;

import static java.lang.Math.pow;

public class Main {

    private static InsertSort insertSort = new InsertSort();
    private static SelectSort selectSort = new SelectSort();

    private static double[] generateOptimisticData(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

    public static void main(String[] args) {
        for(int i = 1; i <= 21; i+=5) {
            int numberOfData = i * 1000;
            long timeIS, timeSS;
            double[] optimisticData = generateOptimisticData(numberOfData);
            System.out.println("\nTime of sorting for: " + numberOfData);
            long startIS = System.nanoTime();
            insertSort.sorting(optimisticData);
            timeIS = System.nanoTime() - startIS;
            System.out.println("\n\tinsert sort: " + timeIS/pow(10,9) + "s");
            long startSS = System.nanoTime();
            selectSort.sorting(optimisticData);
            timeSS = System.nanoTime() - startSS;
            System.out.println("\n\tselect sort: " + timeSS/pow(10,9)+ "s");
        }
    }
}
