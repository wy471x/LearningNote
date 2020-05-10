## Algorithm

### problem 1：

题目链接：<https://leetcode-cn.com/problems/subtree-of-another-tree/>

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

##  Tip 

##  Share 

