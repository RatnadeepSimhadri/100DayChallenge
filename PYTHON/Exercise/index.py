my_dict = dict()
for i in range(3):
    for j in range(2):
        my_dict[i] = j
print(my_dict)

'''
List of Lists (Find Max Sum)
'''

def find_max(lis):
    maxSum = None
    maxIndex = -1
    for i in range(len(lis)):
        li = lis[i]
        if i == 0:
            maxSum = sum(li)
            maxIndex = i
        else:
            if maxSum < sum(li):
                maxSum = sum(li)
                maxIndex = i

    return maxIndex


print(find_max([[1, 2, 3], [2, 3, 3], [1, 3, 3]] ))