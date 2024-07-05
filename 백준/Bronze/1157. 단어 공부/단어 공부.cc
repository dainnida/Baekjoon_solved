#include <iostream>
#include <string>
#include <locale>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    string str;
    int arr[26]={0};
    int max=0;
    char index;
    
    cin>>str;
    for(int i=0; i<str.length(); i++){
        //a[i]=toupper(a[i]);
        int n=str.at(i);
        if(n>=97) //A:65, a:97
            arr[n-97]++;
        else
            arr[n-65]++;
    }
    for(int i=0; i<26; i++){
        if(arr[i]>max){
            max=arr[i];
            index='A'+i;
        }
        else if(arr[i]==max)
            index='?';
    }
    cout<<index<<endl;
    
    return 0;
}