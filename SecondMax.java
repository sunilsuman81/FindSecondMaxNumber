package com.sks;

public class SecondMax {

    public static void main(String... secondMax) {
        int[] array = {-10, -9, -24, -5, 1, -8};
        int findsSecondMax = findSecondMax(array);
        System.out.println(findsSecondMax);

    }
    private static int findSecondMax(int[] array) {
        int max = array[0];
        int s_max = Integer.MIN_VALUE;

        for(int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                s_max = max;
                max =array[i];
            } else if(array[i] > max && array[i] != max) {
                s_max = array[i];
            }
        }
    return s_max;
    }

}
