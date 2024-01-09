#include<stdio.h>
#include<iostream>
using namespace std;

// Creating a function to calculate sum of n numbers
int sum(int n){

    if(n==0){
        return 0;
    }
    return sum(n-1)+n;
}

int main(){

    int num=10;
    cout<<"Sum of "<<num<<" numbers is "<<sum(num)<<endl;
}