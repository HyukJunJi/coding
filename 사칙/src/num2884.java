import java.util.Scanner;
public class num2884 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(b<45){
            if(a==0){
                System.out.println((24-1)+" "+(60-(45-b)));
            }else{
                System.out.println((a-1)+" "+(60-(45-b)));
            }
        }else{
            System.out.println(a+" "+(b-45));
        }
    }
}
