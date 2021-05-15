字符串转换整数
---

+ 使用正则匹配

```python3
       def myAtoi(self, str: str) -> int:
               s=str.strip()
               num=re.findall('^[+\-]?\d+',s)
               return max(min(int(*num),2**31-1),-2**31)
```

+ 逐个转换

~~~text
private static int myAtoi(String str) {
        int k=1;
        int j=0;
        int start=0;
        long res=0;
        str = str.trim();
        if (str==null||str.length()==0){
          return 0;
        }
        char first=str.charAt(0);
        if (first == '+'){
            k = 1;
            start ++;
        }
        else if (first == '-'){
            k = -1;
            start ++;
        }
        for (int i=start;i<str.length();i++){
            if (!Character.isDigit(str.charAt(i))){
                return (int) res * k;
            }
            res = res * 10 + (int)str.charAt(i) -'0';
            if (k==1&& res>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if (k==-1 && res>Integer.MAX_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        return (int) res * k;
    }
~~~

+ 记录数字范围下标 使用字符串切片，转换成 ```long``` 然后判断是否越界 ```Integer.MAX_VALUE```and ```Integer.MIN_VALUE```