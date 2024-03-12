package isp.lab2.Exercise1RandomArray;

import java.util.Random;

public class Exercise1RandomArray {

    public static int[] getArrayOfRandomNumbers(int n) {
        int[] array = new int[n];
        //TODO: implement the logic to fill the array with random numbers
        Random rand = new Random();
        //int randomNumber = rand.nextInt(n);
        for (int i = 1; i <= n; i++) {
            array[i] = rand.nextInt();
        }
        return array;
    }

    public static int[] findMinAndMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            } else if (max < array[i]) {
                max = array[i];
            }
        }

        int[] result = {min, max};
        return result;
        // return null;
    }

    public static void print() {
        System.out.println("TEST");
    }

    public static void main(String[] args) {

        Random random = new Random();
        //genereaza numar random intre 10 si 100
        int size = random.nextInt(91) + 10;
        int[] a = getArrayOfRandomNumbers(size);
        int[] mm = findMinAndMax(a);
        System.out.println("Min is:" + mm[0] + " Max is:" + mm[1]);
    }
}
