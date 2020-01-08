a = [1, 2, 3, 4, 5, 5]

def dupl(a):
    read = set()
    for x in a:
        if x in read:
            return x
        read.add(x)
    return False

def main():
    res = dupl(a)
    print(res)

if __name__ == "__main__":
    main()