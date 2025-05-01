package com.kwh.calculatorLv3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculatorLv3<T extends Number> {
    private static ArrayList<Double> results = new ArrayList<>();

    public double calculate(T fn, T sn, OperatorTypeLv3 op) {
        double firstNum = fn.doubleValue();
        double secondNum = sn.doubleValue();
        return switch (op) {
            case PLUS -> firstNum + secondNum;
            case MINUS -> firstNum - secondNum;
            case DIVIDE -> firstNum / secondNum;
            case MULTIPLY -> firstNum * secondNum;
            default -> 0;
        };
    }

    public List<Double> resultsGreaterThan(double target) {
        return results.stream()
                .filter(n -> n > target)
                .collect(Collectors.toList());
    }

    public void removeResult() {
        results.remove(0);
    }

    public ArrayList<Double> getResults() {
        return results;
    }

    public void setResults(ArrayList<Double> newResults) {
        results = newResults;
    }
}