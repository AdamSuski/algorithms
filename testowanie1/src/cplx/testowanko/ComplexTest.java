package cplx.testowanko;
import cplx.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComplexTest extends Throwable  {

    @Test
    public void testAdd(){
        Complex cpl1 = new Complex(1, 1);
        Complex cpl2 = new Complex(1, 0);
        Complex cpl3 = new Complex(0, 1);
        assertEquals(cpl1,cpl2.add(cpl3));
    }
    @Test
    public void testSubtract(){
        Complex cpl1 = new Complex(1, 1);
        Complex cpl2 = new Complex(1, 0);
        Complex cpl3 = new Complex(0, 1);
        assertEquals(cpl3, cpl1.subtract(cpl2));
    }
    @Test
    public void testMultiply(){
        Complex cpl1 = new Complex(0, 0);
        Complex cpl2 = new Complex(1, 1);
        Complex cpl3 = new Complex(0, 0);
        assertEquals(cpl1,cpl2.multiply(cpl3));
    }
    @Test
    public void testDivide(){
        Complex cpl1 = new Complex(0, -1);
        Complex cpl2 = new Complex(1, 0);
        Complex cpl3 = new Complex(0, 1);
        assertEquals(cpl1,cpl2.divide(cpl3));
    }
    @Test
    public void testDivisionByZero(){
        Complex cpl2 = new Complex(1, 0);
        assertEquals(new Complex(Double.NaN, Double.NaN),cpl2.divide(Complex.ZERO));
    }
    @Test
    public void testToString(){
        Complex cpl1 = new Complex(1, 1);
        assertEquals("(1.0 + 1.0i)",cpl1.toString());
    }
    @Test
    public void testMultiplyByZero(){
        Complex cpl2 = new Complex(3, 0);
        assertEquals(Complex.ZERO,cpl2.multiply(Complex.ZERO));
    }
    @Test
    public void testArithmeticException(){
        Complex cpl1 = new Complex(1, 1);
        assertEquals(Complex.ZERO,Complex.ZERO.divide(cpl1));
    }


}
