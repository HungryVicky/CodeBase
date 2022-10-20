//https://www.hackerrank.com/challenges/multi-level-inheritance-cpp/problem
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
class Equilateral{
    public:
    void equilateral(){
      cout<<"I am an equilateral triangle\n";  
    };
    void triangle(){
        cout<<"I am a triangle\n";
    }
    void isosceles(){
            cout<<"I am an isosceles triangle\n";
    }
};

class Triangle :Equilateral{
	public:
		void triangle(){
			cout<<"I am a triangle\n";
		}
};

class Isosceles : public Triangle{
  	public:
  		void isosceles(){
    		cout<<"I am an isosceles triangle\n";
  		}
};

int main(){
  
    Equilateral eqr;
    eqr.equilateral();
    eqr.isosceles();
    eqr.triangle();
    return 0;
}
