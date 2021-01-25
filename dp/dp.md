## 다이나믹 프로그래밍

- 메모리를 적절히 사용하여 수행 시간 효율성을 비약적으로 향상
- 계산된 결과는 별도의 메모리 영역에 저장, 다시 계산x
- 탑다운, 보텀업 
- 동적 할당 : 프로그램이 실행되는 도중에 실행에 필요한 메모리 할당하는 기법
- 동적 할당과 관련 없음

#### 조건

- 1. 최적 부분 구조 : 큰 문제 -> 작은 문제 , 작은 문제 모아 답 도출
  2. 중복되는 부분 문제 : 동일한 작은 문제

#### 피보나치 수열

- 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 ...
- A(n) = A(n-1)+ A(n+2), A1=1, A2=1  
- 단순 재귀함수로 구하면 지수 시간 복잡도를 가지게 됨
- 중복되는 부분 문제가 생김
- F(30) 구현 위해 10억가량 연산 수행 O(2의 30승)
- 다이나믹 이용하기
  1. 최적 부분 
  2. 중복 부분

#### 메모이제이션

- 다이나믹 프로그래밍 구현 방법 중 하나

- 한번 계산 결과를 메모리 공간에 메모(캐싱)

  

#### 탑다운/보텀업

- 탑다운 => 하향식

- 보텀업 => 상향식

- 다이나믹 전형적 형태 => 보텀업

  - 결과 저장용 리스트는 DP 테이블

    

- 메모이제이션 : 이전에 계산된 결과 일시적으로 기록

  - 다이나믹에 국한된 개념은 아님
  - 시간복잡도 O(N)

#### DP VS 분할 정복

- 공통점 : 최적 부분 구조
- 차이점 : 부분 문제 중복
  - 분할 정복은 부분 문제 반복 계산 X

#### 분할정복 - 퀵 정렬

- 분할 이후에 피벗을 다시 처리하는 부분 문제는 호출 안함(피벗의 위치 바뀌지 않음)

  

#### dp 접근 방법

- 재귀함수로 완전탐색 -> 작은 문제에서 구한 답이 큰 문제에서 그대로 사용될 수 있으면, 코드를 개선하는 방법 사용