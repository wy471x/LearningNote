## Algorithm

题目：每个元音包含偶数次的最长子字符串

题目链接：<https://leetcode-cn.com/problems/find-the-longest-substring-containing-vowels-in-even-counts/>

题目描述：

>  给你一个字符串 `s` ，请你返回满足以下条件的最长子字符串的长度：每个元音字母，即 'a'，'e'，'i'，'o'，'u' ，在子字符串中都恰好出现了偶数次。 

**示例1：**

```tex
输入：s = "eleetminicoworoep"
输出：13
解释：最长子字符串是 "leetminicowor" ，它包含 e，i，o 各 2 个，以及 0 个 a，u 。
```

**示例 2：**

```tex
输入：s = "leetcodeisgreat"
输出：5
解释：最长子字符串是 "leetc" ，其中包含 2 个 e 。
```

**示例 3：**

```tex
输入：s = "bcbcbc"
输出：6
解释：这个示例中，字符串 "bcbcbc" 本身就是最长的，因为所有的元音 a，e，i，o，u 都出现了 0 次。
```

**提示：**

- 1 <= s.length <= 5 x 10^5
- s只包含小写英文字母。

```c++
class Solution {
public:
    int findTheLongestSubstring(string s) {
        int ans = 0, status = 0, n = s.length();
        vector<int> pos(1 << 5, -1);
        pos[0] = 0;
        for (int i = 0; i < n; ++i) {
            if (s[i] == 'a') {
                status ^= 1<<0;
            } else if (s[i] == 'e') {
                status ^= 1<<1;
            } else if (s[i] == 'i') {
                status ^= 1<<2;
            } else if (s[i] == 'o') {
                status ^= 1<<3;
            } else if (s[i] == 'u') {
                status ^= 1<<4;
            }
            if (~pos[status]) {
                ans = max(ans, i + 1 - pos[status]);
            } else {
                pos[status] = i + 1;
            }
        }
        return ans;
    }
};
```

> **时间和空间复杂度分析**
>
> 时间复杂度：因为遍历了整个字符串，故整个时间复杂度为![](https://latex.codecogs.com/gif.latex?O(n))。
>
> 空间复杂度：因为只使用了一个定长为m(上题 m = 32)的数组来存放字符出现的最早位置，故空间复杂度为![](https://latex.codecogs.com/gif.latex?O(m))。

## Review

原文链接：<https://netflixtechblog.com/svt-av1-an-open-source-av1-encoder-and-decoder-ad295d9b5ca2>

> [SVT-AV1](https://github.com/OpenVisualCloud/SVT-AV1/)是Intel和Netflix公司合作进行开发的一个视频编解码的框架开源项目。该文主要从两个方面对其性能和压缩效率进行了简略阐述，首先在编码上，`SVT-AV1`相对于`libaom`来说，压缩速率和整体上的性能而言都要更胜一筹；其次是在解码上，当`SVT-AV1`和`libaom`都以单线程模式运行时，`SVT-AV1`的解码要稍快一些，而在以四线程模式运行时，相对于`libaom`而言，`SVT-AV1`则会获得更大的解码速度的提升。

## Tip

相关文章链接：<https://blog.csdn.net/qq_40073459/article/details/106315277>

> Android Service工作中需要了解的内容，自己对其相关特性及运行流程进行了实践和了解。

## Share

分享文章链接：<https://blog.csdn.net/qq_40073459/article/details/104384940>

> 上面文章是自己对APUE的学习笔记。