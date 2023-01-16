print("I'm a \tboy")

# print('I'm a boy'')
# 오류로 뜸

army = '''우리는 국가와 국민에 충성을 다하는 대한민국의 육군이다.
       '하나 우리는 자유민주주의를 수호하며 조국통일의 역군이 된다'''

print(army)

# multiline 쓸 때 ''' three quotes 사용

# army = '우리는 국가와 국민에 충성을 다하는 대한민국의 육군이다.
#       '하나 우리는 자유민주주의를 수호하며 조국통일의 역군이 된다'

# army = '우리는 국가와 국민에 충성을 다하는 대한민국의 육군이다. \
#       '하나 우리는 자유민주주의를 수호하며 조국통일의 역군이 된다'

# error 예시
army = '우리는 국가와 국민에 충성을 다하는 대한민국의 육군이다. \n하나 우리는 자유민주주의를 수호하며 조국통일의 역군이 된다'
print(army)

army = '우리는 국가와 국민에 충성을 다하는 대한민국의 육군이다. \n\n하나 우리는 자유민주주의를 수호하며 조국통일의 역군이 된다'
print(army)

army = '우리는 국가와 국민에 충성을 다하는 대한민국의 육군이다. \t하나 우리는 자유민주주의를 수호하며 조국통일의 역군이 된다'
print(army)


start = '나' * 4 + '\n'
middle = '헤이' * 3 + '\n'
end = '안녕'
print(start+start+middle+end)

univ = 'Inha University'
print(univ[5:])
print(univ[5:14])  ## 5부터 (14-1)까지
print(univ[-10:])
print(univ[:])
print(univ[::2])
print(univ[5:-6])
print(univ[-10:-6])
# [start:end:step] step만큼 문자를 건너뛰면서 start부터 (end-1)까지


