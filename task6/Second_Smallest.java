package task6;

import mypack.Integer;

public class Second_Smallest {

    public static int findSecondSmallest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return -1; 
        }

        int smallest = Integer.MAX_VALUE;      
        int secondSmallest = Integer.MAX_VALUE; 

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found (all elements might be the same).");
            return -1; 
        }

        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] inputArray = {3, 5, 1, 4, 2};

        int result = findSecondSmallest(inputArray);
        if (result != -1) {
            System.out.println("The second smallest element is: " + result);
        }
    }
}
