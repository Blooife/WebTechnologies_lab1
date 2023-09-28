package task6;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest extends Main {
    @Test
    public void test1(){
        double[] originalArray = {5.5};
        double[][] expected = {{5.5}};
        assertArrayEquals(expected, getMatrix(originalArray));
    }
    @Test
    public void test2(){
        double[] originalArray = {1.0, 2.0, 3.0};
        double[][] expected = {{1.0, 2.0, 3.0},{2.0, 3.0, 1.0},{3.0, 1.0, 2.0}};
        assertArrayEquals(expected, getMatrix(originalArray));
    }
}