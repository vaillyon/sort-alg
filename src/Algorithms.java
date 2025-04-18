
import java.util.Arrays;

    public class Algorithms {

        // Bubble Sort
        public static void bubbleSort(Integer[] array) {
            int n = array.length;
            boolean swapped;
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        // Swap
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        swapped = true;
                    }
                }

                if (!swapped) break;
            }
        }

        // Merge Sort
        public static void mergeSort(Integer[] array) {
            if (array.length < 2) return;
            int mid = array.length / 2;
            Integer[] left = Arrays.copyOfRange(array, 0, mid);
            Integer[] right = Arrays.copyOfRange(array, mid, array.length);

            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }

        private static void merge(Integer[] array, Integer[] left, Integer[] right) {
            int i = 0, j = 0, k = 0;
            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    array[k++] = left[i++];
                } else {
                    array[k++] = right[j++];
                }
            }
            while (i < left.length) {
                array[k++] = left[i++];
            }
            while (j < right.length) {
                array[k++] = right[j++];
            }
        }

        // Insertion Sort
        public static void insertionSort(Integer[] array) {
            for (int i = 1; i < array.length; i++) {
                int key = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > key) {
                    array[j + 1] = array[j];
                    j = j - 1;
                }
                array[j + 1] = key;
            }
        }
    }


