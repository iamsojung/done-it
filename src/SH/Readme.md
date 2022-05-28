```
합 배열 공식
S[i] = S[i - 1] + A[i]

구간 합 공식
S[i] = S[j] - S[i]
```


```
2차원 합 배열 공식
D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j]

2차원 구간 합 공식 
D[i][j] = D[X2][Y1 - 1] + D[X1 - 1][Y2] - D[X1 - 1][Y1 - 1] + A[X2][Y2];
```

```
투 포인터 이동 원칙
sum > N: sum = sum - start_index; start_index++;
sum < N: sum = end_index++; sum = sum + end_index;
sum == N: end_index++; sum = sum + end_index; count++;
```
투 포인터의 핵심은 포인터 2영역 중 한가지를 고정 후 이동 특정 조건에
따라서 영역을 이동. 해당 알고리즘은 NlogN이하로 가능함.