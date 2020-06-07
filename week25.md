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
> 时间复杂度：递归解法，每层一个循环，故时间复杂度为![](https://latex.codecogs.com/gif.latex?O(n^{_{3}}))
>
> 空间复杂度: 存储返回结果的空间随数据量变化，故空间复杂度为![](https://latex.codecogs.com/gif.latex?O(n))

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
>
>时间复杂度：一层循环，故时间复杂度为![](https://latex.codecogs.com/gif.latex?O(n))
>
>空间复杂度：存储结果的空间为常值，故空间复杂度为![](https://latex.codecogs.com/gif.latex?O(1))

## Review
原文：[6 Must-Have Tools for Developers](https://medium.com/better-programming/6-must-have-tools-for-developers-430fd56933dd)
> 本文主要是介绍了一些开发人员必须掌握的一些开发工具，其中包括有 1. [Oh My Zsh](https://ohmyz.sh/)，这是一款shell工具可以让你的工作更让你更> 加轻便 2. ![direnv](https://direnv.net/)，这是一个shell扩展工具，当你输入`cd`，它可以自动加载环境变量 3. ![Lighthouse](https://developers.google.com/web/tools/lighthouse)，这是一个开源的插件用于检测网站性能 4. ![vim-plug](https://github.com/junegunn/vim-plug)和![MELPA Stable ](https://stable.melpa.org/#/)，这两个是`Vim`和`Emacs`的插件管理器 5. ![command-line fuzzy finder](https://github.com/junegunn/fzf)，这是一个文件查询工具，它的运行速度很快，因为是基于`Go`的并发线程去写的 6. ![The Silver Searcher](https://github.com/ggreer/the_silver_searcher)，这款工具是用于查询包含指定字符串的文件并能够显示该字符串在文件中的行号。

## Tip
分享：[Eclipse中导入Apache Commons Logging的commons-logging-1.2.jar文件](https://blog.csdn.net/qq_40073459/article/details/103080070)
> 上面是自己在项目过程中关于jar包导入的问题的相关解决方案。

## Share
文章：[进程环境之C程序的存储空间布局、共享库、存储空间分配以及环境变量](https://blog.csdn.net/qq_40073459/article/details/104421265)
> 上面是自己学习APUE的笔记总结。

