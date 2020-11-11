package br.edu.prjcalculadora.model;

import java.sql.SQLOutput;

public class Calculadora {
    private double vlr1;
    private double vlr2;
    private double result;

    public double getVlr1() {
        return vlr1;
    }

    public void setVlr1(double vlr1) {
        this.vlr1 = vlr1;
    }

    public double getVlr2() {
        return vlr2;
    }

    public void setVlr2(double vlr2) {
        this.vlr2 = vlr2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void soma (double v1, double v2){
        result = v1+v2;
    }

    public void subtracao (double v1, double v2){
        result = v1-v2;
    }

    public void multiplicacao (double v1, double v2){
        result = v1*v2;
    }

    public void divisao (double v1, double v2){
        if(v2 ==0){
            result = 0;
        }else {
            result = v1/v2;
        }


    }
}
