package Main1;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요. : ");    // 덧셈 정수 입력받음
        int sum = 0;    // 입력 정수 합을 받을 변수
        for(int i=0; i<5; i++) {
            int n = scanner.nextInt();  // 스캐너로 정수를 받을 변수
            if(n<=0) {  // 입력받은 n이 양수가 아닐 때
                continue;   // 기존 for문으로 돌아가 다시 반복
            }
            else {
                sum += n;   // 입력 받은 n이 양수일 때 sum에 포함
            }
        }

        System.out.println("양수의 합은 " + sum);
        scanner.close();
    }
}
