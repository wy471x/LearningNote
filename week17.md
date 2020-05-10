## Algorithm
题目：二叉树的最近公共祖先

题目链接：<https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/>

递归解法：
> C++ 实现
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
   public:
    TreeNode* ans;
    bool dfs(TreeNode* root, TreeNode* p, TreeNode* q) {
        if (root == nullptr) return false;
        bool lson = dfs(root->left, p, q);
        bool rson = dfs(root->right, p, q);
        if ((lson && rson) || ((root->val == p->val || root->val == q->val) && (lson || rson))) {
            ans = root;
        } 
        return lson || rson || (root->val == p->val || root->val == q->val);
    }
    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
        dfs(root, p, q);
        return ans;
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
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private TreeNode ans;
    
    public Solution(){
        this.ans = null;
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return ans;
    }
    
    private boolean dfs(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return false;
        boolean lson = dfs(root.left, p, q);
        boolean rson = dfs(root.right, p, q);
        if((lson && rson) || ((root.val == p.val || root.val == q.val) && (lson || rson))){
            ans = root;
        }
        return lson || rson || (root.val == p.val) || (root.val == q.val); 
    }
}
```
## Review
原文链接：<https://blog.csdn.net/weixin_42653531/article/details/82530685>

由于后面要对C51单片机系列进行项目的开发，所要找了关于C51系列单片机开发的博客文章进行了一番学习。对于这篇文章而言，总体讲解比较细致，不管是理论上，还是实践上，两者均是俱佳的。

## Tip
相关链接：<http://wiki.t-firefly.com/zh_CN/Firefly-RK3128/customize_Android_firmware.html>

关于RK芯片上的一些部件的详细文档。

## Share
个人文章链接：<https://blog.csdn.net/qq_40073459/article/details/105694808>
我的这篇文章主要讲解关于Wireshark抓包神器的使用。
