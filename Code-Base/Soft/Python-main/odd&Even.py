n = int(input("Enter A Ending Number "))
eof = (input("Enter 'e' To Print even Number 'o' For Odd Number "))

if eof == 'e':
    for i in range(1, n, 2):
        print(i)

if eof == 'o':
    for j in range(2, n, 2):
        print(j)
