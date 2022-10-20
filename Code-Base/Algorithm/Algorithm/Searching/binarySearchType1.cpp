#include <iostream>

int binarysearch(int arr[],int startingOfArray, int endingOfArray,int x){

    if(endingOfArray >= startingOfArray){
        int mid = startingOfArray + (endingOfArray-startingOfArray)/2; 
        
        if(arr[mid] == x)
            return mid;

        if(arr[mid] > x )
            return binarysearch(arr,startingOfArray,mid-1,x);

        return binarysearch(arr,mid+1,endingOfArray,x);

    }

    return -1;
}


int main(){

    using namespace std;

    int arr[] = { 15,5,10,20,35,20 };
    int target = 35;
    int startOfAraray = 0;
    int endOfArray = sizeof(arr) / sizeof(arr[0]);

    int result = binarysearch(arr,startOfAraray,endOfArray - 1,target);

    (result == -1)
        ? cout << "Element is not present in array"<<endl
        : cout << "Element is present at index " << result<<endl;


    return 0;
}

/* time complexity 0(log n) */
/* Auxiliary Space 0(long n) */

/*
Maybe, you wonder why we are calculating the middle index this way, we can simply add the lower and higher index and divide it by 2.

int mid = (low + high)/2;

But if we calculate the middle index like this means our code is not 100% correct, it contains bugs.

That is, it fails for larger values of int variables low and high. Specifically, it fails if the sum of low and high is greater than the maximum positive int value(231 – 1 ).

The sum overflows to a negative value and the value stays negative when divided by 2. 
In java, it throws ArrayIndexOutOfBoundException.

int mid = low + (high – low)/2;

So it’s better to use it like this. This bug applies equally to merge sort and other divide and conquer algorithms




*/