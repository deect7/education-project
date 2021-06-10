package ru.test.educationproject.array;


public class Array {

    final int[] array;

    public Array() {
        array = new int[0];
    }

    public static int sum(int[] myArray) {
        int result = 0;
        for (int j : myArray) {
            result = result + j;
        }
        return result;
    }

    public static Integer max(int[] maxArray) {
        if (maxArray.length == 0) {
            return null;
        }
        int maxValue = maxArray[0];
        for (int i = 1; i < maxArray.length; i++) {
            if (maxArray[i] > maxValue) {
                maxValue = maxArray[i];
            }
        }
        return maxValue;
    }

    public static Integer middle(int[] midArray) {
        if (midArray.length % 2 == 0) {
            return null;
        } else {
            return midArray[midArray.length / 2];
        }
    }

    public static int[] reverse(int[] revArray) {
        for (int i = 0; i < revArray.length / 2; i++) {
            int j = revArray[i];
            revArray[i] = revArray[revArray.length - i - 1];
            revArray[revArray.length - i - 1] = j;
        }
        return revArray;
    }

}
