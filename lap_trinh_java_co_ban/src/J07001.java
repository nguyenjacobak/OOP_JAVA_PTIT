import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class J07001 {
    public static void main(String[] args) throws FileNotFoundException {
          Scanner sc= new Scanner(new File("DATA.in"));
          while(sc.hasNext()){
              System.out.println(sc.nextLine());
          }
    }   
}
