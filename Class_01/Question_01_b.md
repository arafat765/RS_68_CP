# Given Code Snippet:

```java
class Main
{
    static int floorSqrt(int x)
    {
        if (x == 0 || x == 1)
        {
            return x;
        }
        int i = 1, result = 1;
        while (result <= x)
        {
            i++;
            result = i * i;
        }
        return i - 1;
    }
    public static int main(String[] args)
    {
        int x = 11;
        System.out.println(floorSqrt(x));
    }
}
```

---

Here we will only look at the while loop as all other lines in the code have a time complexity of O(1) or constant time.
<br>
Int the while loop, the loop keeps on running until result <= x. And each time, i increases by 1 and result becomes the square of i.
<br>
Therefore, for i = 1, result = 1.
<br>Similarly, for i = 2, result = 4.
<br>Similarly, for i = 4, result = 16.
<br>Similarly, for i = 7, result = 49.
<br>Similarly, for i = n, result = k<sup>2</sup>
<br><br>
Thus we can write n = k<sup>2</sup>
<br>or, $\sqrt n$ = k
<br><br>
Therefore, we can conclude that the time complexity of the given code snippet is O($\sqrt n$).
