n = int(input("Enter A Number "))

f = 1

if n == 0:
    print("Factorial Of", n, "Is 0")
else:
    for i in range(1, n+1):
        f = f*i
        print("The Factorial Of ", n, "Is", f)
