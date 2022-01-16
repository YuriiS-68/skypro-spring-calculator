package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    private Integer result;

    public String getSum(Integer number1, Integer number2){
        result = number1 + number2;
        return String.valueOf(result);
    }

    public String getDifference(Integer number1, Integer number2){
        result = number1 - number2;
        return String.valueOf(result);
    }

    public String getMultiply(Integer number1, Integer number2){
        result = number1 * number2;
        return String.valueOf(result);
    }

    public String getDivide(Integer number1, Integer number2){
        if(number2 == 0){
            throw new IllegalArgumentException("Invalid parameter value " + number2);
        }
        result = number1 / number2;
        return String.valueOf(result);
    }
}
