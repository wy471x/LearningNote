## Algorithm

题目：乘积最大子数组

题目链接： https://leetcode-cn.com/problems/maximum-product-subarray/ 

题目描述：

给你一个整数数组 `nums` ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。

**示例 1:**

```tex
输入: [2,3,-2,4]
输出: 6
解释: 子数组 [2,3] 有最大乘积 6。
```

**示例 2:**

```tex
输入: [-2,0,-1]
输出: 0
解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。
```

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

> **时间和空间复杂度分析**
>
> 时间复杂度：因为使用了嵌套循环的方式来处理，故时间复杂度为![](https://latex.codecogs.com/gif.latex?O(n^{2}))
>
> 空间复杂度：因为只使用一个整数对结果进行的存储，故空间复杂度为![](https://latex.codecogs.com/gif.latex?O(1))。

## Review

原文链接：<https://medium.com/androiddevelopers/improving-build-speed-in-android-studio-3e1425274837>

> 本篇文章介绍关于提升在Android Studio中构建项目的速度。通过对于在不同版本Android Studio中构建速度的观察发现，很明显的现象是随着版本的发布应当是项目构建的速度会逐步提升，但是实践中却是构建的速度仍然是缓慢的。在项目的构建过程中，整个项目会包含越来越多的代码、资源的使用甚至是语言的特点，正是这些造成了构建速度更加缓慢。然而，同样还有一些其他的因素在影响着构建的速度，比如：1. [Spectre and Meltdown](https://meltdownattack.com/) 补丁；2. 第三方和自定义`Gradle`插件  ；3. 大部分注解处理都是非增长性的；4. `Java 8` 的使用； 5. `Kotlin`的使用。`Android`团队对这些问题做出了一些改善，比如：1.修复内部的处理和持续的性能提升； 2. 增加了寻找原因的工具(Attribution tools)。对于项目构建速度上的提升，开发者所能做的有：1. 使用工具；2. 充分利用你的构建的配置和任务。

## Tip

相关文章链接：<https://www.ibm.com/developerworks/cn/linux/l-lpic1-v3-102-1/>

> 由于工作中碰到要对Linux中df命令的具体是实现问题，需要用到关于Linux文件系统和磁盘分区相关的知识，上面的文章是对Linux下磁盘分区和文件系统进行了详细的介绍。

## Share

分享文章链接：<https://blog.csdn.net/qq_40073459/article/details/104380129>

> 上面文章是自己对APUE的学习笔记。