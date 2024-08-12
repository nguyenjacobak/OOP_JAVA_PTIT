
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TPC
 */
public class J02005 {
    public static boolean timkiem(int[] a, int n, int x){
        for(int i=0;i<n;i++){
            if(a[i]==x) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        int[] giao= new int[n];
        int[] used=new int[1005];
        int idx=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(timkiem(b,m,a[i])){
                if(used[a[i]]==0){
                    used[a[i]]=1;
                    giao[idx]=a[i];
                    idx++;
                }
            }
        }
        Arrays.sort(giao);
        for(int i=0;i<n;i++){
            if(giao[i]>0){
                System.out.print(giao[i]+" ");
            }
        }
    }
}
