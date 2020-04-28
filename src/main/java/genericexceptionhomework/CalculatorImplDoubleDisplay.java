package genericexceptionhomework;
public class CalculatorImplDoubleDisplay implements CalculatorInterface<Double, String> {
    double result;
    @Override
    public Double addition(Double firstNumber, String arithmeticOperator, Double secondNumber) {
        if ("+".equals(arithmeticOperator)){ result = firstNumber + secondNumber; }
        return result;
    }
    @Override
    public Double subtraction(Double firstNumber, String arithmeticOperator, Double secondNumber) {
        if ("-".equals(arithmeticOperator)){
             result = firstNumber - secondNumber;
        }
        return result;
    }
    @Override
    public Double division(Double firstNumber, String arithmeticOperator, Double secondNumber) {
        checkForNullParameter(firstNumber);
        if ("/".equals(arithmeticOperator)){
            result = firstNumber / secondNumber;
        }
        return result;
    }
    @Override
    public Double multiply(Double firstNumber, String arithmeticOperator, Double secondNumber) {
        if ("*".equals(arithmeticOperator)){
            result = firstNumber * secondNumber;
        }
        return result;
    }
    @Override
    public Double modulo(Double firstNumber, String arithmeticOperator, Double secondNumber) {
        checkForNullParameter(firstNumber);
        if ("%".equals(arithmeticOperator)){
            result = firstNumber % secondNumber;
        }
        return result;
    }
    @Override
    public String reset() {
        return "Your Calculator was Reset.";
    }
    public Double specialAddition(String firstNumber, String arithmeticOperator, Double secondNumber) throws MyValidationNumberException {
        parseFirstNumber(firstNumber);
        if ("+".equals(arithmeticOperator)){ result = Double.parseDouble(firstNumber + secondNumber); }
        return result;
    }
    private void checkForNullParameter(double firstNumber){
        if (firstNumber == 0.0) {
            throw new MyNullParameterException("The first number can't be equal with zero. Please insert another value!");
        }
    }
    static void parseFirstNumber(String firstNumber) throws MyValidationNumberException {
        double value;
        try {
            value = Double.parseDouble(firstNumber);
        }catch (NumberFormatException e){
            throw new MyValidationNumberException("The number should be a double");
        }finally {
            value =Double.parseDouble(firstNumber) * 1.0;
        }
    }
}