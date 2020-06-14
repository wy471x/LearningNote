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
原文: <https://developer.android.google.cn/ndk/guides/android_mk>

**Android.mk解析**
>模块描述变量
>模块描述的基本流程
> 1. 使用CLEAR_VARS变量初始化或取消定义与模块相关的变量
>	2. 为用于描述模块的变量赋值
>	3. 使用BUILD_XXX变量设置NDK构建系统，使其将适当的构建脚本用于该模块
>
>LOCAL_PATH变量：用于指定当前文件的路径，必须定义在Android.mk文件开头，CLEAR_VARS所指向的脚本不会清除此变量，故此变量只需定义一次
>
>LOCAL_MODULE变量：存储要构建的模块的名称 即 xxx.so文件的名称
>
>LOCAL_SRC_FILES变量：存储模块编译所涉及的所有源文件，以空格分隔
>
>LOCAL_CPP_EXTENSION变量：用于指定.cpp以外的文件扩展名，也可使用此变量指定多个扩展名
>
>LOCAL_C_INCLUDES变量: 使用此可选变量指定相对于NDK root目录的路径列表，以便在编译所有源文件时添加到include搜索路径中
>
>LOCAL_LDLIBS变量：列出在构建共享库或可执行文件时使用的额外链接器标志
>
>LOCAL_STATIC_LIBRARIES变量：用于存储当前模块依赖的静态库模块列表

## Share
分享：[进程环境之setjmp和longjmp函数以及getrlimit和setrlimit函数](https://blog.csdn.net/qq_40073459/article/details/104429960)

> APUE 个人学习笔记
