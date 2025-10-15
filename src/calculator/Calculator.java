package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // Lv 1. 클래스 없이 기본적인 연산을 수행할 수 있는 계산기
        //1) 계산기는 2개의 숫자를 받을 수 있고 사칙연산 될 문자를 받을 수 있다.
        //2) 계산기는 exit을 입력할 때까지 계속해서 값을 받고 연산 결과를 반환한다.

        //Scanner를 사용하여 양의 정수 2개(0 포함)와 사칙연산을 입력 받기
        Scanner calculatorInPut = new Scanner(System.in);

        System.out.print("원하는 사칙연산(+,-,*,/) 기호를 입력하세요: ");
        char operation = calculatorInPut.next().charAt(0);
        //if문으로 사칙연산을 잘못 입력시 안내멘트 출력하고 프로그램 종료하기
        if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
            System.out.print("잘못된 연산을 입력하셨습니다.");
            return;
        }

        System.out.print("첫번째 숫자를 입력하세요: ");
        int num1 =  calculatorInPut.nextInt();

        System.out.print("두번째 숫자를 입력하세요: ");
        int num2 = calculatorInPut.nextInt();

        //나눗셈 이기에 두번째 입력 정수는 0을 입력 할수 없게 한다.
        if(operation == '/' && num2 == 0){
            System.out.println("나눗셈을 할떄 두번째 정수는 0을 입력할 수 없습니다.");
            return;
        }
        // switch-case문으로 결과값 출력
        // “나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.“
        int result = 0;
        switch (operation){

            case '+':
                result =  num1 + num2;
                break;

            case '-':
                result =  num1 - num2;
                break;

            case '*':
                result =  num1 * num2;
                break;

            case '/':
                result =  num1 / num2;
                break;
        }
        System.out.println("결과: " + result);
    }
}
