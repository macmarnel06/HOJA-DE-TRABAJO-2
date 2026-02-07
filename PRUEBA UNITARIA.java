class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.evaluate("1 2 + 4 * 3 +"); // Ejemplo de la hoja [cite: 23]
        if (result != 15) {
            System.err.println("Test failed: expected 15 but got " + result);
            System.exit(1);
        } else {
            System.out.println("Test passed");
        }
    }
}