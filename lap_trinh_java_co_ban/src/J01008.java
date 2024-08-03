import java.util.Scanner;
public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int k=0;
        while(k!=t){
            int n=sc.nextInt();
            System.out.print("Test "+(k+1)+": ");
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    System.out.print(i);
                    int dem=0;
                    while(n%i==0){
                        dem++;
                        n/=i;
                    }
                    System.out.print("("+dem+") ");
                }
            }
            if(n>1){
                System.out.print(n+"(1)");
            }
            System.out.println("");
            k++;
        }
    }
}
