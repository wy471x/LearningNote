## Algorithm

题目：[合法二叉搜索树]( https://leetcode-cn.com/problems/legal-binary-search-tree-lcci/ )

题目描述：

>  实现一个函数，检查一棵二叉树是否为二叉搜索树。 

**示例 1:**

```tex
输入:
    2
   / \
  1   3
输出: true
```

**示例 2:**

```tex
输入:
    5
   / \
  1   4
     / \
    3   6
输出: false
解释: 输入为: [5,1,4,null,null,3,6]。
     根节点的值为 5 ，但是其右子节点值为 4 。
```
解法：**中序递归遍历**
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
    bool flag;
    long val;
    void inorderTraverse(TreeNode* root){
        if(root==nullptr||!flag){
            return;
        }
        inorderTraverse(root->left);
        if(root->val>val){
            val=root->val;
        }else{
            flag=false;
            return;
        }
        Dfs(root->right);
    }
public:
    bool isValidBST(TreeNode* root) {
        flag=true;
        val=LONG_MIN;
        inorderTraverse(root);
        return flag;
    }
};
```
> **时间和空间复杂度分析**
>
> 时间复杂度为：中序递归遍历中需要保证遍历到左右节点才可保证是一个合法的二叉搜索树，故时间复杂度为![](https://latex.codecogs.com/gif.latex?O(n))
>
> 空间复杂度为：使用到标志位和一个存储值的变量，故空间复杂度为![](https://latex.codecogs.com/gif.latex?O(1))

## Review
原文：[Keeping Customers Streaming — The Centralized Site Reliability Practice at Netflix](https://netflixtechblog.com/keeping-customers-streaming-the-centralized-site-reliability-practice-at-netflix-205cc37aa9fb)
> 这篇文章中主要介绍了Netflix公司CORE团队在维护站点可靠性方面所扮演的重要角色。CORE应急工程师通常就像一个事件管理者，他们所需要处理的活动主要有：1. 协调性 2. 做出决策 3. 实时观测 4. 技术上的调查 5. 中间元素。总而言之，这只团队在Netflix中发挥着举足轻重的作用。他们只需要关注于可靠性，并能够快速响应风险和保证Netflix能给用户带来持续的愉悦感。

## Tip
相关文章：[Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
> 这里是Google关于Java语言的代码风格指南，对于提升自己的代码风格尤为有益。

## Share
分享文章：[Linux下df命令简单实现](https://blog.csdn.net/qq_40073459/article/details/106366490)
> 这里是工作中对于项目中涉及到的内容所作出的总结。
