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
```c++
class Solution {
public:
    // reverse child of list
    pair<ListNode*, ListNode*> myReverse(ListNode* head, ListNode* tail) {
        ListNode* prev = tail->next;
        ListNode* p = head;
        while (prev != tail) {
            ListNode* nex = p->next;
            p->next = prev;
            prev = p;
            p = nex;
        }
        return {tail, head};
    }

    ListNode* reverseKGroup(ListNode* head, int k) {
        ListNode* hair = new ListNode(0);
        hair->next = head;
        ListNode* pre = hair;

        while (head) {
            ListNode* tail = pre;
            // judge whether surplus elements are greater than k
            for (int i = 0; i < k; ++i) {
                tail = tail->next;
                if (!tail) {
                    return hair->next;
                }
            }
            ListNode* nex = tail->next;
            pair<ListNode*, ListNode*> result = myReverse(head, tail);
            head = result.first;
            tail = result.second;
            // relink child list to original list
            pre->next = head;
            tail->next = nex;
            pre = tail;
            head = tail->next;
        }
        return hair->next;
    }
};
```
## Review

## Tip

## Share

