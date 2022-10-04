package chap01;

import java.util.Scanner;

public class SumVerbose1 {

    //1부터 n까지의 합을 구하는 과정을 출력하도록 수정한 프로그램

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1부터 n까지의 합을 구합니다.");

        int n;
        do {
            System.out.println("n값 : ");
            n = scan.nextInt();
        } while (n <= 0);


        int sum = 0;
        for (int i = 1; i <= n; i++) {

            if (i < n)
                System.out.print(i + " + ");
            else
                System.out.print(i + " = ");
            sum += i;
        }
        System.out.println(sum);

    }
}
