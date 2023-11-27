
#print("Aman kumar choudhary,AIML,Roll no-07,JNCT")




# print('''Twinkle,twinkle,little star,
#         How i wonder what you are!
#              up above the world so high,
#              like a diamond in the sky.
#       Twinkle,twinkle,little star,
#              How I wonder what you are''') 
           
# import sys
# p=sys.version()
# print(p)

# import time
# x=time.strftime("%Y-%m-%d")
# y=time.strftime("%H:%M:%S")
# print(f'''the current time is : {y} 
# and date of today is : {x}''')


# from math import pi
# r=float(input("Enter circle areas : "))
# area=pi*r**2
# print(f"the area of circles is : {area}")

# a=(input("Enter your name : "))


# b=a[::-1]
# print(f" {b} ")


# color_list=["Red","Green","White","Black"]
# print(color_list[0:4:3])

# exam_st_date="11,12,2014"
# print(f"The examination will start from : ")
# print(exam_st_date.replace(",","/"))

# import datetime as dt
# date_2=dt.date(2014,7,2)
# date_1=dt.date(2014,7,11)
# print(date_1-date_2)

# a=int(input("Enter first number : "))
# b=int(input("Enter secand number : "))
# c=int(input("Enter third number : "))
# d=a+b+c
# print(d**3)if(a==b==c)else print(d)

# numbers=[386,462,418,47,907,344,236,375,823,566,597,978,328,615,953,345,399,162,758,219,918,237,412,345,
#          566, 826, 248, 866, 950, 626, 949, 687, 217, 815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717, 958,743, 527]
# for i in numbers:
#     if(i%2==0):
#         if(i<237):
#            print(i)
#     else:
#        pass

'''14.		Write a Python program that opens a file and handles a FileNotFoundError exception if the file does not exist.
exception FileNotFoundError: Raised when a file or directory is requested but doesn't exist.

'''
# f=open('myfile.txt','r')
# re=f.read()
# print(re)

# file=input("Enter a file name : ")
# a=file[::-1]
# print(a)

# f=open('aman file.txt','r')
# content=f.read()
# print(content)

# alpha="aeiou"
# print(alpha[:])
# print(alpha[1:])
# print(alpha[2:])
# print(alpha[3:])
# #print(alpha[4:])
# print(alpha[:4])
# print(alpha[1:4])
# print(alpha[2:4])
# #print(alpha[3:4])
# print(alpha[:3])
# print(alpha[:2])
# print(alpha[:2])
# #print(alpha[::1])
# print(alpha[::2]) 
# print(alpha[::3]) 
# print(alpha[::4]) 
# print(alpha[::-1]) 
# print(alpha[::-2]) 
# print(alpha[::-3]) 



#16.	Write a Python program that removes and prints every third number from a list of numbers until the list is empty.
# list = [1,2,3,4,5,6,7,8,9,10,11]
# print(list[::3])

# #17.Write a Python program that prints long text, converts it to a list, and prints all the words and the frequency of each word.
# a='abcdefghijklmnopqrstuv'
# print(list(a))

# #18.	Write a Python program to count the number of each character in a text file.
# f=open('my file.txt','r')
# cou=f.read()
# print(len(cou))

#19.Write a Python program that retrieves the top stories from Google News.

#20.Write a Python program to get a list of locally installed Python modules.

# #q.21
# X = [10, 20, 20, 20]
# Y = [10, 20, 30, 40]
# Z = [10, 30, 40, 20]
# for i in range(0,3):
#     sum=
#     pass
# sum=X[i]

#22.	Write a Python program to add two positive integers without using the '+' operator.
# Note: Use bit wise operations to add two numbers.

# a=5
# b=2
# print(a^b)

#23 Write a Python program to get all possible two-digit letter combinations from a 1-9 digit string

string_maps = {
"1": "abc",
"2": "def",
"3": "ghi",
"4": "jkl",
"5": "mno",
"6": "pqrs",
"7": "tuv",
"8": "wxy",
"9": "z"
}

#
#
#
#25.	 Write a Python program to find the median among three given numbers.
# maps={
# "a" :1,
# "b" :8,
# "c":9}
# n=len(maps)
# median=(n+1)/2
# #print(median)
# print(maps{2})


# 26
# a=int(input("Enter exponent : "))
# c=int(input("Enter the number : "))
# print(c**a)


#27.	Write a Python program to find the number of zeros at the end of a factorial of a given positive number.
#Range of the number(n): (1 <= n <= 2*109).
# def factorial(n):
#     if(n==0 or n==1):
#         return 1
#     else:
#         return n*factorial(n-1)
        
    
# a=factorial(5)
# b=str(a)
# print(b[2:3])
# print(b[1:2])
# if(b[2:3] == "0"):
#     print("one zero")
#     if(b[1:2]=="0"):
#        print("two zero")
#     else:
#         pass
# else:
#     print("three zero")



# 28.Write a Python program to find the total number of even or odd divisors of a given integer.
# import math 
# def countdiviseer(n):
#     for i in range (1,n):
#         if(n%i == 0):
#            a=i
#            #a=a+1
#            print(a)
#         else:
#           pass

# lst=[p for p in range(10)]
# for i in lst:
#    if(10 % i==0):
#       print(i)
#       print(len(lst))
#    else:
#       pass
#b=countdiviseer(10)
#print(b)

#29.	 Write a Python program to find the digits that are missing from a given mobile number.
list=[]

#31.	To write a Python program to find GCD of two numbers.
# c=int(input("Enter first number : "))
# d=int(input("Enter secand number : "))

# def big(c,d):
#    if(c>d):
#     return c
#    else:
#      return d
   
# for i in range (1,big(c,d+1)):
#      if(c%i==0 and d%i==0):
#         hcf=i
     
# print(hcf)

#32.	To write a Python Program to find the square root of a number by Newton’s Method.
# from math import sqrt
# d=int(input("Enter secand number : "))
# print(sqrt(d))

#33.	To write a Python program to find the exponentiation of a number.
# a=int(input("Enter exponent : "))
# c=int(input("Enter the number : "))
# print(c**a)

#34.	To write a Python Program to find the maximum from a list of numbers.
# lst=[12,54,4,8,65]
# print(max(lst))

# a=len(lst)
# max=lst[0]
# for i in lst:
#     #print(i)
# #def grater():
#     if(i>max):
#         max=i
#     else:
#         pass
# print(max)
    
#35.To write a Python Program to perform Linear Search

#40.	To write a Python program to find first n prime numbers.
#n=int(input("Enter the number : "))
#lst=[p for p in range(2,n)]

# def prime(a):
    

#     for j in range(2,a):
#        #pass
#        if(a%j==0):
#          return False
#        else:
#           return True
      
#     #return True

# for i in range(1,n-1):
#     if(prime(i)):
#         print(i)


    

    

#41.	To write a Python program to multiply matrices.
# import numpy as np
# myarr_1=np.array([[1,1,1],[2,2,2],[3,3,3]])
# myarr_2=np.array([[5,4,6],[7,8,9],[10,11,12]])
# mul=myarr_1*myarr_2
# print(myarr_1)
# print(myarr_2)
# print(mul)

#43.To write a Python program to find the most frequent words in a text read from a file.
f=open('my file.txt','r')
freq=f.readline()
print(freq)
# list=[]
# for line in f:
#     # print(f"" ,"{line}")
#     list=line
# for i in list:
#     print(i)