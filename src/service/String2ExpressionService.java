package service;

import model.ComplexNum;

public class String2ExpressionService {


    private String[] array = new String[3];

    private ComplexNum num1;
    private ComplexNum num2;
    private String action;

    private boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
        } catch (Exception e) {
            return true;
        }
        return false;
    }


    public void strToExpr(String inputString) throws Exception {

        array = inputString.replace("(", "").replace("i)", "").split(" ");

        if (array.length != 3) {
            throw new Exception("Неправльный ввод");
        }
        String[] num1 = array[0].split(",");
        this.action = array[1];
        String[] num2 = array[2].split(",");
        if (isNumber(num1[0]) | isNumber(num1[1]) | isNumber(num2[0]) | isNumber(num2[1])) {
            throw new Exception("Формула записано не верно");
        }
        this.num1 = new ComplexNum(Double.parseDouble(num1[0]), Double.parseDouble(num1[1]));
        this.num2 = new ComplexNum(Double.parseDouble(num2[0]), Double.parseDouble(num2[1]));

    }


    public ComplexNum getNum1() {
        return num1;
    }

    public ComplexNum getNum2() {
        return num2;
    }

    public String getAction() {
        return action;
    }

}
