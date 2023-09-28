package task7;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest extends Main {
    @Test
    public void checkIfSorted(){
        double[] arr = {5,7,9,10,15,22,22};
        assertArrayEquals(arr, sort(arr));
    }
    @Test
    public void checkReversed(){
        double[] orgnl = {30,19,10,9,3,2,1};
        double[] exp = {1,2,3,9,10,19,30};
        assertArrayEquals(exp,sort(orgnl));
    }
    @Test
    public void checkUsual(){
        double[] orgnl = {20,3,8,6,17,3};
        double[] exp = {3,3,6,8,17,20};
        assertArrayEquals(exp, sort(orgnl));
    }
}