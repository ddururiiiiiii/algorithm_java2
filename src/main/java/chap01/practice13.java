package chap01;

import java.util.Scanner;

public class practice13 {

    // 입력한 수를 한 변으로 하는 정사각형을 *로 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("정사각형을 출력합니다.");
        System.out.print("변의 길이 : ");
        int a = scan.nextInt();

        for (int i = 0; i < a ; i++){
            for (int j = 0; j < a; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
