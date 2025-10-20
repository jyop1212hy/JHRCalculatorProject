package lvtwocalculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {

    //속
    //13. 연산 결과는 Calculator 클래스의 연산 결과를 저장하는 필드에 저장
    //13-1 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화)
    private List<String> resultHistory = new ArrayList<>();
    public int result;
    //생

    //기

    //9. 연산 수행 역할은 Calculator 클래스가 담당
    //9-1 연산기능 (char operation , int num1, int num2)매개변수 생성
    //12. char operation -> char calculatorInPut 로 매개변수 변경
    public int calculate(char operation1, int num1, int num2) {
        int result = 0;

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
                // 요청사항: “나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.“
                //15. 나눗셈 0입력 if문 병합 완료후 /(나눗셈 기호) 부분 제거)
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)애 0이 입력될 수 없습니다.");
                    return num2;
                } else {
                    result = num1 / num2;
                    break;
                }
        }
        this.result = result;
        //결과값 반환


        // 16.결과값 기록 저장(저장이 정상 작동 되었는지 출력문 띄우기)
        String save = num1 + " " + operation1 + " " + num2 + " = " + result;
        resultHistory.add(save);
        System.out.println("연산이 계산기에 저장되었습니다.");
        return result;
    }

    // 17. 게터를 통해 Mian클래스에서 데이터 볼수있게 함
    public List<String> getResultHistory() {
        return Collections.unmodifiableList(resultHistory);
    }

    // 17-1. 간접 접근을 통해 필드에 접근하여 수정할 수 있도록 구현합니다. (Setter 메서드)
    public void setResultHistoryChangedData(int indexNumber, String changedData) {
        if (indexNumber < 0 || indexNumber >= resultHistory.size()) {
            System.out.println("해당번호는 없는 번호입니다.");
            return;
        }
        resultHistory.set(indexNumber, changedData);
        System.out.println((indexNumber) + "번 기록이 수정되었습니다!");
        return;
    }

    // 17-1. 삭제
    public void resultHistoryRemoveDate(int indexNumber) {
        if (indexNumber == 0) {
            resultHistory.remove(indexNumber);
            System.out.println("가장 오래된 기록이 삭제되었습니다!");
        } else {
            System.out.println("삭제할 기록이 없습니다.");
            return;
        }
    }


    //    public boolean removeLast() {
//        if (!resultHistory.isEmpty()) {
//            resultHistory.remove(resultHistory.size() - 1);
//            return true;
//        }
//        return false;
//    }
}

