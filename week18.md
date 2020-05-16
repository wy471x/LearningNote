## Algorithm

题目：Pow(x, n)

题目链接：<https://leetcode-cn.com/problems/powx-n/>

```c++
class Solution {
public:
    double myPow(double x, int n) {
        long long N = n;
        return N > 0 ? continueMulti(x , N) : 1 / continueMulti(x, -N);
    }

    double continueMulti(double x, long long  n){
        if(n == 0){
            return 1.0;
        }
        double y = continueMulti(x, n / 2);
        return n % 2 == 0 ? y * y : y * y * x;
        
    }
};
```

题目：K个一组翻转链表

题目链接：<https://leetcode-cn.com/problems/reverse-nodes-in-k-group/>

> C++ 实现

```c++
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* reverseKGroup(ListNode* head, int k) {
        
    }
};
```

> Java 实现

```java

```

## Review

## Tip

## Share

