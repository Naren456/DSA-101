def main():
    # YOUR CODE GOES HERE
    # Please take input and print output to standard input/output (stdin/stdout)
    # E.g. 'input()/raw_input()' for input & 'print' for output
    T =int(input())
    for i in range(T):
        s = input()
        count = 0
        for i in range(0,len(s)):
            str = ""
            for j in range(i,len(s)):
                str += s[j]
                print(str)
                count += int(checkvowel(str))
                
        return count%1003
def checkvowel(str):
    n = len(str)
    for i in range(0,n):
        if str[i] in 'AEIOUaeiou':
            return int(1)
if __name__ == '__main__':
    main()