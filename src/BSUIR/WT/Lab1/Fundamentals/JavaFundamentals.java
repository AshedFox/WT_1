package BSUIR.WT.Lab1.Fundamentals;

public class JavaFundamentals {
    public static double countExpression(double x, double y) {
        double dividend = 1 + Math.pow(Math.sin(x + y), 2);
        double divisor = 2 + Math.abs(x - (2 * x / (1 + x * x * y * y)));

        return dividend / divisor + x;
    }

    public static void checkIfPointEnter(double x, double y) {
        if (y > 0){
            System.out.println(x <= 4 && x >= -4 && y <= 5);
        }
        else {
            System.out.println(x <= 6 && x >= -6 && y >= -3);
        }
    }

    public static String countFuncOnRange(double a, double b, double step) {
        StringBuilder stringBuilder = new StringBuilder();

        for (double i = a; i <= b; i += step) {
            stringBuilder.append(String.format("%1$10.2f | %2$10.2f\n", i, Math.tan(i)));
        }

        return stringBuilder.toString();
    }

    public static void printPrimesIndexes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(i)) {
                System.out.print(i + ";");
            }
        }
    }

    public static int task5 (int[] array) {
        int[] buff= new int[array.length];

        for (int i = 0; i < array.length; i++) {
            buff[i] = 1;
            for (int j = 0; j < i; j++) {
                if (array[j] < array[i]) {
                    buff[i] = Math.max(buff[i], 1 + buff[j]);
                }
            }
        }

        int maxSequenceLength = buff[0];
        for (int i = 0; i < array.length; i++) {
            maxSequenceLength = Math.max(maxSequenceLength, buff[i]);
        }
        return array.length - maxSequenceLength;
    }

    public static double[][] getMatrix(double[] array){
        double[][] result = new double[array.length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                result[i][j] = array[j + i];
            }
            for (int j = array.length - i; j < array.length; j++) {
                result[i][j] = array[j + i - array.length];
            }
        }

        return result;
    }

    public static double[] shellSort(double[] arrayToSort) {
        int i = 0;

        while (i < arrayToSort.length - 1){
            if (arrayToSort[i] <= arrayToSort[i + 1]) {
                i++;
            }
            else {
                double buff = arrayToSort[i + 1];
                arrayToSort[i + 1] = arrayToSort[i];
                arrayToSort[i] = buff;
                if (i > 0) {
                    i--;
                }
            }
        }

        return arrayToSort;
    }

    public static void printInsertIndexes(double[] from, double[] to){
        for (int i = 0; i < from.length; i++) {
            boolean isToEnd = true;
            for (int j = 0; j < to.length; j++) {
                if (from[i] < to[j]) {
                    System.out.printf("First array element #%d before second array element #%d\n", i, j);
                    isToEnd = false;
                    break;
                }
            }
            if (isToEnd)
                System.out.printf("First array element #%d to the end of second array\n", i);
        }
    }

    private static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
