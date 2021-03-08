import java.util.Random;

public class RandomQuicksort {

    public static void main(String[] args) {
        double[] test = {5, 9, 3, 4, 0, 3, 5, 88, 0, 1, 3, 5, 9, 32, 4};
        RandomQuicksort.sort(0, test.length-1, test);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + "\n");
        }
    }

    /**
     * sorts array with quicksort method with a randomly selected pivot
     * @param arr the array to be sorted
     */
    public static void sort(int bot, int top, double[] arr) {
        if (bot < top) {
            int p = partition(bot, top, arr);
            sort(bot, p-1, arr);
            sort(p+1, top, arr);
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
        int rand = (int) ((Math.random() * (right-left)) + left); //random pivot
        int index = left;
        swap(rand, right, arr);
        int pivot = right;
        for (int i = left; i <= right-1; i++) {
            if (arr[i] <= arr[pivot]) {
                swap(i, index, arr);
                index++;
            }
        }
        swap(pivot, index, arr);
        return index;
    }
}
