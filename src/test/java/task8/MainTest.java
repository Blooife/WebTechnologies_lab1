package task8;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest extends Main {
    @Test
    public void checkAllBefore(){
        double[] firstArray = {13,14,19,21};
        double[] secondArray = {3,5,8,10};
        int[] expected = {0,0,0,0};
        assertArrayEquals(expected, findIndexes(firstArray, secondArray));
    }
    @Test
    public void checkAllAfter(){
        double[] firstArray = {1,3,4,6};
        double[] secondArray = {8,15,22,30};
        int[] expected = {3,3,3,3};
        assertArrayEquals(expected, findIndexes(firstArray, secondArray));
    }
    @Test
    public void checkUsual(){
        double[] firstArray = {3,5,9,16};
        double[] secondArray = {4,2,10,13};
        int[] expected = {1,0,3,3};
        assertArrayEquals(expected, findIndexes(firstArray, secondArray));
    }

}