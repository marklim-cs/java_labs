import java.util.Arrays;

public class ManualArrayCopy {
    public static void main(String[] args) {
        //all to 0.0
        double[] arr1 = new double[10];
        double[] arr2 = new double[arr1.length];


        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
            arr2[i] = arr1[i];
        }

        System.out.println("arr1 = " + Arrays.toString(arr1) + ", " + "arr2 = " + Arrays.toString(arr2));
    }
}
