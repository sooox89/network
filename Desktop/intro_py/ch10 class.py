#ch10

class Person():
    def __init__(self,name):
        self.name = name
class MDPerson(Person):
    def __init__(self,name):
        self.name = "Doctor" + name
class JDPerson(Person):
    def __init__(self,name):
        self.name = name + ", Esquire"

person = Person('Fudd')
doctor = MDPerson('Fudd')
lawyer = JDPerson('Fudd')
print(person.name)
print(doctor.name)
print(lawyer.name)

class Student():
    def __init__(self,name,age,id):
        self.name = name
        self.age = age
        self.id = id
    def exclaim(self):
        print(f"{self.name} 학생은 {self.age}살이고 학번은 {self.id}입니다")

class Bootcamp(Student):
    def exclaim(self):
        print(f"부트캠프를 다니고 있는 {self.name} 학생은 {self.age}살이고 학번은 {self.id}입니다")

yang = Student("양수경",22,12212291)
yang.exclaim()
yang = Bootcamp("양수경",22,12212291)
yang.exclaim()


