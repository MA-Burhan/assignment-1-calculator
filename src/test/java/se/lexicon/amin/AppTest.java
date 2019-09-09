package se.lexicon.amin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testAddition_OneAndOne() {
        //Arrange
        double numberA = 1;
        double numberB = 1;
        double expectedSum = 2;

        //Act
        double result = Calculation.addition(numberA, numberB);


        //Assert
        assertEquals(expectedSum, result, 0);
    }

    @Test
    public void testAddition_NegativeOneAndNegativeOne() {
        //Arrange
        double numberA = -1;
        double numberB = -1;
        double expectedSum = -2;

        //Act
        double result = Calculation.addition(numberA, numberB);


        //Assert
        assertEquals(expectedSum, result, 0);
    }

    @Test
    public void testSubtraction_OneFromOne() {
        //Arrange
        double numberA = 1;
        double numberB = 1;
        double expectedSum = 0;

        //Act
        double result = Calculation.substraction(numberA, numberB);


        //Assert
        assertEquals(expectedSum, result, 0);
    }

    @Test
    public void testSubtraction_NegativeOneFromNegativeOne() {
        //Arrange
        double numberA = -1;
        double numberB = -1;
        double expectedSum = 0;

        //Act
        double result = Calculation.substraction(numberA, numberB);


        //Assert
        assertEquals(expectedSum, result, 0);
    }

    @Test
    public void testAddition_UsingArray() {
        //Arrange
        double[] array = {5, 10, 15, 20};
        double expectedSum = 50;

        //Act
        double result = Calculation.addition(array);


        //Assert
        assertEquals(expectedSum, result, 0);
    }

    @Test
    public void testSubtraction_UsingArray() {
        //Arrange
        double[] array = {50, 10, 15, 20};
        double expectedSum = 5;

        //Act
        double result = Calculation.subtraction(array);


        //Assert
        assertEquals(expectedSum, result, 0);
    }

    @Test
    public void testMultiplication_TenWithFive() {
        //Arrange
        double numberA = 10;
        double numberB = 5;
        double expectedSum = 50;

        //Act
        double result = Calculation.multiplication(numberA, numberB);


        //Assert
        assertEquals(expectedSum, result, 0);
    }

    @Test
    public void testDivision_TenWithFive() {
        //Arrange
        double numberA = 10;
        double numberB = 5;
        double expectedSum = 2;

        //Act
        double result = Calculation.division(numberA, numberB);


        //Assert
        assertEquals(expectedSum, result, 0);
    }

    @Test
    public void testDivision_dividingWithZero() {
        //Arrange
        double numberA = 10;
        double numberB = 0;
        double expectedSum = -1.0;

        //Act
        double result = Calculation.division(numberA, numberB);


        //Assert
        assertEquals(expectedSum, result, 0);
    }


}
