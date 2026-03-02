#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(0);

    int m,n,r,c;
    cin >> m >> n;
    r=max(m,n);
    c=min(m,n);

    if(r&1)
    cout << (((r-1)/2)*c+c/2);
    else
    cout  << ((r/2)*c);



    return 0;
}