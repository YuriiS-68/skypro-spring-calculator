package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String hello(){
        return "Welcome to calculator.";
    }

    public String getSum(Integer number1, Integer number2){
        return "The result of an addition expression: " + number1 + " + " + number2 + " = " + (number1 + number2);
    }

    public String getDifference(Integer number1, Integer number2){
        return "The result of an difference expression: " + number1 + " - " + number2 + " = " + (number1 - number2);
    }

    public String getMultiply(Integer number1, Integer number2){
        return "The result of an multiply expression: " + number1 + " * " + number2 + " = " + (number1 * number2);
    }

    public String getDivide(Integer number1, Integer number2){
        return "The result of an divide expression: " + number1 + " / " + number2 + " = " + (number1 / number2);
    }
}
