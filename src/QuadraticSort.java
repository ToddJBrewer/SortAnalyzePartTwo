public class QuadraticSort {
    /**
     * sorts array with insertion sort method
     * @param arr the array to be sorted
     * @return the sorted array
     */
    public static double[] QuadraticSort(double[] arr, int left, int right) {
        for (int i = left+1; i < right; i++) {
            double temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        double[] test = {106, 5, 9, 3, 4, 0, 3, 5, 88, 0, 1, 3, 5, 9, 32, 4};
        double[] target = QuadraticSort(test, 0, test.length);
        for (int i = 0; i < test.length; i++) {
            System.out.print(target[i] + "\n");
        }
    }
}