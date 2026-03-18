import java.util.*;


public class E_Sum_of_Digits_and_Again {

    private static int digitsum(int n)
    {
        int s=0;
        while(n!=0)
        {
            s+=n%10;
            n/=10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] YSTR=new String[900001];
        int[] YSUM=new int[900001];

        for(int i=0; i<900001; i++)
        {
            String ystr=Integer.toString(i);
            int next=i;
            while(next>=10)
            {
                next=digitsum(next);
                ystr+=Integer.toString(next);
            }
            int ysum=0;
            for(char ch:ystr.toCharArray())
                ysum+=(ch-'0');

            YSTR[i]=ystr;
            YSUM[i]=ysum;
        }

        int T= in.nextInt();
        
        while(T-->0)
        {
            String s=in.next();
            if(s.length()==1)
            {
                System.out.println(s);
                continue;
            }
            int[] dmap=new int[10];
            int tsum=0;

            for(char ch: s.toCharArray())
            {
                dmap[(ch-'0')]++;
                tsum+=(ch-'0');
            }

            for(int i=0; i<900001; i++)
            {
                if(tsum==i+YSUM[i])
                {
                    int[] tmap=new int[10];
                    boolean match=true;

                    for(char ch:YSTR[i].toCharArray())
                    {
                        int idx=(ch-'0');
                        tmap[idx]++;
                        if(tmap[idx]>dmap[idx])
                        {
                            match=false;
                            break;
                        }
                    }
                    if(!match)  continue;

                    String xstr="";
                    for(int d=9; d>=0; d--)
                    {
                        String digit=Integer.toString(d);
                        xstr+=digit.repeat(dmap[d]-tmap[d]);
                    }
                    System.out.println(xstr+YSTR[i]);
                    break;
                }
            }
        }
    }
}