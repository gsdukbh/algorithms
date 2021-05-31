## 第一个错误版本

##### 思路：二分查找

```java
    public int firstBadVersion(int n) {
        int le=1,ri=n;
        while(le<ri){
            int mid=le + (ri-le)/2;
            if(isBadVersion(mid)){
                ri=mid;
            }else{
                le=mid+1;
            }
        }
        return le;
    }
```

