#include <stdio.h>
#include <stdbool.h>

bool visited[9];
int graph[9][3] = {{}, {2,3,8}, {1,7}, {1,4,5}, {3,5}, {3,4}, {7}, {2,6,8}, {1,7}};

void dfs(int x) {
    visited[x] = true;
    printf("%d ", x);
    for(int i = 0; i <= 3; i++)
    {
        if(graph[x][i] == 0) continue;
        // 인접한 노드가 방문한 적이 없다면 DFS 수행
        if(!visited[graph[x][i]])
        {
            dfs(graph[x][i]);
        }    
    }
}
int main(void) {
    dfs(1); 
}