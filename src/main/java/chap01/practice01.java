package chap01;

public class practice01 {
    // 네 값의 최댓값을 구하는 메서드를 작성하세요.
    // main메서드 포함

    static int Max4(int a, int b, int c, int d){

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max;
    }
    public static void main(String[] args) {
        Max4 (1, 2, 3, 4);

    }
}
