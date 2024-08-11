my_list = list(range(1,11))
print(my_list)
''' List Operations 
'''

# Appends to the end of the List

my_list.append(11)
print(my_list)

# Insert add element at a specific index
my_list.insert(0,0)

print(my_list)

# pop removes last element from the list 

last_element = my_list.pop()

print(my_list)


# delete a particular value from the list 

my_list.remove(10)

print(my_list)

# List Slicing 

print(my_list[0::2])


# Index Search 

print(my_list.index(0))

# List Sorted 

my_list.sort(reverse=True)

print(my_list)


''' List Comprehension 

A Technique that uses for loop and a condition to create a new list from an existing list 

List comprehension is always enclosed in Square Brackets []. 

[expression for loop if condition]
expression: is operation used to create new elements 
for loop will iterate existing list . The iterator will be used in the expression 
new elements will only be added if condition is fulfilled

'''

even_list = [num for num in my_list if num % 2 == 0]
print(even_list)


# Using Multiple Lists with List Comprehension 

list1 = [30, 50, 110, 40, 15, 75]
list2 = [10, 60, 20, 50]

sum_list = [(n1,n2) for n1 in list1 for n2 in list2 if n1+n2 > 100]

print(sum_list)

''' Tuples '''

cities = ("London", "Paris", "Los Angeles", "Tokyo")

print(cities.index("Tokyo"))

print("San Francisco" in cities)

print(sorted(cities))

''' Dictionaries in Python 

A Dictionary stores key:value pairs , where each unique key is an index which holds the value associated with it . 

Dictionaries are unordered because the entries are not store in linear structures

'''

empty_dict = {}


# Dictionary Comprehension 

houses = {1: "Gryffindor", 2: "Slytherin", 3: "Hufflepuff", 4: "Ravenclaw"}
new_houses = {n*2: house + "!" for (n, house) in houses.items()}
print(houses)
print(new_houses)