import java.util.Scanner;
public class num2588 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int numA = Integer.parseInt((a));
        int numB = Integer.parseInt((b));

        String [] B = b.split("");
        System.out.println(numA*Integer.parseInt(B[2]));
        System.out.println(numA*Integer.parseInt(B[1]));
        System.out.println(numA*Integer.parseInt(B[0]));

        System.out.println(numA*numB);

        String aa = "987";
        System.out.println((aa.charAt(2)-'0') * 3);
    }
}
