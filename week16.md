## Algorithm
题目：另一个树的子树

题目链接：<https://leetcode-cn.com/problems/subtree-of-another-tree/>

递归解法：
> C++ 实现
```c++
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool isSubtree(TreeNode* s, TreeNode* t) {
        return dfs(s, t);
    }
    
    bool check(TreeNode* o, TreeNode* t){
        if(!o && !t) return true;
        if((!o && t) || (o && !t) || (o->val != t->val)) return false;
        return check(o->left, t->left) && check(o->right, t->right);
    }
    
    bool dfs(TreeNode* o, TreeNode* t){
        if(!o) return false;
        return check(o, t) || dfs(o->left, t) || dfs(o->right, t);
    }
};
```
> Java 实现
```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return dfs(s, t);
    }
    
    boolean check(TreeNode o, TreeNode t){
        if((o == null) && (t == null)) return true;
        if(((o == null) && (t != null)) || ((o != null) && (t == null)) || (o.val != t.val)) return false;
        return check(o.left, t.left) && check(o.right, t.right);
    }
    
    boolean dfs(TreeNode o, TreeNode t){
        if(o == null) return false;
        return check(o, t) || dfs(o.left, t) || dfs(o.right, t);
    }
}
```

##  Review 
原文链接：<https://www.cnblogs.com/KevinYang/archive/2010/06/18/1760597.html>

本文主要讲解关于字符编解码方面的一些基础知识，会对今后处理相关的技术时有所助益。

##  Tip 
相关链接：<https://blog.csdn.net/kris_fei/article/details/78084114>

该文主要讲解了一些Android系统启动流程，由于我在工作中遇到项目上对于Android系统崩溃，需要检测系统自动进行恢复出厂色模式，从这篇文章中了解了一些Android系统启动相关的模式。

##  Share 
个人文章链接：<https://blog.csdn.net/qq_40073459/article/details/104752813>

上述链接中的文章是自己在学习《Operating System Concepts》第十版时，总结一些关于同步问题的讨论。

