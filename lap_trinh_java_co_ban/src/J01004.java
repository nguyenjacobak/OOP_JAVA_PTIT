import java.util.Scanner;
public class J01004 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int ok=1;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    ok=0;
                    System.out.println("NO");
                    break;
                }
            }
            if(ok==1){
                System.out.println("YES");
            }
        }
    }
}
