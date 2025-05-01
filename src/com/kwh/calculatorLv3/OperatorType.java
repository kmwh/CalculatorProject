package com.kwh.calculatorLv3;

public enum OperatorType {
    PLUS, MINUS, MULTIPLY, DIVIDE;

    public static OperatorType fromChar(char s) {
        return switch (s) {
            case '+' -> OperatorType.PLUS;
            case '-' -> OperatorType.MINUS;
            case '*' -> OperatorType.MULTIPLY;
            case '/' -> OperatorType.DIVIDE;
            default -> throw new IllegalArgumentException("Invalid operator type.");
        };
    }
}

