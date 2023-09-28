package task1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import task1.Main;

import static org.junit.jupiter.api.Assertions.*;

class MainTest extends Main {

    @Test
    public void checkPositiveValue() {
        double x = 2.8;
        double y = 3.3;
        double expected = 3.0;
        double actual = calculate(x,y);
        double epsilon = 0.1;
        assertEquals(expected, actual, epsilon);
    }

    @Test
    public void checkZeroValue() {
        double x = 0;
        double y = 0;
        double expected = 0.5;
        double actual = calculate(x,y);
        double epsilon = 0.1;
        assertEquals(expected, actual, epsilon);
    }
    @Test
    public void checkNegativeValue() {
        double x = -5.5;
        double y = -2.7;
        double expected = -5.2;
        double actual = calculate(x,y);
        double epsilon = 0.1;
        assertEquals(expected, actual, epsilon);
    }
}