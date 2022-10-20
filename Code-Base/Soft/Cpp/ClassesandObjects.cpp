//https://www.hackerrank.com/challenges/classes-objects/problem
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <cassert>
using namespace std;

class Student{
    public :
    int scores[5];
    void input(){
        for(int i; i<5;i++){
            cin>>scores[i];
        }
    }
  
   int calculateTotalScore() 
    {
        int count = 0;
        for (int i = 0; i < 5; i++) 
        {
            count += scores[i];
        }
        return count;
    } 

  
};


