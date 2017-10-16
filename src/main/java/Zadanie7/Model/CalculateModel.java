package Zadanie7.Model;

public class CalculateModel {

    public Float calculate(Float number1, Float number2, String operator) {
        switch (operator) {
            case "+": {
                return number1 + number2;
            }
            case "-": {
                return number1 - number2;
            }
            case "*": {
                return number1 * number2;
            }
            case "/": {
                if (number2 == 0)
                {
                    return Float.valueOf(0);
                }
                return number1 / number2;
            }
            default: {
                return Float.valueOf(0);
            }

        }
    }

//    public Float calculatePercentFromValue(float value, float percent){
//
//    }
}
