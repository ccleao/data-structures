package examplesSort;

import java.util.Arrays;

public class sortJDK {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        Arrays.parallelSort(intArray);

        for (int j : intArray) {
            System.out.println(j);
        }
    }
}
