import java.util.Scanner;
public class num25304 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int totprice = sc.nextInt();
        int totnum = sc.nextInt();
        int a,b;
        int sum=0;

        for(int i=0;i<totnum;i++){
            a = sc.nextInt();
            b = sc.nextInt();
            sum = sum + (a*b);
        }
        if(sum==totprice){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
