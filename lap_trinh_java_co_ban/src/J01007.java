import java.util.Scanner;
public class J01007 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        long[] f= new long[93];
        f[0]=0L;
        f[1]=1L;
        for(int i=2;i<93;i++){
            f[i]=f[i-1]+f[i-2];
        }
        while(t-->0){
            int ok=0;
            long n=sc.nextLong();
            for(int i=0;i<93;i++){
                if(f[i]==n){
                    ok=1;
                    System.out.println("YES");
                    break;
                }
            }
            if(ok==0){
                System.out.println("NO");
            }
        }
    }
}
