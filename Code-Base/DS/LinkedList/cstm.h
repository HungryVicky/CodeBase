#include <iostream>
#include <chrono>
#include <vector>
#include <thread> 

namespace cstm{

/// @brief 
/// @tparam T 
/// @param __Obj 
template<typename T>
    void print(T __Obj) const{
        std::cout<<__Obj<<std::endl;
    }
   
class Timer{

    private:
    std::chrono::time_point<std::chrono::steady_clock> _StartingPoint,_EndingPoint;
    std::chrono::duration<float> duration;
     float _MILLISECOND;

    public:
    Timer():_MILLISECOND(0000.0f){
        start_Timer();
    }

    ~Timer(){};

    public:
    void start_Timer(){
        _StartingPoint = std::chrono::steady_clock::now();
    }
    void end_Timer(){
        _EndingPoint = std::chrono::steady_clock::now();
        duration = _EndingPoint-_StartingPoint;
        _MILLISECOND = duration.count() * 1000.0f;
    }
    float show_Time() const{
        std::cout<<_MILLISECOND<<std::endl;
        return _MILLISECOND;
    }
   
};

/// @brief 
/// @tparam T 
/// @param _Iterble_Obj 
template<typename T>
void for_each(T _Iterble_Obj){
    for(int i = 0 ; i < sizeof(_Iterble_Obj) ; i++){
        std::cout<<_Iterble_Obj[i]<<std::endl;
    }
}

class SmartThread{
    public:

    /// @brief 
    /// @param __Timing 
    void wait_for(int __Timing){
        std::this_thread::sleep_for(std::chrono::seconds(__Timing));
}   
    public:
template<typename T>
    void Thread_Excuter(T _Func1,T __Func2){
        std::thread __Thread1(_Func1);
        std::thread __Thread2(__Func2);
        __Thread1.join();
        __Thread2.join();
}
    public:
template<typename T>
    void Thread_Excuter(T _FirstFunc1,T __SecondFunc2,int _Time){
        std::thread __First_Thread1(_FirstFunc1);
        std::this_thread::sleep_for(std::chrono::seconds(_Time));
        std::thread __Second_Thread2(__SecondFunc2);
        __First_Thread1.join();
        __Second_Thread2.join();
}
};

 /// @brief
 /// @param size
 /// @return description of the return value

void* operator new(size_t size){
   static int _HEAP_ALLOCATION_COUNT;
    ++_HEAP_ALLOCATION_COUNT;
    std::cout<<"\nAllocations : "<<_HEAP_ALLOCATION_COUNT<<"\nSize Of Allocation In Heap : "<<size<<std::endl;
    return malloc(size);
}

}