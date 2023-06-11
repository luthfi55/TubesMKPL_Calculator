import junit.framework.TestCase;

public class CalculatorTest extends TestCase{
    public static void main(String[] args) {
        testAddition();
        testSubtraction();
        testMultiplication();
        testDivision();
        testComplexExpression();
    }

    public static void testAddition() {
        String expression = "2 + 3";
        double expected = 5.0;
        double result = Double.parseDouble(Calculator.calculateExpression(expression));
        System.out.println(expression + " = " + result + " (Expected: " + expected + ")");
    }

    public static void testSubtraction() {
        String expression = "5 - 3";
        double expected = 2.0;
        double result = Double.parseDouble(Calculator.calculateExpression(expression));
        System.out.println(expression + " = " + result + " (Expected: " + expected + ")");
    }

    public static void testMultiplication() {
        String expression = "4 * 3";
        double expected = 12.0;
        double result = Double.parseDouble(Calculator.calculateExpression(expression));
        System.out.println(expression + " = " + result + " (Expected: " + expected + ")");
    }

    public static void testDivision() {
        String expression = "10 / 2";
        double expected = 5.0;
        double result = Double.parseDouble(Calculator.calculateExpression(expression));
        System.out.println(expression + " = " + result + " (Expected: " + expected + ")");
    }

    public static void testComplexExpression() {
        String expression = "2 + 3 * (4 - 1)";
        double expected = 11.0;
        double result = Double.parseDouble(Calculator.calculateExpression(expression));
        System.out.println(expression + " = " + result + " (Expected: " + expected + ")");
    }
}
