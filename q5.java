import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6};
        int length = removeDuplicates(arr);
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index] = arr[i];  
                index++;
            }
        }
        return index;
    }
}
