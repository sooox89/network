#ch10 
class Cat:
    pass
a_cat = Cat()
another_cat = Cat()
a_cat.age = 3
a_cat.name = 'Mr.Fuzzybutton'
a_cat.nemesis = another_cat

# print(a_cat.nemesis.name)  ## AttributeError: 'Cat' object has no attribute 'name'
a_cat.nemesis.name = 'Mr.Bigglesworth'  # another_cat 클래스에 name 속성 할당 !
print(a_cat.nemesis.name)

