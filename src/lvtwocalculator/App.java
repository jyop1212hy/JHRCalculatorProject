package lvtwocalculator;

    import java.util.Scanner;

    public class App {
        public static void main(String[] args) {
            // Lv 1. 클래스 없이 기본적인 연산을 수행할 수 있는 계산기
            //1) 계산기는 2개의 숫자를 받을 수 있고 사칙연산 될 문자를 받을 수 있다.
            //2) 계산기는 exit을 입력할 때까지 계속해서 값을 받고 연산 결과를 반환한다.

            // Lv 2. 클래스를 적용해 기본적인 연산을 수행할 수 있는 계산기 만들기
            //사칙연산을 수행 후, 결과값 반환 메서드 구현 & 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
            //사칙연산을 수행한 후, 결과값을 반환하는 메서드 구현
            //연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
            // 1) 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산(➕,➖,✖️,➗) 기능을 수행한 후
            // 2) 결과 값을 반환하는 메서드와 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성합니다.


            // 10. Calculator 인스턴스(객체) 생성
            Calculator calclator= new Calculator();

            //Scanner를 사용하여 양의 정수 2개(0 포함)와 사칙연산을 입력 받기
            // 11. calculatorInPut 변수를 Calculator 연산기능 메서드 매게변수 인자로 값을 넘기기
            Scanner calculatorInPut = new Scanner(System.in);

            // 7반복문 으로 무산 반복
            while (true) {
                // 1. 사칙연산 기로 입력 받기
                System.out.print("원하는 계산(+,-,*,/) 기호를 입력하세요: ");
                String operation = calculatorInPut.next();

                // 6. if문으로 사칙연산을 잘못 입력시 안내멘트 출력하고 재입력 받기
                char operation1 = operation.charAt(0);
                if (operation1 != '+' && operation1 != '-' && operation1 != '*' && operation1 != '/') {
                    System.out.print("계산기호를 다시 입력하세요.");
                    System.out.println("");
                    continue;
                }

                // 2. 첫번째 숫자 입력
                System.out.print("첫번째 숫자를 입력하세요: ");
                int num1 = calculatorInPut.nextInt();
                // 2-1. 실수 입력 방지하기



                // 3. 두번째 숫자 입력
                System.out.print("두번째 숫자를 입력하세요: ");
                int num2 = calculatorInPut.nextInt();

                // 19. 입력 받은 데이터를 매게변수를 통해 clculator 연산메서드로 인자값 전달
                int result = calclator.clculator(operation1, num1, num2);

                // 요청사항: “나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.“
                // 5. 나눗셈 이기에 두번째 입력 정수는 0을 입력 할수 없게 한다.
                // 14. 나눗셈에 0입력 if문 클래스 연산 메서드로 병합
//                if (operation == '/' && num2 == 0) {
//                    System.out.println("나눗셈 연산에서 분모(두번째 정수)애 0이 입력될 수 없습니다.");
//                    continue;
//                }
                // 20.
                System.out.println("결과: " + result);
                System.out.println("계산이 저장되었습니다.");
                System.out.println("원하지 않으시면 '기록삭제' 를 입력해 주세요.");
                String resultDelete = calculatorInPut.nextLine();

                // 8. 반복의 종료를 알려주는 “exit” 문자열을 입력하기
                System.out.println("다음 연산을 위해 Enter을 눌러주세요. (exit 입력 시 종료)");
                calculatorInPut.nextLine();
                String exit2 = calculatorInPut.nextLine();
                if (exit2.equals("exit")) {
                    System.out.println("프로그램을 종료 합니다.");
                    break;
                }
                System.out.println("오케이 렛츠기릿!");
            }
        }
    }