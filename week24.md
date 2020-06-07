## Algorithm

题目：[三数之和](https://leetcode-cn.com/problems/3sum/description/)

题目描述：

> 给你一个包含 *n* 个整数的数组 `nums`，判断 `nums` 中是否存在三个元素 *a，b，c ，*使得 *a + b + c =* 0 ？请你找出所有满足条件且不重复的三元组。
>
> **注意：**答案中不可以包含重复的三元组。

**示例：**

```tex
给定数组 nums = [-1, 0, 1, 2, -1, -4]，
满足要求的三元组集合为：
[
  [-1, 0, 1],
  [-1, -1, 2]
]
```

```c++
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
      // edge cases
      if (nums.empty() || nums.size() == 1 || nums.size() == 2)
        return vector<vector<int>>();
      
      vector<vector<int>> result;
      std::sort(nums.begin(), nums.end());
      for (int i = 0; i < nums.size() - 2; i++) {
        if ( i == 0 || nums[i] != nums[i-1]) {
            int low = i+1, high = nums.size()-1, sum = 0-nums[i];
            while (low < high) {
                if (nums[low] + nums[high] == sum) {
                    result.push_back(vector<int>{nums[i], nums[low], nums[high]});
                    while (low < high && nums[low] == nums[low+1]) low++;
                    while (low < high && nums[high] == nums[high-1]) high--;
                    low++; high--;
                }else if (nums[low] + nums[high] < sum) {
                     while(low < high && nums[low] == nums[low+1]) low++;
                     low++;
                }
                else {
                     while(low < high && nums[high] == nums[high-1]) high--;
                     high--;
                }
            }
        }
      }
      return result;
    }
};
```

> **时间和空间复杂度分析**
>

[3Sum Closest](https://leetcode.com/problems/3sum-closest/description/)

> Given an array `nums` of *n* integers and an integer `target`, find three integers in `nums` such that the sum is closest to `target`. Return the sum of the three integers. You may assume that each input would have exactly one solution. 

**Example 1:**

```tex
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
```

**Constraints:**

- `3 <= nums.length <= 10^3`
- `-10^3 <= nums[i] <= 10^3`
- `-10^4 <= target <= 10^4`

```cpp
class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        // Most voted solution
        if (nums.size() < 3)
            return 0;
        std::sort(nums.begin(), nums.end());
        int len = nums.size(), closestSet = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < len - 2; ++i) {
            if ( i > 0 && nums[i] == nums[i-1]) continue;
            int j = i + 1, k = len - 1;
            while (j < k) {
                int resultSum = nums[i] + nums[j] + nums[k];
                if (resultSum == target) return resultSum;
                if (std::abs(resultSum - target) < std::abs(closestSet - target)) {
                    closestSet = resultSum;
                }
                if (resultSum < target) { 
                        ++j;
                } else {
                        --k;
                }
            }
        }
        return closestSet;
    }
};
```

> **时间和空间复杂度分析**
>
> 

## Review
原文：[How Netflix uses Druid for Real-time Insights to Ensure a High-Quality Experience](https://netflixtechblog.com/how-netflix-uses-druid-for-real-time-insights-to-ensure-a-high-quality-experience-19e1e8568d06)
> 分析本文之前，需要了解的是[druid](https://druid.apache.org/docs/latest/design/index.html)。Netflix团队对于利用Druid从以下三个方面进行了解释：1. 数据插入，druid能够回滚数据，因为它可以以最小化应当被存储的原生数据； 2. 数据管理，分组化管理和回滚是一种实现较好的查询性能的有效举措；3. 查询，druid支持两种查询方式，一种是Druid SQL,另一种是原生查询，然而Netflix主要使用的方式是原生查询；4. 范围性的调整。

## Tip

## Share

