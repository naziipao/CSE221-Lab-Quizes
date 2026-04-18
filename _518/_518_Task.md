# Task
Given a simple undirected unweighted graph with N nodes and M edges, and Q
queries (X[i], Y[i]), for each queries, find if X[i] and Y[i] are reachable
from each other using some path. The nodes are numbered from 1 to N.

# Input
First line contains the number of tests. The description of each test follows.
Each test is described by (M+Q+1) lines. First line contains N, M, Q. Each of
the next M lines contains U[i] and V[i] indicating that there is an edge
between U[i] and V[i]. Each of next Q lines contains X[i] and Y[i].

# Output
For each test in the given order, print Q lines, "YES" or "NO" in each line,
the answers you are asked to find in this task.

# Example-1 (batch-1)
## Input (stdin)
```
2
2 1 1
1 2
1 1
5 3 4
4 3
1 2
4 5
1 2
2 4
3 1
3 5
```
## Output (stdout)
```
YES
YES
NO
NO
YES
```

# Example-2 (batch-2)
## Input (stdin)
```
2
3 2 1
1 2
2 3
1 3
8 7 4
6 2
7 5
7 8
3 1
2 3
2 1
3 4
3 1
4 6
7 2
4 6
```
## Output (stdout)
```
YES
YES
YES
NO
YES
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
1       0.1     2       2<=max(N,M,Q)<=5
2       0.1     2       2<=max(N,M,Q)<=10
3       0.2     5000    2<=max(N,M,Q)<=20
4       0.3     50      2<=max(N,M,Q)<=3000
5       0.3     5       2<=max(N,M,Q)<=50000
------------------------
5       1       Total
```

# Time limit
1s (cpp) or 1.5s (java) or 3s (py) per batch.

# Hints
- Use fast input/output methods.
- 0.2 score for passing only sample batches.
- O(N+M+Q) solution is expected.