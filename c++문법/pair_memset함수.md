## pair

- 정의

  - first, second 인 두개의 변수를저장할 수 있는 struct

    

- 용도

  - 이차원 배열의 인덱스

  - 이차원 좌표평면에서의 좌표

  - 정점 번호와 해당 정점 번호까지의 최단거리 묶어서 저장해야 되는 경우

    

- 사용법

  - pair를 사용하기 위해서는 <utility>를 include해야 합니다

    

- 예제

~~~
//pair 선언
pair<int,int> p;
pair<char,double> p;
 
//pair 생성
int a = 1, b = 2;
pair<int,int> p = make_pair(a,b);
pair<int,int> p = make_pair(1,2);
 
//pair의 멤버 변수에 접근
int valA = p.first;
int valB = p.second;


// first가 1이고 second가 2인 pair를 만들기 위해, pair<int, int>를 선언한 후에 각 멤버 변수(first, //second)를 초기화 해주는 것이 아니라 make_pair를 이용해 바로 만들어 낼 수 있다
~~~



## memset

- 정의

  - 메모리의 내용을 원하는 크기만큼 특정 값으로 세팅할 수 있는 함수

    

- 함수

  ~~~
  void* memset(void* ptr, int value, size_t num);
  
  첫번째 인자 void* ptr은 세팅하고자 하는 메모리의 시작 주소.
  즉, 그 주소를 가리키고 있는 포인터가 위치하는 자리 입니다.
  
  두번째 인자 value는 메모리에 세팅하고자 하는 값을 집어 넣으면 됩니다.
  int 타입으로 받지만 내부에서는 unsigned char 로 변환되어서 저장됩니다. 즉 'a' 이런것을 넣어도 무방하다는 뜻입니다.
  
  세번째 인자 size_t num은 길이를 뜻합니다. 이 길이는 바이트 단위로써 메모리의 크기 한조각 단위의 길이를 말합니다. 이는 보통 "길이 * sizeof(데이터타입)" 의 형태로 작성하면 됩니다.
  
  반환값은 성공하면 첫번째 인자로 들어간 ptr을 반환하고, 실패한다면 NULL을 반환합니다.
  
  #include<string.h> // #include<memory.h> 도 괜찮습니다.
  #include<stdio.h>
   
  int main(void)
  {
      char arr1[] = "blockdmask blog";
      memset(arr1, 'c', 5 * sizeof(char));
      printf(arr1);
   
      return 0;
  }
   
  => cccccdmsk blog
  /*
  첫번째 인자에는 변경하고자 하는 목적지의 첫번째 주소(포인터)를 넣고,
  두번째 인자에는 변경하고자 하는 값 'c'를 넣었습니다.
  그리고 마지막 인자에는 변경하고자 하는 길이 5를 넣고 char 배열이 들어왔으므로 char 타입의 바이트 크기를 계산해서 곱해주었습니다. 그렇게 해서 바이트 길이를 넣어준 것
  
  */
  ~~~

  
