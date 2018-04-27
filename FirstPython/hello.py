# print("Hello world")
# for i in range(1,12):
#     print("No {} square is {} nd cube is {:4}".format(i,i**2,i**4))
#     print("completed")

# name = input("Enter your name")
# age = int(input("How old are you {}".format(name)))
# print(age)
#
# if (23<=age<=45):
#     print("you are old enough to vote mr {}".format(name))
# else:
#     print("you are kid")

# name = input("Enter your Name:")
# age = int(input("Enter your Age:"))
#
# if(age>18) and (age<31):
#     print("Welcome {} on Holiday".format(name))
# else:
#     print("Sorry {} you are Minor".format(name))


for i in range(1, 20):
    print("The value of I is {}".format(i))
number = "11,13123,3213123,3132,"
for i in range(0, len(number)):
    if number[i] in "1234567":
        print(number[i])