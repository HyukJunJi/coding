import java.util.Scanner;
public class num10952 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        boolean flag= true;
        while(flag==true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==0 && b==0){
                flag=false;
                return;
            }
            System.out.println(a+b);
        }
    }
}
