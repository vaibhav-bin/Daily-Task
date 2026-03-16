import java.util.*;

public class A_Passing_the_Ball {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T= in.nextInt();
        while(T-->0)
        {
            int n= in.nextInt();
            String s=in.next();
            boolean vis[]=new boolean[n];
            vis[0]=true;
            vis[1]=true;
            int ballpos=1;

            for(int pass=1; pass<n; pass++)
            {
                if(s.charAt(ballpos)=='R')
                    vis[++ballpos]=true;
                else
                    vis[--ballpos]=true;
            }
            int c=0;
            for(boolean has:vis)
                if(has) c++;

            System.out.println(c);
        }
    }
}