# 💻<클래스를 적용해 계산기의 특성을 고려한 기본 연산 수행하는 계산기 만들기>
## 🚀 소개
### 프로젝트 소개
Lv 1 의 계산기를 Mian, Calculator 2개의 클래스로 구분하여
사칙연산을 수행 후, 결과값 반환 메서드 구현 & 연산 결과를 저장하는
컬렉션 타입 필드를 가진 계산기 입니다.

### 주요 기능
1. 기본사칙연산 기능
2. 연산후 기록저장 기능
3. gerter/setter 로 저장된 연산 데이터기록 수정,삭제,데이터보기 기능

### 기술적 특징
사용 기술 : JAVA
특별한 구현 방식 : 기본 사칙연산 기능 이외에 요구사항들을 권유할수 있는 메뉴로 보여주고 사용자의 선택에 따라 기능을 사용할수 있도록 구현 하였습니다.
성능 최적화 방법 : Calculator클래스로 계산기의 기능을 모아 두었고 switch 를 통해 사칙연산의 불필요한 컴파일러 하지 않도록 하였습니다.
또한 각 기능구현 또한 switch 하였고 입력방지를 예외처리하여 프로그램의 에러가 나지 않도록 하였습니다.

## 🛠️ 기술 스택
![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white) 

| **Category** | **Stack** |
|:------------:|:----------:|
| **Back-end** | `Java` |


## 💻 설치 방법
```bash
git clone https://github.com/jyop1212hy/JHRCalculatorProject.git
cd JHRCalculator-Calculator-Project
python main.py
```
## 💻 실행 이미지
1. [calculate](/Users/mac/Library/Mobile Documents/com~apple~CloudDocs/01. jeung ha ryun/05. 백앤드 개발자/03. 블로그 자료들/9주차/계산기 실행 장면/ calculate.png)

2. [setter/getter-1](/Users/mac/Library/Mobile Documents/com~apple~CloudDocs/01. jeung ha ryun/05. 백앤드 개발자/03. 블로그 자료들/9주차/계산기 실행 장면/ setResultHistoryChangedData.png)

3. [setter/getter-2](/Users/mac/Library/Mobile Documents/com~apple~CloudDocs/01. jeung ha ryun/05. 백앤드 개발자/03. 블로그 자료들/9주차/계산기 실행 장면/ resultHistoryRemoveDate.png)

4. [setter/getter-3](/Users/mac/Library/Mobile Documents/com~apple~CloudDocs/01. jeung ha ryun/05. 백앤드 개발자/03. 블로그 자료들/9주차/계산기 실행 장면/ resultHistoryRemoveDate_1.png)

5. [exit](/Users/mac/Library/Mobile Documents/com~apple~CloudDocs/01. jeung ha ryun/05. 백앤드 개발자/03. 블로그 자료들/9주차/계산기 실행 장면/ exit.png)