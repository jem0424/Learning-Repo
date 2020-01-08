words = set()

def check(words):
    if words.lower() in words:
        return True
    else:
        return False
def load(dictionary):
    file = open(dictionary,"r")
    for line in file:
        words.add(line)
    file.close()
    return True
def size():
    return len(words)
def unload():
    return True