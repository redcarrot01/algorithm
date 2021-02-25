## 에러 팁

- 컴파일 에러 

1. gcc 버전마다 조금씩 다를 수 있으므로, 기본 STL 라이브러리만 사용하기

- 런타임 에러

1. 배열이나 포인터가 선언하지않은 이상한 곳을 가리킴.
2. 어떠한 값이 NULL을 가리킴.
3. 메모리를 너무 많이 사용해서 초과
4. if(!count<4) 등 연산자 우선순위(`!가 <보다 높음`)를 고려하지 않았을때, 버전에 따른 런타임 오류가 발생할 수 있다.(무조건 연산자 우선순위 고려)

- 시간 초과

1. 무한루프에 빠짐.
2. 탐색한곳을 계속 탐색하는 중복 탐색이 많음
3. 필요없는 연산을 중복해서

- 틀렸습니다

1. 걍 너의 코드가 잘못됐다.
2. 어디서인가 예외가 발생하고 있다.
3. 머리속으로 임의의 값을 넣어보고 A4에 풀어보고 그 값이 나오는지 확인 (ex: 전체 배열을 1로 채우고 탐색하기, 한번도 시도하지 않는 경우 해보기)

- 비주얼과 GCC의 결과 값이 다르다?

1. 배열(레퍼런스)에 증감연산자를 사용했다. arr[count++][100]
2. 엉뚱한 값이나 잘못된 참조를 통해 중간에 중단되었다.

### fighting
