#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(0);

    int T;
    cin >> T;

    for(int t=0; t<T; t++)
    {
        int a,b;
        cin >> a >> b;

        int steps=0;

        int diff=max(a,b)-min(a,b);

        steps+=diff/10;
        steps=diff%10==0?steps:steps+1;
        
        cout << steps << endl;
    }


    return 0;
}