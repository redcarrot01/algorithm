### fill 함수

- 연속성을 띈 자료구조(벡터나 배열)의 시작점부터 연속된 범위를 어떤 값으로 지정 하고 싶을때

```
#include <algorithm>

void fill (ForwardIterator first, ForwardIterator last, const T& val);


	// 1번째 위치부터 4번째 위치까지 1로 할당
	fill (v.begin(), v.begin()+4, 1);  // 1 2 3 4 

	// 5번째 위치부터 끝까지 2로 할당
	fill (v.begin()+4, v.end(), 2); // 5 ... 끝
```

