import java.util.*;

public class B_Your_Name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q= in.nextInt();
        while(Q-->0)
        {
            int n= in.nextInt();
            String s=in.next();
            String t=in.next();

            HashMap<Character, Integer> smap=new HashMap<>();
            HashMap<Character, Integer> tmap=new HashMap<>();

            for(int i=0; i<n; i++)
            {
                char ch1=s.charAt(i);
                char ch2=t.charAt(i);

                smap.put(ch1, smap.getOrDefault(ch1, 0)+1);
                tmap.put(ch2, tmap.getOrDefault(ch2, 0)+1);
            }

            System.out.println(smap.equals(tmap)?"YES":"NO");
        }
    }
}