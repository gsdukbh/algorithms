Python3
====

取巧的方法
-
```python3
 def isPalindrome(self, x: int) -> bool:
        temp = str(x)
        if x>=0:
            return int(temp[::-1])==x
        else:
            return 1==2
```
数学方法
--
```python3
def isPalindrome(self, x: int) -> bool:
        temp = x
        total = 0
        while temp > 0:
            total = total * 10 + temp % 10
            temp //= 10
        return total == x
```