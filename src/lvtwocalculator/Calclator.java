package lvtwocalculator;

import java.util.ArrayList;
import java.util.List;

public class Calclator {
    //13. 연산 결과는 Calculator 클래스의 연산 결과를 저장하는 필드에 저장
    List<String> resultHistory = new ArrayList<>();

    public List<String> resultHistory = new ArrayList() {
        return resultHistory;
    };
    // resultHistory.addResult("fff");
    //속
    //생
    //기

    //9. 연산 수행 역할은 Calculator 클래스가 담당
    //9-1 연산기능 (char operation , int num1, int num2)매개변수 생성
    //12. char operation -> char calculatorInPut 로 매개변수 변경
    int result = 0;
    public int operation1(char calculatorInPut, int num1, int num2) {
        switch (calculatorInPut) {

            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
    //15. 나눗셈 0입력 if문 병합 완료후 / 부분 제거)
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)애 0이 입력될 수 없습니다.");
                    return 0;
                }
                    result = num1 / num2;
                    break;

                }
                // 16.결과값 기록 저장
            String record = num1 + " " + calculatorInPut + " " + num2 + " = " + result;
            resultHistory.add(record);

                return result;

        }
    }