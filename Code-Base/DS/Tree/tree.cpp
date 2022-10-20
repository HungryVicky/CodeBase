#include <iostream>

class Node{

    public:
        int data;
        Node* right;
        Node* left;

    Node(int value){
        data = value;

        right = NULL;
        left = NULL;
    }

};

int main(){

    Node* root = new Node(1);

    root->right = new Node(2);
    root->left = new Node(3);

    root->right->right = new Node(4);
    root->right->right->right = new Node(4);
    root->left->left = new Node(5);

    root->left->right = new Node(7);
    root->right->left = new Node(6);
    

  
}