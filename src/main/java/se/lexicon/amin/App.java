package se.lexicon.amin;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int calculationType;
        double firstValue;
        double secondValue;
        double resultOfCalculation = 0;

        System.out.println("Welcome to this Calculator, please select the type of calculation you want to perform:\n" +
                "\nPress 1 for Addition \nPress 2 for Subtraction \nPress 3 for Division \nPress 4 for Multiplication \nPress any other number to Quit\n");


        System.out.print("Select calculation type (1-4): ");
        calculationType = scanner.nextInt();

        while (calculationType > 0 && calculationType < 5) {

            System.out.print("Enter first value: ");
            firstValue = scanner.nextDouble();
            System.out.print("Enter second value: ");
            secondValue = scanner.nextDouble();

            switch (calculationType) {
                case 1:
                    resultOfCalculation = calculateAddition(firstValue, secondValue);
                    break;
                case 2:
                    resultOfCalculation = calculateSubstraction(firstValue, secondValue);
                    break;
                case 3:
                    resultOfCalculation = calculateDivision(firstValue, secondValue);
                    break;
                case 4:
                    resultOfCalculation = calculateMultiplication(firstValue, secondValue);
                    break;
                default:
                    break;
            }

            System.out.println("Result: " + resultOfCalculation + "\n");
            System.out.print("Select calculation type (1-4): ");
            calculationType = scanner.nextInt();
        }

    }

    public static double calculateAddition(double value1, double value2) {

        double result = value1 + value2;
        return result;

    }

    public static double calculateSubstraction(double value1, double value2) {

        double result = value1 - value2;
        return result;
    }

    public static double calculateDivision(double value1, double value2) {

        double result = value1 / value2;
        return result;
    }

    public static double calculateMultiplication(double value1, double value2) {

        double result = value1 * value2;
        return result;
    }
}
