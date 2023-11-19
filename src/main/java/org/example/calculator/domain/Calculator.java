package org.example.calculator.domain;

import org.example.calculator.tobe.AdditionOperator;
import org.example.calculator.tobe.ArithmeticOperator;
import org.example.calculator.tobe.DivisionOperator;
import org.example.calculator.tobe.SubtractionOperator;

import java.util.List;

public class Calculator {
    private static final List<ArithmeticOperator> arithmeticOperators = List.of(new AdditionOperator(), new SubtractionOperator(), new DivisionOperator());

    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2){
        return arithmeticOperators.stream()
                .filter(arithmeticOperators -> arithmeticOperators.supports(operator))
                .map(arithmeticOperators -> arithmeticOperators.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }
}
