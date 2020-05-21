## Algorithm

题目：乘积最大子数组

题目链接： https://leetcode-cn.com/problems/maximum-product-subarray/ 

```c++
class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int maxNumber = nums[0];
        int lenOfArray = nums.size();
        for(int i = 0; i < lenOfArray; i++){
            int mul = nums[i];
            if(maxNumber < mul)
                maxNumber = mul;
            for(int j = i + 1; j < lenOfArray; j++){
                mul *= nums[j];
                if(maxNumber < mul)
                    maxNumber = mul;
            }
        }
        return maxNumber;
    }
};
```

> 时间和空间复杂度分析：
>
> 时间复杂度为：O(n)

## Review

## Tip

## Share

