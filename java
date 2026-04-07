import java.util.Scanner;
public class a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("몇 층인지 입력하세요 >> ");
        int a = in.nextInt();
        System.out.printf("%dm입니다.", a * 5);
    }
}