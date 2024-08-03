import java.util.Scanner;
public class J01009 {
    public static long gt(int n){
        long sum=1L;
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0L;
        for(int i=1;i<=n;i++){
            sum+=gt(i);
        }
        System.out.println(sum);
    }
}
