package service;

import model.ComplexNum;

public class ComplexNumService {

    public ComplexNum createComplexNum(int num, int inum){
        return new ComplexNum(num, inum);
    }


    public ComplexNum ConjugateComplexNum(ComplexNum num){
        return new ComplexNum(num.getI1(), -num.getI2());
    }


}
