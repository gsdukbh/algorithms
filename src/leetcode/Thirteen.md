Python3
=

一般方法 
-

``` 
#python3

def romanToInt(s: str) -> int:
    lo = {'I': 1, 'V': 5, 'IV': 4, 'X': 10, 'IX': 9, 'L': 50, 'XL': 40, 'XC': 90, 'C': 100, 'CD': 400, 'D': 500,
          'CM': 900, 'M': 1000, }
    res=0
    i=0
    while i < len(s):
        if i< n-1 and lo.get(s[i+1]) > lo.get(s[i]):
            res += lo.get(s[i:i+2])
            i += 2
        else:
            res += lo.get(s[i])
            i += 1
    return res
```