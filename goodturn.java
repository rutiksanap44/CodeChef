import java.util.*;
public class goodturn{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc>0){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            if(n1+n2<=6){
                System.out.print("NO");
            }else{
                System.out.print("YES");
            }
            tc--;
        }
        sc.close();
    }
}