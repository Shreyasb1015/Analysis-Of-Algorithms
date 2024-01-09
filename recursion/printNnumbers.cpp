#include<stdio.h>
#include<iostream>
using namespace std;

void printNo(int n);

int main(){

    int n;
    cout<<"Enter the number:";
    cin>>n;

    printNo(n);

    return 0;
}

void printNo(int n){

     if(n==0){
        return;
     }
     printNo(n-1);
     cout<<n<<" ";
}