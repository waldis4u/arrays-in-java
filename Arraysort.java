package array;

import java.util.Arrays;

public class Arraysort {

    public static void main (String[] args) {
        int array[] = {12, 34, 2, 87, 90, 36, 78, 6, 55, 67};
        Arrays.sort(array);
        for (int i =0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}