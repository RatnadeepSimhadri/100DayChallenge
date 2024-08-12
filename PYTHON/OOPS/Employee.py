

class Employee:
    company = "Infosys" # Class Variable

    # Initializer or Constructor
    def __init__(self, id, name, salary, department = None):
        # Instance Variables
        self.id = id
        self.name = name
        self.salary = salary
        self.department = department

    # An Instance Method
    def salary_per_day(self):
        return self.salary / 365

    # In Python Method Overloading can be implemented through default parameters
    def demo(self, a,b,c,d=5,e=None):
        print("a=",a)
        print("b=",b)
        print("c=",c)
        print("d=",d)
        print("e=",e)


    # Overrides the default representation of Object which is useful for Printing the Instance of the Class
    def __repr__(self):
        return "{}, who is currently working in {} is earning about ₹{} per year".format(self.name, self.department, self.salary)


_RatnaDeep = Employee(198845, "Ratnadeep", 325000, "Cisco")
_JoshSmith = Employee(1234,"John Smith", 120000)


print(_RatnaDeep)
print(_JoshSmith)
print(_RatnaDeep.company)
print(_RatnaDeep.demo(a=1,b=2,c=3))

