package genericexceptionhomework;
import java.util.logging.Logger;
public class CalculatorTest {
    private final static Logger LOGGER = Logger.getLogger(CalculatorImplDoubleDisplay.class.getName());
    public static void main(String[] args) throws CalculatorInterface.MyValidationNumberException {
        CalculatorImplDoubleDisplay c = new CalculatorImplDoubleDisplay();
       LOGGER.info(c.addition(7.0, "+", 23.2).toString());
       LOGGER.warning(c.reset());
       LOGGER.info(c.specialAddition("5", "+", 3.7).toString());
       LOGGER.info(c.modulo(0.0, "%", 2.1).toString());
    }
}