
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TPC
 */
public class J02004 {
    public static boolean doixung(int a[], int n){
        int[] b= new int[n];
        int idx=0;
        for(int i=n-1;i>=0;i--){
            b[idx]=a[i];
            idx++;
        }
        for(int i=0;i<n;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
}
       public static void main(String[] args) {
           Scanner sc= new Scanner(System.in);
           int t=sc.nextInt();
           while(t-->0){
               int n=sc.nextInt();
               int[] a = new int[n];
               for(int i=0;i<n;i++){
                   a[i]=sc.nextInt();
               }
               if(doixung(a,n)){
                   System.out.println("YES");
               }else{
                   System.out.println("NO");
               }
           }
    }
}
