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

## Tip

## Share
