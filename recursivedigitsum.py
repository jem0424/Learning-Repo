#!/bin/python3
# https://www.hackerrank.com/challenges/recursive-digit-sum/problem?isFullScreen=true
import math
import os
import random
import re
import sys

# Complete the superDigit function below.
def superDigit(n, k):
    nk= str(n)*k # o is a string
    p = [] # p is a list
    if (len(nk)==1):
        return nk
    for i in nk:
        p.append(int(i))
        pSum=sum(p)
        
    #return pSum
    n=str(pSum)
    return superDigit(n,1)
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nk = input().split()

    n = nk[0]

    k = int(nk[1])

    result = superDigit(n, k)

    fptr.write(str(result) + '\n')

    fptr.close()