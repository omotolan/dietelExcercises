package tddClass;

import Classwork.Arrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest {
    @Test
    public void highestNumberInArrayTest(){
        Arrays array = new Arrays();
        int[] result = {34, 223, 53, 57, 43, 32, 566, 234, 344, 78};
        assertEquals(566, array.highestFigure(result));
    }
    @Test
    public void sumOfFiguresTest(){
        Arrays array = new Arrays();
        int[] result = {34, 223, 53, 57, 43, 32, 566, 234, 344, 78};
        assertEquals(1664, array.sumOfFigures(result));
    }
    @Test
    public void averageOfFiguresTest(){
        Arrays array = new Arrays();
        int[] result = {34, 223, 2353, 57, 643, 32, 566, 234, 344, 8};
        assertEquals(449.4, array.averageOfFigure(result));
    }
}
