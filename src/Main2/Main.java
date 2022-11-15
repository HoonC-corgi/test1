package Main2;

import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        String s = "a 200";
        Scanner scanner = new Scanner(s);
        String c = scanner.next();
        int i = scanner.nextInt();
        System.out.println(c + ", " + i);

        scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자: ");
        int firstNum = scanner.nextInt();
        System.out.print("두번째 숫자: ");
        int secondNum = scanner.nextInt();
        int result = firstNum + secondNum;
        System.out.println("결과: " + result);
        System.out.println("주소를 입력하세요: ");
        scanner.nextLine();
        String address = scanner.nextLine();
        System.out.println("주소: " + address);
    }
}
