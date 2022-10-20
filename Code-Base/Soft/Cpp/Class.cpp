//https://www.hackerrank.com/challenges/c-tutorial-class/problem

#include <iostream>
#include <sstream>
using namespace std;
class Student{
  private:
  int age;
  int standard;
  string last_name;
  string first_name;
  public:
   void set_age(int set_age){
       age = set_age;
   } 
    void set_standard(int set_first_name){
       standard = set_first_name;
   } 
    void set_first_name(string set_last_name){
       last_name = set_last_name;
   } 
    void set_last_name(string set_standard){
       first_name = set_standard;
   } 
    int get_age(){
       return age;
   } 
    int get_standard(){
        return standard;
   } 
    string get_last_name(){
      return first_name;
   } 
    string get_first_name () {
      return last_name;
   } 
   
  string to_string(){
     stringstream ss;
     ss << age <<","<<last_name<<","<<first_name<<","<<standard;
     return ss.str();
  }
 
};
int main() {
    int age, standard;
    string first_name, last_name;
    
    cin >> age >> first_name >> last_name >> standard;
    
    Student st;
    st.set_age(age);
    st.set_standard(standard);
    st.set_first_name(first_name);
    st.set_last_name(last_name);
    
    cout << st.get_age() << "\n";
    cout << st.get_last_name() << ", " << st.get_first_name() << "\n";
    cout << st.get_standard() << "\n";
    cout << "\n";
    cout << st.to_string();
    
    return 0;
}
