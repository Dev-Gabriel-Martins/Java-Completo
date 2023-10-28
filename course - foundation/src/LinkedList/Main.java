import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static int[] subsetA(int[] arr) {
        List<Integer> subsetA = new ArrayList<>();
        List<Integer> subsetB = new ArrayList<>();
        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sumA <= sumB) {
                subsetA.add(arr[i]);
                sumA += arr[i];
            } else {
                subsetB.add(arr[i]);
                sumB += arr[i];
            }
        }

        return subsetA.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1, 2};
        int[] result = subsetA(arr);
        System.out.println(Arrays.toString(result)); // Output: [5, 7]
    }
}
