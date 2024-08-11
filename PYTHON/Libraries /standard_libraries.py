from datetime import date
from datetime import datetime
import math
import heapq
import random

date_today = date.today()
print(date_today)
time_today = datetime.now()
print(time_today)
print(time_today.strftime("%H:%M:%S"))

''' Popular Modules '''

# math

fact_of_5 = math.factorial(5)
print(fact_of_5)

# heapq: allows us to create heap structure
heap = []
heapq.heappush(heap, 10)
heapq.heappush(heap, 70)
heapq.heappush(heap, 5)
heapq.heappush(heap, 35)
heapq.heappush(heap, 50)

print(heap[0])
print(heapq.nlargest(1,heap))

# random module is used to generate random numbers in pythin

rand_num = random.random()
print(rand_num)

print("Random Integer:", random.randint(1,10))

rand_num_in_range = random.uniform(30,50)
print(rand_num_in_range)

str_list = ['a','b','c','d','e']
random.shuffle(str_list)
print(str_list)
