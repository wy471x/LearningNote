## Algorithm

题目：[四数之和](https://leetcode-cn.com/problems/4sum/description/)

题目描述：

> 给定一个包含 *n* 个整数的数组 `nums` 和一个目标值 `target`，判断 `nums` 中是否存在四个元素 *a*，*b*，*c* 和 *d* ，使得 *a* + *b*+ *c* + *d* 的值与 `target` 相等？找出所有满足条件且不重复的四元组。 

**注意：**

答案中不可以包含重复的四元组。

**示例：**

```tex
给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。

满足要求的四元组集合为：
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]
```

```java
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, 0, 4, target);
    }

    private List<List<Integer>> kSum(int[] nums, int start, int k, int target){
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (k == 2) {
            int left = start, right = len - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if(sum == target) {
                    List<Integer> path = new ArrayList<Integer>();
                    path.add(nums[left]);
                    path.add(nums[right]);
                    res.add(path);
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        } else {
            for (int i = start; i < len - (k - 1); i++) {
                if(i > start && nums[i] == nums[i - 1]) continue;
                List<List<Integer>> temp = kSum(nums, i + 1, k - 1, target - nums[i]);
                for(List<Integer> t : temp) {
                    t.add(0, nums[i]);
                }
                res.addAll(temp);
            }
        }
        return res;
    }
}
```

> **时间和空间复杂度分析**
>
> 

 [Two Sum](https://leetcode.com/problems/two-sum/description/)

> Given an array of integers, return **indices** of the two numbers such that they add up to a specific target.
>
> You may assume that each input would have **exactly** one solution, and you may not use the *same* element twice.

**Example:**

```tex
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndex = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int distanceToTarget = target - nums[i];
            if (numIndex.containsKey(distanceToTarget)) {
                result[0] = numIndex.get(distanceToTarget);
                result[1] = i;
                return result;
            }
            numIndex.put(nums[i], i);
        }
        return result;
    }
}
```

> **时间和空间复杂度分析**

## Review

## Tip

## Share

