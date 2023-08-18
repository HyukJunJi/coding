import java.util.Scanner;
public class num11382 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String num;
        String []a=new String[3];
        num=sc.next();
        a = num.split(" ");
        for(int i=0;i<3;i++){
            System.out.print(a[i]);
        }
            System.out.println(Integer.parseInt(a[0]+Integer.parseInt(a[1])+Integer.parseInt(a[2])));
        
        }
}
