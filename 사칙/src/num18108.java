import java.util.Scanner;
public class num18108 {
    public static void main(String [] args){
        int a;
        Scanner sc=new Scanner(System.in);
        a = sc.nextInt();
        if (a>=1000 && a<=3000){
            System.out.println(a-543);
        }
        else{
            return;
        }
    }
}
