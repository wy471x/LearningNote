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
    bool isValidBST(TreeNode* root) {
		return dfs(root);
    }
    
    bool dfs(TreeNode *node){
        if(node==NULL) return false;
        if((node->left==NULL&&node->right==NULL) || (node->left==NULL&&node->right->val>node->val)||(node->right==NULL&&node->left->val<node->val) || (node->left->val<node->val&&node->right->val>node->val))
            return true;
         return dfs(node->left)&&dfs(node->right);
    }
};
```

## Review

## Tip

## Share