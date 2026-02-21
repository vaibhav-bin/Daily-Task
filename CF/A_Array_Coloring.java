import java.util.*;

public class A_Array_Coloring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while(t-->0)
        {
            int n= in.nextInt();
            int[] nums=new int[n];
            for(int i=0; i<n; i++) nums[i]= in.nextInt();
            HashSet<Integer> oddsBefore=new HashSet<>();
            HashSet<Integer> evensBefore=new HashSet<>();
            for(int i=0; i<n; i++)
            {
                if(i%2==0)
                    evensBefore.add(nums[i]);
                else
                    oddsBefore.add(nums[i]);
            }
            Arrays.sort(nums);
            HashSet<Integer> oddsAfter=new HashSet<>();
            HashSet<Integer> evensAfter=new HashSet<>();
            for(int i=0; i<n; i++)
            {
                if(i%2==0)
                    evensAfter.add(nums[i]);
                else
                    oddsAfter.add(nums[i]);
            }
            if(evensBefore.equals(evensAfter) || oddsBefore.equals(oddsAfter) || evensBefore.equals(oddsAfter) || oddsBefore.equals(evensAfter))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}