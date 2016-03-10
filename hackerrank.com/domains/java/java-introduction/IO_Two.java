import java.util.Scanner;

public class IO_Two{

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s="";
            int x=sc.nextInt();
            double y=sc.nextDouble();
            sc.nextLine();
            s=sc.nextLine();
            

            System.out.println("String: "+s);
            System.out.println("Double: "+y);
            System.out.println("Int: "+x);
    }
}
