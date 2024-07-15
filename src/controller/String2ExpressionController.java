package controller;

import model.ComplexNum;
import service.String2ExpressionService;

public class String2ExpressionController {

    String2ExpressionService strToExprController = new String2ExpressionService();


    public void strToExpr(String inputString){
        try {
            strToExprController.strToExpr(inputString);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public ComplexNum getNum1(){
        return strToExprController.getNum1();
    }

    public ComplexNum getNum2(){
        return strToExprController.getNum2();
    }

    public String getAction(){
        return strToExprController.getAction();
    }

}
