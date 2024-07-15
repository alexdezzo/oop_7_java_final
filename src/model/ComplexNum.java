package model;

public class ComplexNum {

    private double i1;
    private double i2;

    public ComplexNum(double i1, double i2) {
        this.i1 = i1;
        this.i2 = i2;
    }

    public double getI1() {
        return i1;
    }

    public double getI2() {
        return i2;
    }


    @Override
    public String toString() {
        new String();
        return String.format("( %s, %si )", i1, i2);
    }

}
