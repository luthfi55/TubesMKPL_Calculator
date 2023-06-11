package src.test.java;

import static org.junit.Assert.*;
import src.main.java.*;
import org.junit.Test;

public class CalculatorTest{
    
    @Test
    public static void testAddition() {
        String expression = "2 + 3";
        double expected = 5.0;
        double result = Double.parseDouble(Calculator.calculateExpression(expression));
        System.out.println(expression + " = " + result + " (Expected: " + expected + ")");
    }
    
    
    @Test
    public static void testSubtraction() {
        String expression = "5 - 3";
        double expected = 2.0;
        double result = Double.parseDouble(Calculator.calculateExpression(expression));
        System.out.println(expression + " = " + result + " (Expected: " + expected + ")");
    }
    
    @Test
    public static void testMultiplication() {
        String expression = "4 * 3";
        double expected = 12.0;
        double result = Double.parseDouble(Calculator.calculateExpression(expression));
        System.out.println(expression + " = " + result + " (Expected: " + expected + ")");
    }
    
    @Test
    public static void testDivision() {
        String expression = "10 / 2";
        double expected = 5.0;
        double result = Double.parseDouble(Calculator.calculateExpression(expression));
        System.out.println(expression + " = " + result + " (Expected: " + expected + ")");
    }

    @Test
    public static void testComplexExpression() {
        String expression = "2 + 3 * (4 - 1)";
        double expected = 11.0;
        double result = Double.parseDouble(Calculator.calculateExpression(expression));
        System.out.println(expression + " = " + result + " (Expected: " + expected + ")");
    }
}
