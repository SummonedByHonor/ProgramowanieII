package Zadanie7.Controllers;

import Zadanie7.Model.CalculateModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class CalculatorController {
    float number1 = 0;
    String operator = "";
    Boolean start = true;
    CalculateModel calculateModel = new CalculateModel();

    @FXML
    Label resultLabel;


    @FXML
    public void initialize() {
    }

    public void addToLabel(ActionEvent actionEvent) {
        if (start) {
            resultLabel.setText("");
            start = false;
        }
        String creatingValue = ((Button)actionEvent.getSource()).getText();
        resultLabel.setText(resultLabel.getText() + creatingValue);
    }

    public void addOperatorToLabelValue(ActionEvent actionEvent){
        String creatingValue = ((Button)actionEvent.getSource()).getText();

        if (!creatingValue.equals("="))
        {
            if (!operator.isEmpty()){
                return;
            }else {
                if (resultLabel.getText().isEmpty()){
                    return;
                } else {
                    operator = creatingValue;
                    number1 = Float.parseFloat(resultLabel.getText());
                    resultLabel.setText("");
                }
            }
        }else {
            if (operator.isEmpty()){
                return;
            }else {
                float number2 = Float.parseFloat(resultLabel.getText());
                calculateModel = new CalculateModel();
                float resultNumber = calculateModel.calculate(number1,number2,operator);
                resultLabel.setText(String.valueOf(resultNumber).replaceAll("\\.0+$", ""));
                operator = "";
                start = true;
            }
        }
    }

    public void getPercentValue(ActionEvent actionEvent) {
        float numberToPercent = Float.parseFloat(resultLabel.getText());

    }


    public void clearResult(ActionEvent actionEvent) {
        resultLabel.setText("");
        number1 = 0;
    }
}
