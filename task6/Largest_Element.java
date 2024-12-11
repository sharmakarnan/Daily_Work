package task6;

public class Largest_Element {

    public static int findLargest(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return Integer.MIN_VALUE;
        }

        int largest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                largest = num; 
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] inputArray = {3, 5, 1, 8, 2, 10, 4};

        int largest = findLargest(inputArray);
        if (largest != Integer.MIN_VALUE) {
            System.out.println("The largest element in the array is: " + largest);
        }
    }
}
