package chap01;

public class practice03 {
    // 네 값의 최솟값을 구하는 메서드를 작성하시오.

    static int min4(int a, int b, int c, int d){

        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        return min;
    }
    public static void main(String[] args) {
        min4(1,2,3,4);
    }
}
