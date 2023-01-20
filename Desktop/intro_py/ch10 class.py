#ch10

# class Cat():
#     def __init__(self,name):
#         self.name = name
# furball = Cat('Grumpy')
# print('Our latest addition: ', furball.name)

class Car():
    def exclaim(self):
        print("I'm a Car!")
class Yugo(Car):
    def exclaim(self):
        print("I'm a Yugo! Much like a Car, but more Yugo-ish.")
# print(issubclass(Yugo,Car))  ## true

give_me_a_car = Car()  # Car class에 give_me_a_car 객체 생성
give_me_a_yugo = Yugo()

give_me_a_car.exclaim() # 객체에서 exclaim
give_me_a_yugo.exclaim()

