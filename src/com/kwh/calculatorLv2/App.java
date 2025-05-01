package com.kwh.calculatorLv2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nc: 계산");
            System.out.println("h: 계산 기록 확인");
            System.out.println("r: 가장 먼저 저장된 계산 기록 삭제");
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
                int firstNum = sc.nextInt();

                System.out.print("두 번쨰 숫자를 입력하세요: ");
                int secondNum = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: ");
                char op = sc.next().charAt(0);

                if (op == '/' && secondNum == 0) {
                    System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                } else {
                    int result = calculator.calculate(firstNum, secondNum, op);

                    ArrayList<Integer> newResults = calculator.getResults();
                    newResults.add(result);
                    calculator.setResults(newResults);

                    System.out.println("결과: " + result);
                }
            }
        }
    }
}
