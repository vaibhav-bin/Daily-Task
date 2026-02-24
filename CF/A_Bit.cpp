#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(0);

    int n;
    cin >> n;
    int x=0;

    while(n--)
    {
        string s;
        cin >> s;
        x=s[1]=='+'?x+1:x-1;
    }
    cout << x;


    return 0;
}