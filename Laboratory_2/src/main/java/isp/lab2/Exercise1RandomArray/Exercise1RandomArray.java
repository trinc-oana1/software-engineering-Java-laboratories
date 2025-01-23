package isp.lab2.Exercise1RandomArray;

import java.util.Random;

public class Exercise1RandomArray {

    public static int[] getArrayOfRandomNumbers(int n) {
        int[] array = new int[n];
        int i;
        Random rand = new Random();
        for(i=0; i<n; i++)
            array[i] = rand.nextInt(100);

        //TODO: implement the logic to fill the array with random numbers
        return array;
    }

    public static int[] findMinAndMax(int[] array) {
        int min = 1, max = 1, i;
        for (i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            else if (array[i] > max) max = array[i];
        }

        return new int[]{min, max};
}

    public static void main(String[] args) {

        Random random = new Random();
        //genereaza numar random intre 10 si 100
        int size = random.nextInt(91) + 10;
        int[] a = getArrayOfRandomNumbers(size);
        int[] mm = findMinAndMax(a);
        System.out.println("Min is:"+mm[0]+" Max is:"+mm[1] );
    }
}
