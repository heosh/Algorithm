# 배열의 모든 왼쪽 값은 자신의 값보다 작고, 모든 오른쪽 값은 자신의값보다 큰 항목인 조건에 맞는 원소 출력


def findElement(arr):
    result = []
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
            print(i, end = ' ')
    return result

    

arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
findElement(arr)
    