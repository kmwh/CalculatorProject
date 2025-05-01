package com.kwh.calculatorLv2;

import java.util.ArrayList;

public class CalculatorLv2 {
    private static ArrayList<Integer> results = new ArrayList<>();

    public int calculate(int firstNum, int secondNum, char op) {
        return switch (op) {
            case '+' -> firstNum + secondNum;
            case '-' -> firstNum - secondNum;
            case '/' -> firstNum / secondNum;
            case '*' -> firstNum * secondNum;
            default -> 0;
        };
    }

    public void removeResult() {
        results.remove(0);
    }

    public ArrayList<Integer> getResults() {
        return results;
    }

    public void setResults(ArrayList<Integer> newResults) {
        results = newResults;
    }
}