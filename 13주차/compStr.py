def solution(s):
    answer = 1000000
    for slicing in range(1, len(s)//2+2): # 전체 문자열의 범위 절반까지가 최대 압축 길이기 때문에 문자열 절반까지로 끊는다.
        res = ''
        cnt = 1
        tmp = s[:slicing] # 기준 단위로 끊은 문자열 비교
        
        for i in range(slicing, len(s) + slicing, slicing):
            if tmp == s[i:i+slicing]:
                cnt += 1
            else:
                if cnt == 1:
                    res += tmp
                else:
                    res = res + str(cnt) + tmp
                tmp = s[i:i+slicing]
                cnt = 1
                
        answer = min(answer, len(res))
        
    return answer
        
s = 'ababcdcdababcdcd'

print(solution(s))