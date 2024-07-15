package view;

import controller.CalcComplexNumController;
import controller.String2ExpressionController;
import model.ComplexNum;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CalcView {

    private CalcComplexNumController calcComplexNumController = new CalcComplexNumController();

    Logger logger = Logger.getLogger(CalcView.class.getName());

    String2ExpressionController string2ExpressionController = new String2ExpressionController();

    public ComplexNum[] createComplexNumber(String inputStr) {
        string2ExpressionController.strToExpr(inputStr);
        ComplexNum[] res = new ComplexNum[2];
        res[0] = string2ExpressionController.getNum1();
        res[1] = string2ExpressionController.getNum2();
        logger.info("Получение комплексных чисел из строки");
        return res;
    }

    private ComplexNum SumComplexNum(ComplexNum num1, ComplexNum num2) {
        logger.info("Получение суммы: " + num1 + " и " + num2);
        return calcComplexNumController.SumComplexNum(num1, num2);
    }

    private ComplexNum MultiplierComplexNum(ComplexNum num1, ComplexNum num2) {
        logger.info("Произведение чисел: " + num1 + " и " + num2);
        return calcComplexNumController.MultiplierComplexNum(num1, num2);
    }

    private ComplexNum DivisionComplexNum(ComplexNum num1, ComplexNum num2) {
        logger.info("Нахождение частного чисел: " + num1 + " и " + num2);
        return calcComplexNumController.DivisionComplexNum(num1, num2);
    }


    public void Start() throws IOException {
        FileHandler fileHandler = new FileHandler("log.txt", true);
        logger.addHandler(fileHandler);
        logger.setUseParentHandlers(false);
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше выражение в следующем формате:\n(Х,Хi) 'оператор*' (Х,Хi)\n*Операторы: + * /\nПример:(3,1i) + (2,2i)");
        createComplexNumber(scanner.nextLine());
        logger.info("Получение выражения из консоли");
        switch (string2ExpressionController.getAction()){
            case "+" -> System.out.println(SumComplexNum(string2ExpressionController.getNum1(), string2ExpressionController.getNum2()));
            case "*" -> System.out.println(MultiplierComplexNum(string2ExpressionController.getNum1(), string2ExpressionController.getNum2()));
            case "/" -> System.out.println(DivisionComplexNum(string2ExpressionController.getNum1(), string2ExpressionController.getNum2()));
            default -> System.out.println("Операция не поддерживается");
        }



    }

}
