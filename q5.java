import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Example sorted array
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6};

        // Calling the method to remove duplicates
        int length = removeDuplicates(arr);

        // Print the array after removing duplicates
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Method to remove duplicates from a sorted array
    public static int removeDuplicates(int[] arr) {
        // If the array is empty or has one element, return the length as is
        if (arr == null || arr.length == 0) {
            return 0;
        }

        // Variable to keep track of the last unique element's index
        int index = 1;

        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is not equal to the previous element
            if (arr[i] != arr[i - 1]) {
                arr[index] = arr[i];  // Update the array with unique element
                index++;
            }
        }

        // Return the new length of the array with no duplicates
        return index;
    }
}
