#include <iostream>

class BST{
    public:
        int data;
        BST* right;
        BST* left;
    
    BST(int val):data(val),right(NULL),left(NULL){}
    BST();
    BST* search(BST*,int);
    BST* insert(BST*,int);
    void inorder(BST*);

};

BST ::BST(): data(0), left(NULL), right(NULL){}

BST* BST::insert(BST* root, int key){
    if(root == NULL)
        return new BST(key);

    if(root->data < key)
        root->right = insert(root->right,key);

    if(root->data > key)
        root->left = insert(root->left,key);
    
    return root;
}

BST* BST::search(BST* root,int key){
    if(root == NULL || root->data == key)
        return root;
    if(root->data < key)
        return search(root->right,key);
    
    return search(root->left,key);
}

void BST::inorder(BST* root){

    if(!root)
        return;
    
    inorder(root->left);
    std::cout<<root->data<<std::endl;
    inorder(root->right);

}

int main(){

    BST b, *root = NULL;
    root = b.insert(root, 50);
    b.insert(root, 30);
    b.insert(root, 20);
    b.insert(root, 40);
    b.insert(root, 70);
    b.insert(root, 60);
    b.insert(root, 80);
 
    b.inorder(root);
}