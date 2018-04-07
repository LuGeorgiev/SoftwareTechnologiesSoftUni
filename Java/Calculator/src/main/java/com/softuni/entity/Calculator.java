package com.softuni.entity;

import java.text.DecimalFormat;

public class Calculator {
    private double leftOperand;
    private double rightOperand;
    private String operator;

    public Calculator() {
    }

    public Calculator(double leftOperand, double rightOperand, String operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    public double getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(double leftOperand) {
        this.leftOperand = leftOperand;
    }

    public double getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(double rightOperand) {
        this.rightOperand = rightOperand;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double calculateResult(){
        double result=0.0;
        if (this.operator.equals("+")){
            return this.leftOperand+this.rightOperand;
        }
        else if (this.operator.equals("-")){
            return this.leftOperand-this.rightOperand;
        }
        else if (this.operator.equals("/")){
            return this.leftOperand/this.rightOperand;
        }
        else if (this.operator.equals("*")){
            return this.leftOperand*this.rightOperand;
        }
        return result;
    }
}
