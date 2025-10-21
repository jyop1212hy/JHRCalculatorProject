package lvtwocalculator;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Lv 2. 클래스를 적용해 기본적인 연산을 수행할 수 있는 계산기 만들기
        //사칙연산을 수행 후, 결과값 반환 메서드 구현 & 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
        //사칙연산을 수행한 후, 결과값을 반환하는 메서드 구현
        //연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
        // 1) 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산(➕,➖,✖️,➗) 기능을 수행하기
        // 2) 결과 값을 반환하는 메서드와 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성하기
        // 6) 소스 코드 수정 후에도 수정 전의 기능들이 반드시 똑같이 동작해야합니다.

        //Calculator 인스턴스(객체) 생성
        Calculator calculator = new Calculator();

        //Scanner를 사용하여 양의 정수 2개(0 포함)와 사칙연산을 입력 받기
        //calculatorInPut 변수를 Calculator 연산기능 메서드 매게변수 인자로 값을 넘기기
        Scanner calculatorInPut = new Scanner(System.in);

        //반복문 으로 무산 반복
        System.out.println("Hellow Calculator! 2.6.4 버전을 시작합니다.");
        while (true) {
            //사칙연산 기로 입력 받기
            System.out.print("원하는 계산(+,-,*,/) 기호를 입력하세요: ");
            String operation = calculatorInPut.next();

            char operation1 = operation.charAt(0);
            if (operation1 != '+' && operation1 != '-' && operation1 != '*' && operation1 != '/') {
                System.out.print("계산기호를 다시 입력하세요.\n");
                continue;
            }

            //첫번째 숫자 입력
            int num1;
            while (true) {
                System.out.print("첫번째 숫자를 입력하세요: ");
                try {
                    num1 = calculatorInPut.nextInt();
//                        calculatorInPut.nextInt(); // 개행 정리
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("해당버전의 계산기는 정수의 숫자만 입력 가능합니다.");
                    calculatorInPut.nextLine(); // 개행 정리
                }
            }

            //두번째 숫자 입력
            int num2;
            while (true) {
                System.out.print("두번째 숫자를 입력하세요: ");
                try {
                    num2 = calculatorInPut.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("해당버전의 계산기는 정수의 숫자만 입력 가능합니다.");
                    calculatorInPut.nextLine(); // ← 숫자 읽은 뒤 개행 정리
                }
            }

            //입력 받은 데이터를 매게변수를 통해 clculator 연산메서드로 인자값 전달
            int result = calculator.calculate(operation1, num1, num2);
            System.out.println("결과: " + result + "\n");


            //getter,setter,오래된기록삭제 메뉴목록 형식 switchfh로 구현
            int menu;
            while (true) {
                System.out.print("""
                        -----계산기 추가 기능 (원하는 기능의 번호를 입력하세요)----
                        |  1. 추가 계산                                  |
                        |  2. 기록 조회 및 수정                            |
                        |  3. 기록 삭제 (가장 오래된 기록 삭제)               |
                        |  4. 프로그램 종료                               |
                        ------------------------------------------------
                        번호 입력: """);
                try {
                    menu = calculatorInPut.nextInt();
                    calculatorInPut.nextLine(); // ← menu 번호 읽은 뒤 개행 정리
                    if (menu >= 1 && menu <= 4) {
                        break; // 올바른 입력 이므로 while 탈출
                    } else {
                        System.out.println("다시~ 메뉴번호를 눌러주세요.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\n아이참 왜 이러실까? ");
                    calculatorInPut.nextLine(); // 버퍼에 남은 잘못된 입력 비우기
                }
            }
            // 7-1) getter를 private를 private된 resultHistory기록 인스턴화
            List<String> resultHistory = calculator.getResultHistory();

            switch (menu) {
                case 1: {
                    System.out.println("\n계산을 계속합니다.\n");
                    break;
                }

                // 7-2) getter로 resultHistory기록 보기
                case 2: {
                    System.out.println("\n---------------계산 기록---------------");
                    if (resultHistory.isEmpty()) {
                        System.out.println("| 제발 숫자좀 잘 눌러주세요ㅜ.ㅜ 계산기 힘들어요. |");
                        System.out.println("---------------------------------------");
                        break;
                    }

                    for (int i = 0; i < resultHistory.size(); i++) {
                        System.out.println("|   " + i + ". " + resultHistory.get(i) + "  |");// ← 개별 항목 출력
                        System.out.println("---------------------------------------");
                    }

                    // 8-1) setter로 저장된 resultHistory기록 수정하기
                    while (true) {
                        System.out.print("\n수정 하실 번호를 입력해주세요: ");
                        try {
                            int indexNumber = calculatorInPut.nextInt();
                            calculatorInPut.nextLine(); // 개행 정리

                            System.out.println("양식에 맞춰 수정하세요 (예: 2 + 2 = 4): ");
                            String changedData = calculatorInPut.nextLine();
                            calculator.setResultHistoryChangedData(indexNumber, changedData);
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("으악 계산기 터진다!! 숫자로 입력해주세요.");
                            calculatorInPut.nextLine(); // 버퍼 비우기
                        }
                    }
                    break; // case 탈출
                }

                // 9-1) main 메서드에 삭제 메서드가 활용될 수 있도록
                //저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능
                case 3: {
                    System.out.println("\n------저장된 기록을 삭제 할수 있습니다.-----");
                    if (resultHistory.isEmpty()) {
                        System.out.println("|          계산기 쓰려는거 맞죠??          |");
                        System.out.println("\n---------------계산 기록---------------");
                        break;
                    }
                    for (int i = 0; i < resultHistory.size(); i++) {
                        System.out.println("|   " + i + ". " + resultHistory.get(i) + "  |");// ← 개별 항목 출력
                        System.out.println("---------------------------------------\n");
                    }

                    while (true) {
                        System.out.println("0번을 눌러 가장 오래된 기록만순서로만 할수 있습니다.");
                        System.out.print("\n숫자 0을 눌러 삭제 하세요.\n취소는 -1 을 입력하세요: ");
                        break;
                    }
                    try {
                        int deleteNumber = calculatorInPut.nextInt();
                        calculatorInPut.nextLine(); // 개행정리

                        if (deleteNumber == -1) {
                            System.out.println("삭제를 취소합니다.");
                            break;
                        } else if (deleteNumber == 0) {
                            calculator.resultHistoryRemoveDate(0); // 0번 인덱스 삭제
                            System.out.println("0번 기록이 삭제되었습니다.");
                            break;
                        } else {
                            System.out.println("[!] 0 또는 -1을 입력하세요.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("[!] 숫자로 입력해주세요.");
                        calculatorInPut.nextLine(); // 버퍼 비우기
                    }
                    break; // case3 탈출
                }

                // 10)반복의 종료를 알려주는 “exit” 문자열을 입력하기
                //계산기인점을 고려해 키패드만으로도 종료할수 있게 추가함
                case 4: {
                    System.out.println("\n숫자 0 또는 'exit' 입력 하여 종료합니다");
                    String exit = calculatorInPut.nextLine();
                    if (exit.equals("exit")) {
                        System.out.println("프로그램을 종료 합니다.");
                        break;
                    } else if (exit.equals("0")) {
                        System.out.println("프로그램을 종료 합니다.");
                        break;
                    }
                    return;
                }
            }
        }
    }
}