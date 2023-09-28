package task3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.lang.model.element.Element;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest extends Main {

    @Test
    public void checkSameBoundaries(){
        double a = 0;
        double b = 0;
        double h = 0.5;
        ArrayList<Element> expected = new ArrayList<>();
        expected.add(new Element(0, 0));
        assertEquals(expected, calculateTanWithStep(a,b,h));
    }

    @Test
    public void checkNormal(){
        double a = 0;
        double b = 1;
        double h = 0.5;
        ArrayList<Element> expected = new ArrayList<>();
        expected.add(new Element(0, 0));
        expected.add(new Element(Math.tan(0.5), 0.5));
        expected.add(new Element(Math.tan(1), 1));
        assertEquals(expected, calculateTanWithStep(a, b, h));
    }
}