import java.util.Scanner;
public class TaxinChefland {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc>0){
            int n = sc.nextInt();
            if(n>100){
                System.out.println(n-10);
            }else{
                System.out.println(n);
            }
            tc--;
        }
        sc.close();
    }
}
