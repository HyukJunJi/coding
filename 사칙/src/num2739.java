import java.util.Scanner;
public class num2739 {
    public static void mian(String[] args){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i<10;i++){
            System.out.println(a+" "+"*"+" "+i+" "+"="+" "+a*i);
        }
    }
}
