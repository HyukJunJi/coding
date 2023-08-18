import java.util.Scanner;
public class num2525 {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int hour,min,time;
        hour = sc.nextInt();
        min = sc.nextInt();
        time = sc.nextInt();
        if((min+time)>60){
            if(hour==23){
                System.out.println("0"+" "+((min+time)-60));
            }else{
                System.out.println((hour+1)+" "+((min+time)-60));
            }
        }
        else{
            System.out.println(hour+" "+(min+time));
        }
    }
}
