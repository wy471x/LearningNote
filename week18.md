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
原文链接：<https://netflixtechblog.com/how-netflix-brings-safer-and-faster-streaming-experience-to-the-living-room-on-crowded-networks-78b8de7f758c>

> 本文中主要介绍了Netflix技术团队自己开发的一个传输层安全协议TLS的最新版本1.3在1.2基础上进行的一些完善与改进。相比TLS1.2而言，1.3版本在安全性和效率上要更有吸引力。通过`完善的向前保密性`、`认证加密技术`、`安全握手`以及`减少握手`技术，TLS1.3版本的这些改进得以让数据的传输速率和安全性上较大的提高。不仅如此，TLS1.3还有一些其他特性，例如`缩短播放延迟`，`媒体再缓冲`。

## Tip
相关文章链接：<https://blog.csdn.net/dj0379/article/details/49299657>

由于在工作中经常碰到要进行Android设备应用上的调试问题，所以需要用到一些Android Logcat工具来进行相关调试工作。上述文章中详细阐述了一些Logcat的调试方面的技巧。

## Share
分享文章链接：<https://blog.csdn.net/qq_40073459/article/details/104788263>
