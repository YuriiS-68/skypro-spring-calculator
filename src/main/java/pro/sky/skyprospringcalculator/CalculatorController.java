package pro.sky.skyprospringcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String hello(){
        return "Welcome to calculator.";
    }

    @GetMapping(path = "/calculator/plus")
    public String getPlus(@RequestParam(value = "number1", required = false) Integer number1,
                          @RequestParam(value = "number2", required = false) Integer number2){
        if (number1 == null || number2 == null){
            return "One of parameters is not specified.";
        }
        return "The result of an addition expression: " + number1 + " + " + number2 + " = "
                + calculatorService.getSum(number1, number2);
    }

    @GetMapping(path = "/calculator/minus")
    public String getDifference(@RequestParam(value = "number1", required = false) Integer number1,
                                @RequestParam(value = "number2", required = false) Integer number2){
        if (number1 == null || number2 == null){
            return "One of parameters is not specified.";
        }
        return "The result of an difference expression: " + number1 + " - " + number2 + " = "
                + calculatorService.getDifference(number1, number2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String getMultiply(@RequestParam(value = "number1", required = false) Integer number1,
                              @RequestParam(value = "number2", required = false) Integer number2){
        if (number1 == null || number2 == null){
            return "One of parameters is not specified.";
        }
        return "The result of an multiply expression: " + number1 + " * " + number2 + " = "
                + calculatorService.getMultiply(number1, number2);
    }

    @GetMapping(path = "/calculator/divide")
    public String getDivide(@RequestParam(value = "number1", required = false) Integer number1,
                            @RequestParam(value = "number2", required = false) Integer number2){
        if (number1 == null || number2 == null){
            return "One of parameters is not specified.";
        }
        return "The result of an divide expression: " + number1 + " / " + number2 + " = "
                + calculatorService.getDivide(number1, number2);
    }
}
