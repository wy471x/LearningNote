## Algorithm

```java
/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        int len = s.length();
        for (int i = 0; i < len; ++i) {
            if (s.substring(i).compareTo(t) == 0)
                    return true;
        }
        return false;
    }
}
// @lc code=end
```



## Review

原文：[TCP Keepalive HOWTO]( https://www.tldp.org/HOWTO/html_single/TCP-Keepalive-HOWTO/)

> 本文主要介绍了

## Tip

## Share

