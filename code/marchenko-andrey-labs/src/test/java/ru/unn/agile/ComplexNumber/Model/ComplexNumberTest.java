package ru.unn.agile.ComplexNumber.Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexNumberTest {

    private final double EPSILON = 0.000001;

    @Test
    public void canCreateComplexNumberWithInitialValues() {
        ComplexNumber number = new ComplexNumber(1.0, 1.0);

        assertNotNull(number);
    }

    @Test
    public void canGetInitialRealValue() {
        ComplexNumber number = new ComplexNumber(1.0, 2.0);

        assertEquals(1.0, number.getReal(), EPSILON);
    }

    @Test
    public void canSetInitialRealValue() {
        ComplexNumber number = new ComplexNumber(1.0, 2.0);

        number.setReal(2.35);

        assertEquals(2.35, number.getReal(), EPSILON);
    }

    @Test
    public void canGetInitialImaginaryValue() {
        ComplexNumber number = new ComplexNumber(1.0, 2.0);

        assertEquals(2.0, number.getImaginary(), EPSILON);
    }

    @Test
    public void canSetInitialImaginaryValue() {
        ComplexNumber number = new ComplexNumber(1.0, 2.0);

        number.setImaginary(2.35);

        assertEquals(2.35, number.getImaginary(), EPSILON);
    }

    @Test
    public void areEqualComplexNumbersEqual() {
        ComplexNumber z1 = new ComplexNumber(1.0, 2.0);
        ComplexNumber z2 = new ComplexNumber(1.0, 2.0);

        assertEquals(z1, z2);
    }

    @Test
    public void areComplexNumbersWithDifferentRealValueNotEqual() {
        ComplexNumber z1 = new ComplexNumber(2.0, 2.0);
        ComplexNumber z2 = new ComplexNumber(1.0, 2.0);

        assertNotEquals(z1,z2);
    }

    @Test
    public void areComplexNumbersWithDifferentImaginaryValueNotEqual() {
        ComplexNumber z1 = new ComplexNumber(1.0, 2.0);
        ComplexNumber z2 = new ComplexNumber(1.0, 1.0);

        assertNotEquals(z1,z2);
    }

    @Test
    public void canAddComplexNumbersWithPositiveValues() {
        ComplexNumber z1 = new ComplexNumber(1.0, 2.0);
        ComplexNumber z2 = new ComplexNumber(1.0, 1.0);

        ComplexNumber z3 = z1.add(z2);

        assertEquals(new ComplexNumber(2.0, 3.0), z3);
    }

    @Test
    public void canAddComplexNumbersWithNegativeValues() {
        ComplexNumber z1 = new ComplexNumber(-1.0, -2.0);
        ComplexNumber z2 = new ComplexNumber(-1.0, -1.0);

        ComplexNumber z3 = z1.add(z2);

        assertEquals(new ComplexNumber(-2.0, -3.0), z3);
    }

    @Test
    public void canAddComplexNumbersWithZeroValues() {
        ComplexNumber z1 = new ComplexNumber(0.0, 0.0);
        ComplexNumber z2 = new ComplexNumber(0.0, 0.0);

        ComplexNumber z3 = z1.add(z2);

        assertEquals(new ComplexNumber(0.0, 0.0), z3);
    }

}