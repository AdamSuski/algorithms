package sorting;

import interfaces.SortAlgInterface;

public class SelectSort implements SortAlgInterface {
    public void sorting(double[] vector) {
        int n = vector.length;

        for (int i = 0; i < n - 1; i++) {
            int min_id = i;
            for (int j = i + 1; j < n; j++) {
                if (vector[j] < vector[min_id])
                    min_id = j;
            }

            double temp = vector[min_id];
            vector[min_id] = vector[i];
            vector[i] = temp;
        }
    }
}
