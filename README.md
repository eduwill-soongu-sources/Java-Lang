```java
                            //  abacabcd
public static String calculFn(String str, int index, boolean[] seen) {
    if (index < 0) return "";
    char c = str.charAt(index);
    String result = calculFn(str, index - 1, seen); // 재귀 호출
    if (!seen[c]) { // seen배열의 97번인덱스가 false면
        seen[c] = true; // 97번인덱스를 true로 바꿔라 - 마킹
        return c + result;
    }
    return result;
}
```

cf(7) 
ㄴ c = 'd', result = cf(6): 'c' + 'b' + 'a' + ""
  => seen[100] = true, return 'd' + 'c' + 'b' + 'a' + "" => "dcba"
cf(6)
ㄴ c = 'c', result = cf(5): 'c' + 'b' + 'a' + ""
  => seen[99]
cf(5)
ㄴ c = 'b', result = cf(4): 'c' + 'b' + 'a' + ""
  => seen[98]
cf(4)
ㄴ c = 'a', result = cf(3): 'c' + 'b' + 'a' + ""
  => seen[97]
cf(3)
ㄴ c = 'c', result = cf(2): b + a + ""
  => seen[99] = true, return 'c' + 'b' + 'a' + ""
cf(2)
ㄴ c = 'a', result = cf(1): b + a + ""
  => seen[97]

cf(1)
ㄴ c = 'b', result = cf(0) : a + ""
  => seen[98] = true,  return b + a + ""

cf(0)
ㄴ c = 'a': 97, result = cf(-1): ""
  => seen[97] = true,  return a + ""

cf(-1) return "";

