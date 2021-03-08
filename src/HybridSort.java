public class HybridSort {

    /**
     * sorts large arrays with quicksort and changes to quadratic sort when arr size < 15
     * @param arr the array to be sorted
     * @param bot variable tracking bottom of array
     * @param top variable tracking top of array
     */
    public static void hybridsort(int bot, int top, double[] arr) {
        if (bot < top) {
            if (top - bot < 15) { //changes sorting method to quadratic
                QuadraticSort.QuadraticSort(arr, bot, top+1);
            } else {
                int p = partition(bot, top, arr);
                hybridsort(bot, p - 1, arr);
                hybridsort(p + 1, top, arr);
            }
        }
    }
    /**
     * swap method
     * @param arr containing i and j
     * @param i first element to be swapped
     * @param j second element to be swapped
     */
    public static void swap(int i, int j, double[] arr) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * partition function
     * @param left variable which tracks bottom of array
     * @param right variable which tracks top of array
     * @param arr array being partitioned
     * @return index
     */
    public static int partition(int left, int right, double[] arr) {
        int rand = (int) ((Math.random() * (right - left)) + left); //random pivot
        int index = left;
        swap(rand, right, arr);
        int pivot = right;
        for (int i = left; i <= right - 1; i++) {
            if (arr[i] <= arr[pivot]) {
                swap(i, index, arr);
                index++;
            }
        }
        swap(pivot, index, arr);
        return index;
    }

}
