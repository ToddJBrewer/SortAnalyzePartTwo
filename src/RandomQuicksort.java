import java.util.Random;

public class RandomQuicksort {

    public static void main(String[] args) {
        double[] test = {5, 9, 3, 4, 0, 3, 5, 88, 0, 1, 3, 5, 9, 32, 4};
        RandomQuicksort.sort(0, test.length-1, test);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + "\n");
        }
    }

    public static void sort(int bot, int top, double[] arr) {
        if (bot < top) {
            int p = partition(bot, top, arr);
            sort(bot, p-1, arr);
            sort(p+1, top, arr);
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
