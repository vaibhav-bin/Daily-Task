import java.util.*;

public class A_Watermelon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w= in.nextInt();
        in.close();
        System.out.println(w%2==0&&w>2?"YES":"NO");
    }
}