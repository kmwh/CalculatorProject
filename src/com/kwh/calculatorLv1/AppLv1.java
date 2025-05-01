package com.kwh.calculatorLv1;

import java.util.Scanner;

public class AppLv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNum = sc.nextInt();

            System.out.print("두 번쨰 숫자를 입력하세요: ");
            int secondNum = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char op = sc.next().charAt(0);

            if (op == '/' && secondNum == 0) {
                System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
            } else {
                int result = switch (op) {
                    case '+' -> firstNum + secondNum;
                    case '-' -> firstNum - secondNum;
                    case '/' -> firstNum / secondNum;
                    case '*' -> firstNum * secondNum;
                    default -> 0;
                };
                System.out.println("결과: " + result);
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitString = sc.next();
            if (exitString.equals("exit")) {
                System.out.println("계산을 종료합니다.");
                break;
            } else {
                System.out.println("계산을 계속합니다.\n");
            }
        }
    }
}
