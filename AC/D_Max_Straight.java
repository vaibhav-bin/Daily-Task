import java.util.*;

public class D_Max_Straight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int[] nums=new int[n];
        for(int i=0; i<n; i++)  nums[i]= in.nextInt();
        
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int x: nums)    map.put(x, map.getOrDefault(x-1, 0)+1);

        int res=0;

        for(int val:map.values())   res=Math.max(res, val);
        System.out.print(res);
        
    }
}