package org.example.calculator.tobe;

import org.example.calculator.domain.PositiveNumber;

public class DivisionOperator implements ArithmeticOperator {
    @Override
    public boolean supports(String operator) {
        return "/".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber operand1, PositiveNumber operand2) {
        /*if(operand2.toInt() == 0){
            throw new IllegalArgumentException("0으로는 나눌 수 없습니다.");
        }*/
        return operand1.toInt() / operand2.toInt();
    }
}
