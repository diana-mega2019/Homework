package genericexceptionhomework;
public interface CalculatorInterface<N, T> {
    /**
     * define a custom checked exception for parse integer to double
     */
    class MyValidationNumberException extends Exception{
        public MyValidationNumberException(String errorMessage){
            super(errorMessage);
        }
    }
    /**
     * define a custom unchecked exception ;
     */
    class MyNullParameterException extends RuntimeException{
        public MyNullParameterException(String errorMessage){
            super(errorMessage);
        }
    }
    /**
     * Addition of two numbers
     * @param firstNumber is the first number
     * @param arithmeticOperator must be "+"
     * @param secondNumber is the second number
     * @return the sum of given numbers
     */
    N addition(N firstNumber, T arithmeticOperator, N secondNumber);
    /**
     *Difference between two numbers.
     * @param firstNumber is the first number
     * @param arithmeticOperator must be "-"
     * @param secondNumber represents the second number
     * @return the subtraction of the given number
     */
    N subtraction(N firstNumber, T arithmeticOperator, N secondNumber);
    /**
     * Division of two numbers.
     * @param firstNumber is the first number
     * @param arithmeticOperator must be "/"
     * @param secondNumber is the second number
     * @return the result of division
     */
    N division(N firstNumber, T arithmeticOperator, N secondNumber);
    /**
     * Multiplying two numbers
     * @param firstNumber is the first number
     * @param arithmeticOperator must be "*"
     * @param secondNumber is the second number entered
     * @return the result of multiplying
     */
    N multiply(N firstNumber, T arithmeticOperator, N secondNumber);
    /**
     * Modulo find the remainder after division of one number by another
     * @param firstNumber represents the first number
     * @param arithmeticOperator must be "%"
     * @param secondNumber is the second number
     * @return the remainder after division
     */
    N modulo(N firstNumber, T arithmeticOperator, N secondNumber);
    T reset ();
}