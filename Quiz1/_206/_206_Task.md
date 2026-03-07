# Task
Given a list of N integers A[i] and another list of M integers B[j] both sorted
in non-decreasing order, find two positions i and j (in 1-based indexing) such
that the value of A[i] + B[j] is closest to K.

# Input
First line contains the number of tests. The description of each test follows.
Each test is described by three lines. First line contains N, M, K. Second line
contains the integers A[i]. Third line contains the integers B[j].

# Output
For each test in the given order, print the two asked positions in one line.

# Example-1 (batch-1)
## Input (stdin)
```
2
4 4 0
-5 -2 -1 5
-5 0 1 1
6 6 1
-5 -3 3 4 4 5
-2 0 2 2 3 5
```
## Output (stdout)
```
4 1
3 1
```

# Example-2 (batch-2)
## Input (stdin)
```
3
1 1 8
-2
-8
2 2 -4
-7 4
-5 4
3 4 -2
-15 -15 8
-14 4 4 6
```
## Output (stdout)
```
1 1
1 2
3 1
```

# Forbidden words
```
open
file
creat(
fstream
thread
process
system(
exec(
```

# Scoring distribution
```
Batch   Score   Tests   Constraints
1       0.1     2       1<=max(N,M)<=10, max(abs(K),abs(A[i]),abs(B[j]))<=10
2       0.1     2       1<=max(N,M)<=10, max(abs(K),abs(A[i]),abs(B[j]))<=100
3       0.2     5000    1<=max(N,M)<=20, max(abs(K),abs(A[i]),abs(B[j]))<=1000
4       0.3     50      1<=max(N,M)<=4000, max(abs(K),abs(A[i]),abs(B[j]))<=1000000
5       0.3     5       1<=max(N,M)<=100000, max(abs(K),abs(A[i]),abs(B[j]))<=1000000000
------------------------
5       1       Total
```

# Time limit
1s (cpp) or 1.5s (java) or 3s (py) per batch.

# Hints
- Use fast input/output methods.
- 0.2 score for passing only sample batches.
- Expected solution is O(N+M) per test.