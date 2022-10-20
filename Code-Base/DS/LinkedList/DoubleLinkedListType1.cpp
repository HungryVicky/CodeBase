#include <iostream>

class Node{

    public:
        int data;
        Node* prev;
        Node* next;

};

void push(Node** head,int value){
    Node* new_node = new Node();

    new_node->data = value;
    new_node->prev = NULL;
    new_node->next = (*head);

    if((*head) != NULL){
        (*head)->prev = new_node;
    }

    (*head) = new_node;
}
void print(Node* head){

    using namespace std;
    if(head == NULL){
        cout<<"NULL"<<endl;
        return;
    }
    Node* last = head;
    while(head != NULL){
        cout<<head->data<<"<-->";
        last = head;
        head = head->next;
    }
    cout<<"NULL"<<endl;
    cout<<"NULL"<<"<--";
    while (last != NULL) {
        cout <<last->data <<"<-->";
        last = last->prev;
    }

    cout<<endl;
}

void insertAfter(Node* prev,int value){
    if(prev == NULL)
        return;

    Node* new_node = new Node();
    new_node->data = value;
    new_node->next = prev->next;
    prev->next = new_node;
    new_node->prev = prev;

    if (new_node->prev != NULL)
        new_node->next->prev = new_node;
 
}
void Append(Node** head,int value){

    Node* last = *head;
    Node* new_node = new Node();
    new_node->data = value;

    new_node->next = NULL;
    if(*head == NULL){
        new_node->prev = NULL;
        *head = new_node;
    }

    while(last->next != NULL){
        last = last->next;
    }

    last->next = new_node;
    new_node->prev = last;

    return;
}
int main(){

    Node* head = NULL;

    push(&head,13);
    push(&head,11);
    push(&head,10);
    push(&head,9);
    Append(&head,99);
    push(&head,123);

    print(head);
    
}