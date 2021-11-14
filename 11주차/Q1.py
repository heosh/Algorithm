# 배열의 모든 왼쪽 값은 자신의 값보다 작고, 모든 오른쪽 값은 자신의값보다 큰 항목 찾기

def findElement(arr):
    leftMax = []
    maxNum = 0
    for num in arr:
        if(num > maxNum):
            maxNum = num
        leftMax.append(maxNum)
        
    rightMin = []
    print()
    minNum = arr[len(arr)-1]
    for num in reversed(arr):
        if(num < minNum):
            minNum = num
        rightMin.append(minNum)
    rightMin.reverse()
            
    # print(leftMax)
    # print(rightMin)

    for i in range(len(arr)):
        if leftMax[i] == rightMin[i]:
            print(i)
            return
        
    print(-1)
    return

    

arr = [5, 1, 4, 3, 6, 8, 10, 7, 9]
findElement(arr)
    