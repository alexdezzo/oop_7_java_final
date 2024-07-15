package service;

import model.ComplexNum;

public class CalcComplexNumService {


    public ComplexNum sumComplexNum(ComplexNum num, ComplexNum num2) {
        double n = num.getI1() + num.getI1();
        double inum = num2.getI2() + num2.getI2();

        return new ComplexNum(n, inum);
    }

    public ComplexNum MultiplierComplexNum(ComplexNum num1, ComplexNum num2){
        double i1 = num1.getI1() * num2.getI1();
        double i2 = num1.getI2() * num2.getI1();
        double i3 = num1.getI1() * num2.getI2();
        double i4 = -(num1.getI2() * num2.getI2());
        double i5 = i2 + i3;
        double i6 = i1 + i4;
        return new ComplexNum(i6, i5);
    }

    public ComplexNum DivisionComplexNum(ComplexNum num1, ComplexNum num2){
        ComplexNumService complexNumService = new ComplexNumService();
        ComplexNum i1 = MultiplierComplexNum(num1, complexNumService.ConjugateComplexNum(num2));
        ComplexNum i25 = MultiplierComplexNum(num2, complexNumService.ConjugateComplexNum(num2));
        double i2 = (i25.getI1() + i25.getI2());
        double i3 = i1.getI1() / i2;
        double i4 = i1.getI2() / i2;
        return new ComplexNum(i3, i4);
    }


}
