package chap01;

import java.util.Scanner;

public class Max3 {

    // 세개의 정수값을 입력하고 최댓값을 구하여 출력.
        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.print("a의 값 : "); int a = scan.nextInt();
        System.out.print("b의 값 : "); int b = scan.nextInt();
        System.out.print("c의 값 : "); int c = scan.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("최대값은 " + max + " 입니다.");

    }
}
