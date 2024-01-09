#include<iostream>
#include <bits/stdc++.h>
using namespace std;

void subsequence(string processed,string unprocessed){

    if(unprocessed.empty())
    {
        cout<<processed<<endl;
        return;
    }

    subsequence(processed+unprocessed[0],unprocessed.substr(1));
    subsequence(processed,unprocessed.substr(1));

}

int main()
{
    string up="abc";
    string p="";

    subsequence(p,up);

}