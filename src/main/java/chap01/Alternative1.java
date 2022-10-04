package chap01;

import java.util.Scanner;

public class Alternative1 {

    //+과 -를 번갈아 가며 출력 (1)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("+과 -를 번갈아가면서 출력합니다.");
        System.out.print("n의 값 : ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0){
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }

    }
}
