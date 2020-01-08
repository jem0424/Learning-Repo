# Python3 code to demonstrate 
# Finding missing elements in List 
# using list comprehension 
  
# initializing list 
test_list = [3, 5, 6, 8, 10] 
def main():
    # printing original list 
    print("The original list : " + str(test_list))
    res = findMissing(test_list) 
    # print result 
    print("The list of missing elements : " + str(res)) 

  
# using list comprehension 
# Finding missing elements in List
def findMissing(test_list): 
    res = []
    for item in range(max(test_list)+1):
        if item not in test_list:
            res.append(item)
    return res
#res = [miss for miss in range(max(test_list)+1) if miss not in test_list]

if __name__ == "__main__":
    main()
  
