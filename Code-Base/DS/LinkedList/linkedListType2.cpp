#include <iostream>

class Node {
    public:

    int data;
    Node* next;

    Node(int value){
        data = value;
        next = NULL;
    }
    void insertHead(Node*& head,int value);         //O(1)
    void insertafter(Node* head,int key,int value); //O(N)/O(1)
    void insertTail(Node*& head,int value);         //O(1)
    void del(Node*& head,int key);                  //O(1)
    void print(Node*& head);                        //O(N)

};

void insertHead(Node*& head,int value){
    Node* new_node = new Node(value);
    new_node->next = head;
    head = new_node;
}
void insertafter(Node* head,int key,int value){
    
    Node* new_node = new Node(value);
    
    if(key == head->data){
       
        new_node->next = head->next;
        head->next = new_node;
        return;
    }
    
    Node* temp = head;
    while(temp->data != key){
        temp = temp->next;
        if(temp == NULL){
            return;
        }
    }
    new_node->next = temp->next;
    temp->next = new_node;
}

void insertTail(Node*& head,int value){
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
void del(Node*& head,int key){
    Node* temp = head;
    Node* prev_node;

    if (temp != NULL && temp->data == key)
    {
        head = temp->next;
        delete temp;
    }
    else{
        while (temp != NULL && temp->data != key)
        {
            prev_node = temp;
            temp = temp->next;
        }
        if(temp == NULL)return;

        prev_node->next = temp->next;
        delete temp;
    }
    
}

void print(Node*& head){
    
    Node* temp = head;
    
    while(temp != NULL){
        std::cout<<temp->data<<"->";
        temp = temp->next;
    }
    std::cout<<"NULL"<<std::endl;
}

int main() {
    
    Node* head = NULL;      //creating Head Pointer to Point to the head
    
    insertHead(head,1);     //adding value to 1 and pointing it as head
    insertHead(head,2);     //adding value 2 and know 2 is head 

    insertafter(head,2,3);  //insertafter 3 before 2
    insertafter(head,3,4);  //insertafter 4 before 3

    insertTail(head,5);     //adding value 5 and pointing it as tail
    del(head,5);            //delete Node 
    print(head);            // printing the value 
  
    
    return 0;
}