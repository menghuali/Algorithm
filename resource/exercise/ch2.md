# Chapter 2
## 2.1
### 2.1-1
Using Figure 2.2 as a model, illustrate the operation of INSERTION-SORT on an array initially containing the sequence (31, 41, 59, 26, 41, 58).

**A**:<br>
![2.1-1](2.1/2.1-1.png) 

### 2.1-2
Q: Consider the procedure SUM-ARRAY on the facing page. It computes the sum of the n numbers in array *A[1:n]*. State a loop invariant for this procedure, and use
its initialization, maintenance, and termination properties to show that the SUMARRAY procedure returns the sum of the numbers in *A[1:n]*.

```bash
SUM-ARRAY(A, n)
1   sum = 0
2   for i = 1 to n
3       sum = sum + A[i]
4   return sum
```

**A**:<br>
**Initialization**: We start by setting *sum* to zero before the first loop iteration, when *i* = 1. Since no element of the arry is added to sum yet, *sum = 0* shows that the loop invariant is true prior to the first iteration of the loop.

**Maintenance**: The for loop works by adding *A[i]* to *sum*, which make *sum* the sum of subarray *A[1:i]*. Incrementing i for the next iteration of the for-loop then preseves the loop invariant.

**Termination**: The loop variable *i* starts at 1 and increases by 1 in each iteration. Once *i*'s value exceeds *n* in line 2, the loop terminates. Substituting *n + 1* for i in the wording of the loop invariant yield that sum of subarray *A[1:n]*. Hence, the algorithm is correct.

