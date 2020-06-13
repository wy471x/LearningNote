## Algorithm

 [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/description/)

>  Merge *k* sorted linked lists and return it as one sorted list. Analyze and describe its complexity. 

**Example:**

```tex
Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6
```

```cpp
class Solution {
public:
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        if (lists.empty()) {
            return nullptr;
        } else if(lists.size() == 1) {
            return lists[0];
        }
        ListNode *resList = mergeTwoSortedLists(lists[0], lists[1]);
        for (int i = 2; i < lists.size(); i++) {
            resList = mergeTwoSortedLists(lists[i], resList);
        }
        return resList;
    }

    ListNode* mergeTwoSortedLists(ListNode *l1, ListNode *l2) {
        ListNode preHead(0), *tail = &preHead;
        ListNode *tempP = nullptr;
        while (l1 && l2) {
            if (l1->val > l2->val) {
                 tempP = l2->next;
                 l2->next = tail->next;
                 tail->next = l2;
                 tail = l2;
                 l2 = tempP;
            } else {
                tempP = l1->next;
                l1->next = tail->next;
                tail->next = l1;
                tail = l1;
                l1 = tempP;
            }
        }

        while (l1) {
            tempP = l1->next;
            l1->next = tail->next;
            tail->next = l1;
            tail = l1;
            l1 = tempP;
        }

        while (l2) {
            tempP = l2->next;
            l2->next = tail->next;
            tail->next = l2;
            tail = l2;
            l2 = tempP;
        }
        return preHead.next;
    }
};
```

> **时间和空间复杂度分析**

## Review

## Tip

## Share

