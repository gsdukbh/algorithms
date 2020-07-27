使数组唯一的最小增量
-

* 原先的想法
  
   利用Set 集合 判断唯一，但是超出时间限制



```java
 public static int minIncrementForUnique(int[] A) {
        /**
         * 超时
         */
        Arrays.sort(A);
        HashSet<Integer> set= new HashSet<>();
        int res=0;
        int n=0;
        for (int i=0;i<A.length;i++){
            if (set.contains(A[i]) !=true){
                set.add(A[i]);
                System.out.println("++");
            }else {
                res += 1;
                boolean t=set.add(A[i]+1);
                n=A[i]+1;
                while ( ! t){
                    n += 1;
                    t=set.add(n);
                    res +=1;
                }
                n=0;
            }
        }
        return res;
    }
```

* 新的方式

   因为每次都是+1 可以利用差值为。
   
```java

public static int minIncrementForUnique2(int[] A) {
        if (A.length == 0) {return 0;}
        Arrays.sort(A);
        int N = A[0], res = 0;
        for (int i = 0; i < A.length; ++i) {
            if (A[i] <= N) {
                res += N - A[i];
            }
            else{
                N = A[i];
            }
            N++;
        }
        return res;
    }
```

        