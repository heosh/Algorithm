# 음료수 얼려먹기 문제

n, m = map(int, input().split())

graph = []
for i in range(n):
    graph.append(list(map(int, input())))


def dfs(x, y):
    # 주어진 범위를 벗어나는 경우 즉시 종료
    if x <= -1 or x >= n or y <= -1 or y >= m:
        return False
    
    # 현재 노드를 아직 방문하지 않았다면
    if graph[x][y] == 0:
        # 방문 처리
        graph[x][y] = 1
        # 상하좌우의 위치들을 모두 재귀적으로 호출
        dfs(x -1 , y)
        dfs(x, y -1)
        dfs(x + 1, y)
        dfs(x, y +1)
        return True
    return False


# 모든 노드에 대하여 탐색한 후 0을 다 탐색하면 result + 1
result = 0
for i in range(n):
    for j in range(m):
        if dfs(i, j) == True:
            result += 1

print(result)
