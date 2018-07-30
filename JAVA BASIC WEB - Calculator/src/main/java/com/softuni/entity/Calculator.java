package com.softuni.entity;

public class Calculator {

    private double leftOperand;
    private double rightOperand;
    private String operator;

    public Calculator(double leftOperand, double rightOperand, String operator) {

        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    public Double getLeftOperand() {

        return leftOperand;
    }

    public void setLeftOperand(Double leftOperand) {

        this.leftOperand = leftOperand;
    }

    public Double getRightOperand() {

        return rightOperand;
    }

    public void setRightOperand(Double rightOperand) {

        this.rightOperand = rightOperand;
    }

    public String getOperator() {

        return operator;
    }

    public void setOperator(String operator) {

        this.operator = operator;
    }

    public double calculateResult() {

        switch (this.operator) {

            case "+":
                return this.getLeftOperand() + this.getRightOperand();
            case "-":
                return this.getLeftOperand() - this.getRightOperand();
            case "*":
                return this.getLeftOperand() * this.getRightOperand();
            case "/":
                return this.getLeftOperand() / this.getRightOperand();
            case "^":
                return Math.pow(this.getLeftOperand(), this.getRightOperand());
            case "%":
                return this.getLeftOperand() % this.getRightOperand();
            case "pow":
                return Math.pow(this.getLeftOperand(),this.getRightOperand());
            default:
                return 0;
        }
    }
}