import org.junit.Test;

public class CalculatorTest{

    @Test
    public void testAddition() {
        String expression = "2 + 3";
        double expected = 5.0;
        double result = Double.parseDouble(Calculator.calculateExpression(expression));
        org.junit.Assert.assertEquals(expression + " = " + result, expected, result, 0.0);
    }

    @Test
    public void testSubtraction() {
        String expression = "5 - 3";
        double expected = 2.0;
        double result = Double.parseDouble(Calculator.calculateExpression(expression));
        org.junit.Assert.assertEquals(expression + " = " + result, expected, result, 0.0);
    }

    @Test
    public void testMultiplication() {
        String expression = "4 * 3";
        double expected = 12.0;
        double result = Double.parseDouble(Calculator.calculateExpression(expression));
        org.junit.Assert.assertEquals(expression + " = " + result, expected, result, 0.0);
    }

    @Test
    public void testDivision() {
        String expression = "10 / 2";
        double expected = 5.0;
        double result = Double.parseDouble(Calculator.calculateExpression(expression));
        org.junit.Assert.assertEquals(expression + " = " + result, expected, result, 0.0);
    }

    @Test
    public void testComplexExpression() {
        String expression = "2 + 3 * (4 - 1)";
        double expected = 11.0;
        double result = Double.parseDouble(Calculator.calculateExpression(expression));
        org.junit.Assert.assertEquals(expression + " = " + result, expected, result, 0.0);
    }
}
