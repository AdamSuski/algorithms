package sorting;

import interfaces.SortAlgInterface;

public class QuickSort implements SortAlgInterface {
    public void sorting(double[] vector) {
        int start = 0;
        int end = vector.length - 1;
        quickSortExtra(vector, start, end);
    }

    private void quickSortExtra(double[] vec, int start, int end){
        if(vec.length < 15){
            InsertSort insertSort = new InsertSort();
            insertSort.sorting(vec);
        }
        int index = partiation(vec, start, end);
        if(start<end){
            quickSortExtra(vec, start, index-1);
            quickSortExtra(vec, index+1, end);
        }
    }

    private int partiation(double[] vec, int start, int end) {
        double pivot = vec[end];
        for (int i = start; i < end; i++) {
            if (vec[i] < pivot) {
                double temp = vec[start];
                vec[start] = vec[i];
                vec[i] = temp;
                start++;
            }
        }
        double temp = vec[start];
        vec[start] = pivot;
        vec[end] = temp;
        return start;

    }
}
