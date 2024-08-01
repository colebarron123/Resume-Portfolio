package edu.kennesaw.seclass;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

//Cole Barron
//Software Testing and QA
//Assignment 5

public class PrintPrimesTest {

    @Test
    //Q2 bypass while, n = 0 test
    public void testPrintPrimesOne() {
        int n = 0;
        String expectedOutput = " 2";
        assertEquals(expectedOutput, PrintPrimes.printPrimes(n));
    }

    @Test
    //Q3 edge coverage n = 1 test
    public void testPrintPrimesTwo() {
        int n = 1;
        String expectedOutput = " 2";
        assertEquals(expectedOutput, PrintPrimes.printPrimes(n));
    }

    @Test
    //Q3 edge coverage n = 2 test
    public void testPrintPrimesThree() {
        int n = 2;
        String expectedOutput = " 2 3";
        assertEquals(expectedOutput, PrintPrimes.printPrimes(n));
    }
    
    @Test
    //Q3 edge coverage n = 3 test
    public void testPrintPrimesFour() {
        int n = 3;
        String expectedOutput = " 2 3 5";
        assertEquals(expectedOutput, PrintPrimes.printPrimes(n));
    }
}
