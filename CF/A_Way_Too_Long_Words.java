import java.util.*;

public class A_Way_Too_Long_Words {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        while(n-->0)
        {
            String s=in.next();
            int l=s.length();
            if(l>10)
            {
                System.out.println(s.charAt(0)+Integer.toString(l-2)+s.charAt(l-1));
            }
            else
                System.out.println(s);
        }

    }
}