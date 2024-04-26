package hust.soict.globalict.lab01.JavaBasics;

import java.util.Arrays;

public class ArraySortingPlus {
    public static void main(String[] args) {
        double[] array = {5.5, 3.3, 7.7, 1.1, 9.9, 2.2};
        Arrays.sort(array);
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / array.length;
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Sum of Array Elements: " + sum);
        System.out.println("Average of Array Elements: " + average);
    }
}
