public class Calculator {

    public int evaluate(String expression) {
        Stack<Integer> stack = new VectorStack<>(); 
        String[] tokens = expression.split(" "); 

        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));  
            } else {
                int b = stack.pop(); 
                int a = stack.pop(); 
                stack.push(operate(a, b, token));
            }
        }
        return stack.pop();
    }

    private int operate(int a, int b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": 
                if (b == 0) throw new ArithmeticException("División por cero"); 
                return a / b;
            default: throw new IllegalArgumentException("Operador inválido");
        }
    }

    private boolean isNumber(String token) {
        return token.matches("\\d+"); 
    }
}