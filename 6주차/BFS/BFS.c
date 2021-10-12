#include <stdio.h>
#include <stdbool.h>
#define MAX 100
int front=-1;
int rear=-1;
int queue[MAX];

bool visited[9];
int graph[9][3] = {{}, {2,3,8}, {1,7}, {1,4,5}, {3,5}, {3,4}, {7}, {2,6,8}, {1,7}};

int IsEmpty(void){
    if(front==rear)//front와 rear가 같으면 큐는 비어있는 상태 
        return true;
    else return false;
}
int IsFull(void){
    int tmp=(rear+1)%MAX; //원형 큐에서 rear+1을 MAX로 나눈 나머지값이
    if(tmp==front)//front와 같으면 큐는 가득차 있는 상태 
        return true;
    else
        return false;
}
void addq(int value){
    if(IsFull())
        printf("Queue is Full.\n");
    else{
         rear = (rear+1)%MAX;
         queue[rear]=value;
        }

}
int deleteq(){
    if(IsEmpty())
        printf("Queue is Empty.\n");
    else{
        front = (front+1)%MAX;
        return queue[front];
    }
}

void bfs(int start)
{
    addq(start);
    // 현재 노드 방문 처리
    visited[start] = true;
    // 큐가 빌 때까지 반복
    while(!IsEmpty())
    {
        // 큐에서 하나의 원소를 뽑아 출력
        printf("%d ", deleteq());
        // 해당 원소와 연결된 아직 방문하지 않은 원소들을 큐에 삽입
        for(int i = 1; i <= 9; i++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                if(graph[i][j] == 0) continue;
                if(!visited[graph[i][j]])
                {
                    addq(graph[i][j]);
                    visited[graph[i][j]] = true;
                }
            }
        }
    }
}

int main()
{
    bfs(1);
}