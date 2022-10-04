package chap01;

import java.util.Scanner;

public class PrintStars2 {

    //*를 n개 출력하되 w개마다 줄 바꿈을 하는 프로그램.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, w;

        System.out.println("*개를 출력하되 w개마다 줄을 바꿔서 출력합니다.");

        // n개를 출력하되 0 이하면 안됨.
        do{
            System.out.println("n값 : ");
            n = scan.nextInt();
        } while(n <= 0);

        // w개도 0 이하면 안됨, n보다는 커야함.
        do{
            System.out.println("w값 : ");
            w = scan.nextInt();
        } while(w <= 0 || w > n);


        for (int i = 0; i < n / w; i++){
            System.out.println("*".repeat(w));
        }
        int rest = n % w;
        if (rest != 0)
            System.out.println("*".repeat(rest));

    }
}
