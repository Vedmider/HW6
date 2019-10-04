package com.HW6;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CounterTest {
    private List<Integer> integerList;

    @Before
    public void setUp(){
        integerList = new ArrayList<>();
        integerList.addAll(Arrays.asList(1, 2, 3, 4, 2, 1, 5, 5, -1, -2, 2, 7, 34, 2, 2, 3, 2, 5));
    }


    @Test
    public void shouldReturnIntegerListWith6RepetitionsOfNumber2(){
        Integer expected = 6;
        Integer actual = Counter.count(integerList).get(2);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnIntegerListWith3RepetitionsOfNumber5(){
        Integer expected = 3;
        Integer actual = Counter.count(integerList).get(5);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnIntegerListWith2RepetitionsOfNumber1(){
        Integer expected = 2;
        Integer actual = Counter.count(integerList).get(1);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnIntegerListWith1RepetitionsOfNegativeNumber1(){
        Integer expected = 1;
        Integer actual = Counter.count(integerList).get(-1);

        assertEquals(expected, actual);
    }

}
