## Algorithm

题目：检查平衡性

题目链接：< https://leetcode-cn.com/problems/check-balance-lcci/ >
```c++
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
private:
    bool balance = true;
public:
    bool isBalanced(TreeNode* root) {
         height(root);
         return balance;   
    }
	//calculate height of left and right child tree
    int height(TreeNode *tmp){
        if(tmp == nullptr) return 0;
        int left = height(tmp->left);
        int right = height(tmp->right);
        if(abs(left-right) > 1) balance = false;
        return max(left, right) + 1;
    }
};
```
## Review
原文链接：<https://netflixtechblog.com/introducing-dispatch-da4b8a2a8072>
> 本文主要是介绍了Netflix自己的开源项目Dispatch，这个项目主要是涉及风险管理协作的框架。该框架在可以使用现有的工具去创建资源、集结参与者、发送通知、追踪任务以及协助风险事件发生后的复查，这样才能让你去关注于修复问题。不像其他Netflix的工具那样，Dispatch并不是与AWS紧密相关的，它不使用任何AWS APIs。除了内建的整合外，Dispatch还提供了许多整合点来允许适应其他的现存环境。事件执行者们还拥有一个新的工作流，这个工作流所带来的好处是：1.时间执行者不再亲自去接触资源或多种数据流；2.事件之间的交流得以标准化；3.基于类型、优先级以及事件描述，时间参与者能够自动参与；4.事件任务被跟踪，如果这些事件没有按时完成，所属者将被通知；5.所有事件数据都被中心跟踪；6.一个公共的API被提供给内部用户和工具。这些无非就是让通知事件尽可能的碎片化，给用户一个直接的途径去获取他们在风险时期所需要的资源。  

## Tip
相关文章链接：<https://blog.csdn.net/qq_40073459/article/details/105755082> 
> 上面文章中主要涉及的是自己在网络编程方面所做的学习笔记。

## Share
分享文章链接：<https://blog.csdn.net/qq_40073459/article/details/105776041>
> 上面文章是自己利用wireshark抓包工具对于HTTP学习上的笔记与总结。
