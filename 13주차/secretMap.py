def solution(n, arr1, arr2):
    answer = []
    for i in range(n):
        a12 = bin( arr1[i] | arr2[i] )
        a12 = a12[2:].zfill(n)
        a12 = a12.replace('1', '#')
        a12 = a12.replace('0', ' ')
        answer.append(a12)
    
    return answer


n = int(input())
arr1 = list(map(int, input().split()))
arr2 = list(map(int, input().split()))

print(solution(n, arr1, arr2))