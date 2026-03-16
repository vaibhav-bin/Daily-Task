t=int(input())
for test in range(t):
    n=int(input())
    nums=list(map(int, input().split()))

    mp={}

    for i in range(n):
        num=nums[i]
        if num not in mp:
            mp[num]=[]
        mp[num].append(i)

    maxmap={k:v for k,v in sorted(mp.items(), reverse=True)}

    remfrom=n
    c=0
    flag=False

    for v in maxmap.values():
        for index in v[::-1]:
            if index<remfrom:
                c+=1
                remfrom=index

            if remfrom==0:
                flag=True
            if flag:
                break
                
        if flag:
            break

    print(c)

        