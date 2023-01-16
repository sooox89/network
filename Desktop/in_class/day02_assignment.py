# p.105 연습문제 2번

# list에 담고 random하게 choice! 하는 방법

import random

small = random.choice([True,False])
print(small)
green = random.choice([True,False])
print(green)

# small = True
# green = True

if small:
    if green:
        print('완두콩입니다')
    else :
        print('체리입니다')
else :
    if green:
        print('수박입니다')
    else :
        print('호박입니다')



# p.105 연습문제 1번

import random

secret = random.randint(1,10)
guess = int(input('정답은 ?'))

if secret == guess :
    print("정답 입니다!")
elif guess > secret :
    print(f"정답 보다 큰 수 입니다. 정답은 {secret}!")
else :
    print(f"정답 보다 작은 수 입니다. 정답은 {secret}!")
