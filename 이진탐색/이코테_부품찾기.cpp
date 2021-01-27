// set
# include <stdio.h>
#include <iostream>
#include <vector>
#include <set>

using namespace std;

int n, m;
set<int> s; // 부품 전체 담을 집합 
vector<int> targets;

int main() {
    cin >> n;
    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        s.insert(x);
    }
    cin >> m;
    for (int i = 0; i < m; i++) {
        int target;
        cin >> target;
        targets.push_back(target);
    }
    // 손님이 확인 요청한 부품 번호 확인
    for (int i = 0; i < m; i++) {
        // s.find() 찾는 값이 있으면 해당 위치의 iterator 반환, 아니면 s.end()반환 
        if (s.find(targets[i]) != s.end()) {
            cout << "yes" << ' ';
        }
        else cout << "no" << ' ';
    }
}

// 계수정렬

/*
#include <stdio.h>
#include <iostream>
#include <vector>
using namespace std;


int n, m;
int arr[1000001];
vector<int> targets;

int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
		int x;
		cin >> x;
		arr[x] = 1;
	}
	cin >> m;
	for (int i = 0; i < m; i++) {
		int j;
		cin >> j;
		targets.push_back(j);
	}
	// 손님이 확인 요청한 부품 번호를 하나씩 확인
	for (int i = 0; i < m; i++) {
		if (arr[targets[i]] == 1) {
			cout << "yes" << ' ';
		}
		else cout << "no" << ' ';
	}
}
*/
