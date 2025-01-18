# Chapter 1
## 1.1
### 1.1-1
Describe your own real-world example that requires sorting. Describe one that requires finding the shortest distance between two points.

**A:**
**Sorting:** Patients waiting in the emergency room are sorted according to the urgency of their condition so that the most urgent patients receive treatment first.<br>
**Shortest distance:** Find the gas station which is closest to my current location.

### 1.1-2
Other than speed, what other measures of efficiency might you need to consider in a real-world setting?

**A:** Consumption of memory and energy.

### 1.1-3
Select a data structure that you have seen, and discuss its strengths and limitations.

**A:** Array. Accessing the element of cetain index is fast; but insertion and deletion is slow.


### 1.1-4
How are the shortest-path and traveling-salesperson problems given above similar? How are they different?

**A:** Both are about the closest distances. But the shortest-path is to find the closes distance from possible routings; traveling-salesperson is to find the overall smallest distances.

### 1.1-5
Suggest a real-world problem in which only the best solution will do. Then come up with one in which <approximately= the best solution is good enough.

**A:** 
**Best solution:** shortest path between from the origin to the destination.<br>
**Approximation:** traveling-sales person problem.

### 1.1-6
Describe a real-world problem in which sometimes the entire input is available before you need to solve the problem, but other times the input is not entirely available in advance and arrives over time.

**A:** Entire input is available: A Pharmacy system that calculate the total cost of the drugs in a prescription.<br>
Input is not entirely available: The waiting time to get a prescription fulfilled because new prescriptions arrive over time.

## 1.2
### 1.2-1
Give an example of an application that requires algorithmic content at the application level, and discuss the function of the algorithms involved.

**A:** In a social network application, place the most liked comments on a post on the top of all comments. The function of the algorithms to to sort the comments by their likes.

### 1.2-2
Suppose that for inputs of size n on a particular computer, insertion sort runs in 8n² steps and merge sort runs in 64nlg(n) steps. For which values of n does insertion sort beat merge sort?

**A:** When n is less than 40,  insert sort is faster than merge sort. Used the following formula to calcuate *n*.

```
8n² < 64nlg(n)
n < 8lg(n)
```

### 1.2-3
What is the smallest value of n such that an algorithm whose running time is 100n² runs faster than an algorithm whose running time is 2<sup>n</sup> on the same machine?

**A:** 15

### Problem 1-1
For each function *f(n)* and time *t* in the following table, determine the largest size n of a problem that can be solved in time *t*, assuming that the algorithm to solve the problem takes *f(n)* microseconds.

|                 | 1 second | 1 minute | 1 hour | 1 day | 1 month | 1 year | 1 centry |
|-----------------|----------|----------|--------|-------|---------|--------|----------|
| $\lg{n}$        |          |          |        |       |         |        |          |
| $\sqrt{n}$      |          |          |        |       |         |        |          |
| n               |          |          |        |       |         |        |          |
| n$\lg{n}$       |          |          |        |       |         |        |          |
| n<sup>2</sup>   |          |          |        |       |         |        |          |
| n<sup>3</sup>   |          |          |        |       |         |        |          |
| 2<sup>n</sup>   |          |          |        |       |         |        |          |
| n!              |          |          |        |       |         |        |          |


**A:**
|                 | 1 second | 1 minute | 1 hour | 1 day | 1 month | 1 year | 1 centry |
|-----------------|----------|----------|--------|-------|---------|--------|----------|
| $\lg{n}$        | 2<sup>1000</sup> | 2<sup>1000×60</sup> | 2<sup>1000×3600</sup> | 2<sup>1000×3600×24</sup> | 2<sup>1000×3600×24×30</sup> | 2<sup>1000×3600×24×365</sup> | 2<sup>1000×3600×24×365×100</sup> |
| $\sqrt{n}$      | 1000<sup>2</sup> | (1000×60)<sup>2</sup>  | (1000×3600)<sup>2</sup> | (1000×3600×24)<sup>2</sup> | (1000×3600×24×30)<sup>2</sup> | (1000×3600×24×365)<sup>2</sup> | (1000×3600×24×365×100)<sup>2</sup> |
| n               | 1000 | 1000×60 | 1000×3600 | 1000×3600×24 | 1000×3600×24×30 | 1000×3600×24×365 | 1000×3600×24×365×100 |
| n$\lg{n}$       | 140 | 4895 | 204094 | 3943234 | 97659289 | 1052224334 | 86788101610 |
| n<sup>2</sup>   | 31 | 244 | 1897 | 9295 | 50911 | 177583 | 1775837 |
| n<sup>3</sup>   | 10 | 39 | 153 | 442 | 1373 | 3159 | 14664 |
| 2<sup>n</sup>   | 10 | 15 | 21 | 26 | 31 | 34 | 41 |
| n!              |  4 | 8 | 9 | 11 | 12 | 13 | 15 |