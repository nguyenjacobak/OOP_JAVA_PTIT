
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc= new Scanner(new File("DATA.in"));
        long ans=0L;
        while(sc.hasNext()){
            try{
                String line= sc.next();
                if(line.length()<=9){
                    ans+=Integer.parseInt(line);
                }
            }catch(Exception e){
                
            }
        }
        System.out.print(ans);
    }
}
