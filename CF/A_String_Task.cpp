#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(0);

    string s;
    cin >> s;
    string vows="aeiouy";

    for(char ch : s)
    {
        ch=tolower(ch);
        if(vows.find(ch)==string::npos)
        {
            cout << "." << ch;
        }
    }

    return 0;
}