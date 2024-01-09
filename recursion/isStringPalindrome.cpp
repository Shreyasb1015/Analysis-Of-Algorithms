#include<string.h>
#include<iostream>
using namespace std;

bool isStringPalindrome(string arr,int start,int end){

    if(start >=end){
        return true;
    }

    if(arr[start]!=arr[end]){
        return false;
    }

    return isStringPalindrome(arr,start+1,end-1);
}

int main(){

    string arr="madsm";
    cout <<boolalpha<<isStringPalindrome(arr,0,arr.length()-1);    
}