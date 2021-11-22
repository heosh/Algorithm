def solution(numbers): 
    numbers_str = [str(num) for num in numbers]     # int를 str로 변경
    numbers_str.sort(key= lambda num:num*3, reverse=True)   # number는 1000이하의 숫자이므로 x3(반복)한 값으로 비교
    # 3을 곱하게 되면 [101010, 686868, 757575, 777, 212121, 121212] 이렇게 될 것이고, 정렬을 하게 되면 [777, 757575, ~ 121212, 101010]이 된다.
    
    # print(numbers_str)
    return str(int(''.join(numbers_str)))
    # 만약 numbers=[0,0,0,0] 이라면 0 이 나와야 한다.
    # join한 값을 int로 만들어 준 후 원하는 return값이 str이기 때문에 다시 str로 변환한다.
    

print(solution(["10","68","75","7","21","12"]))
