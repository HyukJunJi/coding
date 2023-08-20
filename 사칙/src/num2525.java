import java.util.Scanner;

public class num2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 현재 시각 입력 받기
        int currentHour = scanner.nextInt();
        int currentMinute = scanner.nextInt();

        // 요리 시간 입력 받기
        int cookingTime = scanner.nextInt();

        // 계산
        int totalMinutes = currentHour * 60 + currentMinute + cookingTime;
        int finalHour = totalMinutes / 60 % 24;
        int finalMinute = totalMinutes % 60;

        // 결과 출력
        System.out.println(finalHour + " " + finalMinute);

        scanner.close();
    }
}
