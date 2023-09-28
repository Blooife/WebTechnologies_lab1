package task4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest extends Main {
   // private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @Test
    public void checkNonePrimeNumbers(){
        int[] arr = {20,25,106,1};
        printPrimeElements(arr);
        assertEquals("",outputStreamCaptor.toString());
    }
    @Test
    public void checkAllPrimeNumbers(){
        int[] arr = {17,11,101,7};
        printPrimeElements(arr);
        assertEquals("0 1 2 3 ",outputStreamCaptor.toString());
    }
    @Test
    public void checkSomePrimeNumbers(){
        int[] arr = {10,3,5,22};
        printPrimeElements(arr);
        assertEquals("1 2 ",outputStreamCaptor.toString());
    }

    @Test
    public void checkIsPrimeFunction() {
        assertTrue(isPrime(17));
        assertTrue(isPrime(7));
        assertTrue(isPrime(11));
        assertFalse(isPrime(56));
        assertFalse(isPrime(1));
    }
}