import java.util.*;
public class Loops
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t,i,a,b,n,flag=0;
        String s,str="";
        t=input.nextInt();
        Loops obj = new Loops();
        for(i=0;i<t;i++){
            s=input.next();
            a=Integer.parseInt(s);
            s=input.next();
            b=Integer.parseInt(s);
            s=input.next();
            n=Integer.parseInt(s);
            if(flag==0){
                str=obj.func(a,b,n);
                flag=1;
            }
            else{
                str=str+"\n"+obj.func(a,b,n);
            }
        }
        System.out.print(str);
    }
    public String func(int a,int b,int n){
        String s="";
        int i,x=0;
        for(i=0;i<n;i++){
            if(i==0)
                x=x+a+power(i)*b;
            else
                x=x+power(i)*b;
            s=s+""+x+" ";
        }
        x=0;
        return(s);
    }
    public int power(int x){
        int a=1,i;
        if(x==0)
            return 1;
        else{
            for(i=0;i<x;i++){
                a*=2;
            }
            return a;
        }
    }
}
