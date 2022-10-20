#include <iostream>
#include <string>
using namespace std;
//HackRank Problem  
int main() {
	string a;
    string b;
    char temp;
    cin>>a>>b;
    cout<<a.length()<<" "<<b.length()<<"\n"<<a+b<<endl;
    temp = a[0];
    a[0] = b[0];
    b[0] = temp;
    cout<<a<<" "<<b;
    
    return 0;
  
  //For More Information Go To https://www.hackerrank.com/challenges/c-tutorial-strings/problem
}
