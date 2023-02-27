import java.util.*;

public class WaterConsumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc > 0) {
            int n = sc.nextInt();
            if (n >= 2000) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            tc--;
        }
        sc.close();
    }
}
