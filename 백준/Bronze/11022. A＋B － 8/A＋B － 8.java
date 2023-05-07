import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스 개수 입력 받기

        for (int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;

            System.out.printf("Case #%d: %d + %d = %d\n", i, a, b, sum);
        }
        sc.close();
    }
}
