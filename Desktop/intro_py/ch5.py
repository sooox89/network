vowels = 'a'+'e'+'i'+'o'+'u'
print(vowels)
## aeiou

vowels = ('a' "e" '''i''' 'o' "u")
print(vowels)
## aeiou

vowels = ('a','e','o','i','u')
print(vowels)
##('a', 'e', 'o', 'i', 'u')

# herry를 perry로 !
name = "Herry"
print(name.replace('H','P'))
print('P' + name[1:])
# name[0] = 'P' (X)
# 특정 인덱스에 문자 삽입, 변경 불가능 // 문자열은 불변하기 때문

# len함수 문자열의 길이
letters = 'askdfsdfsdf'
print(len(letters))

# split함수 문자열 나누기
tasks = 'get the gloves,get mask'

print(tasks.split())
##['get', 'the', 'gloves,get', 'msk']    // 스페이스로 나눔

print(tasks.split(','))
##['get the gloves', 'get msk']     // ,로 나눔

# join함수 문자열 결합하기
snack_list = ['초코칩', '칸쵸', '미쯔']
snack_string = ' '.join(snack_list)
print('내가 좋아하는 과자:',snack_string)

# replace함수 문자열 대체하기
notes = 'Sooo is a girl.'
print(notes.replace('girl','boy'))

# strip함수 문자열 스트립 // 정

# 대소문자
tasks = 'get the gloves,get mask.'
print(tasks.capitalize())

# f-문자열
who = 'Sooo'
snack ='칸쵸'
print(f'{who}가 좋아하는 과자는 {snack}이다')