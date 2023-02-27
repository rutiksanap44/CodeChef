import java.util.*;

public class SavingTaxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc > 0) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println(n1 - n2);
            tc--;
        }
        sc.close();
    }
}
