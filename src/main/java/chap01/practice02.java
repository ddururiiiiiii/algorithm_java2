package chap01;

public class practice02 {
    // 세 값의 최소값을 구하는 메서드를 작성하세요.
    // main 메서드 포함.

    static int min3(int a, int b, int c){
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        return min;
    }

    public static void main(String[] args) {
    min3(1,2,3);
    }
}
