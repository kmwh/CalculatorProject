package com.example.calculator;

import java.util.ArrayList;

public class Calculator {
    private static ArrayList<Integer> results = new ArrayList<>();

    public int calculate(int firstNum, int secondNum, char op) {
        int result = switch (op) {
            case '+' -> firstNum + secondNum;
            case '-' -> firstNum - secondNum;
            case '/' -> firstNum / secondNum;
            case '*' -> firstNum * secondNum;
            default -> 0;
        };
        results.add(result);

        return result;
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