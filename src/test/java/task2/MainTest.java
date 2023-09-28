package task2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest extends Main {
    @Test
    public void checkPointInsideFigure(){
        int x = 1;
        int y = 2;
        assertTrue(checkFigure(x, y));
    }

    @Test
    public void checkPointOutsideFigure(){
        int x = 3;
        int y = 6;
        assertFalse(checkFigure(x, y));
    }

    @Test
    public void checkPointOnBorderFigure(){
        int x = -4;
        int y = 2;
        assertTrue(checkFigure(x, y));
    }
}