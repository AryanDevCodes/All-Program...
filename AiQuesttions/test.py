# # a = int(input("Enter Your Savings = "))

# # if (a>=100000):
# #        print("You Are Going To Market")
       
# # elif(a>=70000 and a<=100000):
# #       print("You Are Lucky ")

# # if(a>=30000 and a<=70000):
# #        print("Your Are Unlucky...")

# # else:
# #        print("Bhag Madharchod")


# # name = "Aryan"

# # # for i in name:
# #     print(i , end= "")

# # colors = ["Black","Yellow","Red","Green","Purple"]
# # for i in colors:
# #     print(i)

# # Fruits = [input("Enter Fruits Name = ")]
# # for l in range(5,50):
# #     print(Fruits)

# # a = int(input("Enter 1st Number = "))
# # b = int(input("Enter 2nd Number = ")) 
# # sum = (a+b)

# # for l in range(5):
# #     print(sum)


# # for k in range(5):
# #     print(k-2)


# # for k in range(2,8,6):
# #     print(k)


# # While Loops

# # count = 5
# # while(count>0):
# #     print(count)
# #     count=count+1

# # i = int(input("Enter !! = "))
# # while(i<=15):
# #     print(i)
# #     i=i+1


# # X = int(input("Enter Number = "))
# # while(X>0):
# #     print(X)
# #     X=X-1
# #     if(X>0):
# #        print("Hello")
# # # else:
# # #      print("Counter Is Empty...")   


# # # Printing Table Of Any Number

# # a=int(input("Enter Number = "))

# # for i in range(1,11):
# #     print(a , "X" , i , "=" , (a*i))
    

# # FUNCTION  

# # Clculating Average

# # num=int(input(" How Many Term =  "))
# # sum = 0

# # for n in range(num):
# #     numbers = float(input("Enter Number = "))
# #     sum = numbers
    
# # average = sum/num
# # print("Average of " , num ," = " , average)


# def average():
#  num = int(input("Enter Number of Terms = "))
#  sum = 0

#  for n in range(num):
#      numbers = float(input("Enter Number = "))
#      sum = numbers

#  average = (sum/num)
#  print("Average Of " ,num ,"=" , average  )




# average() 
def insert(arr, element):
    arr.append(element)
 
 
# Driver's code
if __name__ == '__main__':
    # declaring array and key to insert
    arr = [12, 16, 20, 40, 50, 70]
    key = 50
 
    # array before inserting an element
    print("Before Inserting: ")
    print(arr)
 
    # array after Inserting element
    insert(arr, key)
    print("After Inserting: ")
    print(arr)
 
    # Thanks to Aditi Sharma for contributing
    # this code