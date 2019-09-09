package se.lexicon.amin;

public class Calculation {


    public static double addition(double value1, double value2) {

        double result = value1 + value2;
        return result;

    }

    public static double addition(double[] array) {

        double result = 0;

        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }

        return result;
    }

    public static double substraction(double value1, double value2) {

        double result = value1 - value2;
        return result;
    }

    public static double subtraction(double[] array) {

        double result = 0;
        result = array[0];
        for (int i = 1; i < array.length; i++) {

            result -= array[i];
        }
        return result;
    }

    public static double division(double value1, double value2) {

        if (value2 != 0) {
            double result = value1 / value2;
            return result;
        } else {
            return -1.0;
        }
    }

    public static double multiplication(double value1, double value2) {

        double result = value1 * value2;
        return result;

    }

}
