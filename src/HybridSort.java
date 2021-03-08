public class HybridSort {

    public static void hybridsort(int bot, int top, double[] arr) {
        if (bot < top) {
            if (top - bot < 20) {
                QuadraticSort.QuadraticSort(arr, bot, top);
            } else {
                int p = partition(bot, top, arr);
                hybridsort(bot, p - 1, arr);
                hybridsort(p + 1, top, arr);
            }
        }
    }

    public static void swap(int i, int j, double[] arr) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int left, int right, double[] arr) {
        int rand = (int) ((Math.random() * (right-left)) + left);
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
