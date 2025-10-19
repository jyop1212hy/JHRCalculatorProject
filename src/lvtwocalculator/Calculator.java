package lvtwocalculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    //13. 연산 결과는 Calculator 클래스의 연산 결과를 저장하는 필드에 저장
    //13-1 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화)
    private final List<String> resultHistory = new ArrayList<>();

    // 17. 게터를 통해 Mian클래스에서 데이터 볼수있게 함
    public List<String> getresultHistory() {
        return resultHistory;
    }

    // 17-1. 세터
    public List<String> setresultHistory() {
        return resultHistory;
        //return Collections.unmodifiableList(resultHistory);
    }

//    public boolean removeLast() {
//        if (!resultHistory.isEmpty()) {
//            resultHistory.remove(resultHistory.size() - 1);
//            return true;
//        }
//        return false;
//    }



    //속
    //생
    //기

    //9. 연산 수행 역할은 Calculator 클래스가 담당
    //9-1 연산기능 (char operation , int num1, int num2)매개변수 생성
    //12. char operation -> char calculatorInPut 로 매개변수 변경
    int result = 0;
    public int clculator(char operation1, int num1, int num2){
                switch (operation1) {

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
                        //15. 나눗셈 0입력 if문 병합 완료후 /(나눗셈 기호) 부분 제거)
                        if (num2 == 0) {
                            System.out.println("나눗셈 연산에서 분모(두번째 정수)애 0이 입력될 수 없습니다.");
                            return 0;
                        }
                        result = num1 / num2;
                        break;

                }
                // 16.결과값 기록 저장
                String record = num1 + " " + operation1 + " " + num2 + " = " + result;
                resultHistory.add(record);

                return result;
                 }
    }