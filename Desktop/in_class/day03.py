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

#split 함수
print(univ.split())   #띄어쓰기를 기준으로 리스트 형태로 전환시켜줌

print((univ.split('i')))  ##[ 'Inha Un', 'vers' , 'ty']

#join 함수
pokemons_list = ['피카츄', '꼬부기', '파이리', '이상해']
pokemons_string = ', '.join(pokemons_list)
print(pokemons_string)
## 피카츄, 꼬부기, 파이리, 이상해
pokemons_list = ['피카츄', '꼬부기', '파이리', '이상해']
pokemons_string = '/'.join(pokemons_list)
print(pokemons_string)
## 피카츄/꼬부기/파이리/이상해

#replace 함수
inha = 'a duck goes into a sea'
print(inha.replace('a', 'a nice'))    # a nice duck goes into a nice sea nice
print(inha.replace('a ', 'a nice '))   # a niceduck goes into a nicesea

#strip 함수
subjects = '  python, data structure, database  '
print(subjects.strip()) ##python, data structure, database
print(subjects)         ##  python, data structure, database

subjects = '  python, data structure, database   $'
print(subjects.strip())
print(subjects)

subjects = ' $ python, data structure, database   $$$'
print(subjects.count('data'))
print(subjects.rfind('data'), subjects.rindex('data'))    ## 문자열 끝에서 시작
print(subjects.find('inha'))  ## 못찾으면 -1을 반환
# print(subjects.index('inha')) ## 못찾으면 예외 발생
print(subjects.isalnum())
print(subjects.title())

# old style format
# new style format

# pp.134 연습문제 5.1
song =  """When an eel grabs your arm,
... And it causes great harm,
... That's a - moray!"""


