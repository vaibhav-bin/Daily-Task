#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);
    
    int n;
    cin >> n;
    int c=0;
    for(int p=1; p<=n; p++)
    {
        vector<int> know(3);
        for(int i=0; i<3; i++)
        cin >> know[i];

        if(accumulate(know.begin(), know.end(), 0)>=2) c++;
    }
    cout << c;
}