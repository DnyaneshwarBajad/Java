public class Calculator {
    public static void main(String[] args) {
        double num1 = 10; 
        double num2 = 5;  
        char operator = '+'; 

        double result = calculate(num1, num2, operator);

        System.out.println("Result: " + result);
    }

    public static double calculate(double num1, double num2, char operator) {
        double result = 0;
        
        if (operator == '+')
            result = num1 + num2;
        else if (operator == '-')
            result = num1 - num2;
        else if (operator == '*')
            result = num1 * num2;
        else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("Error! Division by zero is not allowed.");
                return 0; 
            }
            result = num1 / num2;
        } else {
            System.out.println("Error! Invalid operator.");
            return 0; 
        }
        
        return result;
    }
}
