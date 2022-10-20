#include <iostream>

class Node{

    public:
        int data;
        Node* next;

        Node(int val){
            data = val;
            next = NULL;
        }
};
class linkedList{
    Node* head ;

    public:
        linkedList(){
            head = NULL;
        };
        void insertNode(int val);
        void print();
        void del(int key);

};
void linkedList::insertNode(int value){

    Node* new_node = new Node(value);

    if(head == NULL){
        head = new_node;
        return;
    } 
    Node* temp = head;
    while(temp->next != NULL){
        temp = temp->next;
    }

    temp->next = new_node; 
}
void linkedList::del(int key){

    Node* temp = head;
    Node* prev_node = NULL;

    if(temp != NULL && temp->data == key){
        head = temp->next;
        delete temp;
    }
    else{
        while (temp != NULL && temp->data != key)
        {
            prev_node = temp;
            temp = temp->next;
        }
        if(temp == NULL){
            return;
        }
        prev_node = temp->next;
        delete temp;
    }
}


void linkedList::print(){
    Node* temp = head;
    while(temp->next != NULL){
        std::cout<<temp->data<<"->";
        temp = temp->next;
    }
    std::cout<<"NULL";
}
int main(){

    linkedList listA;

    listA.insertNode(1);
    listA.insertNode(2);
    listA.insertNode(3);
    listA.insertNode(4);
    listA.insertNode(5);

    listA.print();

    listA.del(3);
    
    listA.print();
}