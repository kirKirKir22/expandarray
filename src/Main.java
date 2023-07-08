import java.util.Arrays;

public class Main {

    public static void toExpendArr(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
            System.out.print(Arrays.toString(arr));
        }

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        toExpendArr(arr);

    }
}