package ru.test.educationproject.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @Test
    public void sumValueEmptyArrayTest() {
        int sum = Array.sum(new int[]{});
        assertEquals(0, sum);
    }

    @Test
    public void sumValueArrayTest() {
        int sum = Array.sum(new int[]{1, 2, 3});
        assertEquals(6, sum);
    }

    @Test
    public void maxValueEmptyArrayTest() {
        Integer max = Array.max(new int[]{});
        assertNull(max);
    }

    @Test
    public void maxValueOneElementArrayTest() {
        Integer max = Array.max(new int[]{1});
        assertEquals(1, max);
    }

    @Test
    public void maxValueArrayTest() {
        Integer max = Array.max(new int[]{1, 2, 3});
        assertEquals(3, max);
    }

    @Test
    public void middleArrayTest() {
        Integer middle = Array.middle(new int[]{1, 2, 3});
        assertEquals(2, middle);
    }

    @Test
    public void middleArrayEmptyResultTest() {
        Integer middle = Array.middle(new int[]{2, 3});
        assertNull(middle);
    }

    @Test
    public void middleEmptyArrayTest() {
        Integer middle = Array.middle(new int[]{1111, 1111, 2222});
        assertEquals(1111, middle);
    }

    @Test
    public void reverseArrayTest() {
        int[] revArray = {1111, 2222, 3333};
        int[] duplicate = Arrays.copyOf(revArray, revArray.length);
        int[] reverse = Array.reverse(revArray);
        assertEquals(revArray.length, reverse.length);
        assertEquals(duplicate[0], reverse[2]);
        assertEquals(duplicate[2], reverse[0]);
        assertEquals(duplicate[1], reverse[1]);
    }

    @Test
    public void reverse2ArrayTest() {
        int[] revArray = {1111, 2222};
        int[] duplicate = Arrays.copyOf(revArray, revArray.length);
        int[] reverse = Array.reverse(revArray);
        assertEquals(revArray.length, reverse.length);
        assertEquals(duplicate[0], reverse[1]);
        assertEquals(duplicate[1], reverse[0]);
    }

    @Test
    public void reverseOneElementArrayTest() {
        int[] revArray = {1111};
        int[] duplicate = Arrays.copyOf(revArray, revArray.length);
        int[] reverse = Array.reverse(revArray);
        assertEquals(revArray.length, reverse.length);
        assertEquals(duplicate[0], reverse[0]);
    }

    @Test
    public void reverseEmptyArrayTest() {
        int[] revArray = {};
        int[] reverse = Array.reverse(revArray);
        assertEquals(revArray.length, reverse.length);
    }

}