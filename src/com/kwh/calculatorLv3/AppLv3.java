package com.kwh.calculatorLv3;

import java.util.ArrayList;
import java.util.Scanner;

public class AppLv3 {
    public static void main(String[] args) {
        ArithmeticCalculatorLv3<Double> calculator = new ArithmeticCalculatorLv3<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nc: 계산");
            System.out.println("h: 계산 기록 확인");
            System.out.println("r: 가장 먼저 저장된 계산 기록 삭제");
            System.out.println("g: 저장된 연산들 중 입력한 값보다 큰 결과값들 확인");
            System.out.println("exit: 종료");
            System.out.print("작업을 선택하세요: ");
            String optionString = sc.next();

            if (optionString.equals("exit")) {
                System.out.println("계산을 종료합니다.");
                break;
            } else if (optionString.equals("h")) {
                System.out.println(calculator.getResults());
            } else if (optionString.equals("r")) {
                if (calculator.getResults().isEmpty()) {
                    System.out.println("삭제할 기록이 없습니다.");
                } else {
                    calculator.removeResult();
                    System.out.println("정상적으로 삭제되었습니다.");
                }
            } else if (optionString.equals("c")) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                double firstNum = sc.nextDouble();

                System.out.print("두 번쨰 숫자를 입력하세요: ");
                double secondNum = sc.nextDouble();

                System.out.print("사칙연산 기호를 입력하세요: ");
                OperatorTypeLv3 op = OperatorTypeLv3.fromChar(sc.next().charAt(0));

                if (op.equals(OperatorTypeLv3.DIVIDE) && secondNum == 0) {
                    System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                } else {
                    double result = calculator.calculate(firstNum, secondNum, op);

                    ArrayList<Double> newResults = calculator.getResults();
                    newResults.add(result);
                    calculator.setResults(newResults);

                    System.out.println("결과: " + result);
                }
            } else if (optionString.equals("g")) {
                System.out.print("비교할 숫자를 입력하세요: ");
                double num = sc.nextDouble();
                System.out.println(calculator.resultsGreaterThan(num));
            }
        }
    }
}
