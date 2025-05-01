package com.kwh.calculatorLv3;

public enum OperatorTypeLv3 {
    PLUS, MINUS, MULTIPLY, DIVIDE;

    public static OperatorTypeLv3 fromChar(char s) {
        return switch (s) {
            case '+' -> OperatorTypeLv3.PLUS;
            case '-' -> OperatorTypeLv3.MINUS;
            case '*' -> OperatorTypeLv3.MULTIPLY;
            case '/' -> OperatorTypeLv3.DIVIDE;
            default -> throw new IllegalArgumentException("Invalid operator type.");
        };
    }
}

