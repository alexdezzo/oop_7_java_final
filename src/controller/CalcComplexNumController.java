package controller;

import model.ComplexNum;
import service.CalcComplexNumService;
import service.ComplexNumService;

public class CalcComplexNumController {

    CalcComplexNumService complexNumController = new CalcComplexNumService();

    public ComplexNum SumComplexNum(ComplexNum num, ComplexNum num2) {
        return complexNumController.sumComplexNum(num, num2);
    }

    public ComplexNum MultiplierComplexNum(ComplexNum num1, ComplexNum num2) {
        return complexNumController.MultiplierComplexNum(num1, num2);
    }

    public ComplexNum DivisionComplexNum(ComplexNum num1, ComplexNum num2) {
        return complexNumController.DivisionComplexNum(num1, num2);

    }


}
