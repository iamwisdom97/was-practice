package org.example.calculator.domain;

import java.util.Arrays;

public enum EnumArithmeticOperator {
    ADDTION("+"){
        @Override
        public int ARithmeticCalculate(int operand1, int opreand2) {
            return operand1 + opreand2;
        }
    }, SUBTRACTION("-"){
        @Override
        public int ARithmeticCalculate(int operand1, int opreand2) {
            return operand1 - opreand2;
        }
    }, MULTIPLICATION("*"){
        @Override
        public int ARithmeticCalculate(int operand1, int opreand2) {
            return operand1 * opreand2;
        }
    }, DIVISION("/"){
        @Override
        public int ARithmeticCalculate(int operand1, int opreand2) {
            return operand1 / opreand2 ;
        }
    };

    private String operator;


    EnumArithmeticOperator(String operator) {
        this.operator = operator;
    }

    public abstract int ARithmeticCalculate(final int operand1, final int opreand2);

    public static int calculate(int operand1, String operator, int operand2) {
        EnumArithmeticOperator arithmeticOperator = Arrays.stream(values())
                .filter(v -> v.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));

        return arithmeticOperator.ARithmeticCalculate(operand1, operand2);
    }

}
