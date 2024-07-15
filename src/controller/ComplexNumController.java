package controller;

import model.ComplexNum;
import service.ComplexNumService;

public class ComplexNumController {

    ComplexNumService complexNumController = new ComplexNumService();


    public ComplexNum createComplexNum(int num, int inum) {

        return complexNumController.createComplexNum(num, inum);
    }



}
