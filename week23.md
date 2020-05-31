## Algorithm

题目：[和可被K整除的子数组]( https://leetcode-cn.com/problems/subarray-sums-divisible-by-k/ )

题目描述：

>  给定一个整数数组 `A`，返回其中元素之和可被 `K` 整除的（连续、非空）子数组的数目。 

**示例：**

```tex
输入：A = [4,5,0,-2,-3,1], K = 5
输出：7
解释：
有 7 个子数组满足其元素之和可被 K = 5 整除：
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
```


提示：

1. 1 <= A.length <= 30000
2. -10000 <= A[i] <= 10000
3. 2 <= K <= 10000

解法1：**暴力法**

```c++
class Solution {
public:
    int subarraysDivByK(vector<int>& A, int K) {
        int len = A.size();
        int total = 0, n = 0;
        for(int i = 0; i < len; i++){
           total = 0;
           for(int j = i; j < len; j++){
             total += A[j];
             if(total % K == 0){
                n++;
             }
           }
        }
		return n;
    }
};
```

> **时间和空间复杂度分析**
>
> 时间复杂度：因为含有嵌套循环且遍历整个数组，故时间复杂度为![](https://latex.codecogs.com/gif.latex?O(n^{2}))
>
> 空间复杂度：只使用了两个变量存储结果和子数组和的大小，故空间复杂度为![](https://latex.codecogs.com/gif.latex?O(1))

解法2：**哈希表+逐一统计**

解题思路：前缀和以及同余定理

```c++
class Solution {
public:
    int subarraysDivByK(vector<int>& A, int K) {
        unordered_map<int, int> record = {{0, 1}};
        int sum = 0, ans = 0;
        for (int elem: A) {
            sum += elem;
            int modulus = (sum % K + K) % K;
            if (record.count(modulus)) {
                ans += record[modulus];
            }
            ++record[modulus];
        }
        return ans;
    }
};
```
> 时间与空间复杂度分析
>
> 时间复杂度：顺序遍历数组，哈希表操作为![](https://latex.codecogs.com/gif.latex?O(1))，故总体时间复杂度为![](https://latex.codecogs.com/gif.latex?O(n))
>
> 空间复杂度：当 ![](https://latex.codecogs.com/gif.latex?N&space;\leq&space;K) 时，最多有 ![](https://latex.codecogs.com/gif.latex?N) 个前缀和，因此哈希表中最多有![](https://latex.codecogs.com/gif.latex?N&plus;1) 个键值对；当  ![](https://latex.codecogs.com/gif.latex?N&space;>&space;K) 时，最多有 ![](https://latex.codecogs.com/gif.latex?K) 个不同的余数，因此哈希表中最多有 ![](https://latex.codecogs.com/gif.latex?K) 个键值对。也就是说，哈希表需要的空间取决于 ![](https://latex.codecogs.com/gif.latex?N) 和 ![](https://latex.codecogs.com/gif.latex?K) 中的较小值,故空间复杂度为![](https://latex.codecogs.com/gif.latex?O(min(N,&space;K)))

## Review
原文：[Open Sourcing Mantis: A Platform For Building Cost-Effective, Realtime, Operations-Focused Applications](https://netflixtechblog.com/open-sourcing-mantis-a-platform-for-building-cost-effective-realtime-operations-focused-5b8ff387813a)
> 本文主要介绍了Netflix开源的Mantis平台。Mantis平台集众多优点于一身，比如：1. 简化回复新提问 2. 提供回答问题的效率。构建Mantis的指导规则有：1. 允许访问原生事件 2. 访问事件的实时性 3. 在没有新指令加入应用中时，可以提出关于数据的新问题 4. 以高效的方式完成上述事情。 同时，Mantis给Netflix带来的价值有以下几个部分：1. 可以实时监控Netflix流的稳定性 2. 上下文的警告 3. 劫持(Raven) 3. Cassandra健康检查 4. 警告性Log 5. 混乱体验监控 6. 实时个人身份识别信息。[Mantis](https://netflix.github.io/mantis/)

## Tip
相关文章：[How I print the ALOGI(…) in Android C++ file?](https://stackoverflow.com/questions/38584876/how-i-print-the-alogi-in-android-c-file)
> 这里是对于在Android Native层添加打印log的调试工具的解决方案。

## Share
文章分享：[标准I/O库之流、FILE对象、三个标准流以及缓冲](https://blog.csdn.net/qq_40073459/article/details/104401050)
> 这里是自己APUE的学习笔记。
