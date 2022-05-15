#### Practice Python ####
a = 3
b = 2
c = 1

# 321
print(a, b, c, sep='')

# 3
# 2
# 1
print(a, b, c, sep='\n')

# 32
print(a, end='')
print(b)

# 10 ~1
for i in range(10, 0, -1):
    print(i)

# for ~ else
for i in range(2):
    print("test")
    # if i == 1:
    #     break
else:
    print("end")

# *
# * *
# * * *
# * * * *
# * * * * *
for i in range(5):
    for j in range(i + 1):
        print('*', end=' ')
    print()

# * * * * *
# * * * *
# * * *
# * *
# *
for i in range(5):
    for j in range(5 - i):
        print('*', end=' ')
    print()

msg = "It is an apple"
print(msg.upper())
print(msg.lower())
print(msg.find('a'))
print(msg.count('a'))
print(msg[:2])
print(msg[3:7])

for x in msg:
    if x.isupper() and x.isalpha():
        print(x, end='')

tmp = 'AZ'
# A ~ Z 65 ~90
# a ~ z 97 ~ 122
for t in tmp:
    print(t)
    num = ord(t)
    print(num)
    c = chr(num)
    print(c)

b = list(range(1, 11))
print(b)
a = b

a.insert(3, 'oo')
print(a)
print(b)
# [1, 2, 3, 'oo', 4, 5, 6, 7, 8, 9, 10]
# [1, 2, 3, 'oo', 4, 5, 6, 7, 8, 9, 10]
print(a.index('oo'))
a.remove('oo')

print(sum(a))
print(max(a))
print(min(a))
a.clear()
print(b)  # []

# (0, 2)
# (1, 3)
# (2, 4)
# (3, 5)
# (4, 6)
# (5, 7)
# (6, 8)
# (7, 9)
for x in enumerate(list(range(2, 10))):
    print(x)

# 0 2
# 1 3
# 2 4
# 3 5
# 4 6
# 5 7
# 6 8
# 7 9

for idx, value in enumerate(list(range(2, 10))):
    print(idx, value)

if all(4 < x for x in list(range(2, 10))):
    print("YES")
else:
    print("NO")

if any(11 > x for x in list(range(2, 10))):
    print("YES")

# [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
a = [[0] * 3 for _ in range(3)]
print(a)

# 000
# 000
# 000
for x in a:
    for y in x:
        print(y, end='')
    print()

plus_two = lambda x: x + 2
print(plus_two(1))

a = [1, 2, 3]
# [3, 4, 5]
# map(함수명, 인자)
print(list(map(plus_two, a)))

# [0, 1, 2]
print(list(map(lambda x: x - 1, a)))

# 2 1
a, b = 1, 2
a, b = b, a
print(a, b)

import itertools as it

# [(3, 2), (3, 1), (2, 3), (2, 1), (1, 3), (1, 2)]
# [(1, 2), (1, 3), (2, 3)]
npr = it.permutations([3, 2, 1], 2)
print(list(npr))
ncr = it.combinations([1, 2, 3], 2)
print(list(ncr))

import copy

a = [1, 2, 3, 4]
b = []

# ['aaa', 1, 2, 3, 4]
# ['aaa', 1, 2, 3, 4]
b = a
b.insert(0, 'aaa')
print(b)
print(a)
b.remove('aaa')

# ['aaa', 1, 2, 3, 4]
# [1, 2, 3, 4]
b = a[:]
b.insert(0, 'aaa')
print(b)
print(a)

# ['aaa', 1, 2, 3, 4]
# [1, 2, 3, 4]
b = copy.deepcopy(a)
b.insert(0, 'aaa')
print(b)
print(a)

# [1, 3, 5, 2, 4]
my_list = [1, 2, 3, 4, 5]
c = sorted(my_list, key=lambda x: x % 2 == 0)
print(c)

# [2, 4, 1, 3, 5]
c = sorted(my_list, key=lambda x: x % 2 == 0, reverse=True)
print(c)

# [[0, 1], [1, 2]]
Q = [[p, v] for p, v in enumerate(list(range(1, 3)))]
print(Q)
