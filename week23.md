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

## Tip

## Share