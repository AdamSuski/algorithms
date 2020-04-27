package sorting;

import interfaces.SortAlgInterface;

public class InsertSort implements SortAlgInterface {
    public void sorting(double[] vector) {
        double key;
        int j;
        for(int i = 1; i < vector.length; i++) {
            j = 1;
            key = vector[i];
            while( j > 0 && vector[j - 1] > key) {
                vector[j] = vector[j - 1];
                j--;
            }
            vector[j] = key;
        }
    }
}
