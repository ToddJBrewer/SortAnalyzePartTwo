import java.util.Random;

public class Test {

    public static double[] createArray(int size) {
        double[] arr = new double[size];
        for (int i= 0; i<arr.length; i++) {
            arr[i] = (new Random()).nextFloat();
        }
        return arr;
    }

    public static void main(String[] args) {

        double[] arr50k = createArray(50000);
        double[] arr100k = createArray(100000);
        double[] arr150k = createArray(150000);
        double[] arr200k = createArray(200000);
        double[] arr250k = createArray(250000);
        double[] arr300k = createArray(300000);
        double[] arr350k = createArray(350000);
        double[] arr400k = createArray(400000);
        double[] arr450k = createArray(450000);
        double[] arr500k = createArray(500000);

        double[][] outerArr = {arr50k, arr100k, arr150k, arr200k, arr250k, arr300k, arr350k, arr400k, arr450k, arr500k};
        double[] results = new double[10];

/*        System.out.print("Insertion Sort Test \n");
        for (int i = 0; i<outerArr.length; i++ ) {
            System.out.print("begin test "+i+" = " + System.currentTimeMillis() + "\n");
            long begin = System.currentTimeMillis();

            QuadraticSort.QuadraticSort(outerArr[i], 0, outerArr[i].length);

            System.out.print("end test "+i+" = " + System.currentTimeMillis() + "\n");
            long end = System.currentTimeMillis();
            System.out.println(end - begin);
            results[i] = (end - begin);
        */

        System.out.print("Random Quick Sort Test \n");
        for (int i = 0; i < outerArr.length; i++) {
            System.out.print("begin test " + i + " = " + System.currentTimeMillis() + "\n");
            long begin = System.currentTimeMillis();

            HybridSort.hybridsort(0, outerArr[i].length-1, outerArr[i]);

            System.out.print("end test " + i + " = " + System.currentTimeMillis() + "\n");
            long end = System.currentTimeMillis();
            System.out.println(end - begin);
            results[i] = (end - begin);

        }
    }


}
