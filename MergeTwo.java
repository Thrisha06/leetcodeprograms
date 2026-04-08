import java.util.Arrays;

public class MergeTwo {

    public static void main(String[] args) {

        int[] list1 = {1, 2, 3};
        int[] list2 = {1, 2, 4};

        int[] result = mergeTwoLists(list1, list2);

        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeTwoLists(int[] list1, int[] list2) {

        int n = list1.length;
        int m = list2.length;

        int[] merged = new int[n + m];

        int i = 0, j = 0, k = 0;

        // compare elements
        while (i < n && j < m) {
            if (list1[i] < list2[j]) {
                merged[k++] = list1[i++];
            } else {
                merged[k++] = list2[j++];
            }
        }

        // remaining elements
        while (i < n) {
            merged[k++] = list1[i++];
        }

        while (j < m) {
            merged[k++] = list2[j++];
        }

        return merged;
    }
}