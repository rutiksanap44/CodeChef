import java.util.Scanner;
public class Burgers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc>0){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int ans = n1>n2 ? n2 : n1;
            System.out.println(ans);
            tc--;
        }
        sc.close();
    }
}
