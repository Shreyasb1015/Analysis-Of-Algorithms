#include<iostream>
#include<stdio.h>
using namespace std;

void reverseArray(int arr[],int start,int end)
{
    if(start>=end)
    {
        return;
    }
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    reverseArray(arr,start+1,end-1);

}

int main(){

    int arr[]={1,2,3,4,5};
    cout <<"Array before : "<<endl;
    for(int i=0;i<5;i++)
    {
        cout <<arr[i]<<" ";
    }
    cout<<endl;
    reverseArray(arr,0,4);
    cout <<"Array after : "<<endl;
    for(int i=0;i<5;i++)
    {
        cout <<arr[i]<<" ";
    }
}