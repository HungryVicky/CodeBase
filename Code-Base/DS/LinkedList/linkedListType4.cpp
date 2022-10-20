#include <iostream>

class Node{
public:
    int data;
    Node* next;
};
void push(Node** head,int val){
    Node* new_node = new Node();

    new_node->data = val;
   new_node->next = (*head);

    (*head) = new_node;

}
void insertafter(Node* prev_Node , int val){
    if(prev_Node->next == NULL){return;}

    Node* new_node = new Node();
    new_node->data = val;

    new_node->next = prev_Node->next;
    prev_Node->next = new_node;
}
void insertEnd(Node** head , int val){

    Node* new_node = new Node();

    new_node->data = val;
    new_node->next = NULL;

    Node* last = (*head);

    if(*head == NULL){
        *head = new_node;
    }

    while(last->next != NULL){
        last = last->next;
    }
    last->next = new_node;

    return;
}
void print(Node* head){
    while(head!=NULL){
        std::cout<<head->data<<"->";
        head = head->next;
    }
}
int main(){
    Node* head;
   
   push(&head,5);
   push(&head,15);
   insertEnd(&head,20);
   insertafter(head,20);
    print(head);
}