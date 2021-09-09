package com.company;

public class Main {
    public static double multAdd(double a, double b, double c) {
        return a * b + c;
    }

    public static void main(String[] args) {
        System.out.println(multAdd(1.0, 2.0, 3.0));

        double computeValues = Math.PI/4;
        System.out.println(multAdd(1.0, Math.sin(computeValues), (Math.cos(computeValues)/2)));
        System.out.println(multAdd(1.0, Math.log(10.0), Math.log(20.0)));
        System.out.println(expSum(1.0));
    }

    public static double expSum(double x) {
        double a=x;
        double b=Math.exp(-x);
        double c=Math.sqrt(1-b);

        return multAdd(a, b ,c);
    }
}
//(Math.sin(Math.PI/4)+((Math.cos(Math.PI/4)/2)))
// System.out.println(multAdd(1.0, expSum((x * Math.exp(-x)) + Math.sqrt(1 - Math.exp(-x)))));
//Tak til GodeGamleJacob for at have en så overskuelig kode og forklaring